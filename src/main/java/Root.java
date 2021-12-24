import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Root {

    @SerializedName("ProfileId")
    private String profileId;
    @SerializedName("PersonInfo")
    private PersonInfo personInfo;
    @SerializedName("CardInfo")
    private List<CardInfo> cardInfo;

    public String getProfileId() {
        return profileId;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public List<CardInfo> getCardInfo() {
        return cardInfo;
    }

    @Override
    public String toString(){
        return "Root{" + "profileId = " + profileId +
                ", personInfo = " + personInfo +
                ", cardInfo = " + cardInfo;
    }
}
