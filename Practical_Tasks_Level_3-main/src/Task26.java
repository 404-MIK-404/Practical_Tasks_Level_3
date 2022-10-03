import java.util.Scanner;

public class Task26 {

    /**
     *
     * Создайте функцию, которая принимает строку из одного слова и выполняет следующие действия:
     *
     * Конкатенирует inator до конца, если слово заканчивается согласным, в противном случае вместо него конкатенирует  -inator
     * Добавляет длину слова исходного слова в конец, снабженный '000'.
     * Пример:
     * inatorInator("Shrink") ➞ "Shrinkinator 6000"
     *
     * inatorInator("Doom") ➞ "Doominator 4000"
     *
     * inatorInator("EvilClone") ➞ "EvilClone-inator 9000"
     *
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
        inatorInator(line);

    }

    public static void inatorInator(String line)
    {
        char temp = Character.toLowerCase(line.charAt(line.length()-1));
        int count = line.length();
        if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
        {
            line += "-inator "+ Integer.toString(count)+"000";
        }
        else
        {
            line += "inator "+ Integer.toString(count)+ "000";
        }
        System.out.print("Результат преобразования текста: " + line);
    }


}
