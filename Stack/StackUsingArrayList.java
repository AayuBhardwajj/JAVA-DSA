// import java.util.*;
// public class ArrayL {
//         static ArrayList<Integer> list = new ArrayList<>();

//         public static boolean isEmpty(){
//             return list.size()==0;
//         }
//         public static void push(int data){
//             list.add(data);
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }

//         public static void main(String[] args){
//             ArrayL xx= new ArrayL();
//             xx.push(1);
//             xx.push(2);
//             xx.push(3);
//             xx.push(4);

//             while(!xx.isEmpty()){
//                 System.out.println(xx.peek());
//                 xx.pop();
//             }
//         }
//     }

import java.util.*;
public class StackUsingArrayList{
    static ArrayList<Integer> al= new ArrayList<>();

    public static boolean isEmpty(){
        return al.size()==0;
    }
    public static void push(int data){
        al.add(data);
    }
    public static int pop(){
        if(al.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
        int top=al.get(al.size()-1);
        al.remove(al.size()-1);
        return top;
    }
}
    public static int peek(){
        return al.get(al.size()-1);
    }

    public static void main(String[] args){
        StackUsingArrayList op= new StackUsingArrayList();
        op.push(1);
        op.push(2);
        op.push(3);
        op.push(4);
        while(!op.isEmpty()){
            System.out.println(op.peek());
            op.pop();
        }
        }
}


