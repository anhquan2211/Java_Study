package exercise03_library;

public class User {
    private final String name;
    private final int libraryCardNumber;

    public User(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }
}
