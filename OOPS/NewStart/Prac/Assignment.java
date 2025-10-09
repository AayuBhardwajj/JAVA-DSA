import java.util.*;
    
class Library {
    void displayInfo() {
        System.out.println("Welcome to the Library!");
    }
}
class Member extends Library {
    String name;

    Member(String name) {
        this.name = name;
    }
    void borrowBook(String bookTitle) {
        System.out.println(name + " borrowed the book: " + bookTitle);
    }
    void returnBook(String bookTitle) {
        System.out.println(name + " returned the book: " + bookTitle);
    }
}


 public class Assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter member name: ");
        String memberName = s.nextLine();
        Member member = new Member(memberName);
        member.displayInfo();
        System.out.print("Enter book title: ");
        String bookTitle = s.nextLine();
        member.borrowBook(bookTitle);
        member.returnBook(bookTitle);

    }
}