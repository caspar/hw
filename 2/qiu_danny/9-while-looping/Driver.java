public class Driver {

    public static void main(String[] args) {
        Loops l;
        l = new Loops();

        if (args.length == 0) {
            int n1, n2, n3;
            n1 = 0;
            n2 = 1;
            n3 = 5;
            System.out.println("Fact " + n1 + ": " + l.fact(n1));
            System.out.println("Fact " + n2 + ": " + l.fact(n2));
            System.out.println("Fact " + n3 + ": " + l.fact(n3));
            System.out.println("Fact2 " + n1 + ": " + l.fact2(n1));
            System.out.println("Fact2 " + n2 + ": " + l.fact2(n2));
            System.out.println("Fact2 " + n3 + ": " + l.fact2(n3));
        }
        else {
            int i;
            i = 0;
            while (i < args.length) {
                System.out.println("Fact2 " + args[i] + ": " + l.fact2(Integer.parseInt(args[i])));
                i = i + 1;
            }
        }
    }
}
