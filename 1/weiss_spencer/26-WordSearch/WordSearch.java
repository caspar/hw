// Worked with Elise Zlotnikova

import java.io.*;
import java.util.*;

public class WordSearch {

    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList = new ArrayList<String>();
    private ArrayList<String> finalWordList = new ArrayList<String>();
    private Random randGen = new Random();

    public WordSearch(int rows, int cols) {
        rand = new Random();
        readIn("wordsearch.txt");
        System.out.println(wordList);
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) 
            for (int j=0;j<cols;j++) 
                board[i][j]='-';

    }

    public ArrayList<String> getFinalWordList() {
        return finalWordList;
    }

    public WordSearch() {
        this(20,20);
    }

    public boolean addWord(int row, int col, int deltaR, int deltaC,  String word) {

        /* make sure deltas are in range */
        if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || 
            (deltaR==0 && deltaC==0) )
            return false;

        /* see if we can place the word */
        int r = row;
        int c = col;
        for (int i=0; i < word.length(); i++) {
                try {
                    //j=10/i; <-- this is only to show the Arithmetic exception
                    if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
                        return false; // we return false since we can't add the word
                    }
                } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
                    return false;  // we return false since we can't add the word
                }
                r = r + deltaR; 
                c = c+ deltaC;
            }
            
        /* if we get here, we can add the word */
        r = row;
        c = col;
        for (int i=0; i < word.length(); i++) {
            board[r][c]=word.charAt(i);
            r = r + deltaR; 
            c = c+ deltaC;
        }
            
        
        return true;
    }

    public boolean addWordH(int r, int c, String w) {
        return addWord(r,c,0,-1,w);
    }
    public boolean addWordV(int r, int c, String w) {
        return addWord(r,c,1,0,w);
    }
    public boolean addWordD(int r, int c, String w) {
        return addWord(r,c,1,1,w);
    }
    
    public boolean addWordRandomLoc(String w) {
        int r = rand.nextInt(board.length);
        int c = rand.nextInt(board[0].length);
        int deltaR = rand.nextInt(3)-1;
        int deltaC = rand.nextInt(3)-1;

        return addWord(r,c,deltaR,deltaC,w);

    }

    public void fillInBlanks() {
        for (int r = 0; r < board.length; r++)
            for (int c=0;c<board[0].length;c++) {
                if (board[r][c]=='-')
                    board[r][c]=(char)('A'+(char)rand.nextInt('Z'-'A'));
            }
    }


    public String toString() {
        String s = "";
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[i].length;j++) {
                s=s+board[i][j];
            }
            s=s+"\n";
        }
        return s;
    }

    public void readIn(String filename) {
        try { 
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) { 
                String s = sc.nextLine();
                wordList.add(s);
            }
        }
        catch (FileNotFoundException e) { 
            System.out.println(e);
            System.exit(0);
        }
    }

    public void makePuzzle(int numWords) { 
        for (int i=0;i<numWords;i++) {
            int index = randGen.nextInt(wordList.size());
            String word = wordList.get(index);
            wordList.remove(index);
            int x = 0;
            boolean b = false;
            while (x<5 && !b) { 
                b = addWordRandomLoc(word);
                if (b) 
                    finalWordList.add(word);
                x = x + 1;
            }

        }
    }

}