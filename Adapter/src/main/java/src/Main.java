package src;

public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        // Set initial date
        dateAdapter.setDay(12);
        dateAdapter.setMonth(11); // August
        dateAdapter.setYear(2024);

        // Display initial date
        System.out.println("Initial Date: " + dateAdapter.getDay() + "/" +
                dateAdapter.getMonth() + "/" + dateAdapter.getYear());

        // Advance date by 10 days
        dateAdapter.advanceDays(10);

        // Display new date
        System.out.println("New Date after advancing 10 days: " +
                dateAdapter.getDay() + "/" +
                dateAdapter.getMonth() + "/" + dateAdapter.getYear());
    }
}
