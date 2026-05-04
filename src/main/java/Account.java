public class Account {
    // Şifre en az 8 karakter olmalı
    public boolean validatePassword(String password) {
        return password != null && password.length() >= 8;
    }

    // Yaş en az 18 olmalı
    public boolean validateAge(int age) {
        return age >= 18;
    }
}
