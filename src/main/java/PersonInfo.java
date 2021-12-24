import com.google.gson.annotations.SerializedName;

public class PersonInfo {
    @SerializedName("Name")
    private String name;
    @SerializedName("BirthDate")
    private String birthDate;
    @SerializedName("Citizenship")
    private String citizenship;

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCitizenship() {
        return citizenship;
    }

    @Override
    public String toString(){
        return "PersonInfo{ name = " + name +
                ", birthDate = " + birthDate +
                ", citizenship = " + citizenship;
    }
}
