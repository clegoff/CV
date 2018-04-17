package com.example.clego.cv;

public class Experience {
    private String duree;
    private String lieu;
    private String profession;

    public Experience(String duree, String lieu, String profession) {
        this.duree = duree;
        this.lieu = lieu;
        this.profession = profession;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {

        return duree + "\n\n" + lieu + "---" + profession;
    }
}
