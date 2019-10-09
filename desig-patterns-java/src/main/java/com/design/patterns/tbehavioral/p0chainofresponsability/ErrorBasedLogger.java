package com.design.patterns.tbehavioral.p0chainofresponsability;

public class ErrorBasedLogger extends Logger {  
    public ErrorBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("ERROR LOGGER INFO: "+msg);  
    }  
}