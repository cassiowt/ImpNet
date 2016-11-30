package com.impnet.model;

public class Baskara {

	public Double calculaRaizUm(int a, int b, int c) {
		double r = (-b+(Math.sqrt(b*b +(4*a*c))))/2*a; 
		System.err.println(r);
		return r;
	}

	public Double calculaRaizDois(int a, int b, int c) {
 		return (-b-(Math.sqrt(b*b +(4*a*c))))/2*a;
	}

}
