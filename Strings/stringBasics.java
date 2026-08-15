package Strings;

// import java.util.*;

public class stringBasics {
    public static void main(String[] args) {
        // char[] arr = new char[10];
        // New method to define string
        // Scanner removed because it's not used in this example to avoid resource leak
        // String s = sc.next();
        // String sp = sc.nextLine();
        // System.out.println(sp);

        String str = "Hello";
        String gtr = "Dello";
        // System.out.println(str);
        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(5));
        // System.out.println(str.indexOf('a'));
        // System.out.println(str.compareTo(gtr));
        // System.out.println(str.contains("ello")); //it checks whole string contains
        // in str
        // System.out.println(str.startsWith("He"));
        // System.out.println(str.endsWith("llo"));
        // System.out.println(str.toLowerCase());
        // System.out.println(gtr.toUpperCase());

        System.out.println(str.concat(gtr));

        String s1 = "Physics";
        for (int i = 2; i < 4; i++) {
            System.out.print(s1.substring(i));
        }

        // int lenghtOfString = str.length();
        // System.out.println(lenghtOfString);


        
    }
}
