package comparators;

import entity.Family;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
