package week2.technicalContent4.banking_system;

public enum CurrencyType {

    //enum Özelliği	Açıklama:
    //Sabit değerleri tutar:	Evet (USD, EUR, vb.)
    //Güvenlidir:	Geçersiz değer atamazsın
    //Switch-case ile uyumludur	✔️
    //Metot içerebilir	✔️
    //Daha okunaklı kod sağlar	✔️

    TL("TL"),
    DOLAR("$"),
    EURO("€"),
    GOLD("G");


    private final String symbol;

    CurrencyType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
