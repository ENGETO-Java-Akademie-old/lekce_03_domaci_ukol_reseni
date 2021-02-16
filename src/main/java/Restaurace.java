import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Restaurace {

    List<Objednavka> objednavkaList = new ArrayList<>();

    public static void main(String[] args){
        Restaurace restaurace = new Restaurace();

        Objednavka objednavka1 = new Objednavka();
        objednavka1.cisloStolu = 1;
        objednavka1.poradi = 1;
        objednavka1.casObjednavky = LocalDateTime.of(2020, 2, 16, 15, 10, 10);
        objednavka1.typPlatby = TypPlatby.CASH;

        Polozka polozka1 = new Polozka("Smazeny syr", 99, 2);
        Polozka polozka2 = new Polozka("Smazeny rizek", 129, 2);
        Polozka polozka3 = new Polozka("Pivo 10 0.5l", 35, 4);
        Polozka polozka4 = new Polozka("Pivo 10 0.5l", 35, 2);

        objednavka1.polozky.add(polozka1);
        objednavka1.polozky.add(polozka2);
        objednavka1.polozky.add(polozka3);
        objednavka1.polozky.add(polozka4);

        restaurace.objednavkaList.add(objednavka1);

        System.out.println("Pocet objednavek: "+restaurace.pocetObjednavek());
        System.out.println("Celkova utrata: "+restaurace.celkovaUtrata());
        System.out.println("Prodej `Pivo 10 0.5l`: "+restaurace.prodejPolozky("Pivo 10 0.5l"));
        System.out.println("Prodej `Pivo 12 0.5l`: "+restaurace.prodejPolozky("Pivo 12 0.5l"));
        System.out.println("Utrata stolu  `1`: "+restaurace.utrataStolu(1));
        System.out.println("Utrata stolu  `2`: "+restaurace.utrataStolu(2));
    }

    Integer pocetObjednavek(){
        return this.objednavkaList.size();
    }

    Integer celkovaUtrata(){
        Integer utrata = 0;
        for (Objednavka objednavka:this.objednavkaList){
            for (Polozka polozka: objednavka.polozky){
                utrata += polozka.cena * polozka.pocet;
            }
        }
        return utrata;
    }

    Integer prodejPolozky(String nazev){
        Integer utrata = 0;

        for (Objednavka objednavka:this.objednavkaList){
            for (Polozka polozka: objednavka.polozky){
                if (nazev.equals(polozka.nazev)){
                    utrata += polozka.cena * polozka.pocet;
                }
            }
        }
        return utrata;
    }

    Integer utrataStolu(Integer cisloStolu){
        Integer utrata = 0;

        for (Objednavka objednavka:this.objednavkaList){
            if (objednavka.cisloStolu == cisloStolu) {
                for (Polozka polozka : objednavka.polozky) {
                    utrata += polozka.cena * polozka.pocet;
                }
            }
        }
        return utrata;
    }
}