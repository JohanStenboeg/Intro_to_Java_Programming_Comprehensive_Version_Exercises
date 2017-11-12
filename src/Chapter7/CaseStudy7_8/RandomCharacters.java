package Chapter7.CaseStudy7_8;

public class RandomCharacters {


    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }


    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
}






