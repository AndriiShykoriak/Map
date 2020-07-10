package comparators;

import entity.Family;

import java.util.Comparator;

public class ComparatorByTitle {
    public static Comparator<Family> sortTitle() {
        return Comparator.comparing(Family::getTitle);
    }
}
