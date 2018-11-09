package com.example.demo.Serwis;

import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class RandomSerwis {

    private Random random = new Random();
    public int getSmallInt(){
        return random.nextInt(100);
    }
    public int getBigInt(){
        return random.nextInt(100_000);
    }
}
