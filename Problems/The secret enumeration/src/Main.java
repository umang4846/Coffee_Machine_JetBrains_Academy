public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < Secret.values().length; i++) {
            if (Secret.values()[i].toString().startsWith("STAR")) {
                ++count;
            }
        }
        System.out.println(count);
    }
}

/*
enum Secret {
    STAR, CRASH, START, // ...
}
*/
