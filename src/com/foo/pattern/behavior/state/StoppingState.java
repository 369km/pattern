package com.foo.pattern.behavior.state;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNINGSTATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNINGSTATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("stopping...");
    }
}
