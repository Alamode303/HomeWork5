package task5_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_5 {
    public static void main(String[] args) {
        /*
        Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
         */
        System.out.println("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        int wordNo = 0;

        String[] wordsArr = words.split(" ");

        //берем длину каждого слова и сортируем.
        int[] sort1 = new int[wordsArr.length];
        for (int i = 0; i < sort1.length; i++) {
            sort1[i] = wordsArr[i].length();
        }
        Arrays.sort(sort1);
        int a = 0;
        Boolean stop = false;
        for (int i = 0; i < sort1.length; i++) {
            if (a == sort1[i]) {
                stop = true;
                System.out.println("есть одинаковые по длине слова");
            } else a = sort1[i];
        }
        if (!stop) {
            for (int i = 0; i < wordsArr.length; i++) {
                if (wordsArr[i].length() == a) {
                    wordNo = i;
                }
            }
            System.out.println("Самое длинное слово: " + wordsArr[wordNo]);
        }
    }
}
