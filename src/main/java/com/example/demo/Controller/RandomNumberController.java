package com.example.demo.Controller;

import com.example.demo.Serwis.RandomSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
@Controller




public class RandomNumberController {
    private RandomSerwis randomSerwis;
@Autowired
    public RandomNumberController(RandomSerwis randomSerwis) {
        this.randomSerwis = randomSerwis;
    }

    @GetMapping("/small")
    @ResponseBody
    public String smallRandom(){
        int smallInt = randomSerwis.getSmallInt();
        return "Losowa liczba :" + smallInt;
    }
    @GetMapping("/big")
    @ResponseBody
    public String bigRandom(){
        int bigInt = randomSerwis.getBigInt();
        return "Losowa liczba :" + bigInt;
    }
}
