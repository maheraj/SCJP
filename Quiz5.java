public class Quiz5 {

    public static void process() {
        int[] arr = {1, 2, 3};
        for (int element : arr) {
            System.out.print(element);
            element = element + 5;
        }

        for (int element : arr) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        process();
    }
}
