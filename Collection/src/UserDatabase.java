import java.util.Arrays;

class UserDatabase {
    User[] u;
    UserDatabase (int l) {
        u = new User[l];
    };
    UserDatabase () {
        u = new User[10];
    };
     private int i = 0;

    void addFirst(User user) {

        if (i==u.length) {
            u = Arrays.copyOf(u, u.length+10);
        }

        for(int l=0; l<i; l++){
            u[i-l] = u[i-l-1];
        }
        u[0] = user;
        i++;

    }

    void addNext(User user) {

        if (i==u.length) {
            u = Arrays.copyOf(u, u.length+10);
        }

        //if (u[i] == null) {
            u[i] = user;
        //}
        i++;
    }

    void insert (User user, int id) {

        if (i==u.length) {
            u = Arrays.copyOf(u, u.length+10);
        }

        for(int l=0; l<(i-id); l++){
            u[i-l] = u[i-l-1];
        }
        u[id] = user;
        i++;
    }

    void getUser (int id) {
        (u[id]).println();
    }

    void remove (int id) {
        if(id == i-1) {
         u[id] = null;
        }
        else
            for(int l=0; l<(i-id); l++){
                u[id+l] = u[id+l+1];
            }
        i--;
    }

    void print() {
        System.out.println("=======");
        for (int i = 0; i < u.length; i++) {
            if (u[i] != null) {
                System.out.println("id: " + i);
                (u[i]).println();
                System.out.println("=======");
            }
        }
    }

}