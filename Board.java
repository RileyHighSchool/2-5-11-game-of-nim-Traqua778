import java.util.Scanner;
public class Board {
private static int pileSize;

    public static void populate(){
        int randomInt = (int) (Math.random() * 41) + 10;   
        pileSize = randomInt;
    }

    public static void takePieces(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pieces would you like to take");
        int pieces = sc.nextInt();
        while (pieces > pileSize/2 || pieces < 1){
            System.out.println("You need to take less than half, and more than one");
            pieces = sc.nextInt();
        }
        pileSize -= pieces;
    }

    public static int getpileSize(){
        return pileSize;
    }


}
