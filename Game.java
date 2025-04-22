import java.util.Scanner;

public class Game {
    
    private Player player1;
    private Player player2;
    private Player currPlayer;
    Scanner input = new Scanner(System.in);

    public Game(){
        player1 = new Player();
        player2 = new Player();


    }

    public void setFirstPlayer(){
        if (Math.random() > .5){
            currPlayer = player1;
            System.out.println(player1.getName() + " is the first player");
          } else {
            currPlayer = player2;
            System.out.println(player2.getName() + " is the first player");
          } 
    }

    public void endGame(){
      if (player1.getScore() > player2.getScore()){
        System.out.println(player1.getName() + ", " + "You won! \n");
  
      } else if (player2.getScore() > player1.getScore()){
        System.out.println(player2.getName() + ", " + "You won! \n");
  
      } else {
        System.out.println("The game ends in a tie!");
      }
    }

    public void switchPlayer(){
      if (currPlayer == player1){
        currPlayer = player2;
        System.out.println(player2.getName() + ", " + "your turn:");;
      } else{
        currPlayer = player1;
        System.out.println(player1.getName() + ", " + "your turn:");;
      }
    }

    public void play(){
      setFirstPlayer();

      while (Board.getpileSize() > 1){
      System.out.println("Pieces: " + Board.getpileSize());

      Board.takePieces();
      switchPlayer();    
      }

      if (currPlayer == player1){
        player1.updateScore(1);
        System.out.println(player1.getName()  + ", you win!");
      } else {
      player2.updateScore(1);
      System.out.println(player2.getName()  + ", you win!");}

      System.out.println("Do you want to play again?");
      String playAgain = input.nextLine();
      if (playAgain.equals("y") || playAgain.equals("yes")){
        Board.populate();
        play();
  
      } else if (playAgain.equals("n") || playAgain.equals("no")){
        endGame();
      } else {
        System.out.println("Please put a valid response, (yes, y, no, n)");
      }
    }

}
