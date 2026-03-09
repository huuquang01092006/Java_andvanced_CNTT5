package session02.bt5;

public interface UserActions {

    default void logActivity(String activity) {
        System.out.println("User action: " + activity);
    }

}