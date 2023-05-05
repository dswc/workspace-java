package project1;

public class Main {
    public static void main(String[] args) {
        DeckOfCard myDeckOfCard = new DeckOfCard();

        myDeckOfCard.shuffle();

        Card[] cards = myDeckOfCard.dealCards(7);
        for (int i = 0; i < cards.length; i++)
            System.out.println(cards[i].toString());
    }
}
