package exercise03_library;

public class EducationLibrary extends Library {
    public EducationLibrary(String name, int bookCount, int staffCount) {
        super(name, bookCount, staffCount);
    }

    public EducationLibrary(String name, int staffCount) {
        super(name, staffCount);
    }

    @Override
    public void printLibraryInfo() {
        System.out.println("Thư viện Giáo dục: " + name);
        System.out.println("Số sách: " + bookCount);
        System.out.println("Số nhân viên: " + staffCount);
    }
}

