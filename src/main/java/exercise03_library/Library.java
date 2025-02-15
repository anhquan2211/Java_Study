package exercise03_library;

public abstract class Library {
    protected String name;
    protected int bookCount;
    protected int staffCount;

    // Constructor Overloading
    public Library(String name, int bookCount, int staffCount) {
        this.name = name;
        this.bookCount = bookCount;
        this.staffCount = staffCount;
    }

    public Library(String name, int staffCount) {
        this(name, 0, staffCount); // Số sách mặc định là 0
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getStaffCount() {
        return staffCount;
    }

    // Phương thức trừu tượng in thông tin thư viện (sẽ override trong các lớp con)
    public abstract void printLibraryInfo();

    // Kiểm tra điều kiện mượn sách (overloading với 2 kiểu tham số)
    public boolean canBorrow(String userName) {
        return userName != null && !userName.isEmpty();
    }

    public boolean canBorrow(int libraryCardNumber) {
        return libraryCardNumber > 0;
    }
}
