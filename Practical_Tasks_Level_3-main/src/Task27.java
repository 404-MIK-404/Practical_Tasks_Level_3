import java.util.Scanner;

public class Task27 {
    /**
     *
     * Напишите функцию, которая принимает три измерения кирпича: высоту(a), ширину(b) и глубину(c) и возвращает true, если этот кирпич может поместиться в отверстие с шириной(w) и высотой(h).
     *
     * Пример:
     * doesBrickFit(1, 1, 1, 1, 1) ➞ true
     *
     * doesBrickFit(1, 2, 1, 1, 1) ➞ true
     *
     * doesBrickFit(1, 2, 2, 1, 1) ➞ false
     *
     * Примечание:
     * - Вы можете повернуть кирпич любой стороной к отверстию.
     * - Мы предполагаем, что кирпич подходит, если его размеры равны размерам отверстия (то есть размер кирпича должен быть меньше или равен размеру отверстия, а не строго меньше).
     * - Нельзя класть кирпич под неортогональным углом.
     *
     *
     *
     * */
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
