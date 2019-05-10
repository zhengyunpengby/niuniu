package com.niuniulove.niuniu.schedule;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @program: niuniu
 * @description: 定时任务
 * @author:
 * @create: 2019-05-10 13:44
 **/
//@EnableAsync
@EnableScheduling
@Component
public class SheduledUtils {

    ///@Async
    @Scheduled(cron = "0/1 * * * * ? ")
    public void addModule(){
        System.out.println(LocalDateTime.now().toString()+":addModule"+":"+Thread.currentThread().getName());
    }

}
