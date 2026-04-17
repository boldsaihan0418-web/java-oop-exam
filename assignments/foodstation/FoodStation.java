package assignments.foodstation;

import java.util.ArrayList;

public class FoodStation {

    private String ner;
    private ArrayList<String> menu;
    private ArrayList<Integer> uneNuud;
    private int niitOrlogo;

    public FoodStation(String ner) {
        this.ner = ner;
        this.menu = new ArrayList<>();
        this.uneNuud = new ArrayList<>();
        this.niitOrlogo = 0;
    }

    public void tsesNemeh(String hool, int une) {
        this.menu.add(hool);
        this.uneNuud.add(une);
    }

    public String zahialga(String hool) {
        int index = this.menu.indexOf(hool);
        if (index == -1) {
            return "❌ Цэсэнд байхгүй";
        }
        int une = this.uneNuud.get(index);
        this.niitOrlogo += une;
        return "✅ " + hool + " бэлтгэж байна";
    }

    public String hamgiinHvnstei() {
        if (this.menu.isEmpty()) {
            return "Цэс хоосон";
        }

        int maxIndex = 0;
        for (int i = 1; i < this.uneNuud.size(); i++) {
            if (this.uneNuud.get(i) > this.uneNuud.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return this.menu.get(maxIndex);
    }

    @Override
    public String toString() {
        return "🍜 " + ner + " | Цэс: " + menu.size() + " хоол | Орлого: " + niitOrlogo + "₮";
    }
}