package prg.es06;
import java.util.Scanner;

public class SingleInput{
    private static SingleInput instance;
	
    public static SingleInput getInstance(){
        if(instance == null){
            instance = new SingleInput();
        }
        return instance;
    }

    private SingleInput(){
        scanner = new Scanner(System.in);
    }
    
	/////////////////////////////////////	
    private Scanner scanner;
        
    public String readString(String prompt){
        System.out.print(prompt);
        return scanner.next();
    }
    
    public String readString(){
        return readString("");
    }

    public int readInt(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public int readInt(){
        return readInt("");
    }
}