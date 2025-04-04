public class ImprovedSwitchCase {

    public static void main(String[] args) {
        String day = "Friday";
        String result = switch (day) {

            case "Monday" -> "Start of the week";
            case "Friday" -> "Weekend is near";
            case "Sunday" -> "Weekend!!";
            default -> "Midweek";
        };
        System.out.println("Status :: " + result);
    }
}
