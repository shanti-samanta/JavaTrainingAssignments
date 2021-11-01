package com.CaseStudy;

import java.util.*;

/*
  Name: Shanti Samanta
  Topic: Case Study Question 1
 */

public class FlowerDemo {

	public static Map<String, String> displayFlower(String continent)
	{
		Map<String, String> asia= new HashMap<String, String>();
		Map<String, String> europe= new HashMap<String, String>();
		Map<String, String> africa= new HashMap<String, String>();
		
		Map<String, String> returnContinent=null;
		
		//Add the country : flower pair to ASIA
		asia.put("INDIA", "Lotus");
		asia.put("PAKISTAN", "Jasmine");
		asia.put("NEPAL", "Lali Gurans");
		
		
		//Add the country : flower pair to EUROPE
		europe.put("GERMANY", "Corn Flower");
		europe.put("FRANCE", "Lily");
		europe.put("GREECE", "Acanthus Mollis");

		
		//Add the country : flower pair to AFRICA
		africa.put("EGYPT", "Blue Lotus");
		africa.put("NIGERIA", "Yellow Trumpet");
		africa.put("KENYA", "Orchid");
						
		if(continent=="ASIA")
			returnContinent=asia;
		
		else if(continent=="EUROPE")
			returnContinent=europe;
		
		else if(continent=="AFRICA")
			returnContinent=africa;
		
		return returnContinent;
	}
	
	public static void display(Map<String, String> map)
	{
		for(String country : map.keySet())
			System.out.println(country+" : "+ map.get(country));
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int choice=0;
		
		Map<String, String> result= null;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("CHOOSE THE CONTINENT WHOSE COUNTRY : NATIONAL FLOWER YOU WANT TO VIEW: ");
		System.out.println("1. ASIA \n2. EUROPE\n3. AFRICA");
		System.out.print("ENTER YOUR CHOICE: ");
		choice= sc.nextInt();
		
		switch(choice)
		{
			case 1: 
			{
				result= displayFlower("ASIA");
				System.out.println("\n=======================================");
				System.out.println("COUNTRY : FLOWER LIST OF ASIA:");
				System.out.println("=======================================");
				display(result);
			}
			break;
			
			case 2:
			{
				result= displayFlower("EUROPE");
				System.out.println("\n=======================================");
				System.out.println("COUNTRY : FLOWER LIST OF EUROPE: ");
				System.out.println("=======================================");
				display(result);
			}
			break;
			
			case 3:
			{
				result= displayFlower("AFRICA");
				System.out.println("\n=======================================");
				System.out.println("COUNTRY : FLOWER LIST OF AFRICA:");
				System.out.println("=======================================");
				display(result);
			}
			break;
			
			default:
			{
				System.out.println("\n|| INVALID INPUT ||");
			}
		}
	}

}