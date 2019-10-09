package com.design.patterns.structural.p5proxy;

public class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");  
        access.grantInternetAccess();  
    }  
}