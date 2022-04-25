package bot;

public class SimpleBot {

    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot();
        bot.setName("Fedor");
        bot.setAge(2020);
        System.out.printf("Hello! My name is %s.\n", bot.getName());
        System.out.printf("I was created in %d.", bot.getAge());
    }

    private String name = "";
    private int age = 0;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}
