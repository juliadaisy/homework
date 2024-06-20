import java.util.Arrays;

class Calc1 {
    double result;
    int l;
    int[] n = new int[l];

    double add(double b) {
//        ++l;
//        this.n = Arrays.copyOf(n,l);
//        System.out.println(this.result += b);
//        return n[l-1] = (int) b;
        return this.result += b;
    }
    double sub(double b) {
//        ++l;
//        this.n = Arrays.copyOf(n,l);
//        System.out.println(this.result -= b);
//        return n[l-1] =(int) b;
        return this.result -= b;
    }
    double mult(double b) {
//        ++l;
//        this.n = Arrays.copyOf(n,l);
//        System.out.println(this.result *= b);
//        return n[l-1] = (int) b;
        return this.result *= b;
    }
    double div(double b) {
//        ++l;
//        this.n = Arrays.copyOf(n,l);

        if (b != 0)
            return this.result /= b;
            //System.out.println(this.result /= b);
        else
            throw new RuntimeException("You can't divide on zero!");
        //return n[l-1] = (int) b;
    }


    void history() {
        System.out.println(Arrays.toString(n));
    }
}