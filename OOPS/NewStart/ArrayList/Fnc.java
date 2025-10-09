/*
A program that depicts almost all the commonly used functions of ArrayList, But most importantly
It shwos how scanner can also be taken as an argument.
 */

package ArrayList;
import java.util.*;
public class Fnc {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements you wanna keep in your ArrayList: ");
        int num=s.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter the "+num+" elements: ");
        for(int i=0;i<num;i++){
            int input=s.nextInt();
            list.add(input);
        }
        System.out.println();
        System.out.println(list);
        System.out.println();
        int choice;
        do{
        System.out.println("Menu of functions:  ");
        System.out.println();
        System.out.println("1> Add");
        System.out.println("2> Add on a particular index");
        System.out.println("3> Remove an element from a particular index");
        System.out.println("4> Set element at a particular index");
        System.out.println("5> Check for presence of an element: ");
        System.out.println("8> Exit");
        System.out.println();
        System.out.println("Enter your choice: ");
       choice=s.nextInt();
       switch (choice) {
        case 1:
            addEle(list,s);
            break;
        case 2: 
            addEleAtINdex(list,s);
            break;
        case 3:
            removeEle(list,s);
            break;
        case 4:
            setEle(list,s);
            break;
        case 5:
        checkForPresence(list,s);
        break;
        case 8:
        System.out.println("Exiting");
        System.out.println("Exited Successfully");
        return; 
        default:
        System.out.println("Invalid input");
            break;
        }
    } while(choice!=8);
}
    public static void addEle(ArrayList<Integer> list ,Scanner s){
        System.out.println("Enter the element you wanna add: ");
        int addThat=s.nextInt();
        list.add(addThat);
        System.out.println(list);
    }
    public static void addEleAtINdex(ArrayList<Integer> list, Scanner s){

        System.out.println("Enter the index where you wanna a new element: ");
        int index=s.nextInt();
        System.out.println("Enter the new element at "+index+" element: ");
        int ele=s.nextInt();
        if(index<0 || index>list.size()){
            System.out.println("Invalid Index");
            return;
        }else{
        list.add(index, ele);
        System.out.println(list);
    }
}
    public static void removeEle(ArrayList<Integer> list, Scanner s){
    
        System.out.println("Enter the element's index which you wanna remove: ");
        int index=s.nextInt();
        if(index<0 || index>=list.size()){
            System.out.println("Invalid index");
            return;
        }
        else{ 
        list.remove(index);
        System.out.println(list);
    }
}
    public static void setEle(ArrayList<Integer> list, Scanner s){
       
        System.out.println("Enter the index where you wanna update the element: ");
        int index=s.nextInt();
        System.out.println("Enter the new element for "+index+" index: ");
        int n=s.nextInt();
        if(index<0 || index>=list.size()){
            System.out.println("Invalid Index");
            return;
        }else{
        list.set(index, n);
        System.out.println(list);
    }
}
    public static boolean checkForPresence(ArrayList<Integer> list, Scanner s){
        System.err.println("Enter the element whose presence you wanna check: ");
        int ele=s.nextInt();
        if(list.contains(ele)){
           System.out.println("Yes, the list contains the element "+ele);
        }
        else{
            System.out.println("Element doesn't exists");
        }
        return false;
    }
}
