package com.vednexgen.switch_case;

public class StringSwitchCase {
    public static void main(String[] args) {
         int i = extracted();
         IO.println(i);
    }

    private static int extracted() {
        String fruit = "Apple";
        int i = switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                yield 1;
            case "Banana":
                System.out.println("It's a banana");
//                yield 2;
//                break;
            default:
                System.out.println("Unknown fruit");
                yield 3;
        };

        return i;
    }
}