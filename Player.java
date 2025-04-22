
import java.util.Scanner;

public class Player
{
  private int score;
  private String name;
  
  public Player(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    name = sc.nextLine();
    score = 0;
  }


  public int getScore(){
    return score;
  }

  public String getName(){
    return name;
  }
  public void updateScore(int s){
    score += s;
  }
  public void setName(String n){
    name = n;
  }

}