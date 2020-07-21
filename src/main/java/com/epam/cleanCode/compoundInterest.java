package com.epam.cleanCode;

public class compoundInterest {
	int p;
	int t;
	double r;
	public compoundInterest(int p,int t,double r) {
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public void CI() {
		double ans=p * 
                (Math.pow((1 + r / 100), t));
		System.out.println("Compound Interest is : "+ans);
	}

}
