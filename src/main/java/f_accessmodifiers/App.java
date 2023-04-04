package f_accessmodifiers;

public class App {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(10);

        System.out.println(user1.getAge());
    }
}
