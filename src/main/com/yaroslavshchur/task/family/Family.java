package main.com.yaroslavshchur.task.family;

import java.util.Objects;

public class Family implements Comparable<Family> {
    private final String name;
    private final String title;
    private final String nameOfEmblem;
    private final int quantityMember;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public Family(String name, String title, String nameOfEmblem, int quantityMember) {
        this.name = name;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
        this.quantityMember = quantityMember;
    }

    @Override
    public int compareTo(Family family) {
        return name.compareTo(family.getName());
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                ", quantityMember=" + quantityMember +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return quantityMember == family.quantityMember &&
                name.equals(family.name) &&
                title.equals(family.title) &&
                nameOfEmblem.equals(family.nameOfEmblem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, nameOfEmblem, quantityMember);
    }
}