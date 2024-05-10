package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    public String jmeno;
    public String firma;
    public String ulice;
    public String obecPsc;
    public String psc;
    public String celaAdresa; //(readonly property, ve tvaru „ulice, obecPsc“)
    public String email;
    public String telefon;
    public String web;

    public Vizitka() {
    }

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.celaAdresa = celaAdresa;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = obecPsc;
    }


    public String getCelaAdresa() {
        return ulice + ", " + obecPsc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
