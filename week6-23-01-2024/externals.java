package SEE;
import CIE.internals;
import java.util.Scanner;
public class externals extends internals {
    protected int marks[];
    protected int finalMarks[];
    public externals() {
        marks = new int[5]; 
        finalMarks = new int[5]; 
    }
    public void inputSEEmarks() {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.print("Enter marks of Subject "+(i+1)+" : ");
            marks[i] = sc.nextInt(); 
        } 
    }
    public void calculateFinalMarks() {
        for(int i=0;i<5;i++){
            finalMarks[i] = marks[i]/2 + super.marks[i];
        }
    }
    public void displayFinalMarks() { 
        displayStudentDetails();
        for(int i=0;i<5;i++){
            System.out.println("Subject " + (i+1) + ": " + finalMarks[i]);
        }
    }
        
}
