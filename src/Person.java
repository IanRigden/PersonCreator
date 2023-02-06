public class Person {
    //Properties
    private String name;
    private int age;

    private int height;
    private double weight;

    //Constructor
    public Person(String name, int age, int height, double weight) {
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
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    //weight
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Behaviour method
    public void growOlder(){
        //Bloomin cheek...
        this.age++;
        this.height--;
        this.weight -= 0.5;
    }
}
