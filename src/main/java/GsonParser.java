import com.google.gson.Gson;
import java.io.FileReader;

public class GsonParser {

private String fileName;

GsonParser(String fileName){this.fileName = fileName;}

    public  Root parser(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fileName)) {
            Root root = gson.fromJson(reader,Root.class);
            return root;
        }catch (Exception e){
            System.out.println("Parsing error: " + e.toString());
        }
        return null;
    }
}
