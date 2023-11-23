package LineGeometry;

import java.util.Random;

public class LineGeometry {
	
	
	/*
	 * @params:none
	 * @return:double array
	 * @desc:set the random points array
	 */
    private static double[] setPoints() {
		Random random=new Random();
		int x1=random.nextInt(100);
		int y1=random.nextInt(100);
		int x2=random.nextInt(100);
		int y2=random.nextInt(100);
        return new double[]{x1, y1, x2, y2};
    }
    
    
	/*
	 * @params:x1,x2,y1,y2
	 * @return:length
	 * @desc:calculates the cartesian length
	 */
	static double cartesianLength(double [] line1) {
		
		double length=Math.sqrt((Math.pow((line1[2]-line1[0]),2)+Math.pow((line1[3]-line1[1]),2)));
		return length;
	}
	
	
    
	/*
	 * @params:double array of line1 & line 2
	 * @return:boolean true or false
	 * @desc:checks the condition
	 */
    private static boolean isEqualTo() {
    	double [] line1=setPoints();
    	double [] line2=setPoints();
    	double length1=cartesianLength(line1);
    	double length2=cartesianLength(line2);
        return length1==length2;
    }

    
    
	/*
	 * @params:none
	 * @return:none
	 * @desc:main function prints the answer 
	 */
	public static void main(String []args) {
		System.out.println("Welcome to Line Comparison Computation Program");
        boolean areEqual = isEqualTo();
        System.out.println("are lines are equal: " + areEqual);

	}
}

