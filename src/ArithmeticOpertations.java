public class ArithmeticOpertations {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 10;
        boolean trueFlag = true;
        boolean falseFlag = false;

//        System.out.println("Invert trueFlag : " + !trueFlag);
//        System.out.println("Invert falseFlag : " + !falseFlag);

//        if(trueFlag) {
//            System.out.println("Send OTP");
//        }

//        if((a>b) || (b>c)) { // true, false
//            System.out.println("1. Any one condition is true");
//        }
//        if((a>b) || (c>b)) { // true, true
//            System.out.println("2. Any one condition is true");
//        }
//        if((b>c) || (c>b)) { // false, true
//            System.out.println("3. Any one condition is true");
//        }
//        if((b>a) || (b>c)) { // false, false
//            System.out.println("4. Any one condition is true");
//        }

//        if((a>b) && (c>b)) {  // true, true
//            System.out.println("1, Both condition are true");
//        }
//
//        if((a>b) && (b>c)) {  // true, false
//            System.out.println("2, Both condition are true");
//        }
//
//        if((b>a) && (b>c)) {  // false, false
//            System.out.println("3, Both condition are true");
//        }
//
//        if((b>a) && (c>b)) {  // false. true
//            System.out.println("4. Both condition are true");
//        }

//        if((a>b) && (c>b) && (c>a)) {  // true, true
//            System.out.println("All 3 conditions are true");
//        }


        int div1 = a / b;
        float div2 = (float) a / b;
//        System.out.println(div1);
//        System.out.println(div2);
        int mod = a % b;
//        System.out.println(mod);
        int multi = a * b;
//        System.out.println(multi);

//        System.out.println( a > b); // true
//        System.out.println( a < b); // false
//        System.out.println( a >= b); // true
//        System.out.println( a <= b); // false
//        System.out.println( a != b); // true
//        System.out.println( a == b); // false





        String name1 = "Bhushan";
        String name2 = "Bhushan";

//        System.out.println( name1 == name2);

        String name3 = new String ("Bhushan"); //101
        String name4 = new String ("Bhushan"); //102

//        System.out.println(name3 == name4); //false

//        System.out.println(name3.equals(name4)); //true


    }
}
