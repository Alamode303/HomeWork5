package task5_2;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
/*
Найти количество вхождений одной строки в другую.
Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
 */
/*
        string1 = "Java P y t h o n";
        String[] str = string1.split(" ");

        System.out.println(string1.startsWith("JJD"));
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова:");
        String words = scanner.nextLine();
        System.out.println("Какое слово искать?");
        String word1 = scanner.nextLine();
        String[] words2 = words.split(" ");
        int j = 0;
        for (int i = 0; i < words2.length; i++) {
            if (words2[i].contains(word1)) j++;
        }
        System.out.println("Количество повторений: " + j);
    }
}
