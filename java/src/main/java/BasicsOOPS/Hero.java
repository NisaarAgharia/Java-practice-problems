package BasicsOOPS;

public final class Hero  extends Actor{


    public void printDetails(){
        System.out.println("Hero + "+this.toString());
    }

    public void act (){
        System.out.println("I am acting");
    }

    public void sing(){
        System.out.println("Singing  from Actor");
    }

    public void act(int age,String Name){
        System.out.println("Acting from Hero");
    }

    public void flirt (){

    }
}
