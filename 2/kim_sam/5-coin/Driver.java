import java.io.*;
import java.util.*;

public class Driver {
     public static void main (String[] args) {
	 
	 Coin c;
	 c = new Coin ();
	
	 c.setProb(.5);
	 c.flip();
	 c.flip();
	 c.flip();
	 c.flip();
	 c.flip();
	 System.out.println(c.getFlips());
	 System.out.println(c.getCurrentFace());

     }
}

//Used Andrew Fischer's file for help