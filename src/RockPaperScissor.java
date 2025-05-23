import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----ROCK PAPER SCISSORS GAME ---------");
        System.out.println("Rules: \n \t 0 : ROCK \n \t 1 : PAPER \n \t 2 : SCISSORS");
        int userwin = 0;
        int computerWin = 0;
        int i = 0;
        while (i<5){
            int userInput = sc.nextInt();
            System.out.println("User entered: " + userInput);

            Random rand = new Random();
            int computer = rand.nextInt(3); // will generate numbers randomly of 0, 1, 2
            System.out.println("Computer entered: " + computer);

            if(userInput == computer ){
                System.out.println("The match is draw");
            }
            else if(userInput == 0 && computer ==2 || userInput == 1 && computer == 0 ||userInput == 2 && computer ==1){
                System.out.println("user wins!!");
                userwin +=1 ;
            }
            else {
                System.out.println("computer wins!!");
                computerWin +=1;
            }
            i++;
        }
        if (userwin > computerWin) {
            System.out.println("user is final winner!!!");
        }
        else if (computerWin > userwin) {
            System.out.println("computer is the final winner!!");
        }
        else {
            System.out.println("🥲☹️the final result is draw!!!..........");
        }

    }
}
