package com.riches.service.mini.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer count0 = 1;
    private Integer count1 = 1;
    private Integer count2 = 1;
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() throws InterruptedException {
        System.out.println(String.format("1---第%s次执行，当前时间为：%s", count0++, dateFormat.format(new Date())));
    }

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTimeAfterSleep() throws InterruptedException {
        System.out.println(String.format("2===第%s次执行，当前时间为：%s", count1++, dateFormat.format(new Date())));
    }
    
    @Scheduled(cron = "*/5 * * * * *")
    public void reportCurrentTimeCron() throws InterruptedException {
        System.out.println(String.format("3+++第%s次执行，当前时间为：%s", count2++, dateFormat.format(new Date())));
    }

}
