package prg.es06;

public class MainIntegerSet2{
    public static void main(String args[]){
        IntegerSet2 a = new IntegerSet2();
        IntegerSet2 b = new IntegerSet2();
        
        a.insertElement(4);
        a.insertElement(234);
        a.insertElement(765);
        b.insertElement(4);
        b.insertElement(14);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        IntegerSet2 res;
        
        res = a.unionOfIntegerSet(b);
        System.out.println("a U b: " + res);
        res = a.intersectionOfIntegerSet(b);
        System.out.println("a int b: " + res);
        
        a.deleteElement(10);
        System.out.println("a: " + a);
        a.deleteElement(234);
        System.out.println("a: " + a);
    }
}