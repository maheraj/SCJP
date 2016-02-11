public class Quiz6 {
    public static void process() {
        int x = 0;
        int[] nums = {1, 2, 3, 5};

        for (int i : nums)
            switch (i) {
                case 1:
                    x += i;
                case 5:
                    x += i;
                default:
                    x += i;
                case 2:
                    x += i;
            }
        System.out.println(x);
    }

    public static void main(String[] args) {
        process();
    }
}
