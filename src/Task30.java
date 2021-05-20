import java.util.Scanner;

public class Task30 {

    public static void main(String[] args)
    {
        int value;
        int temp = 0;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите число: ");
        value = ui.nextInt();
        for (int i = 0; i < Integer.toString(value).length();i++)
        {
            temp += Character.getNumericValue(Integer.toString(value).charAt(i));
        }
        System.out.print("Результат преобразования: " + temp + " данные числа является " + parityAnalysis(value,temp));
    }

    public static boolean parityAnalysis(int value,int temp)
    {
        if ((value %2 == 0 && temp % 2 == 0) || (value %2 != 0 && temp % 2 != 0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
