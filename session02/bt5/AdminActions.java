package session02.bt5;

public interface AdminActions {

    default void logActivity(String activity) {
        System.out.println("Admin action: " + activity);
    }

}