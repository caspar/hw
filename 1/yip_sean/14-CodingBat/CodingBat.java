public class CodingBat {
	public boolean sameStarChar(String s) {
		for (int i = 1; i < s.length() - 1; i++) {if (s.charAt(i) == '*' && (s.charAt(i - 1) != s.charAt(i + 1))) {return false;}}
		
		return true;	
	}
	
	public String sameEnds(String s) {
		if (s.length() % 2 != 0) {s = s.substring(0, (s.length() - 1) / 2) + s.substring((s.length() + 1) / 2);}
		
		while (!(s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2)))) {s = s.substring(0, (s.length() / 2) - 1) + s.substring((s.length() / 2) + 1);}
		
		return s.substring(0, s.length() / 2);
	}
}
