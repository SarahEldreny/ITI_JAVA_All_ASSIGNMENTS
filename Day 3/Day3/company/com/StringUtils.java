package company.com;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class StringUtils {
    public static String betterString(String string1, String string2, BiPredicate<String,String> biPredicate){
        if (biPredicate.test(string1,string2))
            return string1;
        return string2;

    }
}
