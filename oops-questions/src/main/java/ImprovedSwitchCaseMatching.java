public class ImprovedSwitchCaseMatching {

    public static void main(String[] args) {

        Object obj = "Hello, Java!";

        switch (obj) {
            case String s -> System.out.println(s.toLowerCase());
            case Integer i -> System.out.println(i.intValue());
            default -> System.out.println("something else");
        }

    }
}
