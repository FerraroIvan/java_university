package prg.es07;
import java.util.ArrayList;
import java.util.Scanner;


public class Servizio2{
    ArrayList<Abbonato> abbonatoList;
    ArrayList<AbbonatoPremium> abbonatoPremiumList;

    public Servizio2(){
        abbonatoList = new ArrayList<>();
        abbonatoPremiumList = new ArrayList<>();
    }

    public void addAbbonato(Abbonato a){
        abbonatoList.add(a);
    }

    public void addAbbonatoPremium(AbbonatoPremium a){
        abbonatoPremiumList.add(a);
    }

    public void stampaAbbonati(){
        int id = 0;
        System.out.println("Lista Abbonati");
        for(Abbonato a : abbonatoList){
            System.out.println(id + ") " + a);
            ++id;
        }
    }

    public void stampaAbbonatiPremium(){
        int id = 0;
        System.out.println("Lista Abbonati Premium");
        for(AbbonatoPremium a : abbonatoPremiumList){
            System.out.println(id + ") " + a);
            ++id;
        }
    }

    public Abbonato getAbbonato(int i){
        return abbonatoList.get(i);
    }

    public AbbonatoPremium getAbbonatoPremium(int i){
        return abbonatoPremiumList.get(i);
    }
}
