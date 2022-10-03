import java.util.Scanner;

public class Task22 {


    /**
     * Учитывая самую короткую сторону треугольника 30° на 60° на 90°, вы должны найти другие 2 стороны (верните самую длинную сторону, сторону средней длины).
     *
     * Пример:
     * otherSides(1) ➞ [2.0, 1.73]
     *
     * otherSides(12) ➞ [24.0, 20.0]
     *
     * otherSides(2) ➞ [4.0, 3.46]
     *
     * otherSides(3) ➞ [6.0, 5.2]
     *
     * Примечание:
     * - треугольники 30° на 60° на 90° всегда следуют этому правилу, скажем, самая короткая длина стороны равна x единицам, гипотенуза будет равна 2 единицам, а другая сторона будет равна x * root3 единицам.
     * - Результаты тестов округляются до 2 знаков после запятой.
     * - Верните результат в виде массива.
     *
     *
     */

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
