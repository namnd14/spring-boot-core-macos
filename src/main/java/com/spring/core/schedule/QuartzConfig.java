package com.spring.core.schedule;

import com.spring.core.job.FirstSimpleJob;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(FirstSimpleJob.class).withIdentity("firstSimpleJob").storeDurably().build();
    }

    @Bean
    public Trigger jobTrigger() {
        SimpleScheduleBuilder schedule =
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(60).repeatForever();

        return TriggerBuilder.newTrigger().forJob(jobDetail()).withIdentity("myTrigger").withSchedule(schedule).build();
    }
}
