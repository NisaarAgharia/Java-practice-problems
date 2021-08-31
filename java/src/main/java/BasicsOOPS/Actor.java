package BasicsOOPS;

import java.util.Objects;

public class Actor {
   public String name;
   public int age;
   private int weight;

    public Actor (){

    }
    public Actor(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return age == actor.age &&
                weight == actor.weight &&
                Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    public void printDetails(){
        System.out.println("Actor "+this.toString());
    }

    public void act(int age,String Name){
        System.out.println("Acting from Actor");
    }

    public void runner(){
        System.out.println("runner from Actor");
    }
}
