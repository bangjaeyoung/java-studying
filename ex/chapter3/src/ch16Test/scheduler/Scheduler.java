package ch16Test.scheduler;

public interface Scheduler {

    public abstract void getNextCall();
    public abstract void sendCallToAgent();
}