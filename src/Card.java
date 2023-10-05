import java.util.Objects;

public class Card {
    private int cardNumber;
    private String cardHolderName;
    private int cardSecurityCode;

    public Card(int cardNumber, String cardHolderName, int cardSecurityCode) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardSecurityCode = cardSecurityCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCardSecurityCode() {
        return cardSecurityCode;
    }

    public void setCardSecurityCode(int cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card user)) return false;
        return getCardNumber() == user.getCardNumber() && getCardSecurityCode() == user.getCardSecurityCode() && Objects.equals(getCardHolderName(), user.getCardHolderName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getCardHolderName(), getCardSecurityCode());
    }
}
