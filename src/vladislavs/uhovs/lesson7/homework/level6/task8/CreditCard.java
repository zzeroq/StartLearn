package vladislavs.uhovs.lesson7.homework.level6.task8;

import java.util.Objects;

public class CreditCard {

    private static final int PAN_LENGTH = 16;
    private static final String PAN_PATTERN = "[0-9]{" + PAN_LENGTH + "}";
    private static final int PIN_LENGTH = 3;
    private static final String PIN_PATTERN = "[0-9]{" + PIN_LENGTH + "}";
    private final String cardNumber;
    private final String pin;
    private int balance;
    private int creditLimit;
    private int debt;

    public CreditCard(String cardNumber, String pin, int creditLimit) {
        if (cardNumber == null || !cardNumber.matches(PAN_PATTERN)) {
            throw new IllegalArgumentException("Card number must be " + PAN_LENGTH + " digits");
        }
        if (pin == null || !pin.matches(PIN_PATTERN)) {
            throw new IllegalArgumentException("PIN must be " + PIN_LENGTH + " digits");
        }
        if (creditLimit < 0) {
            throw new IllegalArgumentException("Credit limit cannot be negative");
        }

        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditLimit = creditLimit;

        this.balance = 0;
        this.debt = 0;
    }


    public String getCardNumber() {
        return cardNumber;
    }
    public int getBalance() {
        return balance;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public int getDebt() {
        return debt;
    }
    public int getCreditAvailable() {
        return creditLimit - debt;
    }


    public boolean setCreditLimit(int newLimit) {
        if (newLimit < 0) return false;
        if (newLimit < debt) return false;
        this.creditLimit = newLimit;
        return true;
    }

    public boolean deposit(String pin, int amount) {
        if (!isPinOk(pin)) return false;
        if (amount <= 0) return false;
        if (debt > 0) {
            if (amount >= debt) {
                int remaining = amount - debt;
                debt = 0;
                balance += remaining;
            } else {
                debt -= amount;
            }
        } else {
            balance += amount;
        }
        return true;
    }

    public boolean withdraw(String pin, int amount) {
        if (!isPinOk(pin)) return false;
        if (amount <= 0) return false;
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        int remainder = amount - balance;
        int newDebt = debt + remainder;
        if (newDebt > creditLimit) return false;
        balance = 0;
        debt = newDebt;
        return true;
    }

    private boolean isPinOk(String pinToCheck) {
        return Objects.equals(this.pin, pinToCheck);
    }
}
