import java.util.Arrays;
import java.util.List;

public class B {
    public String[] getMethod11() {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        return sampleArray;
    }
}
