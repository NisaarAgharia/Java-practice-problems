package math;

public class NumberOfDigits {

    public static void main(String[] args) {

        NumberOfDigits num = new NumberOfDigits();
        num.NumberOfDigitsIterative(400);
        //  System.out.println(num.NumberOfDigitsIterative(345678));

        System.out.println(num.NumberOfDigitsLog(412322569));
    }

    public int NumberOfDigitsIterative(long number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public int NumberOfDigitsLog(long num) {
        return (int) Math.floor(Math.log10(num) + 1);
    }
}
