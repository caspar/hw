public class StringTests {

  public static void main(String[] args) {

    String s1,s2,s3,s4,s5,s6;
    s1=new String("Hello");
    s2="Hello";
    s3=s1;
    s4="Hello";
    s5="World";
    s6=new String("World");

    System.out.println(s1==s2);
    	/* Should print out false */

    System.out.println(s1==s3);
    	/* Should print out true */

    System.out.println(s1==s4);
    	/* Should print out false */

    System.out.println(s1==s5);
    	/* Should print out false */

    System.out.println(s1==s6);
    	/* Should print out false */

    System.out.println(s2==s3);
    	/* Should print out false */

    System.out.println(s2==s4);
    	/* Should print out true */

    System.out.println(s2==s5);
    	/* Should print out false */

   	System.out.println(s2==s6);
   		/* Should print out false */

   	System.out.println(s3==s4);
   		/* Should print out false */

    System.out.println(s3==s5);
    	/* Should print out false */

    System.out.println(s3==s6);
    	/* Should print out false */

    System.out.println(s4==s5);
    	/* Should print out false */

    System.out.println(s4==s6);
    	/* Should print out false */

    System.out.println(s5==s6);
   		/* Should print out false */

    }
}