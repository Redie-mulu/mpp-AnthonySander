package test.expencecalculation;

import java.util.List;

public class Department {
    private String name;
    private Fulltime manager;
    private List<Employ> employs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employ> getEmploys() {
        return employs;
    }

    public void setEmploys(List<Employ> employs) {
        this.employs = employs;
    }
}
