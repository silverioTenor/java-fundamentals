package lesson3.schoolSystem;

sealed interface Authenticable permits Employee {
    void login();
    void logout();
}
