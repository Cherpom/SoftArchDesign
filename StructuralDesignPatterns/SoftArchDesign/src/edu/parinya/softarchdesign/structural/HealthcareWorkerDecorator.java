package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    //Variable
    protected HealthcareServiceable worker;
    //Constructor
    public HealthcareWorkerDecorator(HealthcareWorker worker){
        super(worker);
        this.worker = worker;
    }

    //Function
    public void service(){
        worker.service();
    }
    public double getPrice(){
        return worker.getPrice();
    }
}
