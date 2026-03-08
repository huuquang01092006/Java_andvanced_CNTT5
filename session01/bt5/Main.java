package session01.bt5;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.setAge(-5);
            System.out.println("Tuổi người dùng: " + user.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi xảy ra: " + e.getMessage());
        }
    }
}
