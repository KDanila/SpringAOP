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
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Everything is ok";
    }

    public String getFortune(boolean isExceptionNeedToThrow) {
        if (isExceptionNeedToThrow) {
            throw new RuntimeException("Shit is happen");
        }
        return getFortune();
    }
}
