package Chapter_9.Opg9_3;
/*
Program funtion:
Selvbestemte værdier for antal sekunder omregnet til dato og tid.
Author: Johan Stenbøg
Reason: Homework during education.
Due date: 28/09 2017
Country: Denmark
 */
public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date(); //Siden date classen allerede er lavet i intellij, så henter man den bare.
        System.out.println("De forskellige mængde milisekunder omskrevet til datoer, der viser datoen og tiden i antal sekunder efter computeren startede med at tælle. ALtså tirsdag d. 1 Januar CET 1970 kl. 01:00:00");
        for (long i = 12000; i <= 1e12; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}