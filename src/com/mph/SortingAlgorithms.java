package com.mph;

import java.util.Arrays;

public class SortingAlgorithms
{

	public static void main(String[] args)
	{

		bubbleSort(Arrays.stream(args)
			.map(x -> Integer.valueOf(x))
			.toArray(Integer[]::new));
            
	}
	
	private static void bubbleSort(Integer[] tab)
	{

        int border = tab.length;
        int tmp;
        boolean oneMoreTime;
        
        System.out.println(Arrays.toString(tab));

        do 
        {    
        	
            oneMoreTime = false;

            for(int i = 0; i < border-1; i++)
            {
            	
                if(tab[i] > tab[i+1])
                {
                	
                    tmp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = tmp;
                    
                    oneMoreTime = true;
                    
                    System.out.println(Arrays.toString(tab));
                    
                }
                
            }

            border--;

        } while(oneMoreTime);
        
    }

}