import java.util.Scanner;

public class Task26 {

    public static void main(String[] args)
    {
        String line;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст для преобразования: ");
        line = ui.nextLine();
        inatorInator(line);

    }

    public static void inatorInator(String line)
    {
        char temp;
        temp = Character.toLowerCase(line.charAt(line.length()-1));
        int count = line.length();
        if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
        {
            line += "-inator "+ Integer.toString(count)+"000";
        }
        else
        {
            line += "inator "+ Integer.toString(count)+"000";
        }
        System.out.print("Результат преобразования текста: " + line);
    }


}
