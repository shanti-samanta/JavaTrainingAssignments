package assignmentPackage;
import java.util.*;
public class ArrayDemo {

	public static int add(int[] a1, int[] a2)
	{
		int sum_of_Array1=0;
		int sum_of_Array2=0;
		
		for(int i=0; i<a1.length; i++)
			sum_of_Array1 += a1[i];
		System.out.println("\nSUM OF ARRAY 1: "+ sum_of_Array1);
		
		for(int i=0; i<a2.length; i++)
			sum_of_Array2 += a2[i];
		System.out.println("SUM OF ARRAY 2: "+ sum_of_Array2);
		
		return (sum_of_Array1 + sum_of_Array2);
		
	}
	
	public static int multiply(int arr[])
	{
		int product=1;
		for(int i=0; i<arr.length; i++)
			product*=arr[i];
		return product;
	}
	
	public static int[] mergeAndSort(int a1[], int a2[])
	{
		int newSize= a1.length + a2.length;
		int[] mergedArray= new int[newSize];
		
		int index=0; 
		for(int i=0; i<a1.length; i++)
		{
			mergedArray[index]= a1[i];
			index++;
		}
		
		
		for(int j=0; j<a2.length; j++)
		{
			mergedArray[index]= a2[j];
			index++;
		}
		Arrays.sort(mergedArray);
		
		return mergedArray;
	}
	
	public static char[] displayChracterArray(char[] array)
	{
		Arrays.sort(array);
		return array;
	}
	
	public static void displayArray(int[] array)
	{
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static void displayArray(char[] array)
	{
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	
		int size1=0, size2=0, size3=0;
		
		System.out.print("\nSIZE OF ARRAY 1: ");
		size1= scan.nextInt();
		int array1[]= new int[size1];
		System.out.print("ARRAY 1: ");
		for(int i=0; i<size1; i++)
			array1[i]= scan.nextInt();
		
		System.out.print("\nSIZE OF ARRAY 2: ");
		size2= scan.nextInt();
		int array2[]= new int[size2];
		System.out.print("ARRAY 2: ");
		for(int i=0; i<size2; i++)
			array2[i]= scan.nextInt();
		
		int totalSum= add(array1, array2);
		System.out.println("SUM OF BOTH ARRAYS: "+ totalSum+"\n");
		
		System.out.println("\nPRODUCT OF ARRAY 1: "+ multiply(array1));
		System.out.println("PRODUCT OF ARRAY 2: "+ multiply(array2));
		
		System.out.print("\nMERGED ARRAY: ");
		displayArray(mergeAndSort(array1, array2));
		
		System.out.print("\nSIZE OF CHARACTER ARRAY: ");
		size3= scan.nextInt();
		char array3[]= new char[size3];
		System.out.print("CHARACTER ARRAY : ");
		for(int i=0; i<size3; i++)
			array3[i]= scan.next().charAt(0);
		displayArray(displayChracterArray(array3));
	}

}
