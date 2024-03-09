package odev;

import java.util.ArrayList;

public class Odev05 {
    //Bunu yapamadım hocam. İşin içinden çıkamayınca ChatGPT ye baktım. ChatGPT Böyle bir
    // kod yazdı. Mantıklı ama kendi kendime bu kadarını kurgulayamadım.
    public static void main(String[] args) {
        //Girilen String bir ifadenin harfleri yer değiştirilerek oluşturulabilecek
        //anlamlı anlamsız bütün kelimeleri alt alta gösteren bir program yazınız

        String kelime = "merhaba";
        ArrayList<String> permütasyonlar = new ArrayList<>();
        permütasyonlarıBul(kelime.toCharArray(), 0, permütasyonlar);
        for (String s : permütasyonlar) {
            System.out.println(s);
        }
    }

    public static void permütasyonlarıBul(char[] kelime, int indeks, ArrayList<String> sonuçlar) {
        if (indeks == kelime.length - 1) {
            sonuçlar.add(new String(kelime));
            return;
        }

        for (int i = indeks; i < kelime.length; i++) {
            char temp = kelime[indeks];
            kelime[indeks] = kelime[i];
            kelime[i] = temp;

            permütasyonlarıBul(kelime, indeks + 1, sonuçlar);

            temp = kelime[indeks];
            kelime[indeks] = kelime[i];
            kelime[i] = temp;

        }
    }
}
