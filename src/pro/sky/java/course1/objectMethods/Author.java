package pro.sky.java.course1.objectMethods;
import org.apache.commons.text.WordUtils;

import java.util.Objects;

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

    @Override
    public boolean equals(Object otherAuthor) {
        if (this == otherAuthor) return true;
        if (otherAuthor == null || getClass() != otherAuthor.getClass()) return false;
        Author author = (Author) otherAuthor;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}