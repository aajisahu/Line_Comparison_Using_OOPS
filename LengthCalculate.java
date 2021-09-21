package Line_Comparison_Using_OOPS;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Day8_Programs.PresentAbsent;
 

abstract class Compute {
	abstract void getInput();  //trying to use abstract class and method to see how actully its work
	abstract void getSecondInput();
}

public class LengthCalculate extends Compute {
	private static final Logger Log= LogManager.getLogger(LengthCalculate.class);
	
	double dis, dis2;//instance variable
	
	//declaring body to a abstract method
	void getInput(){ //taking first line input
		
		Scanner sc= new Scanner(System.in);
		
		Log.info("Enter x1 cordinate");
		int x1=sc.nextInt(); 
		
		Log.info("Enter x2 cordinate");
		int x2=sc.nextInt(); 
		
		Log.info("Enter y1 cordinate");
		int y1=sc.nextInt(); 
		
		Log.info("Enter y2 cordinate");
		int y2=sc.nextInt(); 
		
		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	
		
		Log.info("Length of line of coordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
		
	}
	
	 void getSecondInput() { //taking second line input
		
		Scanner sc2= new Scanner(System.in);
		
		Log.info("Enter p1 cordinate");
		int p1=sc2.nextInt(); 
		
		Log.info("Enter p2 cordinate");
		int p2=sc2.nextInt(); 
		
		Log.info("Enter q1 cordinate");
		int q1=sc2.nextInt(); 
		
		Log.info("Enter q2 cordinate");
		int q2=sc2.nextInt(); 
		
		dis2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));	
		
		Log.info("Length of line of coordinates"+"("+p1+","+p1+"),"+"("+q2+","+q2+")===>"+dis2);
		
	}
	
	public static void main(String[] args) {
		
		LengthCalculate obj= new LengthCalculate();
		obj.getInput();
		obj.getSecondInput();
		
		if (obj.dis == obj.dis2) // comparing instance variable by calling directly
			Log.info("Both lines are equale");
			
		else if (obj.dis >obj.dis2)
			Log.info("Line one is greater than line two");
		
		else 
			Log.info("Line one is smaller than line two");
		
	}
	
}