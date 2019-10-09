package com.design.patterns.creational.p0factory;

abstract class Plan{  
	
     protected double rate;  
     abstract void getRate();  
   
     public void calculateBill(int units){  
          System.out.println(units*rate);  
      }  
     
}