
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Black Jack"); // c#: Console.WriteLine("text")

        //create a deck
        String[] deck = new String[]{"Hjärter Ess", "Hjärter 2", "Hjärter 3", "Hjärter 4", "Hjärter 5", "Hjärter 6", "Hjärter 7", "Hjärter 8", "Hjärter 9", "Hjärter 10", "Hjärter Knekt", "Hjärter Dam", "Hjärter Kung",
            "Spader Ess", "Spader 2", "Spader 3", "Spader 4", "Spader 5", "Spader 6", "Spader 7", "Spader 8", "Spader 9", "Spader 10", "Spader Knekt", "Spader Dam", "Spader Kung",
            "Ruter Ess", "Ruter 2", "Ruter 3", "Ruter 4", "Ruter 5", "Ruter 6", "Ruter 7", "Ruter 8", "Ruter 9", "Ruter 10", "Ruter Knekt", "Ruter Dam", "Ruter Kung",
            "Klöver Ess", "Klöver 2", "Klöver 3", "Klöver 4", "Klöver 5", "Klöver 6", "Klöver 7", "Klöver 8", "Klöver 9", "Klöver 10", "Klöver Knekt", "Klöver Dam", "Klöver Kung"};

        //PLayer hand
        String[] playerHand = new String[12];

        // Pick a random card
        Random randGen = new Random();
        int cardIndex = randGen.nextInt(52);
        playerHand[0] = deck[cardIndex];

        // Pick a random card
        cardIndex = randGen.nextInt(52);
        playerHand[1] = deck[cardIndex];

        //Print player hand
        //printPlayerHand(playerHand);
        int playerValue = calculateValues(playerHand, deck);
        System.out.println("The players hand is worth " + playerValue);

    }

    //Calculates the value of a stack of card
    public static int calculateValues(String[] stack, String[] deck) {
        int sum= 0;
        //loop through the stack 
        for (int i = 0; i < stack.length; i++) {
            String currentCard = stack[i];
            System.out.println("current card is " + currentCard);
            // only loop through the deck if the card is not null
            if (currentCard != null) {
                int index= findIndex(currentCard,deck);
                int value = index % 13 + 1; // +1 because H5 index 4 gives value 4
                if (value > 10){
                    value = 10;
                }
                sum= sum+value;
            }
        }
        return sum;
    }

    //finds index for a given card
    private static int findIndex(String currentCard, String[] deck) {
        for (int j = 0; j < deck.length; j++) {
            if (currentCard.equals(deck[j])) { //C#: currentCard == deck[i]
                System.out.println("card has index " + j);
                return j;
            }
        }
        return -1; // (should) Will never be activated but must be here
    }

    // Prints all cards in a stack of cards
    public static void printPlayerHand(String[] hand) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                System.out.println(hand[i]);
            }
        }
    }

}
