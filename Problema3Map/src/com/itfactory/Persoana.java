package com.itfactory;

import java.util.Objects;

public class Persoana {
    private String id;
    private String nume;

    public Persoana(String id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(id, persoana.id) && Objects.equals(nume, persoana.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume);
    }

    @Override
    public String toString() {
        return "{" + id + ", " + nume + "}";
    }
}
