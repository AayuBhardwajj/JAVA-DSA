// package Stack;

// // import java.util.*;
// // public class ArrayL {
// //         static ArrayList<Integer> list = new ArrayList<>();
// //         public static boolean isEmpty(){
// //             return list.size()==0;
// //         }
// //         public static void push(int data){
// //             list.add(data);
// //         }
// //         public static int pop(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             int top=list.get(list.size()-1);
// //             list.remove(list.size()-1);
// //             return top;
// //         }
// //         public static int peek(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             return list.get(list.size()-1);
// //         }

// //         public static void main(String[] args){
// //             ArrayL xx= new ArrayL();
// //             xx.push(1);
// //             xx.push(2);
// //             xx.push(3);
// //             xx.push(4);

// //             while(!xx.isEmpty()){
// //                 System.out.println(xx.peek());
// //                 xx.pop();
// //             }
// //         }
// //     }
// import java.util.ArrayList;
// import java.util.Stack;

// public class ArrayL{
//         static ArrayList<Integer> list= new ArrayList<>();

//         public static boolean isEmpty(){
//             return list.size()==0;
//         }

//         public static void push(int data){
//             list.add(data);
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }

//     public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int x=list.get(list.size()-1);
//         list.remove(list.size()-1);
//         return x;
//     }

//     public static void main(String[] args) {
//     ArrayL xx= new ArrayL();
//     ArrayL.push(1);
//     ArrayL.push(2);
//     push(3);

//     while(!isEmpty()){
//         System.out.println(peek());
//         pop();
//     }

//     }
// }

import java.util.*;
public class ArrayL{
    static ArrayList<Integer> al = new ArrayList<>();

    public  boolean isEmpty(){
        return al.size()==0;
    }

    public  void push(int data){
        al.add(data);
    }

    public int pop(){
        int top=al.get(al.size()-1);
        al.remove(al.size()-1);
        return top;
    }

    public  int peek(){
        if(isEmpty()){
            return -1;
        }
        return al.get(al.size()-1);
    }

    public static void main(String[] args){
        ArrayL x= new ArrayL();
        x.push(9);
        x.push(6);
        while(!x.isEmpty()){
            System.out.println(x.peek());
           x.pop();
        }
    }

}