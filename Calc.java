package KataCalc;

import java.util.Scanner;

public class Calc {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Введите 2 числа (римские/арабские) до 10 и одной дейтсвие (+, -, *, /)");
           String input = sc.nextLine();
           System.out.println(calc(input));

       }

       public static String calc (String input){
           String[] inputArr = input.split(" ");
           if (inputArr.length !=3){
               throw new IllegalArgumentException("Необходимо ввести 2 числа и одно действие (+, -, /, *)");
           }

           String first = inputArr[0];
           String deystvie = inputArr[1];
           String second = inputArr[2];
           if ((first.matches("\\d") && second.matches("[IVXLC]+")) || (first.matches("[IVXLC]+") && second.matches("\\d")))
           {
               throw new IllegalArgumentException("Используются одновременно арабское и римское число");
           }
           if (!((first.matches("\\d") && second.matches("\\d")) || (first.matches("[IVXLC]+") && second.matches("[IVXLC]+"))))
           {
               throw new IllegalArgumentException("Введен неверный формат данных. Используйте числа от 1 до 10 или от I до X");
           }
           if (deystvie.matches("[^+*\\-/]"))
           {
               throw new IllegalArgumentException("Вы ввели неверное действие");
           }
           if (first.matches("\\d") && second.matches("\\d")) {
               return switch (deystvie) {
                   case "+" -> ArabicNumberCalculation.plus(first, second);
                   case "-" -> ArabicNumberCalculation.minus(first, second);
                   case "/" -> ArabicNumberCalculation.del(first, second);
                   default -> ArabicNumberCalculation.umn(first, second);
               };
           }
           if (first.matches("[IVXLC]+") && second.matches("[IVXLC]+")) {
               return switch (deystvie) {
                   case "+" -> RomanNumbersCalculation.plus(first, second);
                   case "-" -> RomanNumbersCalculation.minus(first, second);
                   case "/" -> RomanNumbersCalculation.del(first, second);
                   default -> RomanNumbersCalculation.umn(first, second);
               };

           }

           return "0";


       }




}















