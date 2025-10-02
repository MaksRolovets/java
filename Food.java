package bsu.rfe.java.group7.lab1.Rolovets.var8A;

public abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) return false;
        Food other = (Food) obj;
        return this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}