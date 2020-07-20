package main.com.yaroslavshchur.task.family;

import java.util.Comparator;

public class NameOfEmblemComparator implements Comparator<Family> {
    @Override
    public int compare(Family family, Family o) {
        return family.getNameOfEmblem().length() - o.getNameOfEmblem().length();
    }
}