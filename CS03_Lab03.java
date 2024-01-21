import java.util.Scanner;

public class CS03_Lab03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num, rank, suit;
        String card = "";

        System.out.print("Enter Card Number (1-52): ");
        num = scanner.nextInt();

        rank = num % 13;
        if (rank == 0) {
            rank = 13;
        }

        suit = (num / 13);
        if (suit > 1) {
            suit -= 1;
        }
        switch (rank) {
            case 1:
                card += "Ace of ";
                break;
            case 2:
                card += "Two of ";
                break;
            case 3:
                card += "Three of ";
                break;
            case 4:
                card += "Four of ";
                break;
            case 5:
                card += "Five of ";
                break;
            case 6:
                card += "Six of ";
                break;
            case 7:
                card += "Seven of ";
                break;
            case 8:
                card += "Eight of ";
                break;
            case 9:
                card += "Nine of ";
                break;
            case 10:
                card += "Ten of ";
                break;
            case 11:
                card += "Jack of ";
                break;
            case 12:
                card += "Queen of ";
                break;
            case 13:
                card += "King of ";
                break;
        }

        switch (suit) {
            case 0:
                card += "Clubs";
                break;
            case 1:
                card += "Diamonds";
                break;
            case 2:
                card += "Hearts";
                break;
            case 3:
                card += "Spades";
                break;
        }

        System.out.println("The card you picked is " + card );

    }
}