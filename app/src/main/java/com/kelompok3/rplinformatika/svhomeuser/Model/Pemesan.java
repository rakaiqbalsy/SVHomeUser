package com.kelompok3.rplinformatika.svhomeuser.Model;

/**
 * Created by rakaiqbalsy on 5/27/18.
 */

public class Pemesan {

    private String textNamaRumah;
    private String textHarga;
    private String textNamaPemesan;
    private String textNoHp;
    private String textEmail;
    private String textPekerjaan;
    private String gajiPemesan;
    private String check;

    public Pemesan() {
    }

    public Pemesan(String textNamaRumah, String textHarga, String textNamaPemesan, String textNoHp, String textEmail, String textPekerjaan, String gajiPemesan, String check) {
        this.textNamaRumah = textNamaRumah;
        this.textHarga = textHarga;
        this.textNamaPemesan = textNamaPemesan;
        this.textNoHp = textNoHp;
        this.textEmail = textEmail;
        this.textPekerjaan = textPekerjaan;
        this.gajiPemesan = gajiPemesan;
        this.check = check;
    }

    public String getTextNamaRumah() {
        return textNamaRumah;
    }

    public void setTextNamaRumah(String textNamaRumah) {
        this.textNamaRumah = textNamaRumah;
    }

    public String getTextHarga() {
        return textHarga;
    }

    public void setTextHarga(String textHarga) {
        this.textHarga = textHarga;
    }

    public String getTextNamaPemesan() {
        return textNamaPemesan;
    }

    public void setTextNamaPemesan(String textNamaPemesan) {
        this.textNamaPemesan = textNamaPemesan;
    }

    public String getTextNoHp() {
        return textNoHp;
    }

    public void setTextNoHp(String textNoHp) {
        this.textNoHp = textNoHp;
    }

    public String getTextEmail() {
        return textEmail;
    }

    public void setTextEmail(String textEmail) {
        this.textEmail = textEmail;
    }

    public String getTextPekerjaan() {
        return textPekerjaan;
    }

    public void setTextPekerjaan(String textPekerjaan) {
        this.textPekerjaan = textPekerjaan;
    }

    public String getGajiPemesan() {
        return gajiPemesan;
    }

    public void setGajiPemesan(String gajiPemesan) {
        this.gajiPemesan = gajiPemesan;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
}
