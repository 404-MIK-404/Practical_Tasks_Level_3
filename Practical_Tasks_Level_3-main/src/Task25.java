import java.util.Scanner;

public class Task25 {


    /**
     *
     *
     * Учитывая строку, создайте функцию для обратного обращения. Все буквы в нижнем регистре должны быть прописными, и наоборот.
     *
     * Пример:
     * reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"
     *
     * reverseCase("MANY THANKS") ➞ "many thanks"
     *
     * reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"
     *
     *
     *
     *
     */

    public static void main(String[] args)
    {
        String line;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст для преобразования: ");
        line = ui.nextLine();
        reverseCase(line);

    }

    public static void reverseCase(String line)
    {
        String temp = "";
        for(String text: line.split("[!]|[ ]|[.]|[?]|[,]"))
        {
            for (int i = 0; i < text.length(); i++)
            {
                char checkregister = text.charAt(i);
                if(Character.isLowerCase(checkregister))
                {
                    temp += Character.toUpperCase(checkregister);
                }
                else {
                    temp += Character.toLowerCase(checkregister);
                }
            }
            temp += " ";
        }
        System.out.print("Результат преобразования текста: " + temp);

    }


}
