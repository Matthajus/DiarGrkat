package com.example.diargrkat;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "days")
public class Day implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String den;

    private String mesiac;

    private String nazovDna;

    private String meniny;

    private String poznamka;

    private String svaty;

    private boolean nedela_sviatok;

    private String citania;

    private String komentar;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDen() {
        return den;
    }

    public void setDen(String den) {
        this.den = den;
    }

    public String getMesiac() {
        return mesiac;
    }

    public void setMesiac(String mesiac) {
        this.mesiac = mesiac;
    }

    public String getNazovDna() {
        return nazovDna;
    }

    public void setNazovDna(String nazovDna) {
        this.nazovDna = nazovDna;
    }

    public String getMeniny() {
        return meniny;
    }

    public void setMeniny(String meniny) {
        this.meniny = meniny;
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
    }

    public String getSvaty() {
        return svaty;
    }

    public void setSvaty(String svaty) {
        this.svaty = svaty;
    }

    public boolean isNedela_sviatok() {
        return nedela_sviatok;
    }

    public void setNedela_sviatok(boolean nedela_sviatok) {
        this.nedela_sviatok = nedela_sviatok;
    }

    public String getCitania() {
        return citania;
    }

    public void setCitania(String citania) {
        this.citania = citania;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
}
