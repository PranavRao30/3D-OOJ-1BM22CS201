import java.util.Scanner;
class Subject
{
    int sub_marks;
    int credits;
    int grade;
}

class SGPA
{
    Subject subject[];
    String USN,name;
    double sgpa;
    Scanner sc = new Scanner(System.in);
    
    SGPA()
    {
        subject=new Subject[8];
        for(int i=0;i<8;i++)
        {
            subject[i]=new Subject();
        }
    }
    
    void getData()
    {
        System.out.println("Enter name of Student.");
        name=sc.nextLine();
        System.out.println("Enter USN of Student.");
        USN=sc.nextLine();
    }
    
    void getMarks()
    {
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter subject "+(i+1)+" marks");
            subject[i].sub_marks=sc.nextInt();
            System.out.println("Enter subject "+(i+1)+" credits");
            subject[i].credits=sc.nextInt();
        }
        
        for(int i=0;i<8;i++)
        {
            if(subject[i].sub_marks>=90 && subject[i].sub_marks<=100)
            {
                subject[i].grade=10;
            }
            else if(subject[i].sub_marks>=80 && subject[i].sub_marks<90)
            {
                subject[i].grade=9;
            }
            else if(subject[i].sub_marks>=70 && subject[i].sub_marks<80)
            {
                subject[i].grade=8;
            }
            else if(subject[i].sub_marks>=60 && subject[i].sub_marks<70)
            {
                subject[i].grade=7;
            }
            else if(subject[i].sub_marks>=50 && subject[i].sub_marks<60)
            {
                subject[i].grade=6;
            }
            else if(subject[i].sub_marks>=40 && subject[i].sub_marks<50)
            {
                subject[i].grade=5;
            }
            else if(subject[i].sub_marks>=0 && subject[i].sub_marks<40)
            {
                subject[i].grade=0;
            }
            else
            {
                System.out.println("Enter valid score");
                break;
            }
        }
    }
    
    double compute()
    {
        double sum=0.0,num;
        for(int i=0;i<8;i++)
        {
            num=(subject[i].grade)*(subject[i].credits);
            sum+=num;
        }
        sgpa=sum/20;
        return sgpa;
    }
    
    void display(double sgpa)
    {
        System.out.println("Name of candidate: "+name);
        System.out.println("USN of candidate: "+USN);
        System.out.println("SGPA= "+sgpa);
    }
}

class Main
{
    public static void main(String args[])
    {   System.out.println("Pranav Anantha Rao\n1BM22CS201\n\n");
        SGPA ob=new SGPA();
        ob.getData();
        ob.getMarks();
        double a=ob.compute();
        ob.display(a);
    }
}
