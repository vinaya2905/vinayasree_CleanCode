package com.epam.cleanCode;

//import java.util.Scanner;

public class simpleInterest {
	int pa;
	int ti;
	double ra;
	public simpleInterest(int p, int t, double r) {
		// TODO Auto-generated constructor stub
		this.pa=p;
		this.ti=t;
		this.ra=r;
	}
	public void SI() {
		double ans= (pa*ti*ra)/100;
		System.out.println("Simple Interest is : "+ans);
	}
}
