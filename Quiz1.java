public class Quiz1 {
    static String str;

    public static boolean test1(){
        return new Boolean("1");
    }

    public static boolean test2(){
        return new Boolean(str);
    }

    public static void process() {

        if(test1())
            System.out.print("1");
        if(!test2())
            System.out.print("2");
        if(test1() != test2())
            System.out.print("3");
    }
}
