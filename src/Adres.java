import java.util.regex.Pattern;

public class Adres {

    private System ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(System ulica, String numerDomu, String kodPocztowy, String miasto) {
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setKodPocztowy(kodPocztowy);
        setMiasto(miasto);
    }

    public System getUlica() {
        return ulica;
    }

    public void setUlica(System ulica) {
        if (ulica == null) {
            throw new IllegalArgumentException("Ulica nie może być pusta");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        Pattern pattern = Pattern.compile("^[0-9]+[a-zA-Z]*$");
        if(!pattern.matcher(numerDomu).matches()) {
            throw new IllegalArgumentException("Błędny format numeru domu");
        }
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        if(!pattern.matcher(kodPocztowy).matches()) {
            throw new IllegalArgumentException("Zły format kodu pocztowego");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null) {
            throw new IllegalArgumentException("Miasto nie może być puste");
        }
        this.miasto = miasto;
    }
}
