import java.util.HashSet;

public class ArrayUtil {

    public static String[] findCommon(String[] array1, String[] array2) {

        HashSet<String> duplicates = new HashSet<>();

        for (String s : array1) {
            for (String value : array2) {
                if (s.equals(value)) {
                    duplicates.add(s);
                }
            }
        }
        return duplicates.toArray(new String[0]);
    }
}
