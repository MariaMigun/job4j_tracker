package ru.job4j;

public class Profession {
    private String name;

    private String surname;

    private String education;

    private String birthday;

    public String getName() {
    }

    public String getSurname() {
    }

    public String getBirthday() {
    }

    public String getEducation() {
    }
}

public class Engineer extends Profession {
    private String partner;

    private String factory;

    public String project(Partner name) {
    }
}

public class Doctor extends Profession{
    private String patient;

    private String hospital;

    public String diagnosis(Pacient name) {

    }
}

public class Surgeon extends Doctor{
    private String duty;

    private int room;

    public String surgery(Pacient name) {

    }
}

public class Dentist extends Doctor{
    private String specific;

    private int price;

    public boolean toothCut(Pacient name) {
    }
}

public class Programmer extends Engineer {
    private String language;

    private int experience;

    public String program() {
    }
}

public class Builder extends Engineer {
    private String speciality;

    public String works() {
    }
}