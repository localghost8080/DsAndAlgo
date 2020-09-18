package com.samrat;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    int sum_pd =0;
    int sum_sd=0;
    int index = 0;
    if(arr!=null && arr.size()>0){
        for(List<Integer> lst : arr){
            sum_pd = sum_pd + lst.get(index);
            sum_sd = sum_sd + lst.get(lst.size()-index-1);
            index++;
        }
    }

    return (sum_pd - sum_sd);

    }

}

public class DiagonalSum {
    public static void main(String[] args) throws IOException {
    	
    	List<Integer> arr1 = Arrays.asList(11,2,4);
    	List<Integer> arr2 = Arrays.asList(4,5,6);
    	List<Integer> arr3 = Arrays.asList(10,8,-12);
       
    	List<List<Integer>> lists = new ArrayList<List<Integer>>();
    	lists.add(arr1);
    	lists.add(arr2);
    	lists.add(arr3);
    	
        int result = Result.diagonalDifference(lists);
        
        System.out.println(result);

        
    }
}