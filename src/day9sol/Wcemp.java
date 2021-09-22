package day9sol;

import java.util.Random;

public class Wcemp {
	public static void main(String[] args) {
		
	
	System.out.println("welcome to employee");
	Random ran=new Random();
	int ran1=ran.nextInt(3);
	int wageperhr=20;
	int fullday=8;
	if (ran1==1) {
		System.out.println("emp present full day");
	    int empwage=fullday*wageperhr;
	    System.out.println("empwage for full day emp is"+empwage);
	    
	}else if(ran1==2) {
		System.out.println("emp present for parttime");
	}else {
		System.out.println("emp not present");}
	
	}
	

}
