package bsu.rfe.java.group7.lab1.Rolovets.var8A;

public class ChewingGum extends Food {
    private String flavour;

    public ChewingGum(String flavour) {
        super("ChewingGum"); // имя фиксированное
        this.flavour = flavour;
    }

    public void consume() {
        String[] flav = flavour.split("/");
        System.out.println(flav[0] + " со вкусом " + flav[1] + " съедена");
    }
}