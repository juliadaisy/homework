class Calculator {
    double result = 0.0;
    String st = "";

    double add(double b) {
        //(this.n = new Object[]{new Double(b)
        System.out.println(this.result += b);
        st = st + ((int) b) + ", ";
        return result;
    }

    double sub(double b) {
        System.out.println(this.result -= b);
        st = st + ((int) b) + ", ";
        return result;
    }

    double mult(double b) {
        System.out.println(this.result *= b);
        st = st + ((int) b) + ", ";
        return result;
    }

    String div(double b) {
        st = st + (int) b + ", ";
        if (b == 0)
            System.out.println("You can't divide on zero!");
        if (b != 0)
            System.out.println(this.result /= b);
        else
            return "You can't divide on zero!";
        return "" + result;
    }

    //    void print() {
//        System.out.println(this.result);
//    }
    void history() {
        System.out.println(st);
    }
}