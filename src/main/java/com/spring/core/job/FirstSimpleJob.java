package com.spring.core.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FirstSimpleJob implements Job {
    @Override
    public void execute(JobExecutionContext context) {
        System.out.println("Executing scheduled task: " + new Date());
    }
}
