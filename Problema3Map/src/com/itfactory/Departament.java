package com.itfactory;

import java.util.Objects;

public class Departament {
    private String numeDepartament;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    public String getNumeDepartament() {
        return numeDepartament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(numeDepartament, that.numeDepartament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeDepartament);
    }

    @Override
    public String toString() {
        return "{" + numeDepartament + "}";
    }
}
