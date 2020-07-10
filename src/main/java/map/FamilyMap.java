package map;

import comparators.ComparatorByNameOfEmblem;
import comparators.ComparatorByTitle;
import comparators.ComparatorByName;
import entity.Family;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FamilyMap {
    public void fillingMapFamily() {
        Map<Family, Integer> map = printMap();

        Map<Family, Integer> nameSort = printNameSort(map);

        printTitleReverseSort(map);

        printFamilyEmblemLengthSort(map, nameSort);

    }

    private Map<Family, Integer> printMap() {
        Map<Family, Integer> map = new HashMap<>();
        map.put(new Family("Andrii", 5, "gold", "elephant"), 1);
        map.put(new Family("Oleg", 7, "formula", "lion"), 2);
        map.put(new Family("Igor", 8, "programmer", "cheetah"), 3);
        map.put(new Family("Serhii", 2, "red", "wolf"), 4);
        map.put(new Family("Petro", 3, "green", "hare"), 5);
        map.put(new Family("Ivan", 1, "lion", "rabbit"), 6);
        map.put(new Family("Stepan", 2, "sport", "fox"), 7);
        map.put(new Family("Leonid", 5, "lviv", "bear"), 8);
        map.put(new Family("Nazar", 4, "kiev", "deer"), 9);
        map.put(new Family("Ruslan", 3, "odesa", "mole"), 10);
        System.out.println();
        for (Map.Entry<Family, Integer> entry : map.entrySet()) {
            System.out.println("id= " + entry.getValue() + "  " + entry.getKey());
        }
        return map;
    }

    private Map<Family, Integer> printNameSort(Map<Family, Integer> map) {
        Comparator comparator = new ComparatorByName();
        Map<Family, Integer> nameSort = new TreeMap<>(comparator);
        nameSort.putAll(map);
        System.out.println("\nSort ASC by Name:");
        for (Map.Entry<Family, Integer> entry : nameSort.entrySet()) {
            System.out.println("id= " + entry.getValue() + "  " + entry.getKey().getName());
        }
        return nameSort;
    }

    private void printTitleReverseSort(Map<Family, Integer> map) {
        Map<Family, Integer> TitleReverseSort = new TreeMap<>(ComparatorByTitle.sortTitle().reversed());
        TitleReverseSort.putAll(map);
        System.out.println("\nSort DESC by Title:");
        for (Map.Entry<Family, Integer> entry : TitleReverseSort.entrySet()) {
            System.out.println("id= " + entry.getValue() + "  " + entry.getKey().getTitle());
        }
    }

    private void printFamilyEmblemLengthSort(Map<Family, Integer> map, Map<Family, Integer> nameSort) {
        Map<Family, Integer> familyEmblemLengthSort = new TreeMap<>(new ComparatorByNameOfEmblem());
        familyEmblemLengthSort.putAll(map);
        System.out.println("\nSort by length NameOfEmblem:");
        for (Map.Entry<Family, Integer> entry : nameSort.entrySet()) {
            System.out.println("id= " + entry.getValue() + "  " + entry.getKey().getNameOfEmblem() + " " + entry.getKey().getNameOfEmblem().length());
        }
    }
}
