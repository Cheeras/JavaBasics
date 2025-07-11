package com.assignments;

import java.util.*;

public class TimeSlotBookingSystem {

    enum SlotType {
        AVAILABLE, LUNCH_BREAK, UNAVAILABLE, INVALID, CLOSED
    }

    static class TimeRange {
        double start;
        double end;

        TimeRange(double start, double end) {
            this.start = start;
            this.end = end;
        }

        boolean includes(double time) {
            return time >= start && time < end;
        }
    }

    static final Map<String, List<TimeRange>> locationSlots = new HashMap<>();
    static final List<String> nonWorkingDays = Arrays.asList("Sunday");

    static {
        // Define time slots per location
        locationSlots.put("Hyderabad", List.of(
                new TimeRange(9.0, 12.0),
                new TimeRange(14.0, 17.0)
        ));

        locationSlots.put("Chennai", List.of(
                new TimeRange(10.0, 13.0),
                new TimeRange(15.0, 18.0)
        ));
    }

    public static SlotType getSlotType(String day, String location, double time) {
        if (time < 0 || time >= 24) {
            return SlotType.INVALID;
        }

        if (nonWorkingDays.contains(day)) {
            return SlotType.CLOSED;
        }

        List<TimeRange> slots = locationSlots.get(location);
        if (slots == null) {
            return SlotType.INVALID;
        }

        for (TimeRange range : slots) {
            if (range.includes(time)) {
                return SlotType.AVAILABLE;
            }
        }

        if (time >= 12.0 && time < 14.0) {
            return SlotType.LUNCH_BREAK;
        }

        return SlotType.UNAVAILABLE;
    }

    public static double parseTimeToDecimal(String time) {
        try {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            return hour + (minute / 60.0);
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time (HH:mm): ");
        String timeInput = sc.nextLine();

        System.out.print("Enter day (e.g., Monday): ");
        String day = sc.nextLine().trim();

        System.out.print("Enter location (Hyderabad/Chennai): ");
        String location = sc.nextLine().trim();

        double time = parseTimeToDecimal(timeInput);
        SlotType slotType = getSlotType(day, location, time);

        switch (slotType) {
            case AVAILABLE -> System.out.println("✅ Booking Available");
            case LUNCH_BREAK -> System.out.println("🍴 Lunch Break – Try later");
            case UNAVAILABLE -> System.out.println("❌ Slot Unavailable");
            case CLOSED -> System.out.println("📅 Closed Today (" + day + ")");
            case INVALID -> System.out.println("⚠️ Invalid time or location");
        }
    }
}
