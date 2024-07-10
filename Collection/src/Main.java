import java.util.*;

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
        udb.addFirst(will);
        udb.print();

    }
}

