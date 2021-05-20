import java.util.Scanner;

public class Task28 {

    public static void main(String[] args)
    {
        float oil,oilrasxod;
        int pass;
        boolean condi = false;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите топливо: ");
        oil = ui.nextFloat();
        System.out.print("Введите расход топлива: ");
        oilrasxod = ui.nextFloat();
        System.out.print("Количество пассажиров: ");
        pass = ui.nextInt();
        System.out.print("Включить кондиционер: (Да - 1/ Нет - 2) \n");
        switch (ui.nextInt())
        {
            case 1:
                condi = true;
                break;

            case 2:
                condi = false;
                break;

            default:
                break;
        }
        System.out.print("Максимальная дистанция: " + totalDistance(oil,oilrasxod,pass,condi));
    }

    public static float totalDistance(float oil,float oilrasxod, int pass,boolean condi)
    {
       float value = oilrasxod * (100 + (pass*5))/100;
       if (condi)
       {
           float value1 = (value * 110) / 100;
           return (oil/value1) * 100;
       }
       return (oil/value) * 100;
    }

}
