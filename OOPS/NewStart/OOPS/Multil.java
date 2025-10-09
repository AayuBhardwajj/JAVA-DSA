
package OOPS;

    class parent{
        public void pP(){
            System.out.println("This is derived from the parent class");
        }
    }
     class child extends parent{
        public void cC(){
            System.out.println("This is the Derived class 1, following the logic of Multi Level Inheritance");
        }
    }
    class child1 extends child{
        public void cC1(){
            System.out.println("This is the Derived class 2, Derived from the Derived Class 1, following the logic of Multi Level Inheritance");
        }
    }
    class Multil{
    public static void main(String[] args){
        child1 cr= new child1();
        cr.pP();
        cr.cC();
        cr.cC1();
    }
    }

