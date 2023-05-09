import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
      String[] rps = {"r","p","s"};
      String cumputerMove = rps[new Random().nextInt(rps.length)];


       String playerMove;
       while(true)
       {
           System.out.println("Please enter your move (r,p or s)");
         playerMove = scanner.nextLine();

         if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
         {
            break;
         }
         System.out.println(playerMove + " is not a valid move. ");
       }
    System.out.println("computer move: " + cumputerMove);

       if(playerMove.equals(cumputerMove)){
           System.out.println("The game was a tie");
       } else if (playerMove.equals("r")) {
           if(cumputerMove.equals("p")){
               System.out.println("You lose! ");
           } else if (cumputerMove.equals("s")) {
               System.out.println("You win! ");
           }
       }
       else if (playerMove.equals("p")) {
           if(cumputerMove.equals("r")){
               System.out.println("You win! ");
           } else if (cumputerMove.equals("s")) {
               System.out.println("You lose! ");
           }
       }
       else if (playerMove.equals("s")) {
           if (cumputerMove.equals("p")) {
               System.out.println("You win! ");
           } else if (cumputerMove.equals("r")) {
               System.out.println("You lose! ");
           }
       }
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y"))
            {
                break;
            }
            scanner.close();
     }
    }
}
;