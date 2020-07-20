package main.com.yaroslavshchur.task;

import main.com.yaroslavshchur.task.family.FamilyCreator;
import main.com.yaroslavshchur.task.family.NameOfEmblemComparator;
import main.com.yaroslavshchur.task.family.TitleComparator;
import main.com.yaroslavshchur.task.number.FamilyMap;

public class Executor {
    private void printUniqueNumbers() {
      FamilyMap familyMap = new FamilyMap();
        System.out.println("Unique numbers");
        familyMap.uniqueValues().forEach(val -> System.out.print(val + " "));
    }

    private void familyExecutor() {
        FamilyCreator familyDefaultSort = new FamilyCreator();
        familyDefaultSort.printFamilyMap();
        FamilyCreator familyTitleComparator = new FamilyCreator(new TitleComparator(),
                "Reverse sort by Title");
        familyTitleComparator.printFamilyMap();
        FamilyCreator familyEmblemComparator = new FamilyCreator(new NameOfEmblemComparator(),
                "Sort by length of Name of Emblem");
        familyEmblemComparator.printFamilyMap();
    }

    public void run() {
        this.printUniqueNumbers();
        System.out.println("\n------Family Task --------");
        this.familyExecutor();
    }
}