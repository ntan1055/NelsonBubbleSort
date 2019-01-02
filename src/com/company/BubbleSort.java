package com.company;

public class BubbleSort
{
    public static void bubbleSort(int[] arr, int i, int j)
    {
            for(j = 1; j < arr.length; j++)
            {
                i = j - 1;
                if(arr[j] < arr[i])
                {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
    }
}
