import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class EXAM {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Aayush", 80),
                new Student("Riya", 72),
                new Student("Karan", 95),
                new Student("Simran", 65),
                new Student("Mohit", 88)
        );

        students.stream()
                .filter(s -> s.getMarks() > 75)                    
                .sorted((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()))  
                .map(Student::getName)                             
                .forEach(System.out::println);                   
    }
}
