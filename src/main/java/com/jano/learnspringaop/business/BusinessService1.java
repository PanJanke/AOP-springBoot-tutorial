package com.jano.learnspringaop.business;

import java.util.Arrays;

import com.jano.learnspringaop.annotations.TrackTime;
import com.jano.learnspringaop.data.DataService1;
import org.springframework.stereotype.Service;



@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax() {
        int[] data = dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
