import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String args[]) {
	Cipher c = new Cipher();

	System.out.println(c.encode("hello!", 3));
	System.out.println(c.encode("hi there!", 3));
	System.out.println(c.encode("timothy", 13));
	System.out.println(c.encode(c.encode("timothy",13),13));
	
    }
}
