import java.util.*;

class User {
    String firstName;
    String lastName;
    int age;
//     User (String name, String surname, int age) {
//         this.name = name;
//         this.surname = surname;
//         this.age = age;
//     }
//     //щоб переопреділити метод він має мати однакову з батькіськім методом сигнатуру
//    //== не підходить для не примітивів
//    public String toString(){
//         return this.name+" "+this.surname+", age: "+this.age;
//    }
//    public boolean equals(Object obj){
//        User user = (User) obj;
//        return (this.name).equals(user.name)&(this.surname).equals(user.surname)&(this.age==user.age);
//     }
}

class UserDatabase {
    Object[] u = new Object[10];

    void addFirst(Object o) {
//    this.u = new Object[]{o} + u[];
//        u[0] = o;
    }

    void addLast() {

    }

    void search() {

    }

    void remove() {

    }
}

public class Main {
    public static void main(String[] args) {
        int lenght = 10;
        int[] b = new int[lenght];
        int k = 0;
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < lenght; i++) {
            if (b[i] == 0) {
                k = i + 1;
                System.out.println(k);
                break;
            }
        }

        for (int i = 0; i < k-1; i++) {
            b[k - 1 - i] = b[k - 2 - i];
        }

//        b[3] = b[2];
//        b[2] = b[1];
//        b[1] = b[0];
        b[0] = 4;
        System.out.println(Arrays.toString(b));
        b[lenght-1] = 9;
        System.out.println(Arrays.toString(b));
        int m = 0;
        if (b[lenght-1] != 0) {
            for (int i = lenght-1; i > 0; i--) {
                if (b[i] == 0){
                    m = i;
                    break;
                }
            }
        }
        b[m] = 8;
        System.out.println(Arrays.toString(b));

//        LinkedList users = new LinkedList();
//        users.toString();
//        User julia = new User("Yulia", "Zav", 25);
//        User isliam = new User("Isliam", "Bagirov", 24);
//        User isliam1 = new User("Isliam", "Bagirov", 24);
//        System.out.println(isliam.equals(isliam1));
//
//        users.addFirst(julia);
//        users.addLast(isliam);
//        if (users.contains(isliam)){
//            System.out.println(users.get(users.indexOf(isliam)).toString());
//        }

    }
}

