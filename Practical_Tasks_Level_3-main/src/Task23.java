import java.util.Scanner;

public class Task23 {


    /**
     *
     *  Создайте функцию, имитирующую игру "камень, ножницы, бумага". Функция принимает входные данные обоих игроков (камень, ножницы или бумага), первый параметр от первого игрока, второй от второго игрока. Функция возвращает результат как таковой:
     *
     * "Игрок 1 выигрывает"
     * "Игрок 2 выигрывает"
     * "НИЧЬЯ" (если оба входа одинаковы)
     * Правила игры камень, ножницы, бумага, если не известны:
     *
     * Оба игрока должны сказать одновременно "камень", "бумага" или "ножницы".
     * Камень бьет ножницы, бумага бьет камень, ножницы бьют бумагу.
     *
     * Пример:
     * rps("rock", "paper") ➞ "Player 2 wins"
     *
     * rps("paper", "rock") ➞ "Player 1 wins"
     *
     * rps("paper", "scissors") ➞ "Player 2 wins"
     *
     * rps("scissors", "scissors") ➞ "TIE"
     *
     * rps("scissors", "paper") ➞ "Player 1 wins"
     *
     *
     */


    private static String[] choicePlayer = new String[2];

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        for (int i = 0; i < choicePlayer.length;i++){
            System.out.print("Игрок №" + (i+1) + " выберите (Комень, ножница, бумага): ");
            choicePlayer[i] = ui.nextLine();
        }
        rps(choicePlayer);
    }

    public static void checkSecondPlayerChoice(String needEquals,String choiceSecondPlayer){
        if (needEquals.equals(choiceSecondPlayer)){
            System.out.print("Выиграл первый игрок");
        }
        else {
            System.out.print("Выиграл второй игрок");
        }

    }


    public static void rps(String[] choicePlayer)
    {
        if (choicePlayer[0].equals(choicePlayer[1])){
            System.out.print("Ничья");
        }
        else if ("камень".equals(choicePlayer[0])){
            checkSecondPlayerChoice("ножницы",choicePlayer[1]);
        }
        else if ("ножницы".equals(choicePlayer[0])){
            checkSecondPlayerChoice("бумага",choicePlayer[1]);
        }
        else if ("бумага".equals(choicePlayer[0])){
            checkSecondPlayerChoice("камень", choicePlayer[1]);
        }
    }

}
