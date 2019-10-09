package com.design.patterns.tbehavioral.p0chainofresponsability;

public class ConsoleBasedLogger extends Logger {  
    public ConsoleBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("CONSOLE LOGGER INFO: "+msg);  
    }  
}  