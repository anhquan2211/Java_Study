package exercise03_immutable_object;

public final class Connection {
    private final String url;
    private final int numberConnector;
    private final String username;
    private final String password;

    // Constructor khởi tạo tất cả giá trị
    public Connection(String url, int numberConnector, String username, String password) {
        this.url = url;
        this.numberConnector = numberConnector;
        this.username = username;
        this.password = password;
    }

    // Getter cho các thuộc tính (Không có setter)
    public String getUrl() {
        return url;
    }

    public int getNumberConnector() {
        return numberConnector;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Phương thức thay đổi số lượng Connector - Tạo đối tượng mới thay vì thay đổi trạng thái hiện tại
    public Connection withNumberConnector(int newNumberConnector) {
        return new Connection(this.url, newNumberConnector, this.username, this.password);
    }

    // Override toString để dễ kiểm tra
    @Override
    public String toString() {
        return "Connection{" +
                "url='" + url + '\'' +
                ", numberConnector=" + numberConnector +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

