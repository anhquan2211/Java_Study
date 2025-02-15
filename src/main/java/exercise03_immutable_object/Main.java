package exercise03_immutable_object;

public class Main {
    public static void main(String[] args) {
        // Tạo một connection ban đầu
        Connection connection1 = new Connection("jdbc:mysql://localhost:3306/mydb", 10, "admin", "password123");

        // In thông tin connection ban đầu
        System.out.println("Original Connection:");
        System.out.println(connection1);

        // Tạo một connection mới với số lượng Connector thay đổi
        Connection connection2 = connection1.withNumberConnector(20);

        // In thông tin connection sau khi thay đổi
        System.out.println("\nNew Connection:");
        System.out.println(connection2);

        // Kiểm tra tính bất biến (original không bị thay đổi)
        System.out.println("\nCheck Original Connection is still unchanged:");
        System.out.println(connection1);
    }
}

