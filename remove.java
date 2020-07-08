package tinhtien;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class remove {

	public static void main(String[] args) {
		int []arr = {90,90,100,20,27,35,22,10,8,8};
		HashSet<Integer> hs = new LinkedHashSet<Integer>();
		for(int i = 0 ; i < arr.length ; i++)
		{
			 hs.add(arr[i]);
		}
		for(int number :hs) 
		{
			System.out.print(number + " ");
		}
	   
	}

}
