package bsu.rfe.java.group7.lab1.Rolovets.var8A;

public class MainApplication {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int count = 0;

        // если ничего не передали — сделаем пример вручную
        if (args.length == 0) {
            args = new String[]{"ChewingGum/мята", "ChewingGum/арбуз"};
        }

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("ChewingGum")) {
                breakfast[count++] = new ChewingGum(parts[1]);
            }
        }

        // Подсчёт жвачек
        int chewingGumCount = 0;
        for (int i = 0; i < count; i++) {
            if (breakfast[i].equals(new ChewingGum("test"))) {
                chewingGumCount++;
            }
            // употребление продукта
            if (breakfast[i] instanceof ChewingGum) {
                ((ChewingGum) breakfast[i]).consume();
            }
        }

        System.out.println("Количество жевательных резинок: " + chewingGumCount);
    }
}