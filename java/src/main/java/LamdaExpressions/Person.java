package LamdaExpressions;

public class Person {
    String name;
    int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void Name(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void Age(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void Height(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
