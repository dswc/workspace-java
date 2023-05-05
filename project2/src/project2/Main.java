package project2;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] suits = { "♣", "♦", "♥", "♠" };
        String[] deckOfCardFace = new String[52];
        String[] deckOfCardSuit = new String[52];
        int count = 0;

        // initial the deckOfCard
        for (int i = 0; i < deckOfCardFace.length; i++) {
            deckOfCardFace[i] = faces[i % 13];
            deckOfCardSuit[i] = suits[i / 13];
        }

        // 第 1 次 洗牌
        shuffle(deckOfCardFace, deckOfCardSuit, count, false);
        // 第 1 次 發牌
        count = dealCard(deckOfCardFace, deckOfCardSuit, 3, count, false);

        // 第 2 次 洗牌
        shuffle(deckOfCardFace, deckOfCardSuit, count, false);
        // 第 2 次 發牌
        count = dealCard(deckOfCardFace, deckOfCardSuit, 2, count, false);

        // 第 3 次 發過的牌組 去 洗牌
        shuffle(deckOfCardFace, deckOfCardSuit, count, true);
        // 第 3 次 發過的牌組 去 發牌
        dealCard(deckOfCardFace, deckOfCardSuit, 6, count, true);
     
        // 第 4 次 洗牌
        shuffle(deckOfCardFace, deckOfCardSuit, count, false);
        // 第 4 次 發牌
        count = dealCard(deckOfCardFace, deckOfCardSuit, 2, count, false);

    }

    public static void shuffle(String[] deckOfCardFace, String[] deckOfCardSuit, int count, boolean used) {
        SecureRandom randomNum = new SecureRandom();

        int i;
        int randNum;
        int times;
        if (!used) {
            i = count;
            randNum = randomNum.nextInt(52 - count) + count;
            times = deckOfCardFace.length;
        } else {
            i = 0;
            randNum = randomNum.nextInt(count);
            times = count;
        }

        for (; i < times; i++) {

            String tempFace = deckOfCardFace[randNum];
            String tempSuit = deckOfCardSuit[randNum];

            deckOfCardFace[randNum] = deckOfCardFace[i];
            deckOfCardSuit[randNum] = deckOfCardSuit[i];

            deckOfCardFace[i] = tempFace;
            deckOfCardSuit[i] = tempSuit;
        }
    }

    public static int dealCard(String[] deckOfCardFace, String[] deckOfCardSuit, int numOfCards, int count,
            boolean used) {
        if (used)
            count = 0;
        for (int i = 0; i < numOfCards; i++) {
            String face = deckOfCardFace[count];
            String suit = deckOfCardSuit[count];
            count++;
            System.out.println(face + '_' + suit);
        }
        System.out.println("=======================");
        return count;
    }
}
