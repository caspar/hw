import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
        
        WordSearch w = new WordSearch(15,40);
	System.out.println(w);
	System.out.println(w.makePuzzle(15));
	System.out.println(w);
	w.fillSpaces();
	System.out.println(w);
    }
}