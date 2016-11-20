import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleArea {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args){
	int radious=0;
	
	System.out.println("Please enter radious of the circle");
	
	try{
		//get the radious from the console
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				radious = Integer.parseInt(br.readLine());
	}
	//Input values are entered invalid
	catch(NumberFormatException ne){
		System.out.println("Invalid radious value" + ne);
		System.exit(0);
	}
	catch(IOException ioe){
		System.out.println("IOError" + ioe);
		System.exit(0);
	}
	
    /*
     * Area of a circle is
     * pi * r * r
     * where r is a radius of a circle.
     */
   
    //NOTE : use Math.PI constant to get value of pi
	
	if (radious > 0){
	double area = Math.PI * radious * radious;
	System.out.println("Area of the Circle" + area);
	}
	else{ 
		System.out.println("Invalid radious input");
	}
}
}