package com.neo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Scheduler1Task {

    /**
     * Cron表达式参数分别表示：
     * 秒（0~59） 例如0/5表示每5秒
     * 分（0~59）
     * 时（0~23）
     * 日（0~31）的某天，需计算
     * 月（0~11）
     * 周几（ 可填1-7 或 SUN/MON/TUE/WED/THU/FRI/SAT）
     */

    @Async
    @Scheduled(cron = "0/1 * * * * ?")
    public void process() {
        System.out.println("Scheduler1Task ==> " +
                LocalDateTime.now().toLocalTime() + " ===> " + Thread.currentThread().getName());
    }

}
