import java.util.ArrayList;
import java.util.Arrays;

class Database <T extends Print> implements Print {
    private static int b = 10;
    Object[] u;

    Database(int l) {
        u = new Object[l];
    }

    Database() {
        u = new Object[b];
    }

    private int i = 0;

    void addFirst(T o) {

        incrLength();

        for (int l = 0; l < i; l++) {
            u[i - l] = u[i - l - 1];
        }
        u[0] = o;
        i++;

    }

    void addNext(T o) {

        incrLength();

        u[i] = o;
        i++;
    }

    void insert(T o, int id) {

        incrLength();

        for (int l = 0; l < (i - id); l++) {
            u[i - l] = u[i - l - 1];
        }
        u[id] = o;
        i++;
    }

    void getUser(int id) {
        ((T) u[id]).print();
    }

    void remove(int id) {
        if (id == i - 1) {
            u[id] = null;
        } else
            for (int l = 0; l < (i - id); l++) {
                u[id + l] = u[id + l + 1];
            }
        i--;
    }

    @Override
    public void print() {
        System.out.println("=======");
        for (int i = 0; i < u.length; i++) {
            if (u[i] != null) {
                System.out.println("id: " + i);
                ((T) u[i]).print();
                System.out.println("=======");
            }
        }
    }

    void incrLength() {
        if (i == u.length) {
            u = Arrays.copyOf(u, u.length + b);
        }
    }

}