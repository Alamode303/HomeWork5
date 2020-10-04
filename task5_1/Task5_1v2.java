package task5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_1v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размар массива:");
        int n = scanner.nextInt();
        String[] wordsArrAll = new String[n];
        boolean stop = false;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите слово 1");
        String wordsToArr = scan1.nextLine();
        if (wordsToArr.compareTo("exit") == 0) stop = true;
        if (!stop) {
            for (int i = 1; i < n; i++) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите слово " + (i + 1));
                String words = scan.nextLine();
                String words2;
                if (words.compareTo("exit") == 0) break;
                else if (wordsToArr.contains(words)) {
                    System.out.println("Такое слово есть");
                    i--;
                } else {
                    words2 = wordsToArr.concat(" ").concat(words);
                    wordsToArr = words2;
                }
            }
            String[] wordsArr = wordsToArr.split(" ");
            if (wordsArr.length < n) {
              //String[] wordsArrAll = new String[n];
                for (int i = 0; i < wordsArr.length; i++) {
                    wordsArrAll[i] = wordsArr[i];
                }
                System.out.println(Arrays.toString(wordsArrAll));
            } else {
                System.out.println(Arrays.toString(wordsArr));
            }
        }
        else System.out.println(Arrays.toString(wordsArrAll));
    }
}

