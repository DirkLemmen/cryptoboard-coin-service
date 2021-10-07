package com.example.cryptoboardcoinservice.coins;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CoinServiceTest {

    private CoinService underTest;

    @Test
    void givenCallToGetCoinsShouldReturnListOfCoins()
    {
        underTest.GetCoins();
        underTest.GetCoins();
        underTest.GetCoins();
        underTest.GetCoins();

    }
}