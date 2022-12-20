package pro.sky.java.course1.objectMethods;
import org.apache.commons.text.WordUtils;
import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int yearOfPublishing;

    public Book(String bookName, Author author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {
        return WordUtils.capitalizeFully(this.bookName);
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void increaseYearOfPublishing(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Книга не может быть издана, пока её не закончил автор.");
        }
        this.yearOfPublishing = yearOfPublishing + increment;
    }

    @Override
    public String toString() {
        return "Название книги: " + getBookName() + "\nАвтор книги: " + author.toString() + "\nГод издания: " + getYearOfPublishing();
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(bookName, book.bookName) && Objects.equals(author.toString(), book.author.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublishing);
    }
}