package chp10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex10 {
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("xfshgd", "jJsdgf", "abnzfcz", "csdfh"));
        removeInRange(arr, "b", "w");
        System.out.println(arr);
    }
    public static void removeInRange(ArrayList<String> arr, String start, String end)
    {
    	arr.add(start);
    	arr.add(end);
    	Collections.sort(arr);
    	int startInd = arr.indexOf(start);
    	
    	while(arr.contains(end)) 
    	{
    		arr.remove(startInd);
    	}
    	arr.remove(end);
    }
}

