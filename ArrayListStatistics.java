package com.Collections;

import java.util.*;

public class ArrayListStatistics {
	
	public static double sum(List<Integer> list)
	{
		double sum=0.0;
		for(int number : list)
			sum+=number;
		return sum;
	}
	
	public static double mean(List<Integer> list)
	{
		double total= sum(list);
		double average= total/list.size();
		return average;
	}
	
	public static double median(List<Integer> list)
	{
		Collections.sort(list);
		double median=0.0;
		int middle= list.size()/2;
		if(middle>0 && list.size()%2==0)
		{
			median= (list.get(middle) + list.get(middle-1)) / 2;
		}
		else
			median=list.get(middle);
		return median;
	}
	
	public static void show(List<Integer> list)
	{
		for(int number : list)
			System.out.print(number+" | ");
		System.out.println("\n");
	}
	
	public static void main(String[] args) 
	{
		List<Integer> list= new ArrayList<>();
		list.add(50);
		list.add(25);
		list.add(64);
		list.add(78); 
		list.add(88); 
		list.add(34);
		list.add(12);
		list.add(42);
		
		System.out.print("ARRAY LIST: ");
		show(list);
		Collections.sort(list);
		System.out.print("SORTED LIST: ");
		show(list);
		System.out.println("SUM: "+ sum(list)+"\n");
		System.out.println("MEAN: "+ mean(list)+"\n");
		System.out.println("MEDIAN: "+ median(list)+"\n");
	}

}
