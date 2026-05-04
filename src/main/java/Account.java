public class Account {
    // Şifre Sınırı: Minimum 8 karakter
    public boolean validatePassword(String password) {
        return password != null && password.length() >= 8;
    }

    // Yaş Sınırı: 18 ile 120 yaş arası
    public boolean validateAge(int age) {
        return age >= 18 && age <= 120;
    }

    // İsim Sınırı: En az 1 karakter, en fazla 50 karakter
    public boolean validateName(String name) {
        if (name == null) return false;
        int len = name.trim().length();
        return len >= 1 && len <= 50;
    }
}
