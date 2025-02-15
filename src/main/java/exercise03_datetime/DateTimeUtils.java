package exercise03_datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateTimeUtils {

    // Định dạng mặc định
    private static final String DEFAULT_FORMAT = "dd-MM-yyyy HH:mm:ss";

    // 1️⃣ Phương thức format ngày giờ với format tùy chọn
    public static String formatDateTime(LocalDateTime dateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return dateTime.format(formatter);
    }

    // Overloading: Nếu không có format, sử dụng format mặc định
    public static String formatDateTime(LocalDateTime dateTime) {
        return formatDateTime(dateTime, DEFAULT_FORMAT);
    }

    // 2️⃣ Phương thức cộng hoặc trừ số ngày
    public static LocalDateTime addOrSubtractDays(LocalDateTime dateTime, int days) {
        return dateTime.plusDays(days);
    }

    // 3️⃣ Phương thức lấy thời gian theo Timezone
    public static String getDateTimeWithTimezone(LocalDateTime dateTime, String timezone, String format) {
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault()) // Lấy giờ hệ thống
                .withZoneSameInstant(ZoneId.of(timezone)); // Chuyển đổi múi giờ
        return formatDateTime(zonedDateTime.toLocalDateTime(), format);
    }

    // Overloading: Sử dụng format mặc định nếu không truyền format
    public static String getDateTimeWithTimezone(LocalDateTime dateTime, String timezone) {
        return getDateTimeWithTimezone(dateTime, timezone, DEFAULT_FORMAT);
    }
}

