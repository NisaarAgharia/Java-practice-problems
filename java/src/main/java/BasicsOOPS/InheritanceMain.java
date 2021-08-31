package BasicsOOPS;

public class InheritanceMain {

    public static void main(String[] args) {

        Hero h = new Hero();
        Actor a = new Actor();

        h.act();
        a.printDetails();
        a.act(12,"hasnanin");
        h.act(1,"");
        h.runner();
    }
}
