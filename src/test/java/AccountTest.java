import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeEach // Her testten önce çalışır (Setup)
    void setUp() {
        account = new Account();
    }

    @Test
    void testPasswordExactlyEight() { // Tam sınır: 8 (Geçmeli)
        assertTrue(account.validatePassword("12345678"));
    }

    @Test
    void testPasswordSevenChars() { // Sınırın altı: 7 (Hata vermeli)
        assertFalse(account.validatePassword("1234567"));
    }

    @Test
    void testAgeExactlyEighteen() { // Tam sınır: 18 (Geçmeli)
        assertTrue(account.validateAge(18));
    }
}
