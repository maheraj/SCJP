import java.util.HashSet;
import java.util.Set;

/**
 * User: maheraj
 * Date: 2/9/16
 * Time: 12:43 PM
 */
public class Quiz2 {
    public static void main(String[] args) {
        Set<Short> set = new HashSet<>();
        for (short i = 0; i < 10; i++) {
            set.add(i);
            set.remove(i - 1);
        }
        System.out.println(set.size());
    }
}
