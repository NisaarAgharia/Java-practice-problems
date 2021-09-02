package InnerClasses;

public class OuterClass {
    public static void main(String[] args) {
      //OuterClass out = new  OuterClass.innerclass
        //s1.hi();
    }
    String build;
    static int i = 5;

    public static class innerclass{
        void hi (){

            if (i>5)
            {}
        }
    }

    public  class StaticNestedClass{
        void hi (){

            if (i>5)
            {}
        }


    }
    public  void method1(){

        class innerclass2{
             void hi (){

                 if (i>5)
                 {}
             }

         }

         class StaticNestedClass{
             void hi (){

                 if (i>5)
                 {}
             }

        }
    }
}
