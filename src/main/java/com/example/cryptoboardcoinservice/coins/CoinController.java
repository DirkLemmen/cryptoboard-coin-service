package com.example.cryptoboardcoinservice.coins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/public/coins")
public class CoinController {

    private final CoinService coinService;

    @Autowired
    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @GetMapping()
    public List<Coin> GetCoins()
    {
        return coinService.GetCoins();
    }

//    public List<Coin> coinFallback(){
//        return Arrays.asList(new Coin());
//    }

}
