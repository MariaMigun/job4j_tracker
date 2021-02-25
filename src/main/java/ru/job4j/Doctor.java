package ru.job4j;

public class Doctor extends Profession {
    private String patient;

    private String hospital;

    private Doctor(String name, String education, String birthday, String hospital, String patient) {
        super (name, education, birthday);
        this.hospital = hospital;
        this.patient = patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    private String getPatient() {
        return patient;
    }

}