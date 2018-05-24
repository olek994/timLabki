package pl.edu.wat.timlab.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.edu.wat.timlab.service.RandomNumbersService;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Aleksander Małkowicz, Date: 23.05.2018
 * Copyright by RelayOnIT, Warszawa 2018
 */
@Service
@Slf4j
public class RandomNumbersServiceImpl implements RandomNumbersService{


    @Override
    public List<Integer> getRandomNumbers(int amount) {
        if(amount < 1){
            return null;
        }

        List<Integer> numbers = new LinkedList<>();
        Random r = new Random();
        for(int i = 0;i<amount;i++){
            numbers.add(r.nextInt(100));
        }

        return numbers;
    }
}
