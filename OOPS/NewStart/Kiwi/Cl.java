import java.util.Scanner;

class x{
    private int Salary;
    private String Name;

    public void setName(String Name){
        this.Name=Name;
    }

    public void setSalary(int Salary){
        this.Salary=Salary;
    }

    public int getSalary(){
        return Salary;
    }

    public String getName(){
        return Name;
    }
 }
    class u extends x{
        void you(){
            System.out.println("Congo, you are selected at Conpany U");
        }
        void enterDetails(){
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the Salary: ") ;
            int x= s.nextInt();
            setSalary(x);

            System.out.println("Enter your Name: ");
            String y= s.nextLine();
            setName(y);
            s.nextLine();
        }

        void accessDetails(){
             System.out.println("You'll be employed with the salary of: "+getSalary());
            System.out.println("Your Name is: "+getName());
        }
    }


public class Cl {
    public static void main(String[] args) {
        u obj= new u();
        obj.enterDetails();
        obj.accessDetails();
        System.out.println(obj);
        
    }
}
