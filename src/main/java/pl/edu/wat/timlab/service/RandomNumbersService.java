package pl.edu.wat.timlab.service;

import java.util.List;

/**
 * Created by Aleksander Małkowicz, Date: 23.05.2018
 * Copyright by RelayOnIT, Warszawa 2018
 */
public interface RandomNumbersService {

    List<Integer> getRandomNumbers(int amount);
}
