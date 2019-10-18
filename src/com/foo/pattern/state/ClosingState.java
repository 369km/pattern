package com.foo.pattern.state;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNINGSTATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("closing...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNINGSTATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {

    }
}
