package com.vednexgen.switch_case;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        String day = "Monday";

        String type = switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(type);
    }
}