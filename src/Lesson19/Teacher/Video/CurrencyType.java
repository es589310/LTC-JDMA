package Lesson19.Teacher.Video;

public enum CurrencyType {
    //Inum
    //Inum - sabit dəyərləri saxlamaqdan ötrü istifadə olunan strukturdur, class deyil
    //sıra məntiqi yoxdu, heapde saxlanilir
    //istifadəçiyə əlavə dəyişkən yazmağa icazə vermir
    //fayl sonlughu (.txt ve s.) kimi uzantili olanlarida saxlamaq uchun istifade olur


    USD("Dollar"),
    AZN("Manat"),
    EURO("Avro");

    private String value;

    CurrencyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
