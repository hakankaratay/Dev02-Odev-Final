package odev;

import java.util.Scanner;

public class Odev02 {

    public static void main(String[] args) {
        //Verilen String ifadenin palindrome olup olmadığını kontrol eden kod yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen palindrome olup olmadığını kontrol etmem için bir kelime giriniz: ");
        String a = scan.nextLine();

        int i=0;
        int sayac = 0;
        do {
            if (a.charAt(i) == a.charAt(a.length() - 1 - i)) {
            } else {
                sayac++;
            }
            i++;
        } while (i < a.length()-i);

        if (sayac==0) {
            System.out.println(a + " ifadesi palindromdur.");
        } else {
            System.out.println(a + " ifadesi palindrom değildir.");
        }

    }
}
