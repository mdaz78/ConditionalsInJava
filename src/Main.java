public class Main {
    public static void main(String[] args) {
        System.out.println("Using if loop");
        ifStatements(20);

        System.out.println("--------------------");

        System.out.println("Using switch");
        switchStatements(2);

        System.out.println("Enhanced switch");
        System.out.println(getQuarter("January"));
        System.out.println(getQuarter("aoeu"));
    }

    public static void ifStatements(int age) {
        // Check if person is old enough to drink
        if (age < 18) {
            System.out.println("Can't Drink Sorry! :(");
        } else if (age > 18) {
            System.out.println("Sure, Grab a drink");
        } else {
            System.out.println("Meh!! Do whatever you want, I don't care");
        }
    }

    /**
     * Determines the day of the week based on the given day number.
     *
     * @param day An integer representing the day of the week (1-7)
     *            1 = Monday
     *            2 = Tuesday
     *            3 = Wednesday
     *            4 = Thursday
     *            5 = Friday
     *            6 = Saturday
     *            7 = Sunday
     * @return void
     */
    public static void switchStatements(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }

    public static String getQuarter(String month) {
        return switch (month.toLowerCase()) {
            case "january", "february", "march" -> "First Quarter";
            case "april", "may", "june" -> "Second Quarter";
            case "july", "august", "september" -> "Third Quarter";
            case "october", "november", "december" -> "Fourth Quarter";
            default -> {
                String badResponse = "Invalid month " + month;
                yield badResponse;
            }
        };
    }
}
