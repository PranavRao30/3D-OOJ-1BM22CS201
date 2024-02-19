class m1 extends Thread{
    public void run(){
        while(true){
            System.out.println("BMS College of Engineering");
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                System.out.println("Interrupted: " + e);
            }
        }
    }
}

class m2 extends Thread{
    public void run(){
        while(true){
            System.out.println("CSE");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Interrupted: " + e);
            }
        }
    }
}

public class Main{
    public static void main(String args[]){
        m1 bms = new m1();
        m2 cse = new m2();
        bms.start();
        cse.start();
    }
}
