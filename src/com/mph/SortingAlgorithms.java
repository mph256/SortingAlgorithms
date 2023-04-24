package com.mph;

import java.util.Arrays;

public class SortingAlgorithms
{
    
    public static void main(String[] args)
	{

		mergeSort(Arrays.stream(args)
			.map(x -> Integer.valueOf(x))
			.toArray(Integer[]::new));

    }
    
    private static Integer[] mergeSort(Integer[] tab)
    {

        if(tab.length == 1)
        {

            return tab;

        } else
        {
            
            Integer[] tab1 = new Integer[tab.length/2 + tab.length%2];
            Integer[] tab2 = new Integer[tab.length - tab1.length];
            
            for(int i = 0; i < tab1.length; i++)
            {
            	
                tab1[i] = tab[i];
                
            }
            
            for(int j = 0; j < tab2.length; j++)
            {
            	
                tab2[j] = tab[tab1.length+j];
                
            }
            
            System.out.println("Tableau à diviser: ");
            System.out.println(Arrays.toString(tab));
            System.out.println("Résultat de la division: ");
            System.out.println("Tab 1: " + Arrays.toString(tab1));
            System.out.println("Tab 2: " + Arrays.toString(tab2) +"\n");
            
            return mergeTab(mergeSort(tab1), mergeSort(tab2));

        }

    }
    
    // fusion de 2 tableaux triés
    private static Integer[] mergeTab(Integer[] tab1, Integer[] tab2)
    {

        Integer[] result = new Integer[tab1.length + tab2.length];
        int i = 0;
        int j = 0;

        for(int k = 0; k < result.length; k++)
        {

            if(i == tab1.length)
            {
            	
                result[k] = tab2[j];
                j++;
                
            } else if(j == tab2.length)
            {
            	
                result[k] = tab1[i];
                i++;
                
            } else if(tab1[i] < tab2[j])
            {
            	
                result[k] = tab1[i];
                i++;
                
            } else
            {
            	
                result[k] = tab2[j];
                j++;
                
            }

        }

        System.out.println("Tableaux à fusionner: ");
        System.out.println("Tab 1: " + Arrays.toString(tab1));
        System.out.println("Tab 2: " + Arrays.toString(tab2));
        System.out.println("Résultat de la fusion: " + Arrays.toString(result) +"\n");

        return result;

    }
    
}