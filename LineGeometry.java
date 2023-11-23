package LineGeometry;

import java.util.Random;

public class LineGeometry {
	
	
	/*
	 * @params:none
	 * @return:double array
	 * @desc:set the endpoint array
	 */
    private static double[] setEndpoints() {
		Random random=new Random();
		int x1=random.nextInt(100);
		int y1=random.nextInt(100);
		int x2=random.nextInt(100);
		int y2=random.nextInt(100);
        return new double[]{x1, y1, x2, y2};
    }
    
    
	/*
	 * @params:double array of line1 & line 2
	 * @return:boolean true or false
	 * @desc:checks the condition
	 */
    private static boolean isEqualTo(double[] line1, double[] line2) {
        return line1[0] == line2[0] && line1[1] == line2[1] &&
               line1[2] == line2[2] && line1[3] == line2[3];
    }

    
    
	/*
	 * @params:none
	 * @return:none
	 * @desc:main function prints the answer 
	 */
	public static void main(String []args) {
		System.out.println("Welcome to Line Comparison Computation Program");
        double[] line1 = setEndpoints();
        double[] line2 = setEndpoints();
        boolean areEqual = isEqualTo(line1, line2);
        System.out.println("are lines are equal: " + areEqual);

	}
}

