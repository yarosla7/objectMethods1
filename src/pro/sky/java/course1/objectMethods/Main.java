package pro.sky.java.course1.objectMethods;

public class Main {
    public static void main(String[] args) {

        Author tolkien = new Author("john ronald reuel", "tolkien"); //все специально написал маленькими, чтобы проверить, как работает библиотека
        Author jerome = new Author("jerome", "salinger");
        Author jerome1 = new Author("jerome", "salinger");

        Book theCatcher = new Book("the catcher in the rye", jerome, 1951);
        Book theCatcher2 = new Book("the catcher in the rye", jerome1, 1951);

        Book lotr = new Book("the lord of the rings", tolkien, 1954);

        System.out.println("Книга №1 - " + theCatcher);
        System.out.println("\nКнига №2 - " + lotr);

        System.out.println("\ntheCatcher.equals(theCatcher2) = " + theCatcher2.equals(theCatcher));

        theCatcher2.increaseYearOfPublishing(52);
        System.out.println("theCatcher2.getYearOfPublishing() = " + theCatcher2.getYearOfPublishing());
        System.out.println("\ntheCatcher.equals(theCatcher2) = " + theCatcher.equals(theCatcher2));

        System.out.println("lotr.equals(theCatcher2) = " + lotr.equals(theCatcher2));

        System.out.println("\ntolkien.hashCode() = " + tolkien.hashCode());
        System.out.println("theCatcher.hashCode() = " + theCatcher.hashCode());
    }
}
