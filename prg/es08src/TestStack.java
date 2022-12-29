package prg.es08;
import java.util.Scanner;

public class TestStack{
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner in = new Scanner(System.in);
        while(true){
            menu();
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter string: ");
                    String string = in.next();
                    stack.push(string);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println("Enter string to research: ");
                    String string2 = in.next();
                    if(stack.contains(string2)){
                        System.out.println(string2 + " is present");
                    } else {
                        System.out.println("This string is not present");
                    }
                    break;
                case 4:
                    System.out.println(stack);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Try another option");
            }
        }
    }

    public static void menu(){
        System.out.println("Scegli un numero tra i seguenti per effettuare una scelta");
        System.out.println("1) Aggiungi un elemento allo stack");
        System.out.println("2) Elimina l'ultimo elemento dallo stack");
        System.out.println("3) Verifica se è presente un elemento nello stack");
        System.out.println("4) Stampa l'intero stack");
        System.out.println("5) Chiudi il programma");
    }
}
