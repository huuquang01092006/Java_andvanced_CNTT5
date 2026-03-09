package session02.bt1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<User> userSupplier = () -> new User("guest_user", "GUEST");
        User defaultUser = userSupplier.get();

        Predicate<User> isAdmin = user -> "ADMIN".equals(user.role);

        Function<User, String> getUsername = user -> user.username;

        Consumer<User> printUser = user -> System.out.println("Thông tin chi tiết: " + user);

        User admin = new User("hoang_admin", "ADMIN");

        System.out.println("--- Kiểm tra logic ---");
        System.out.println("Is Admin? " + isAdmin.test(admin));
        System.out.println("Username: " + getUsername.apply(admin));

        printUser.accept(defaultUser);
    }
}