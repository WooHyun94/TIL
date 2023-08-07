import java.util.*;
public class MyStack2 {
    ArrayList<StackNode> stk = new ArrayList<>();

    public boolean isEmpty(){
        if(stk.isEmpty()) return true;
        else return false;
    }
    public int peek(){
        return stk.get(stk.size() - 1).value;
    }
    public void push(int n){
        stk.add(new StackNode(n));
    }
    public int size(){
        return stk.size();
    }
    public int pop(){
        int result = stk.get(stk.size() - 1).value;
        stk.remove(stk.size() - 1);
        return result;
    }

    public class StackNode{
        int value;
        StackNode(int value){
            this.value = value;
        }
    }
}
