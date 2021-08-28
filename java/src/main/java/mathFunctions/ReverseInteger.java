package mathFunctions;

public class ReverseInteger {

    public static int reverseINT(int num) {

        int rev = 0;
        while (num != 1) {
            int LD = num % 10;
            rev = rev * 10 + LD;
            num = num / 10;
        }

        return rev;
    }


    public static void main(String[] args) {


        System.out.println(reverseINT(32103456));

        //System.out.println("hello1");
    }

}

