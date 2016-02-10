public class Quiz4 {
    public static void main(String[] args) {
        String[] integers = {"1", "2", "3"};
        Quiz4_2.main(integers);
    }
}


class Quiz4_2 {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s);
        System.out.print(4);
    }
}
