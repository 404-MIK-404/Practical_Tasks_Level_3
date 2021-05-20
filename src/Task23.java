import java.util.Scanner;

public class Task23 {

    private static String playerone;
    private static String playertwo;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Игрок номер один выберите: ");
        playerone = ui.nextLine();
        System.out.print("Игрок номер один выберите: ");
        playertwo = ui.nextLine();
        rps(playerone,playertwo);
    }


    public static void rps(String playerone,String playertwo)
    {
        if (playerone.equals(playertwo))
        {
            System.out.print("TIE");
        }
        if (playerone.equals("rock"))
        {
            if (playertwo.equals("scissors"))
            {
                System.out.print("Player 1 wins");
            }
            System.out.print("Player 2 wins");
        }
        if (playerone.equals("paper"))
        {
            if (playertwo.equals("rock"))
            {
                System.out.print("Player 1 wins");
            }
            System.out.print("Player 2 wins");
        }
        if (playerone.equals("scissors"))
        {
            if (playertwo.equals("paper"))
            {
                System.out.print("Player 1 wins");
            }
            System.out.print("Player 2 wins");

        }
    }

}
