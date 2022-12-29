package prg.es08;
import java.util.ArrayList;

public class Stack{
    ArrayList<String> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public void push(String s){
        if(!isFull()){
            stack.add(s);
        } else {
            System.out.println("Full stack");
        }
    }

    public String pop(){
        if(!stack.isEmpty()){
            return stack.remove(stack.size()-1);
        }
        return "Empty stack";
    }
 
    public boolean isEmpty(  ){
       if(stack.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        int limit = 100;
        if(stack.size() == limit){
            return true;
        } else {
            return false;
        }

    }

    public String toString(){
        return stack.toString();
    }

    public boolean contains(String s){
        return stack.contains(s);
    }

    public boolean equals(Stack altro){
        return this.stack.equals(altro.stack);
    }
}
