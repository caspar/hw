import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	/*
	  g = new Greeter();
	  g.setGreeting("Hello");
	  result = g.greet("Tom");
	  System.out.println(result);
	  g2 = new Greeter();
	  g2.setGreeting("How are you doing");
	  result = g.greet("Tom");
	  System.out.println(result);
	  result = g2.greet("Sarah");
	  System.out.println(result);
	  
	  g.setGreeting("sup");
	  System.out.println(g.greet("Alan"));
	  System.out.println(g2.greet("Sue"));
	*/
	g2 = new Greeter();
	g = new Greeter("Howdy");
	System.out.println(g.greet("Tom"));
	System.out.println(g2.greet("Sue"));



    }
} 

/* I have absolutely no idea how to do this. I've basically been staring at a screen for an hour trying to figure out how to change the classes and methods to do what I want them to, but I honestly don't know how to do it at all*/ 