package CIE;
import java.util.Scanner;
import CIE.student;
public class internals extends student{
    protected int marks[] = new int[5];
    public void InputCIEMarks(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter Marks of Subject " + (i+1) + ":");
            marks[i] = sc.nextInt();
        }
    }
}
