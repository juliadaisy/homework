class UserDatabase {
    static Object[] u = new Object[10];

    void addFirst(Object o) {
//    this.u = new Object[]{o} + u[];
//        u[0] = o;
    }

    void addNext(User user) {
        for (int i = 0; i < u.length; i++) {
            if (u[i] == null) {
                u[i] = user;
                break;
            }
        }
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