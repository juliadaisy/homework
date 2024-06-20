import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5);
        c.sub(3);
        c.mult(4);
        c.add(9);
        c.div(0);
        c.history();


        Calc1 C = new Calc1();
//        C.add(5);
//        C.sub(3);
//        C.mult(4);
//        C.add(9);
////        try {
////            C.div(2);
////        } catch (Exception e) {
////            System.out.println("exception");
////        }
//        C.div(4);
//        C.history();


        Calc1 Cl = new Calc1();
        String s = "";
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number:");
            Cl.add(sc.nextDouble());//1 way
            while (!s.equals("exit")) {

                System.out.println("Enter operator:");
                s = sc.next();
                while (s.equals("exit")) {
                    return;
                }
                if (!s.equals("+") & !s.equals("-") & !s.equals("*") & !s.equals("/")) {
                    System.out.println("It's not an operator! Enter '+', '-', '*', '/'");
                    return;
                }
                System.out.println("Enter number:");
                double b = sc.nextDouble();
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
        } catch (InputMismatchException e) {
            System.out.println("You can't enter characters");
        }


//        while (true) {
//            System.out.println("Enter operator:");
//            s = sc.next();
//            if (s.equals("exit"))
//                return;//break
//            System.out.println("Enter number:");
//            double b = sc.nextDouble();
//            if (s.equals("+")) {
//                a = a + b;
//                System.out.println("result = " + a);
//            }
//        }
    }
}