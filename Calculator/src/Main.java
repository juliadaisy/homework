import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        Calc1 Cl = new Calc1();
        try {
            Cl.add(input.askForNumber());
            while (true) {
                String s = input.askForOperator();
                double b = input.askForNumber();
                switch (s) {
                    case "+" -> System.out.println("result = " + Cl.add(b));
                    case "-" -> System.out.println("result = " + Cl.sub(b));
                    case "*" -> System.out.println("result = " + Cl.mult(b));
                    case "/" -> System.out.println("result = " + Cl.div(b));
                }
            }
        } catch (RuntimeException e) {
            System.out.println("vse robota zakinchena");
        }
    }

}

class Input {
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

    String askForOperator() {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator:");
        s = sc.next();
        if (s.equals("exit")) {
            throw new RuntimeException();
        }
        while (!s.equals("+") & !s.equals("-") & !s.equals("*") & !s.equals("/")){
            System.out.println("It's not an operator! Enter '+', '-', '*', '/'");
            System.out.println("Enter operator:");
            s = sc.next();
            if (s.equals("exit")) {
                throw new RuntimeException();
            }
        }
        return s;
    }
}
