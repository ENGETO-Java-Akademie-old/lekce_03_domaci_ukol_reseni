import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Objednavka {

    public Objednavka(){

    }

    public Objednavka(Integer poradi, Integer cisloStolu, LocalDateTime casObjednavky, TypPlatby typPlatby) {
        this.poradi = poradi;
        this.cisloStolu = cisloStolu;
        this.casObjednavky = casObjednavky;
        this.typPlatby = typPlatby;
    }

    public Integer poradi;
    public Integer cisloStolu;
    public LocalDateTime casObjednavky;
    public List<Polozka> polozky = new ArrayList<>();
    public TypPlatby typPlatby;
}
