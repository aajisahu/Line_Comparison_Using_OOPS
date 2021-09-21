package Line_Comparison_Using_OOPS;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Day8_Programs.PresentAbsent;
 abstract class Compute {
	abstract void getInput();
	
}
public class LengthCalculate extends Compute {
	private static final Logger Log= LogManager.getLogger(LengthCalculate.class);
	
	
	void getInput(){
		double dis;
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
	public static void main(String[] args) {
		LengthCalculate obj= new LengthCalculate();
		obj.getInput();
		
		
	}
	
}