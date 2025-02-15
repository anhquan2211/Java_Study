package exercise03_library;

public class GeographicLibrary extends Library {
    public GeographicLibrary(String name, int bookCount, int staffCount) {
        super(name, bookCount, staffCount);
    }

    public GeographicLibrary(String name, int staffCount) {
        super(name, staffCount);
    }

    @Override
    public void printLibraryInfo() {
        System.out.println("Thư viện Địa lý: " + name);
        System.out.println("Số sách: " + bookCount);
        System.out.println("Số nhân viên: " + staffCount);
    }
}

