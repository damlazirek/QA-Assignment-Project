import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeEach // Her testten önce yeni bir nesne oluşturur (Setup)
    void setUp() {
        account = new Account();
    }

    // --- ŞİFRE SINIR TESTLERİ (BVA) ---
    @Test
    void testPasswordExactlyEight() { // Alt Sınır: 8 (Geçmeli)
        assertTrue(account.validatePassword("12345678"));
    }

    @Test
    void testPasswordSevenChars() { // Alt Sınırın 1 Altı: 7 (Hata Vermeli)
        assertFalse(account.validatePassword("1234567"));
    }

    // --- YAŞ SINIR TESTLERİ (BVA) ---
    @Test
    void testAgeExactlyEighteen() { // Alt Sınır: 18 (Geçmeli)
        assertTrue(account.validateAge(18));
    }

    @Test
    void testAgeSeventeen() { // Alt Sınırın 1 Altı: 17 (Hata Vermeli)
        assertFalse(account.validateAge(17));
    }

    @Test
    void testAgeExactlyOneHundredTwenty() { // Üst Sınır: 120 (Geçmeli)
        assertTrue(account.validateAge(120));
    }

    @Test
    void testAgeOneHundredTwentyOne() { // Üst Sınırın 1 Üstü: 121 (Hata Vermeli)
        assertFalse(account.validateAge(121));
    }

    // --- İSİM SINIR TESTLERİ (BVA) ---
    @Test
    void testNameEmpty() { // Alt Sınırın Altı: 0 karakter (Hata Vermeli)
        assertFalse(account.validateName(""));
    }

    @Test
    void testNameFiftyOneChars() { // Üst Sınırın 1 Üstü: 51 karakter (Hata Vermeli)
        String longName = "A".repeat(51);
        assertFalse(account.validateName(longName));
    }
}
