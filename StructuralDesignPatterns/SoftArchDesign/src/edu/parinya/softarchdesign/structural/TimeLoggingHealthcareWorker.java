package edu.parinya.softarchdesign.structural;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{
    public TimeLoggingHealthcareWorker(HealthcareWorker worker){
        super(worker);
        System.out.println("Decorate " + worker.getName() + " with TimeLogging.");
    }

    @Override
    public void service() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy: ");
        String strDate = formatter.format(date);
        System.out.print(strDate);
        super.service();
    }
}
