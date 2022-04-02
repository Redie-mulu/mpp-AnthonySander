package test.expencecalculation;

import java.util.List;

public class Fulltime implements Role {
    List<ExpenceClame> expenceClames;
    Department department;
    @Override
    public String isrole() {
        return "fulltime";
    }
}
