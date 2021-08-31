package BasicsOOPS;

public class BasicsMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        obj1.hashCode();
        Object obj2 = obj1;


     //   obj2.equals(obj1);
        System.out.println(obj2.equals(obj1));
        System.out.println("obj 1" +obj1.hashCode() + "Obj 2 "+obj2.hashCode());
        Actor a1 = new Actor();
        Actor a2 = new Actor("Nisaar",22,75);
        System.out.println("a1 " +a1.hashCode() + " a2 "+a2.hashCode());
        System.out.println(a1.equals(a2));
    }

}
