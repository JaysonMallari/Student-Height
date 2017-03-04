package com.renz.studentAverageHeight;
/*
 * Jayson Mallari
 */
import java.util.Scanner;
public class studentAverageHeight {
	
	public static void main(String[] args){
		int studentNum;
		double[] heightArr;
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many students do we have? ");
		studentNum = in.nextInt();
		
		heightArr = new double[studentNum];
		
		for (int x=0;x<studentNum;x++){
			System.out.println("Please enter the height in inches of Student"+(x+1));
			heightArr[x]= in.nextDouble();
		}
		findTallest(heightArr);
		findShortest(heightArr);
		averageHeight(heightArr);
	}
	
	//get and display the tallest height from the array
		public static void findTallest(double[] arr){
			double tallest=arr[0];
			for(int x=0;x<arr.length;x++){
				if (tallest < arr[x]){
					tallest = arr[x];
				}
			}
			System.out.println("The TALLEST student height is: " + tallest);
		}
		
		public static void findShortest(double[] arr){
			double shortest=arr[0];
			for(int x=0;x<arr.length;x++){
				if (shortest > arr[x]){
					shortest = arr[x];
				}
			}
			System.out.println("The Shortest student height is: "+ shortest);
		}
		
		public static void averageHeight(double[] arr){
			double total = 0;
			for (int x=0;x<arr.length;x++){
				total += arr[x];
			}
			total /=arr.length;
			System.out.println("The average height of our students is : "+total);
		}
}
