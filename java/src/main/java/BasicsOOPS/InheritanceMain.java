package BasicsOOPS;

public class InheritanceMain {

    public static void main(String[] args) {

        Hero h = new Hero();
        Actor a = new Actor();

        Actor ah = new Hero();
        h.act();
        a.sing();
        a.printDetails();
        ah.sing();
       // a.act(12,"hasnanin");
      //  h.act(1,"");
      //  h.runner();





    }
}