package comparators;


import entity.Family;

import java.util.Comparator;

public class ComparatorByNameOfEmblem implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {
        return o1.getNameOfEmblem().length() - o2.getNameOfEmblem().length();
    }
}
