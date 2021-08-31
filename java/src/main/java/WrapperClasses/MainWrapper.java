package WrapperClasses;

public class MainWrapper {
    public static void main(String[] args) {
        //Wrapper Classes
        int i = Integer.valueOf(100);
        System.out.println("value of i - "+i);

        int j = new Integer(100);
        System.out.println(j);

        //Autoboxing

        Integer nineC = 9;
        nineC++;

        Float fl = 3.3f;
        fl++;

        Double db = 4343.4d;

        System.out.println(nineC+" "+fl+" "+db+" ");


        // Type Casting

        int val = (int) 3.5;

        float val2 = (float)4;

        Integer in = (int) 6.55;

        long num = 2345;
        int num2 = (int)num;
        Character c1 = new Character('C');
        Boolean b = new Boolean(true);
        Boolean b4 = new Boolean("SomeString");

        Integer seven =
                Integer.valueOf("111", 2);
        System.out.println(seven);

        System.out.println(" "+val+" "+val2+" "+in+" "+num2);
    }
}
