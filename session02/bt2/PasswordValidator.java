package session02.bt2;

@FunctionalInterface
interface PasswordValidator {
    boolean isValid(String password);
}