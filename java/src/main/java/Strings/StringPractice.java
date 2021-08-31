package Strings;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "Nisaar";
        String s2 = " Agharia";
        String s3 = "";
//never do this - string manipulation with String in loops use string buffer or builder instead.
       /* for (int i=0 ; i< 100000; i++)
        {
            s3= s1+s2 +s3;
            System.out.println(s3);
        }*/
        String str3 = "value1";
        str3.concat("value2");
        System.out.println( str3.getBytes());
        System.out.println("Str 3 "+str3);
        String concat = str3.concat("value2");
        System.out.println("-->"+concat);
        System.out.println(str3.concat("value2"));


        // String Builder

        StringBuilder sb = new StringBuilder(s2);
        StringBuilder sba = new StringBuilder("3.3airawg");
        sb.replace(0,2,"bz");
        sb.insert(3,"w");
        sb.append(3.3f);
        sb.delete(4,5);
        sb.reverse();


        System.out.println( sb.compareTo(sba));
        System.out.println(sb);


    }
}
