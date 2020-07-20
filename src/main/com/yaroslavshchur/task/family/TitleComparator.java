package main.com.yaroslavshchur.task.family;

import java.util.Comparator;

public class TitleComparator implements Comparator<Family> {
    @Override
    public int compare(Family family, Family t1) {
        return (-1) * family.getTitle().compareTo(t1.getTitle());
    }
}