package test.Hospital;

import java.util.List;

public class Doctor implements Role{
    private String name;
    private int age;
    List<Visit> visits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public Doctor(String name, int age, List<Visit> visits) {
        this.name = name;
        this.age = age;
        this.visits = visits;
    }
}



