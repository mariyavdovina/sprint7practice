package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Harvest {
    public void printHarvest() {
        String[] items = {"Картошка, мешки, 8", "Яблоки, ящики, 11.5", "Клубника, кг, 5.75"};
        for (String str : items) {
            String[] split = str.split(",");
            String item = String.format("%-10s%-7s%-4s",split[0].trim(),split[1].trim(),split[2].trim());
            System.out.printf(item + '\n');
            //System.out.println("\n")
            ArrayList<String> countryNames = new ArrayList<String>();
        }
    }

    public static void main(String[] args) {
/*        Harvest harvest = new Harvest();
        harvest.printHarvest();
        ArrayList<String> kittenNames = new ArrayList<String>();
        kittenNames.add("Пушок");
        kittenNames.add("Ушастик");
        kittenNames.add("Рыжик");
        kittenNames.add(1,"Снежок");
        System.out.println(kittenNames);

        ArrayList<Double> kittenWeights = new ArrayList<Double>();
        ArrayList<Double> kittensinTheKitcen = new ArrayList<Double>();
        kittenWeights.add(1.62);
        kittenWeights.add(1.76);
        kittenWeights.add(2.02);
        kittenWeights.add(1.88);

        double max = 0;
        for (int i=0; i<kittenWeights.size();i++) {
            if (kittenWeights.get(i)> max) {
                max = kittenWeights.get(i);
            }
        }*/

        /*Пушок — 1,62 кг;
Снежок — 1,91 кг;
Черныш — 1,76 кг;
Ушастик — 2,02 кг;
Рыжик — 1,88 кг.*/
        HashMap<String, Double> kittenWeights = new HashMap<String, Double>();
        kittenWeights.put("Пушок",1.62);
        kittenWeights.put("Снежок",1.91);
        kittenWeights.put("Черныш",1.76);
        kittenWeights.put("Ушастик",2.02);
        kittenWeights.put("Рыжик",1.88);

        kittenWeights.put("Черныш",1.96);
        System.out.println(kittenWeights);
        // создай список kittensInTheKitchen
        ArrayList<String> kittensInTheKitchen = new ArrayList<String>();
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // добавь в список каждого котёнка Пушок, Снежок, Черныш, Ушастик и Рыжик
        kittensInTheKitchen.add("Пушок");
        kittensInTheKitchen.add("Снежок");
        kittensInTheKitchen.add("Черныш");
        kittensInTheKitchen.add("Ушастик");
        kittensInTheKitchen.add("Рыжик");

        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // удали Пушка из списка по индексу
        kittensInTheKitchen.remove(0);
        // удали Снежка из списка по имени
        kittensInTheKitchen.remove(0);
        // проверь, пропал ли Снежок из списка
        if (kittensInTheKitchen.get(0).equals("Снежок")) {
            System.out.println("Снежок ещё на кухне");
        } else {
            System.out.println("Снежок уже ушёл");
        }
        // удали Черныша из списка по имени
        kittensInTheKitchen.remove("Черныш");
        // проверь, пропал ли Черныш из списка
        if (kittensInTheKitchen.contains("Черныш")) {
            System.out.println("Черныш ещё на кухне");
        } else {
            System.out.println("Черныш уже ушёл");
        }
        // удали оставшихся котят из списка
        kittensInTheKitchen.clear();
        // проверь, сколько теперь котят на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне остались котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
    }

    }
