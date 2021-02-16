# Java 1 Lekce 3 Domaci Ukol Reseni
Reseni domaciho ukolu Java 1 - Lekce 3
## Zadani
[Zadani domaciho ukolu](https://github.com/ENGETO-Java-Akademie/lekce_03_domaci_ukol)

Napište program, který bude fungovat jako seznam objednávek v restauraci. Každá objednávka bude mít několik detailů: Pořádí objednávky, číslo stolu, datum objednávky, typ platby (hotově, kartou) a v sobě vnořený seznam objednáných položek (název, cena, množství).

Jako druhý úkol napište několik analytických metod:

Ukažtě počet objednávek
Spočítejte celkovou cenu útraty
Na základě jména položky spočítejte celkový prodej dané položky
Na základě čísla stolu, spočítejte útratu u daného stolu

### Analyza

#### Objekty
Trida `Objednavka`

- Poradi - `Integer poradi`
- Cislo stolu - `Integer cislo stolu`
- Cas objednavky - `LocalDateTime casObjednavky`
- List Polozek - `ArrayList<Polozka> polozky`

Enum `TypPlatby`

- Hotove - `CASH`
- Kartou - `CARD`

Trida `Polozka` 
- Nazve - `String nazev`
- Cena - `Integer cena`
- Mnozstvi - `Integer pocet`

#### Metody

Ukažtě počet objednávek - `Integer pocetObjednavek(List<Objednavka> objednavky)`

Spočítejte celkovou cenu útraty - `Integer celkovaUtrata(List<Objednavka> objednavky)`

Na základě jména položky spočítejte celkový prodej dané položky - `Integer pocetObjednavek(List<Objednavka> objednavky, String polozka)`

Na základě čísla stolu, spočítejte útratu u daného stolu - `Integer pocetObjednavek(List<Objednavka> objednavky, Integer cisloStolu)`

