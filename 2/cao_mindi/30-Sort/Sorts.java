import java.io.*;
import java.util.*;

public class Sorts {
    private int x, c, rs;

    public static void main(String[] args){
	Sorts s;
	s = new Sorts();
	int[] b = new int[6];
	Random rand = new Random();
	for (int i = 0; i < b.length; i ++){
	    b[i] = rand.nextInt(10);
	}
	s.bsort(b);
        for (int i = 0; i < b.length; i ++){
	    System.out.println(b[i]);
	}
	System.out.println("Swaps: " + rs);
	System.out.println("Comparisons: " + c);
    }


    public int[] bsort(int[] a){
	for(int i = 0; i < a.length; i ++){
	    int s = 0;
	    for(int j = 0; j < a.length - 1; j ++){
		if (a[j] > a[j+1]){
		    x = a[j + 1];
		    a[j + 1] = a[j];
		    a[j] = x;
		    rs ++;
		    s ++;
		}
		c ++;
	    }
	    if( s ==0){
		i = a.length;
	    }
	}
	return a;
    }
}