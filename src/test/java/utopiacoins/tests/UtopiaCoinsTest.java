package utopiacoins.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utopiacoins.Coins;

public class UtopiaCoinsTest {
    Coins coins = new Coins();

    @Test
    void Calculate(){
        Assertions.assertEquals(1, coins.iDontLikeCoins(1));
        Assertions.assertEquals(1, coins.iDontLikeCoins(7));
        Assertions.assertEquals(1, coins.iDontLikeCoins(10));
        Assertions.assertEquals(1, coins.iDontLikeCoins(22));
        Assertions.assertEquals(3, coins.iDontLikeCoins(15));
        Assertions.assertEquals(2, coins.iDontLikeCoins(29));
        Assertions.assertEquals(6, coins.iDontLikeCoins(69));
        Assertions.assertEquals(5, coins.iDontLikeCoins(71));
        Assertions.assertEquals(7, coins.iDontLikeCoins(100));
    }
}
