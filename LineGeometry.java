package LineGeometry;

import java.util.Random;

public class LineGeometry {
	
	/*
	 * @params:x1,x2,y1,y2
	 * @return:length
	 * @desc:calculates the cartesian length
	 */
	
	static double cartesianLength(int x1, int y1,int x2,int y2) {
		double length=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2- y1),2)));
		return length;
	}
	/*
	 * @params:none
	 * @return:none
	 * @desc:main function prints the message
	 */
	public static void main(String []args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Random random=new Random();
		int x1=random.nextInt(100);
		int y1=random.nextInt(100);
		int x2=random.nextInt(100);
		int y2=random.nextInt(100);
		double length=cartesianLength(x1,y1,x2,y2);
		System.out.println("The cartesian length is:"+length);
	}
}

