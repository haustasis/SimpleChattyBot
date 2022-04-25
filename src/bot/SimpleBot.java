package bot;

public class SimpleBot {

    public static void main(String[] args) {
        botGreeting("Paca", 2022);
    }

    private static void botGreeting(String name, int birthYear) {
        System.out.printf("Hello! my name is %s. %nI was created in %d.", name, birthYear);
    }
}
