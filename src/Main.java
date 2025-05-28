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

        System.out.println("Switch challenge");
        System.out.println(natoChallenge("Car"));
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

    /**
     * Determines the quarter of the year based on the given month.
     * Works with JDK 14 and above
     *
     * @param month A string representing the month
     * @return A string representing the quarter of the year
     */
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

    public static String natoChallenge(String word) {
        String natoWord = "";
        for (char c : word.toLowerCase().toCharArray()) {
            natoWord += switch (c) {
                case 'a' -> "Alfa";
                case 'b' -> "Bravo";
                case 'c' -> "Charlie";
                case 'd' -> "Delta";
                case 'e' -> "Echo";
                case 'f' -> "Foxtrot";
                case 'g' -> "Golf";
                case 'h' -> "Hotel";
                case 'i' -> "India";
                case 'j' -> "Juliett";
                case 'k' -> "Kilo";
                case 'l' -> "Lima";
                case 'm' -> "Mike";
                case 'n' -> "November";
                case 'o' -> "Oscar";
                case 'p' -> "Papa";
                case 'q' -> "Quebec";
                case 'r' -> "Romeo";
                case 's' -> "Sierra";
                case 't' -> "Tango";
                case 'u' -> "Uniform";
                case 'v' -> "Victor";
                case 'w' -> "Whiskey";
                case 'x' -> "Xray";
                case 'y' -> "Yankee";
                case 'z' -> "Zulu";
                default -> "Invalid character";
            };
        }
        return natoWord;
    }
}
