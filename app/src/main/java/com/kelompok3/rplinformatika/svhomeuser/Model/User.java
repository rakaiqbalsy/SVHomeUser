package com.kelompok3.rplinformatika.svhomeuser.Model;

/**
 * Created by rakaiqbalsy on 5/28/18.
 */

public class User {
    private String email;
    private String nama;
    private String password;

    public User() {
    }

    public User(String email, String nama, String password) {
        this.email = email;
        this.nama = nama;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
