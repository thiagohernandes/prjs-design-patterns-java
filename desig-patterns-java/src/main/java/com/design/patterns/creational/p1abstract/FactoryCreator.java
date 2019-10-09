package com.design.patterns.creational.p1abstract;

class FactoryCreator {  
    public static AbstractFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("Bank")){  
        return new BankFactory();  
     } else if(choice.equalsIgnoreCase("Loan")){  
        return new LoanFactory();  
     }  
     return null;  
  }  
}