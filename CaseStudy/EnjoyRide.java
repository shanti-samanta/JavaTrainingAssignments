package com.CaseStudy;

import java.util.*;

public class EnjoyRide 
{
	private Map<String, Integer> adult= new HashMap<String, Integer>();
	private Map<String, Integer> child= new HashMap<String, Integer>();
	private double totalFare=0.0;
	
	EnjoyRide()
	{
		adult.put("Alibaba", 50);
		adult.put("Alpine slide", 60);
		adult.put("Bumpper Cars", 45);
		adult.put("Baloon Race", 70);
		
		child.put("Alibaba", 40);
		child.put("Alpine slide", 30);
		child.put("Bumpper Cars", 25);
		child.put("Baloon Race", 60);
	}
	
	private double calculateFare(int adults, int children, int hours, String ride)
	{
		int adultRidePrice= adult.get(ride);
		int childRidePrice= child.get(ride);
		totalFare= ( (adultRidePrice * adults) + (childRidePrice * children) ) * hours;
		return totalFare;
	}
	
	public void displayFare(int adults, int children, int hours, String ride)
	{
		System.out.println("\n=====================================");
		System.out.println("\t    INVOICE");
		System.out.println("=====================================");
		System.out.println("RIDE TYPE: "+ ride);
		System.out.println("ADULT FARE: "+ adult.get(ride)+" | CHILD FARE: "+ child.get(ride));
		System.out.println("ADULTS    :  "+ adults+" | CHILDREN  :  "+ children);
		System.out.println("-------------------------------------");
		System.out.println("\tTOTAL FARE: "+ calculateFare(adults, children, hours, ride));
		System.out.println("-------------------------------------");
		
		System.out.println("Enjoy your ride !");
	}
}
