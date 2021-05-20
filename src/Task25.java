import java.util.Scanner;

public class Task25 {


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
                if (!Character.isLowerCase(checkregister))
                {
                    temp += Character.toLowerCase(checkregister);
                }
            }
            temp += " ";
        }
        System.out.print("Результат преобразования текста: " + temp);

    }


}
