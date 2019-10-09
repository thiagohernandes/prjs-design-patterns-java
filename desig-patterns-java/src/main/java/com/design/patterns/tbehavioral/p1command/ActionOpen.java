package com.design.patterns.tbehavioral.p1command;

public class ActionOpen implements ActionListenerCommand{
	
	private Document doc;
	 
    public ActionOpen(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }

}
