package OOPS;

public class Pen {
    int thickness;
    String color;
    void setThickness(int newThickness) {
    thickness = newThickness;
    }
    void setColor(String newC){
        color=newC;
    }

public static void main(String[] args){
    Pen p1= new Pen();
    p1.setThickness(3);
    System.out.println(p1.thickness);
    p1.setColor("Red");
    System.out.println(p1.color);
}
}

