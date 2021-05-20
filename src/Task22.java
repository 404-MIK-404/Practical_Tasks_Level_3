import java.util.Scanner;

public class Task22 {

    private static float shortlenght;

    public static void main(String[] args)
    {
        float[] maslenght = new float[2];
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите значение короткой стороны треугольника: ");
        shortlenght = ui.nextFloat();
        maslenght[0] = findLongLenght(shortlenght);
        maslenght[1] = findAvgLenght(maslenght);
        System.out.format("Значение длинной стороны %.2f \nЗначение средней стороны %.2f",maslenght[0], maslenght[1]);
    }

    public static float findLongLenght(float value)
    {
        return (float)(value/Math.sin(Math.toRadians(30)));
    }

    public static float findAvgLenght(float[] maslenght)
    {
        return (float) (maslenght[0] * Math.cos(Math.toRadians(30)));
    }

}
