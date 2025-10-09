package OOPS;
import java.util.*;

public class Encap1 {  

    private String name;
    private int age;
    private String cgpa;

    // Initializing a parameterized constructor
    public Encap1(String name, int age, String cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCgpa() { return cgpa; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCgpa(String cgpa) { this.cgpa = cgpa; }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Encap1> users = new ArrayList<>();

        // Adding users
        while (true) {
            System.out.print("\nEnter your Name: ");
            String name = s.nextLine();

            System.out.print("Enter your Age: ");
            int age = s.nextInt();
            s.nextLine(); 

            System.out.print("Enter your CGPA: ");
            String cgpa = s.nextLine();

            users.add(new Encap1(name, age, cgpa));

            System.out.print("Do you wanna add another user? (yes/no): ");
            if (!s.nextLine().equalsIgnoreCase("yes")) break;
        }

        // Updating user details
        if (!users.isEmpty()) {
            System.out.print("\nUpdate user details? (yes/no): ");
            if (s.nextLine().equalsIgnoreCase("yes")) {
                System.out.print("Enter user index (1-" + users.size() + "): ");
                int index = s.nextInt() - 1;
                s.nextLine(); 

                if (index >= 0 && index < users.size()) {
                    System.out.print("New Name: ");
                    users.get(index).setName(s.nextLine());

                    System.out.print("New Age: ");
                    users.get(index).setAge(s.nextInt());
                    s.nextLine(); 

                    System.out.print("New CGPA: ");
                    users.get(index).setCgpa(s.nextLine());
                } else {
                    System.out.println("Invalid index.");
                }
            }
        }

        // Displaying user details
        System.out.println("\nUser Details:");
        for (int i = 0; i < users.size(); i++) {
            Encap1 user = users.get(i);
            System.out.println("\nUser " + (i + 1) + ": " +
                    "\nName: " + user.getName() +
                    "\nAge: " + user.getAge() +
                    "\nCGPA: " + user.getCgpa());
        }

        s.close();
    }
}
