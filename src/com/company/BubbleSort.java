package com.company;

public class BubbleSort
{
    public static void bubbleSort(int[] arr, int i, int j)
    {
        boolean swap = true;
        while(swap)
        {
            swap = false;
            for(j = 1; j < arr.length; j++)
            {
                i = j - 1;
                if(arr[j] < arr[i])
                {
                    swapInt(arr, i, j);
                    swap = true;
                }
            }
        }
    }
}
