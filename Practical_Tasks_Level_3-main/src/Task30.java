import java.util.Scanner;

public class Task30 {

    /**
     *
     * Создайте функцию, которая принимает число в качестве входных данных и возвращает true, если сумма его цифр имеет ту же четность, что и все число. В противном случае верните false.
     *
     * Пример:
     * parityAnalysis(243) ➞ true
     * // 243 is odd and so is 9 (2 + 4 + 3)
     *
     * parityAnalysis(12) ➞ false
     * // 12 is even but 3 is odd (1 + 2)
     *
     * parityAnalysis(3) ➞ true
     * // 3 is odd and 3 is odd and 3 is odd (3)
     *
     */


    public static void main(String[] args)
    {
        int value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите число: ");
        value = ui.nextInt();
        System.out.print("Результат: " + parityAnalysis(value));
    }

    public static boolean parityAnalysis(int value)
    {
        int sum = 0;
        int valueWhile = value;
        while (valueWhile != 0){
            sum += valueWhile % 10;
            valueWhile = valueWhile / 10;
        }
        return sum % 2 == value % 2;
    }

}
