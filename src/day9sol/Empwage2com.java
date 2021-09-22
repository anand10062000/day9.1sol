package day9sol;

import java.util.Random;

public class Empwage2com {
	public void empcomp2() {
		
int emphr=0;int totalwage=0;
		
	
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
	int noofworkingdays=20;
	int noofhrsinmonth=100;
	int totalemphrs=0;int emphrs=0;int workingdays=0;
	//for(int day=0;day<noofworkingdays;day++)
	while(totalemphrs<=noofhrsinmonth && workingdays<=noofworkingdays)
	{
	workingdays++;

	switch(ran1)
	{
	case 1:
		System.out.println("emp not present for full day");
		 emphr=8;
		break;
	case 2:
		System.out.println("emp present for parttime");
		emphr=8;
		break;
	case 3:
		System.out.println("emp not present ");
		
	
	}
	//int empwage=wageperhr*emphr;
	totalemphrs+=emphr;
	  //totalwage +=empwage;
	  System.out.println("days is:"+workingdays+"emp hrs is :"+emphr);

}
	int totalempwage=totalemphrs*wageperhr;
    System.out.println("total emp wage is"+totalempwage);
}
}

