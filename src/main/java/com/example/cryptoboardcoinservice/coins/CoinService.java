package com.example.cryptoboardcoinservice.coins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CacheConfig(cacheNames = "coin")
@Service
public class CoinService {

    @Autowired
    private RestTemplate restTemplate;

    @Cacheable("allcoinscache")
    public List<Coin> GetCoins(){
        final String uri = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false";

        Coin[] coins = restTemplate.getForObject(uri, Coin[].class);

        return Arrays.asList(coins);
    }
}
