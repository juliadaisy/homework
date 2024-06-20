import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Number number = new Number();
        Calc1 Cl = new Calc1();
        String s;
        Scanner sc = new Scanner(System.in);
        try {

            Cl.add(number.askForNumber());
            while (true) {

                System.out.println("Enter operator:");
                s = sc.next();
                if (s.equals("exit")) {
                    return;
                }
                if (!s.equals("+") & !s.equals("-") & !s.equals("*") & !s.equals("/")) {
                    System.out.println("It's not an operator! Enter '+', '-', '*', '/'");
                    return;
                }
                double b = number.askForNumber();
                if (s.equals("+")) {
                    System.out.println("result = " + Cl.add(b));
                }
                if (s.equals("-")) {
                    System.out.println("result = " + Cl.sub(b));
                }
                if (s.equals("*")) {
                    System.out.println("result = " + Cl.mult(b));
                }
                if (s.equals("/")) {
                    System.out.println("result = " + Cl.div(b));
                }
            }
        } catch (RuntimeException e) {
            System.out.println("vse robota zakinchena");
        }
    }

}

class Number {
    double askForNumber() {
        while (true) {
            try {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number:");
                String n = sc.next();
                if (n.equals("exit")) {
                    throw new RuntimeException();
                }
                return Double.parseDouble(n);

            } catch (NumberFormatException e) {
                System.out.println("It's not a number");
            }
        }

    }
}
