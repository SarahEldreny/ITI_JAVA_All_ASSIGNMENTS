package Day3;

import java.util.function.Predicate;

public class checkerString {
    public static boolean checkString(String string, Predicate<String> predicate){
        return predicate.test(string);
    }
}
