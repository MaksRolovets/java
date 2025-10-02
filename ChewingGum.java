package bsu.rfe.java.group7.lab1.Rolovets.var8A;

public class ChewingGum extends Food {
    private String flavour;

    public ChewingGum(String flavour) {
        super("ChewingGum"); // имя фиксированное
        this.flavour = flavour;
    }

    public void consume() {
        System.out.println("Жевательная резинка со вкусом " + flavour + " съедена");
    }
}