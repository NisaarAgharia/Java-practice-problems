package LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class lambdas {

    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Person("Hasnain", 18, 6.1);
        p[1] = new Person("Raziya", 24, 5.4);
        p[2] = new Person("Nisaar", 27, 6);
        p[3] = new Person("Nisaar", 24, 6);

        //System.out.println(Arrays.stream(p).filter(age->age.age==24).count());
        //   Arrays.stream(p).filter(age->age.age==24).forEach(System.out::println);


       List<Person> li = Arrays.asList(p);
        li.stream().filter(a->a.name.equals("Nisaar")).forEach(System.out::println);
        //  li.stream().filter(a->a.name.equals("Nisaar")).collect(Collectors.toMap(1,2)).forEach(System.out::println);

        // System.out.println("LI"+li);


    }
}
