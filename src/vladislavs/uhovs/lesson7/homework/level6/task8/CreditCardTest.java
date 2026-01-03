package vladislavs.uhovs.lesson7.homework.level6.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    private CreditCard card;

    @BeforeEach
    void setUp() {
        card = new CreditCard("1234567812345678", "123", 300);
    }

    @Test
    @DisplayName("Initial state: balance=0, debt=0, limit set")
    void initialState() {
        assertEquals(0, card.getBalance());
        assertEquals(0, card.getDebt());
        assertEquals(300, card.getCreditLimit());
        assertEquals(300, card.getCreditAvailable());
    }

    @Test
    @DisplayName("Deposit declines on wrong PIN")
    void depositWrongPinDeclined() {
        assertFalse(card.deposit("999", 100));
        assertEquals(0, card.getBalance());
        assertEquals(0, card.getDebt());
    }

    @Test
    @DisplayName("Withdraw declines on wrong PIN")
    void withdrawWrongPinDeclined() {
        assertFalse(card.withdraw("999", 50));
        assertEquals(0, card.getBalance());
        assertEquals(0, card.getDebt());
    }

    @Test
    @DisplayName("Deposit must be positive")
    void depositMustBePositive() {
        assertFalse(card.deposit("123", 0));
        assertFalse(card.deposit("123", -10));
        assertEquals(0, card.getBalance());
        assertEquals(0, card.getDebt());
    }

    @Test
    @DisplayName("Withdraw must be positive")
    void withdrawMustBePositive() {
        assertFalse(card.withdraw("123", 0));
        assertFalse(card.withdraw("123", -10));
        assertEquals(0, card.getBalance());
        assertEquals(0, card.getDebt());
    }

    @Test
    @DisplayName("Withdraw uses balance first")
    void withdrawFromBalance() {
        assertTrue(card.deposit("123", 200));
        assertTrue(card.withdraw("123", 50));
        assertEquals(150, card.getBalance());
        assertEquals(0, card.getDebt());
    }

    @Test
    @DisplayName("Withdraw uses credit when balance not enough")
    void withdrawUsesCredit() {
        assertTrue(card.deposit("123", 100));
        assertTrue(card.withdraw("123", 180)); // 100 balance + 80 debt
        assertEquals(0, card.getBalance());
        assertEquals(80, card.getDebt());
        assertEquals(220, card.getCreditAvailable());
    }

    @Test
    @DisplayName("Withdraw declines if would exceed credit limit (no state change)")
    void withdrawDeclinedIfExceedsLimit() {
        assertTrue(card.deposit("123", 50));     // balance=50
        assertTrue(card.withdraw("123", 330));   // total available = 50 + 300 = 350 -> ok, debt=280
        assertEquals(0, card.getBalance());
        assertEquals(280, card.getDebt());

        // теперь доступно только 20 кредита, попытка снять 21 должна быть отклонена
        assertFalse(card.withdraw("123", 21));
        assertEquals(0, card.getBalance());
        assertEquals(280, card.getDebt());
    }

    @Test
    @DisplayName("Deposit pays debt first, then balance")
    void depositPaysDebtFirst() {
        assertTrue(card.deposit("123", 100));
        assertTrue(card.withdraw("123", 150)); // debt=50
        assertEquals(0, card.getBalance());
        assertEquals(50, card.getDebt());

        assertTrue(card.deposit("123", 30)); // debt=20
        assertEquals(0, card.getBalance());
        assertEquals(20, card.getDebt());

        assertTrue(card.deposit("123", 50)); // debt=0, balance=30
        assertEquals(30, card.getBalance());
        assertEquals(0, card.getDebt());
    }

    @Test
    @DisplayName("Cannot lower credit limit below current debt")
    void cannotLowerLimitBelowDebt() {
        assertTrue(card.deposit("123", 10));
        assertTrue(card.withdraw("123", 200)); // debt=190
        assertEquals(190, card.getDebt());

        assertFalse(card.setCreditLimit(189));
        assertEquals(300, card.getCreditLimit());
    }

    @Test
    @DisplayName("Can increase credit limit")
    void canIncreaseLimit() {
        assertTrue(card.setCreditLimit(500));
        assertEquals(500, card.getCreditLimit());
        assertEquals(500, card.getCreditAvailable());
    }

    @Test
    @DisplayName("Constructor validates PAN and PIN")
    void constructorValidates() {
        assertThrows(IllegalArgumentException.class, () -> new CreditCard("123", "123", 10));
        assertThrows(IllegalArgumentException.class, () -> new CreditCard("1234567812345678", "12", 10));
        assertThrows(IllegalArgumentException.class, () -> new CreditCard("1234567812345678", "123", -1));
    }
}