import java.util.Scanner;

public class Task27 {

    public static void main(String[] args)
    {
        int a,b,c;
        int w,h;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите высоту кирпича: ");
        a = ui.nextInt();
        System.out.print("Введите ширину кирпича: ");
        b = ui.nextInt();
        System.out.print("Введите глубину кирпича: ");
        c = ui.nextInt();
        System.out.print("Введите ширину отверстия: ");
        w = ui.nextInt();
        System.out.print("Введите высоту отверстия: ");
        h = ui.nextInt();
        System.out.print("Результат: " + doesBrickFir(a,b,c,w,h));
    }

    public static boolean doesBrickFir(int a,int b,int c,int w,int h)
    {
        if (a * b <= w*h)
        {
            return true;
        }
        if (a * c <= w*h)
        {
            return true;
        }
        if (b * c <= w * h)
        {
            return  true;
        }
        return  false;
    }


}
