public class PersonCreator {
    public static void main(String[] args) {
        //Create objects
        Person Person01 = new Person("James Peterson", 34, "180cm", "73.5lbs");
        Person Person02 = new Person("Bob Thornley", 25, "171cm", "68.2lbs");

        //Output to screen...

        //Person1
        System.out.println("Person1: " + Person01.getName() + " " + Person01.getAge() +
                " " + Person01.getHeight() + " " + Person01.getWeight());

        //Person2
        System.out.println("Person2: " + Person02.getName() + " " + Person02.getAge() +
                " " + Person02.getHeight() + " " + Person02.getWeight());
    }
}
