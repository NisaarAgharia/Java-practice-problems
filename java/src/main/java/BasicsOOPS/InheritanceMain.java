package BasicsOOPS;

import BasicsOOPS.AbstractClasses.Actoress;

public class InheritanceMain {

    public static void main(String[] args) {

        Hero h = new Hero();
        Actor a = new Actor();

        Actor ah = new Hero();
        Actoress f = new Actoress();

        System.out.println(f instanceof Showbiz);

   //     Hero h = new Object();
        h.act();
        a.sing();
        a.printDetails();

       // a.act(12,"hasnanin");
      //  h.act(1,"");
      //  h.runner();





    }
}
