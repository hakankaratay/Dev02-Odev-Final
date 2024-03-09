package odev;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev01 {
    public static void main(String[] args) {

        //Girilen string bir ifadede tekrar etmeyen ilk karakteri getiren kodu yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tekrar etmeyen ilk karakteri kontrol etmem için bir ifade giriniz: ");
        String s = scanner.nextLine();

        //1.yol:

        char [] krktrlr = s.toCharArray();
        ArrayList<Character> krktrlrList = new ArrayList<>();

        for (char w: krktrlr){
            krktrlrList.add(w);
        }
        System.out.println(krktrlrList);//Artık String deki her karakteri barındıran bir Array Listimiz var.

        ArrayList<Character> kopya = new ArrayList<>();
        for (char w : krktrlr){
            kopya.add(w);
        } //Aynı list in kopyasını oluşturdum.

        // Şimdi bu kopya Array list içinde gezinerek tekrar eden karakterleri bulalım
        // ve orjinal Array listimizde * ile işaretleyelim

        for (int i = 0; i < kopya.size(); i++) {
            for (int j = 0; j < kopya.size(); j++) {
                if (i!=j && kopya.get(i).equals(kopya.get(j))){
                    krktrlrList.set(i,'*');
                }
            }
        }
        System.out.println(krktrlrList); //tekrar edenleri * ladık. Şimdi tekrarsızları yeni bir ArrayListe ekleyelim
        ArrayList<Character> sonHali = new ArrayList<>();
        for (char w: krktrlrList){
            if(w != '*'){
                sonHali.add(w);
            }
        }

        System.out.println(sonHali);

        //Şimdi de tekrar etmeyen ilk karakterimizi yazdıralım
        char tekrarsizIlkKarakter = sonHali.get(0);
        System.out.println("Tekrarsız ilk karakter: " + tekrarsizIlkKarakter);

        //2.yol:

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean iceriyorMu = (s.substring(0,i) + s.substring(i+1)).contains(s.substring(i,i+1));
            if (iceriyorMu){

            } else {
                System.out.println("Tekrarsız ilk karakter: " + s.substring(i,i+1));
                counter ++;
            }
            if (counter == 1){
                break;
            }
        }



    } // main dışı




}
