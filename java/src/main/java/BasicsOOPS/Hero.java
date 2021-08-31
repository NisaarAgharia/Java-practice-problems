package BasicsOOPS;

public class Hero  extends Actor{


    public void printDetails(){
        System.out.println("Gero + "+this.toString());
    }

    public void act (){
        System.out.println("I am acting");
    }

    public void act(int age,String Name){
        System.out.println("Acting from Hero");
    }
}
