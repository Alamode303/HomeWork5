package task5_4;

import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args){
        /*
        Заменить все буквы в слове на строчные, а первую букву на заглавную
Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
         */
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String word2 = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        System.out.println(word2);
    }
}
