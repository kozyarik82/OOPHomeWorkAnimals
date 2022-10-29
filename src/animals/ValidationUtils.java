package animals;

public class ValidationUtils {
    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        }else{
            return value;
        }
    }


}
