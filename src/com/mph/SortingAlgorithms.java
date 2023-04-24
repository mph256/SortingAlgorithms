package com.mph;

import java.util.Arrays;

public class SortingAlgorithms
{

	public static void main(String[] args)
	{
		
		insertionSort(Arrays.stream(args)
			.map(x -> Integer.valueOf(x))
			.toArray(Integer[]::new));

	}
	
	private static void insertionSort(Integer[] tab)
	{
		
		int j;
		int tmp;
		
		System.out.println(Arrays.toString(tab));
		
		for(int i = 1; i < tab.length; i++)
		{
        	
			j = i;
            
			while(j > 0 && tab[j-1] > tab[j])
			{
                
				tmp = tab[j];
				tab[j] = tab[j-1];
				tab[j-1] = tmp;
                
				j--;
				
				System.out.println(Arrays.toString(tab));
				
			}
			
		}
		
	}
	
}