import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name){
	String a,b,c,d,e;
	int f;
	f = name.indexOf(" ");
	a = name.substring(0,1).toUpperCase();
	b = name.substring(1,f);
	d = name.substring(f+1,f+2).toUpperCase();
	c = name.substring(f+2);
	e = a + b +" "+ d + c;
	return e;
    }
    public String bondify(String name){
	String a,b,c,d;
	int f;
	name = capitalize(name);
	f = name.indexOf(" ");
	a = name.substring(0,f);
	b = name.substring(f+1);
	c = ", ";
	d = b + c + a +" "+ b;
	return d;
    }
}