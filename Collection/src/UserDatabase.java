class UserDatabase {
    static Object[] u = new Object[10];
    int i = 0;

    void addFirst(User user) {
        for(int l=0; l<i; l++){
              u[i-l] = u[i-l-1];
        }
        u[0] = user;
        i++;
    }

    void addNext(User user) {
        //if (u[i] == null) {
            u[i] = user;
        //}
        i++;
    }

    void search() {

    }

    void remove() {

    }

    void print() {
        System.out.println("=======");
        for (int i = 0; i < u.length; i++) {
            if (u[i] != null) {
                System.out.println("id: " + i);
                User.println((User) u[i]);
                System.out.println("=======");
            }
        }
    }


}