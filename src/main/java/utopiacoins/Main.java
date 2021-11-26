package utopiacoins;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coins coins = new Coins();
        Scanner s = new Scanner(System.in);
        System.out.println("Select a an amount:");
        int N = s.nextInt();
        //System.out.println("The minimum number of coins is: " + coins.iDontLikeCoins(N));
        System.out.println ( "Minimum coins required is "
                + coins.iDontLikeCoins(N));
    }

}
