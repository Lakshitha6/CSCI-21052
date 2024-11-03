abstract public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}