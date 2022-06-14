package Game;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public void startGame() {

        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessplayer1 = 0;
        int guessplayer2 = 0;
        int guessplayer3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);

        System.out.println("Я загадываю число от 0 до 9,,,");

        while(true){
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            guessplayer1 = player1.number;
            System.out.println("Перый игрок думает, что это " + guessplayer1);

            guessplayer2 = player2.number;
            System.out.println("Второй игрок думает, что это " + guessplayer2);

            guessplayer3 = player3.number;
            System.out.println("Третий игрок думает, что это " + guessplayer3);

            if (guessplayer1 == targetNumber){
                p1isRight = true;
            }
            if (guessplayer2 == targetNumber){
                p2isRight = true;
            }
            if (guessplayer3 == targetNumber){
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры.");
                break;
            }else {
                System.out.println("Игроки должны попробовать ещё раз.");
            }
        }

    }

}
