package Placement;
import java.util.Stack;
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(1);
        st.push(2);
        st.push(4);
        System.out.println(st);
        System.out.println();
        StackSort(st);
        System.out.println(st);
    }

    public static void StackSort(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        StackSort(st);
        insert(st,x);
    }
    public static void insert(Stack<Integer> st,int temp){
        if(st.size()==0 || st.get(st.size()-1)<=temp){
            st.push(temp);
            return;
        }
        int x=st.pop();
        insert(st, temp);
        st.push(x);
    }
}
