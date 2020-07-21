package com.epam.cleanCode;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter values of princial amount,time,rate of interest");
    	int principalAmount=sc.nextInt();
    	int time=sc.nextInt();
    	double rateOfInterest=sc.nextDouble();
    	System.out.println("Enter material,area and automatedType");
    	String material=sc.next();
    	double area=sc.nextDouble();
    	String automatedType=sc.next();
    	simpleInterest si=new simpleInterest(principalAmount,time,rateOfInterest);
    	compoundInterest ci=new compoundInterest(principalAmount,time,rateOfInterest);
    	si.SI();
    	ci.CI();
    	constructionCost co=new constructionCost(material,area,automatedType);
    	co.finalCost();
    	sc.close();
    }
}
