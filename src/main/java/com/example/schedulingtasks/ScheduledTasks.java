package com.example.schedulingtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component

public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
    private static final SimpleDateFormat date = new SimpleDateFormat("MMM d, yyyy");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", time.format(new Date()));
    }

    @Scheduled(fixedDelay = 6000)
    public void reportCurrentDate() {
        log.info("Today's date is {}", date.format(new Date()));
    }
}
