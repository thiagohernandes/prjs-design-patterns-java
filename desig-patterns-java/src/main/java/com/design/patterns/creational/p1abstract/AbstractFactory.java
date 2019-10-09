package com.design.patterns.creational.p1abstract;

abstract class AbstractFactory{  
	  public abstract Bank getBank(String bank);  
	  public abstract Loan getLoan(String loan);  
	} 