package CIE;
import java.util.Scanner;
public class student{
    protected String usn;
    protected String name;
    protected int sem;
    public void InputStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USN: ");
        String usn = sc.next();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter sem: ");
        int sem = sc.nextInt();
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
    public void displayStudentDetails(){
        System.out.println("USN: " + this.usn);
        System.out.println("Name: " + this.name);
        System.out.println("Sem: " + this.sem);
    }
}
