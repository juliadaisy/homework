public class Main {
    public static void main(String[] args) {

        Human isliam = new Human();
        isliam.bornIn = 1999;
        isliam.firstName = "Isliam";
        isliam.lastName = "Bagirov";
        isliam.gender = "man";
        isliam.printIdentity();
        //System.out.println(isliam);

        Human yulia = new Human();
        yulia.bornIn = 1998;
        yulia.firstName = "Yuliia";
        yulia.lastName = "Zavadska";
        yulia.gender = "woman";
        yulia.printIdentity();

        yulia.kiss(isliam);
        isliam.kiss(yulia);

    }
}

class Human extends Mammal {
    Integer bornIn;
    String firstName;
    String lastName;
    String gender;

    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + (2023 - bornIn) + " years, " + gender;
    }

    void printIdentity() {
        String h = "==============";
        String s = lastName + " " + firstName + ", " + (2023 - bornIn) + " years, " + gender;
        int l = (s.length() - h.length()) / 2;
        for (int i = 0; i < l; i++)
            System.out.print(" ");
        System.out.println(h);
        System.out.println(s);
        for (int i = 0; i < l; i++)
            System.out.print(" ");
        System.out.println(h);

    }

    void kiss(Human h) {
        System.out.println(lastName + " kisses " + h.firstName);
    }
}
class Mammal {

}