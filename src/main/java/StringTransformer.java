import java.util.Locale;

public class StringTransformer {

    private String str;

    public StringTransformer(String str) {
        this.str = str;
    }

    public String allCaps() {
        return this.str.toUpperCase();
    }

    public String spaced() {
        return this.str.replace("", " ").trim();
    }


}
