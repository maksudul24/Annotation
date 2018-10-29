package main;


import java.io.*;

/**
 * <h1>A Basic Calculator</h1>
 * The calculator can perform only addition,multiplication,subtraction,division and root value.
 * Except for root operation for every other operation the calculator takes two integer ans show the calculation
 * The output of corresponding operation is shown in the display. 
 * @author Maksudul Hasan
 * @version 1.0.0
 * @since 10-30-2018
 */

public class DocClass {
	/**
	 * This method performs addition operation in the calculator
	 * @param num1
	 * @param num2
	 * @return int The sum of two given value in calculator
	 */
	public int add(int num1,int num2) {
		return num1+num2;
	}
	/**
	 * This Method performs subtraction
	 * @param num1
	 * @param num2
	 * @return int The subtraction between the first number num1 and num2 and returns a negative value if num1 is greater than num2  
	 */
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	/**
	 * This method is used to perform multiplication 
	 * @param num1
	 * @param num2
	 * @return int The multiplication of two given value
	 */
	public int mul(int num1,int num2) {
		return num1*num2;
	}
	/**
	 * This method is performing the division operation in calculator
	 * @param num1
	 * @param num2
	 * @return double The result of dividing num1 by num2
	 */
	public double div(int num1,int num2) {
		return num1/num2;
	}
	/**
	 * This method is performing square root operation in calculator
	 * This is the only method that takes one double type parameter
	 * @param num
	 * @return double the result is square root of num
	 * @deprecated 
	 * This method is creating problem with Junit test
	 * because of my lack of knowledge in Junit test
	 */
	public double rot(double num) {
		return Math.sqrt(num);
	}
	
}
