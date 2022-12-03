package chapter12;

import java.util.Calendar;

public class SchedulerFactory {

    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID){
        ElevatorScheduler scheduler = null;
        switch (strategyID){
            case RESPONSE_TIME:
                scheduler = new ResponseTimeScheduler();
            case THROUGHPUT:
                scheduler = new ThroughputScheduler();
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if(hour<12){
                    scheduler = new ResponseTimeScheduler();
                }else{
                    scheduler = new ThroughputScheduler();
                }
        }
        return scheduler;
    }

}