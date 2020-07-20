package main.com.yaroslavshchur.task.family;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FamilyCreator {
    private Map<Family, Integer> familyMap;
    private String message;

    public FamilyCreator() {
        familyMap = new TreeMap<>();
        this.familyMapInput();
        message = new String("Default Sort by Name in alphabet");
    }

    public FamilyCreator(Comparator<Family> comparator, String message) {
        familyMap = new TreeMap<>(comparator);
        this.familyMapInput();
        this.message = message;
    }

    private void familyMapInput() {
        familyMap.put(new Family("Dracula", "Graph", "vampire", 100), 1);
        familyMap.put(new Family("Victor", "King", "elf", 5), 22);
        familyMap.put(new Family("Artur", "King", "human", 124), -5);
        familyMap.put(new Family("Vladimir", "Prince", "human", 14), 23);
        familyMap.put(new Family("Voldemort", "Lord", "mage", 1), 0);
        familyMap.put(new Family("Dumbledore", "Director", "mage", 3), 0);
        familyMap.put(new Family("Legolas", "Warrior", "elf", 3), 11);
        familyMap.put(new Family("Gandalf", "White", "mage", 1), 10);
        familyMap.put(new Family("Aragorn", "King", "human", 1), 10);
        familyMap.put(new Family("Zero", "Ki", "h", 1), 10);
    }

    public String getMessage() {
        return message;
    }

    public void printFamilyMap() {
        System.out.println(message);
        familyMap.forEach((fam, num) -> System.out.println(" " + fam));
    }
}