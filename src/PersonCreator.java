public class PersonCreator {
    public static void main(String[] args) {
        //Create objects
        Person Person01 = new Person("James Peterson", 34, 180, 73.5);
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2);

        //Output to screen...

        //Person1
        //age James...
        Person01.growOlder();
        System.out.println("Person1: " + Person01.getName() + " " + Person01.getAge() +
                " " + Person01.getHeight() + "cm " + Person01.getWeight() + "lbs");

        //Person2
        System.out.println("Person2: " + Person02.getName() + " " + Person02.getAge() +
                " " + Person02.getHeight() + "cm " + Person02.getWeight() + "lbs");
    }
}
