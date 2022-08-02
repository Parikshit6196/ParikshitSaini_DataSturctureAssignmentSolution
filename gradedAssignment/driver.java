package com.gradedAssignment;

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		
		FloorAssemble obj = new FloorAssemble();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of floors in the building.");
		int N = sc.nextInt();
		
		int [] arr = new int [N];
		
		for(int i=0;i<N;i++) {
			System.out.println("Enter the floor size given on day : "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The order of construction is as follows");
		
		obj.solve(arr,N);
		
		sc.close();

	}

}

