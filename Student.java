import java.util.Scanner;
public class Student {
    private String name;
    private int age;
    public Student(){
        name = "No name yet!";
        age = 0;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Given Name: " + name);
        System.out.println("Current Age: "+ age);
        System.out.println("-----------------------------------");
    }
    public static void main(String[]args){
        Student info = new Student("Karuro Inamura", 27);
        Student info1 = new Student();
        info.displayInfo();
        info1.displayInfo();
    }
}

