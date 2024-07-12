import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        UserDatabase udb = new UserDatabase();
        User julia = new User("Yulia", "Zav", 25);
        udb.addNext(julia);
        User isliam = new User("Isliam", "Bagirov", 24);
        udb.addNext(isliam);
        User nana = new User("Nana", "Fauler", 30);
        udb.addNext(nana);
        udb.print();
        User kate = new User("Kate", "Fox", 23);
        udb.addFirst(kate);
        udb.print();
        User will = new User("Will", "Smith", 50);
        udb.insert(will, 2);
        udb.print();
        User nina = new User("Nina", "Fdd", 32);
        udb.insert(nina, 1);
        udb.print();
        udb.getUser(4);
        udb.remove(4);
        udb.print();
        udb.remove(1);
        udb.print();
        udb.addNext(julia);
        udb.addNext(julia);
        udb.addNext(julia);
        udb.print();
        udb.addFirst(isliam);
        udb.print();

        UserDatabase udb1 = new UserDatabase(2);
        User jim = new User("Jim", "Tuna", 35);
        udb1.addNext(jim);
        udb1.print();

    }
}

