package exercise03_datetime;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Lấy thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();

        // 1️⃣ Format ngày giờ
        System.out.println("Format mặc định: " + DateTimeUtils.formatDateTime(now));
        System.out.println("Format tùy chỉnh: " + DateTimeUtils.formatDateTime(now, "yyyy/MM/dd HH:mm"));

        // 2️⃣ Cộng hoặc trừ ngày
        System.out.println("Cộng 5 ngày: " + DateTimeUtils.formatDateTime(DateTimeUtils.addOrSubtractDays(now, 5)));
        System.out.println("Trừ 3 ngày: " + DateTimeUtils.formatDateTime(DateTimeUtils.addOrSubtractDays(now, -3)));

        // 3️⃣ Xử lý múi giờ
        System.out.println("Giờ tại New York: " + DateTimeUtils.getDateTimeWithTimezone(now, "America/New_York"));
        System.out.println("Giờ tại Tokyo (format khác): " + DateTimeUtils.getDateTimeWithTimezone(now, "Asia/Tokyo", "yyyy/MM/dd HH:mm:ss"));
    }
}
