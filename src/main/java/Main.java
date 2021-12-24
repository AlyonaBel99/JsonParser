import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        GsonParser gsonParser = new GsonParser("test.json");
        Root root = gsonParser.parser();
        CardsExpDate cardsExpDate = new CardsExpDate();
        Date date = new GregorianCalendar(2020, 01, 21).getTime();

        System.out.println("Date: " +date + " \nnumber: " + cardsExpDate.getCardsArrayExpDate(root, date));
    }
}
