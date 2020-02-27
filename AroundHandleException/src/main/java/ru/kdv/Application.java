package ru.kdv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kdv.configuration.Config;
import ru.kdv.dao.AccountDAO;
import ru.kdv.service.TrafficFortuneService;

import java.util.logging.Logger;

public class Application {
    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        boolean throwEcxeption = true;
        logger.info(trafficFortuneService.getFortune(throwEcxeption));
        logger.info("Finished.");
        context.close();
    }
}