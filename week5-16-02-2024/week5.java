1.

public class Main {
    public static void main(String[] args) {
       
        String str1 = "Hello World";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray);

        byte[] byteArray = {65, 66, 67};

        String str3 = new String(byteArray);
       
        String str4 = new String(charArray, 2, 3);
       
        String str5 = new String(str1);
       
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}

2.

public class Main{
    public static void main(String[] args) {
        String str = "Hello";
       
        int length = str.length();
        System.out.println(length);
       
        String literal = "Hello";
        System.out.println("Hello".length());
       
        String concat = str.concat(" World");
        System.out.println(concat);
    }
}

3.

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

class Main {
    public static void main(String args[]) {
    Box b = new Box(10, 12, 14);
    String s = "Box b: " + b;
    System.out.println(b);
    System.out.println(s);
    }
}

4.

class Main {
    public static void main(String args[]) {
        String s = "Welcome to Bmsce college";
        char[] chars = new char[5];
        s.getChars(11, 16, chars, 0);
       
        String extractedString = new String(chars);
        System.out.println(extractedString);

    }
}

5.

public class Main{
    public static void main(String[] args) {
        String str = "Hello";
       
        byte[] byteArray = str.getBytes();
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
       
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}

6.

public class Main{
    public static void main(String[] args) {
        String s1 = "Bmsce";
        String s2 = "Bmsce";
        String s3 = "College";
        String s4 = "BMSCE";
       
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}

7.
public class Main {
    public static void main(String[] args) {
        String sentence = "Welcome to Bmsce College of Engineering";
        String substring = "Bmsce college";
       
        boolean matches = sentence.regionMatches(11, substring, 0, substring.length());
       
        if (matches) {
            System.out.println("Substring is matched");
        } else {
            System.out.println("Substring is not matched");
        }
    }
}

8.
public class Main{
    public static void main(String[] args) {
        String str = "Hello World";
       
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with Hello -> " + startsWithHello);
       
        boolean startsWithHi = str.startsWith("Hi");
        System.out.println("Starts with Hi -> " + startsWithHi);
    }
}

9.
public class Main{
    public static void main(String[] args) {
        String str = "Hello World";
       
        boolean endsWithWorld = str.endsWith("World");
        System.out.println("Ends with World -> " + endsWithWorld);
       
        boolean endsWithUniverse = str.endsWith("Universe");
        System.out.println("Ends with Universe -> " + endsWithUniverse);
    }
}

10.
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
       
        boolean equal = str1.equals(str2);
        System.out.println("Using equals() -> " + equal);
       
        boolean equals = (str1 == str2);
        System.out.println("Using == -> " + equals);
    }
}

11.
class Main{
    static String arr[] = {"van", "watch", "ball", "cat", "xmas", "yatch", "zee", "apple", "ice", "jug", "kite", "lift", "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring", "star", "tree", "umbrella"};
    public static void main(String args[]) {
        for(int j = 0; j < arr.length; j++) {
            for(int i = j + 1; i < arr.length; i++) {
                if(arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i]; arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}

12.
class Main{
    static String arr[] = {"9", "8", "7", "6", "5", "4", "3", "2", "1"};
    public static void main(String args[]) {
        for(int j = 0; j < arr.length; j++) {
            for(int i = j + 1; i < arr.length; i++) {
                if(arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}

13.
class Main{
    public static void main(String args[]) {
        String org = "Thwas was a test. Thwas was, too.";
        String search = "was";
        String sub = "is";
        String result = "";
        int i;
        do {
            System.out.println(org);
            i = org.indexOf(search);
            if(i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while(i != -1);
    }
}

14.
public class Main{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World";
       
        String result = s1.concat(s2);
       
        System.out.println(result);
    }
}

15.
public class Main{
    public static void main(String[] args) {
        String sentence = "College";
       
        String newSentence = sentence.replace("l", "m");
       
        System.out.println(newSentence);
    }
}

16.
public class Main{
    public static void main(String[] args) {
        String str = "  Hello Friends  ";
       
        String trimmedString = str.trim();
       
        System.out.println(trimmedString);
    }
}

17.
import java.util.Scanner;
class Student{
    int regNo;
    String fName;
    short sem;
    float cgpa;
   
    Student(){
        this.regNo = 0;
        this.fName = "Nil";
        this.sem = 1;
        this.cgpa = 0;
    }
   
    Student(int regNo, String fName, short sem, float cgpa){
        this.regNo = regNo;
        this.fName = fName;
        this.sem = sem;
        this.cgpa = cgpa;
    }
   
    void display(){
        System.out.print("Register Number: " + regNo);
        System.out.print("Full Name: " + fName);
        System.out.print("Semester: " + sem);
        System.out.print("CGPA: " + cgpa);
    }
}

class Main{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] records = new Student[5];
        for(int i = 0; i < 5; i++){
            int no;
            String name;
            short sem;
            float cgpa;
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter reg no: ");
            no = sc.nextInt();
            System.out.println("Enter sem: ");
            sem = sc.nextShort();
            System.out.println("Enter cgpa: ");
            cgpa = sc.nextFloat();
            records[i] = new Student(no, name, sem, cgpa);
        }
       
        for (Student student : records) {
            student.display();
            System.out.println();
        }
    }
}

18.
public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
       
        System.out.println("Length: " + stringBuffer.length());
        stringBuffer.setLength(3);
        System.out.println("Length: " + stringBuffer.length());
        stringBuffer = new StringBuffer("Hello");
       
        char c = stringBuffer.charAt(1);
        System.out.println("Character at index 1: " + c);
       
        stringBuffer.setCharAt(1, 'a');
        System.out.println("Updated string: " + stringBuffer);
       
        char[] chars = new char[3];
        stringBuffer.getChars(1, 4, chars, 0);
        System.out.print("Extracted characters: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();
       
        stringBuffer.append(" World");
        System.out.println("Appended string: " + stringBuffer);
       
        stringBuffer.insert(6, "Java ");
        System.out.println("Inserted string: " + stringBuffer);
       
        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);
       
        stringBuffer.delete(5, 9);
        System.out.println("Deleted string: " + stringBuffer);
       
        stringBuffer.deleteCharAt(0);
        System.out.println("Deleted character: " + stringBuffer);
       
        stringBuffer.replace(2, 5, "llo");
        System.out.println("Replaced string: " + stringBuffer);
       
        String substring = stringBuffer.substring(1, 4);
        System.out.println("Substring: " + substring);
    }
}

19.
abstract class Bird {
    public abstract void fly();
   
    public abstract void makeSound();
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle flies high in the sky");
    }
   
    public void makeSound() {
        System.out.println("Eagle makes screeching sound");
    }
}

class Hawk extends Bird {
    public void fly() {
        System.out.println("Hawk flies fast and agile");
    }
   
    public void makeSound() {
        System.out.println("Hawk makes high-pitched sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();
       
        Hawk hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}

20.
abstract class Shape {
    public abstract double calculateArea();
   
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
   
    public Circle(double radius) {
        this.radius = radius;
    }
   
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
   
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
   
    public double calculateArea() {
        return 0.5 * base * height;
    }
   
    public double calculatePerimeter() {
        return base + (2 * Math.sqrt(Math.pow((base / 2), 2) + Math.pow(height, 2)));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
       
        Triangle triangle = new Triangle(4, 6);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
