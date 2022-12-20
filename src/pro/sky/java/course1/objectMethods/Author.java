package pro.sky.java.course1.objectMethods;
import org.apache.commons.text.WordUtils;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return WordUtils.capitalizeFully(this.name);
    }

    public String getSurname() {
        return WordUtils.capitalizeFully(this.surname);
    }

    public String toString() {
        return getName() + " " + getSurname();
    }
}