package exercise03_library;

public class Main {
    public static void main(String[] args) {
        // Tạo các thư viện với constructor overloading
        EducationLibrary eduLibrary = new EducationLibrary("Thư viện Đại học", 10000, 20);
        GeographicLibrary geoLibrary = new GeographicLibrary("Thư viện Địa lý Quốc gia", 15);

        // In thông tin thư viện
        System.out.println("=== Thông tin Thư viện ===");
        eduLibrary.printLibraryInfo();
        System.out.println();
        geoLibrary.printLibraryInfo();

        // Tạo user
        User user1 = new User("Luu Anh Quan", 12345);
        User user2 = new User("Nguyen Van A", 0);

        // Kiểm tra điều kiện mượn sách
        System.out.println("\n=== Kiểm tra điều kiện mượn sách ===");
        System.out.println("User " + user1.getName() + " có thể mượn sách? " + eduLibrary.canBorrow(user1.getName()));
        System.out.println("User " + user2.getName() + " có thể mượn sách? " + eduLibrary.canBorrow(user2.getLibraryCardNumber()));
    }
}

