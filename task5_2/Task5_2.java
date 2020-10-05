package task5_2;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
/*
Найти количество вхождений одной строки в другую.
Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова:");
        String words = scanner.nextLine();
        System.out.println("Какое слово искать?");
        String word1 = scanner.nextLine();
        String[] words2 = words.split(" ");
        int j = 0;
        for (String s : words2) if (s.contains(word1)) j++;
        System.out.println("Количество повторений: " + j);
    }
}
