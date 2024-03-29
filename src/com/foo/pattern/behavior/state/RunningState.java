package com.foo.pattern.behavior.state;

public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("running...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPINGSTATE);
        super.context.getLiftState().stop();
    }
}
