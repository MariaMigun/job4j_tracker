package ru.job4j;

public class Doctor extends Profession {
    private String patient;

    private String hospital;

    private String getPatient() {
        return patient;
    }

    public Doctor(String name, String education, String hospital) {
        this.name = name;
        this.education = education;
        this.hospital = hospital;
    }
}