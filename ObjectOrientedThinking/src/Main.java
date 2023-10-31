import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //autoboxing

//        Integer intObject = Integer.valueOf(2);
//        Integer intObjects = new Integer(8);
//        //autobox
//        Integer intObjectss = 9;
//
//        //autounboxed
//        int x = Integer.valueOf(2);
//
//        Integer [] inArray = {3,5,6};
//
//        System.out.println(inArray[0] + inArray[1] + inArray[2]);
//
//        Integer y = 3 + Integer.valueOf(5);
//        Integer a = 3;
//        Double  b = Double.valueOf(4.5) + 9.0 + a;
//        System.out.println(b);
//        Double v = 4.0;
//        double xs = Double.valueOf(9);
//        int xy = Integer.valueOf(9);
//        int xyz = Integer.valueOf(4) + Integer.valueOf(5);
//
//        Double yu = 3.5;
//        System.out.println(yu.intValue());
//        System.out.println(yu.compareTo(9.9));
//
//        Integer[] intArray = {1,2,3};
//        int i = intArray[1] + intArray[0];
//        int j = i + intArray[2];
//        double d = intArray[0];
//
//        BigInteger f = new BigInteger("984488484848");
//        BigInteger k = new BigInteger("484");
//        BigInteger l = f.multiply(k);
//
//        BigDecimal o = new BigDecimal("4848");
//        BigDecimal n = new BigDecimal("8");
////        BigDecimal r = o.divide(b,20, RoundingMode.HALF_DOWN);

//        BigInteger yz = new BigInteger("3");
//        BigInteger zy = new BigInteger("7");
//        System.out.println(zy.add(yz));;
//        char testCode = "Hello, World".charAt(9);
//        System.out.println(testCode);
//        String testCodes = "Hello, world";
//        testCodes.length();
//        System.out.println(testCodes.charAt(8));;
//        testCodes.toLowerCase();
//        System.out.println(testCodes);
//
//        String message = new String("Welcome to Java");
//        message.toCharArray();
//        message.toUpperCase();
//        System.out.println(message);
//
//        String messages = "Welcome to Java";
//        char [] charArray = {'G', 'o', 'o', 'd', '', 'D', 'a', 'y'};
//
//        String messages1 = new String(charArray);
//
//        "Welcome".replace('e','A');
//        "Welcome".replaceFirst("e", "f");
//        "Welcome".replace("e", "AB");
//        "Welcome".replace("el", "AB");
//        "Welcome".replaceAll("e", "AB");
//
//        String [] tokens = "Java#HTML#PERL".split("#");
//        for(int i = 0; i < tokens.length; i++){
//            System.out.println(tokens[i] + " ");
//        }
//
//        String s1 = "Welcome to Java";
//        s1.replace("Java", "HTML");
//        s1.replaceAll("o", "T");
//        s1.replaceFirst("o", "T");
//        s1.toCharArray();
//

//        String [] tokens = "Welcome to Java".split("o");
//        System.out.println(tokens[2]);
//
//        for (int i = 0; i < tokens.length; i++ ){
//            System.out.print(tokens[i] + " ");
//        }
//
//        "Java".matches("Java");
//        "Java".equals("Java");
//        "Java is fun".matches("Java.*");
//        "Java is cool".matches("Java.*");
//        "Java is powerful".matches("Java.*");
//
//        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{3}"));
//        System.out.println();
//
//        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
//        System.out.println(s);
//
//        String [] tokenss = "Java,C?C#,C++".split(".,:;?");
//
//        System.out.println("Hi, ABC, good".matches("ABC "));
//        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
//        System.out.println("A, B; C".replaceAll("[,;]", "#"));
//
//        System.out.println("A,B;C".replaceAll(",;", "#") + " ");
//        System.out.println("A, B, C".replaceAll("[,;]", "#"));

        char [] chars = "Java".toCharArray();
        System.out.println(chars[1]);

        char [] dst = {'J', 'A', 'V', 'A', '1', '1', '3', '0', '1'};
        "CS3720".getChars(2,6,dst, 4);












    }
}