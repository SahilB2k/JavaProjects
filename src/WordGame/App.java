package WordGame;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String[] words={"java","Programming","class","character","method"};
        WordGuess game=new WordGuess(words,10);
        Scanner scan=new Scanner(System.in);
        boolean shouldPlayAgain=false;

        int wins=0;
        int losses=0;
        do{
            char playAgain=scan.nextLine().toLowerCase().charAt(0);
            String result=game.play();
            if(result.equals("win")) {
                wins += 1;
            }else{
                losses+=1;


            }

            System.out.println("Wins:"+wins+"  "+"Losses:"+losses);

            System.out.print("Do you want to play again?(y/n");
            shouldPlayAgain=playAgain=='y';

        }while(shouldPlayAgain);


        game.play();




    }
}
