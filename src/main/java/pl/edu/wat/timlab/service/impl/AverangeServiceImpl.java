package pl.edu.wat.timlab.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.edu.wat.timlab.service.AverangeService;

import java.util.List;

/**
 * Created by Aleksander Małkowicz, Date: 23.05.2018
 * Copyright by RelayOnIT, Warszawa 2018
 */
@Service
@Slf4j
public class AverangeServiceImpl implements AverangeService {

    @Override
    public double getAverange(List<Integer> numbers) {
        if (numbers == null) {
            return -1;
        }

        double averange = 0;

        for(Integer n: numbers){
            averange += n;
        }
        averange /= numbers.size();

        return averange;
    }
}
