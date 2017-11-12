package Chapter7.CaseStudy7_8;

import java.util.*;

public class CaseStudyCountingTheOccurrencesOfEachLetter {
    public static void main(String[] args) {
        char[] chars = createArray(); //deklarerer og laver en array.
        System.out.print("The lovercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars); //Tæller visningen af hvert bogstav.

        System.out.println();
        System.out.print("The occurences of each letter are: ");
        displayCounts(counts); //Viser hvor antallet af hvert bogstav.
    }

    public static char[] createArray() {
        char[] chars = new char[100]; //laver en array og dekeklarere den.

        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacters.getRandomLowerCaseLetter();

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.print(chars[i]);
            else System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.print(counts[i] + " " + (char) (i + 'a'));
            else
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
        }
    }
}
