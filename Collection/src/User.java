class User {
    String firstName;
    String lastName;
    int age;

    User(String name, String surname, int age) {
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
    }

    public static void println(User user) {
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Age: " + user.age);
    }
}