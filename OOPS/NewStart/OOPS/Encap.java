package OOPS;
import java.util.*;
public class Encap {
    private String name;
    private int age;
    private String cgpa;

    public Encap(String name, int age, String cgpa ){
        this.age=age;
        this.name=name;
        this.cgpa=cgpa;
    }
    public void setModifiedName(String nName){
        name=nName;
    }
    public void setModifiedAge(int nAge){
        age=nAge;
    }
    public void setModifiedCgpa(String nCgpa){
        cgpa=nCgpa;
    }
    public String getModifiedName(){
        return name;
    }
    public int getModifiedAge(){
        return age;
    }
    public String getModifiedCgpa(){
        return cgpa;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= s.nextLine();
        System.out.println("Enter your age: ");
        int age=s.nextInt();
        s.nextLine();
        System.out.println("Enter your cgpa: ");
        String cgpa=s.nextLine();
          Encap e1= new Encap(name, age, cgpa);
        System.out.println("Your age is: "+e1.getModifiedAge());
        System.out.println("Your name is: "+e1.getModifiedName());
        System.out.println("Your CGPA is: "+e1.getModifiedCgpa());
        e1.setModifiedAge(69);
        System.out.println("MOdified age is: "+e1.getModifiedAge()    );
    }
    
}
