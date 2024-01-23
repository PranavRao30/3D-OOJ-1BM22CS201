import SEE.externals;
class Main {
    public static void main(String args[]){
        int numOfStudents = 2;
        externals finalMarks[] = new externals[numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            finalMarks[i] = new externals();
            finalMarks[i].InputStudentDetails();
            System.out.println("Enter CIE marks");
            finalMarks[i].InputCIEMarks();
            System.out.println("Enter SEE marks");
            finalMarks[i].inputSEEmarks();
        }
        System.out.println("Displaying data:\n");
        for(int i=0;i<numOfStudents;i++){
            finalMarks[i].calculateFinalMarks();
            finalMarks[i].displayFinalMarks();
        } 
    } 
}
