import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name) {
	int x = name.indexOf(" ");
	return name.substring(0,1).toUpperCase() + name.substring(1, x + 1) /* or, instead of adding 1 to the index, just add a space */ + name.substring(x + 1, x + 2).toUpperCase() + name.substring(x + 2);
    }

    public String bondify(String name) {
	int x = name.indexOf(" ");
	String n = capitalize(name);
	return n.substring(x + 1) + ", " + n;
    }

    public boolean isVowel(String letter) {
	return (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"));
    }

    public String piglatinify(String word) {
	if (isVowel(word.substring(0,1))) {
	    return word + "ay";
	} else {
	    return piglatinify(word.substring(1) + word.substring(0,1));
	}
    }

}
