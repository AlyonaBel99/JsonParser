import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardsExpDate {

    private Date CardDate(String string){
        Date date = null;
        try {
            if (string.length() != 10) throw new IOException();
            date = new SimpleDateFormat("dd-MM-yyyy").parse(string);
            return date;
        } catch (Exception e) {
            System.out.println("Parsing Date error: " + e.toString());
        }
        return null;
    }
    private void checkCardNumber(String cardNumber) throws IOException {
            if ( cardNumber.length()!=16 || cardNumber.matches("\\d+") != true)throw new IOException();
    }

    private void checkExpDate(String expDate) throws IOException {
        if (expDate.length() != 10)throw new IOException();
    }

    public List<String> getCardsArrayExpDate (Root json, Date date) {
        List<String> listCardNumber = new ArrayList<>();
        try {
            if (json == null || json.getCardInfo() == null)
                throw new IOException();
            for (CardInfo cardInfo: json.getCardInfo()) {
                checkCardNumber(cardInfo.getCardNumber()); // проверка CardNumber
               checkExpDate(cardInfo.getExpDate()); //проверка ExpDate
                if (CardDate(cardInfo.getExpDate()).before(date) == true){
                    String str = cardInfo.getCardNumber();
                    String last4 = str == null || str.length() < 4 ? str : str.substring(str.length() - 4);
                    listCardNumber.add(last4);
                }
            }
            if (listCardNumber.isEmpty() != true)
                return listCardNumber;
        }catch (Exception e){
            System.out.println("Data error: " + e.toString());
        }
        return null;
    }
}
