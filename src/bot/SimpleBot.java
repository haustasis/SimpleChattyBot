package bot;

public class SimpleBot {

    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot("slice", "2028");
        System.out.println(bot.toString());
    }

    private String botName;
    private String botYear;

    public SimpleBot() {
        this.botName = "Stride";
        this.botYear = "2023";
    }

    public SimpleBot(String botName, String botYear) {
        this.botName = botName;
        this.botYear = botYear;
    }

    public String toString() {
        return "Hello! My name is " + this.botName + ". \nI was created in " + this.botYear + ".";
    }


}
