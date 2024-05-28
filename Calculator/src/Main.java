public class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1);
        c.print();
        c.mult(4);
        c.add(2);
        c.print();
        c.sub(5);
        c.print();
        c.sub(2);
        c.print();
        c.mult(5);
        c.print();
    }
}
class Calculator {
    double result = 0.0;
    Calculator() {
    }
    void add(double b) {
        this.result += b;
    }
    void sub(double b) {
        this.result -= b;
    }
    void mult(double b) {
        this.result *= b;
    }
    void print() {
        System.out.println((int)this.result);
    }
}