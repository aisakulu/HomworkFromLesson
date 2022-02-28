package com.peaksoft;

public enum Oblastar {
    BATKEN ("Орукзарлары бар"),
    OSH ("Сулайман тоо жана аш"),
    JALALABAD ("Арсланбап шаркыратмасы"),
    TALAS ("Манас кумбозу жана опко :))"),
    NARYN ("Куржун толо эт"),
    YSYK_KOL ("Загар кылып келели"),
    CHUY ("Сууга мол талаалар");

    private String ozgocholuktor;

    Oblastar() {

    }

    Oblastar(String ozgocholuktor) {
        this.ozgocholuktor = ozgocholuktor;
    }

    public String getOzgocholuktor() {
        return ozgocholuktor;
    }

    @Override
    public String toString() {
        return "Oblastar{" +
                "'" + ozgocholuktor + '\'' +
                "} " + super.toString();
    }
}
