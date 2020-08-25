import java.util.HashMap;

public class TestJava {
    public static void main(String[] args) {
        String[] names = {"Caty", "John", "Nick", "John", "Philip", "Caty", "Caty"};
        HashMap<String, Integer> repeatNames = new HashMap<String, Integer>();
        int repeatCount = 0;

        for (String name : names) {
            int count = 0;
                if (names.) {
                    count++;
                }
            }

            if (count > 1) {
                if (!repeatNames.containsKey(name)) {
                    System.out.println(name + ":" + count);
                    repeatNames.put(name, count);
                    repeatCount += count;
                }
            }
        }
        System.out.println("Total Count:" + repeatCount);
    }
}
