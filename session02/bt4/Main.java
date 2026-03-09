package session02.bt4;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("An"),
                new User("Binh"),
                new User("Chi")
        );

        Function<User, String> f = User::getUsername;

        Consumer<String> printer = System.out::println;

        Supplier<User> creator = User::new;

        users.stream()
                .map(f)
                .forEach(printer);

        User newUser = creator.get();
        System.out.println(newUser.getUsername());
    }
}