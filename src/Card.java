import java.util.ArrayList;
import java.util.Objects;

public class Card {
    private int cardNumber;
    private String cardHolderName;
    private int cardSecurityCode;
    private int PIN;
    private float cardSold;
    private ArrayList extrasCont;

    public Card(int cardNumber, String cardHolderName, int cardSecurityCode, int PIN, float cardSold, ArrayList extrasCont) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardSecurityCode = cardSecurityCode;
        this.PIN = PIN;
        this.cardSold = cardSold;
        this.extrasCont = extrasCont;
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

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public float getCardSold() {
        return cardSold;
    }

    public void setCardSold(float cardSold) {
        this.cardSold = cardSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return getCardNumber() == card.getCardNumber() && getCardSecurityCode() == card.getCardSecurityCode() && getPIN() == card.getPIN() && Float.compare(card.getCardSold(), getCardSold()) == 0 && Objects.equals(getCardHolderName(), card.getCardHolderName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getCardHolderName(), getCardSecurityCode(), getPIN(), getCardSold());
    }
}
