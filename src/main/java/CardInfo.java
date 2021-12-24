import com.google.gson.annotations.SerializedName;

public class CardInfo {
    @SerializedName("CardNumber")
    private String cardNumber;
    @SerializedName("CardName")
    private String cardName;
    @SerializedName("ExpDate")
    private String expDate;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public String toString(){
        return "CardInfo{ cardNumber = " + cardNumber +
                ", cardName = " + cardName +
                ", expDate = " + expDate;
    }
}
