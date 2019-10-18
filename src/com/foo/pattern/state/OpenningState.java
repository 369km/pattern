package com.foo.pattern.state;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("opening...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSINGSTATE);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
