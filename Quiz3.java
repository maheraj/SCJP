//For multiple overloading, most specific method is chosen over generic option.
public class Quiz3 {
    public static String getValue(Integer value) {
        return "integer";
    }

    public static String getValue(Object value) {
        return "object";
    }

    public static void process() {
        System.out.println(getValue(null));
    }

    public static void main(String[] args) {
        process();
    }
}
