package odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev04 {
    public static void main(String[] args) {
        //Verilen bir string cümle içinde tekrar eden kelimeleri ve bu kelimelerin sayısını veren kod yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tekrar eden kelimeleri kontrol etmem için bir cümle giriniz: ");
        String s = scanner.nextLine().replaceAll("\\p{Punct}","");
        String [] sList = s.split("\\s+");
        List<String> kelimelist = new ArrayList<>();
        for (String w: sList){
            int sayac = 0;
            for (int i = 0; i < sList.length; i++) {
                if (w.equals(sList[i])){
                    sayac++;
                }
            }
            if (sayac>1 && !kelimelist.contains(w)){
                kelimelist.add(w);
                System.out.println("Girdiğiniz cümlede '"+w+"' kelimesinden " + sayac + " kez kullanıldı." );
            }
        }
        System.out.println("Diğer kelimeler tekrar etmediği için görüntülenmedi.");
        System.out.println("bbb");

    }
}
