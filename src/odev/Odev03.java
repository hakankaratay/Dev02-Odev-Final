package odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {
        //Verilen String içinde tekrar eden karakterleri ve tekrer sayısını veren bir kod yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tekrar eden karakterleri kontrol etmem için bir ifade giriniz: ");
        String s = scanner.nextLine();
        char [] cList = s.toCharArray();
        ArrayList<Character> tekrarliKrktrlrList = new ArrayList<>();
        for (char w: cList){
            int sayac = 0;
            for (int i = 0; i < cList.length; i++) {
                if (w==cList[i]){
                    sayac++;
                }
            }
            if (sayac>1 && !tekrarliKrktrlrList.contains(w)){
                tekrarliKrktrlrList.add(w);
                System.out.println("Girdiğiniz ifadede '"+w+"' karakterinden " + sayac + " kez kullanıldı." );
            }
        }
        System.out.println("Diğer karakterler tekrar etmediği için görüntülenmedi.");

    }
}
