package com.company;

public class SortingUtil
{
    public static void swapInt(int[] array, int i, int j)
    {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    public static int[] randIntArr(int count)
    {
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }

    
