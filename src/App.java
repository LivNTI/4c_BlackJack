
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Black Jack"); // c#: Console.WriteLine("text")
        
        //create a deck
        String[] deck = new String[]{"H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","HJ","HQ","HK",
                                        "S1","S2","S3","S4","S5","S6","S7","S8","S9","S10","SJ","SQ","SK",
                                        "R1","R2","R3","R4","R5","R6","R7","R8","R9","R10","RJ","RQ","RK",
                                        "K1","K2","K3","K4","K5","K6","K7","K8","K9","K10","KJ","KQ","KK"} ;
        
        //PLayer hand
        String[] playerHand = new String[12];

        // Pick a random card
        Random randGen = new Random();
        int cardIndex= randGen.nextInt(52);
        playerHand[0] = deck[cardIndex];

        // Pick a random card
        cardIndex= randGen.nextInt(52);
        playerHand[1] = deck[cardIndex];

        //Print player hand
        printPlayerHand(playerHand);

    }

    public static void printPlayerHand(String[] hand){
        for(int i = 0; i < hand.length; i++){
            if(hand[i] != null){
                System.out.println(hand[i]);
            }
        }
    }
}
