package com.company;

public class Jailoo {
    private String aty;
    private String daregi;
    private String chanbanAty;
    private Ui[] uilar;
    private Koi[] koilor;
    private At[] attary;


    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getDaregi() {
        return daregi;
    }

    public void setDaregi(String daregi) {
        this.daregi = daregi;
    }

    public String getChanbanAty() {
        return chanbanAty;
    }

    public void setChanbanAty(String chanbanAty) {
        this.chanbanAty = chanbanAty;
    }

    public Ui[] getUilar() {
        return uilar;
    }

    public void setUilar(Ui[] uilar) {
        this.uilar = uilar;
    }

    public Koi[] getKoilor() {
        return koilor;
    }

    public void setKoilor(Koi[] koilor) {
        this.koilor = koilor;
    }

    public At[] getAttary() {
        return attary;
    }

    public void setAttary(At[] attary) {
        this.attary = attary;
    }

    public Jailoo(String aty, String daregi, String chanbanAty, Ui[] uilar, Koi[] koilor, At[] attary) {
        this.aty = aty;
        this.daregi = daregi;
        this.chanbanAty = chanbanAty;
        this.uilar = uilar;
        this.koilor = koilor;
        this.attary = attary;

    }

}
