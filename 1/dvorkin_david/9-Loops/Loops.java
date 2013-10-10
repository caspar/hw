import java.io.*;
import java.util.*;

public class Loops {
   
    private int n;
    private int x;
    private int g;
 
    public int fact (int n){
       
	if (n == 1)
	    return n;
	else {
	    return n * fact (n-1);		
	}
    }

    public int fact2 (int n){
	int x = 1;
	while (n > 1){
	    x = x * n;
	    n=n-1;
	}
	return x;
   }

    public int GCD ( int a, int b ) {

	if (a < b) {
	    g = a;
	}
	else {
	    g = b; 
	}

	while (g>0)  {
	    if (a%g == 0 && b%g == 0) {
		return g;
	    }
	    g = g - 1;
	}

	return 1;
    }
}
