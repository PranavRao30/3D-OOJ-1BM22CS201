import java.util.Scanner;

class WrongAge extends Exception{
    WrongAge(){
        super("Age error");
    }
    WrongAge(String message){
        super(message);
    }
}

class Father{
    private int age;
    public Father(int age) throws WrongAge {
        if(age < 0){
            throw new WrongAge("Age cannot be negative");
        }
        this.age = age;
    }

    int getAge(){
        return this.age;
    }
}

class Son extends Father{
    private int age;

    public Son(int FAge, int SAge) throws WrongAge {
        super(FAge);
        if(SAge >= FAge){
            throw new WrongAge("Son's age can't be greater than Father's age");
        }
        if(SAge < 0){
            throw new WrongAge("Age cannot be negative");
        }
        this.age = SAge;
    }

    int getSonAge(){
        return this.age; 
    }
}

public class Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Father's age");
            int Fage = sc.nextInt();
            System.out.println("Enter Son's age");
            int Sage = sc.nextInt();
            
            Father fat = new Father(Fage);
            Son son = new Son(Fage, Sage);

            System.out.println("Father's Age is " + fat.getAge());
            System.out.println("Son's Age is " + son.getSonAge());
        } catch (WrongAge e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

