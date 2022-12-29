package prg.es06;

public class MainIntegerSet{
    public static void main(String args[]){
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();
        
        a.insertElement(4);
        b.insertElement(4);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        IntegerSet res;
        
        res = a.unionOfIntegerSet(b);
        System.out.println("a U b: " + res);
        res = a.intersectionOfIntegerSet(b);
        System.out.println("a int b: " + res);
        
        a.deleteElement(10);
        System.out.println("a: " + a);
    }
}
