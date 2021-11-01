package com.CaseStudy;


/*
 * ==============================================================
 * This class contains the main function for the class EnjoyRide
 * ==============================================================
 * 
 */

import java.util.Scanner;

public class DriveClass {

	public static void main(String[] args) 
	{
		int choice=0;
		int noAdults=0, noChild=0, hours=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n=============================================");
		System.out.println("\t    WELCOME TO ENJOY RIDES");
		System.out.println("=============================================");
		System.out.println("AVAILABLE RIDE OPTIONS: ");
		System.out.println("1. Alibaba \n2. Alpine Rides \n3. Bumpper Cars \n4. Baloon Race\n");
		
		System.out.print("CHOOSE YOUR RIDE: ");
		choice= sc.nextInt();
		System.out.print("NUMBER OF ADULTS: ");
		noAdults= sc.nextInt();
		System.out.print("NUMBER OF CHILDREN: ");
		noChild= sc.nextInt();
		System.out.print("HOURS OF TRAVEL: ");
		hours= sc.nextInt();
		
		EnjoyRide ride1= new EnjoyRide();
		
		switch(choice)
		{
			case 1:
			{
				ride1.displayFare(noAdults, noChild, hours, "Alibaba");
			}
			break;
			
			case 2:
			{
				ride1.displayFare(noAdults, noChild, hours, "Alpine slide");
			}
			break;
			
			case 3:
			{
				ride1.displayFare(noAdults, noChild, hours, "Bumpper Cars");
			}
			break;
			
			case 4:
			{
				ride1.displayFare(noAdults, noChild, hours, "Baloon Race");
			}
			break;
			
			default:
			{
				System.out.println("\n|| INVALID INPUT ||");
			}
			break;
		}
	}

}
