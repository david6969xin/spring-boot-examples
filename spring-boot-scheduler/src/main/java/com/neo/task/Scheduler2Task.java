package com.neo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Scheduler2Task {

    @Async
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        System.out.println("Scheduler2Task ==> " +
                LocalDateTime.now().toLocalTime() + " ===> " + Thread.currentThread().getName());
    }

}
