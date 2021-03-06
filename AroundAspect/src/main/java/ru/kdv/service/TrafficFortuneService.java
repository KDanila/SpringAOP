package ru.kdv.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {
    /**
     * Simulate SIMPLE delay.
     *
     * @return
     */
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Expect heavy traffic";
    }
}
