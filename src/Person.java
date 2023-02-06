public class Person {
    //Properties
    private String name;
    private int age;
    //Using strings for these...
    private String height;
    private String weight;

    //Constructor
    public Person(String name, int age, String height, String weight) {
        //Set properties
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    //Gets and Sets...

    //name...
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //height
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }

    //weight
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

}
