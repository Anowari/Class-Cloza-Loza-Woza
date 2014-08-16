package com.coza.prac;

public class ClassFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			int n = 2;
			int sum;
			int fibNuma = 2;
			int fibNumb = 2;
		
			fibNuma=fibNumb=2;
			for(n=2; n<=20; n++){
			
				System.out.println(fibNuma);
			sum=fibNuma+fibNumb;
			fibNuma=fibNumb;
			fibNumb=sum;
			}
			
			}
}