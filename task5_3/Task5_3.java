package task5_3;

import java.util.Objects;
import java.util.Scanner;

/*
Написать функцию, которая проверяет, является ли строка палиндромом.
Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам
или по словам как слева направо, так и справа налево.
Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
 */
public class Task5_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полиндром:");
        String polindrome = scanner.nextLine();
        String polindrome1 = polindrome.replaceAll("\\s", "").toLowerCase();
        StringBuffer polindrome2 = new StringBuffer(polindrome1);
        //System.out.println(polindrome2.reverse().toString());
        if (polindrome1.compareTo(polindrome2.reverse().toString()) == 0) System.out.println("Это полиндром");
        else System.out.println("Это не полиндром");
    }
}
