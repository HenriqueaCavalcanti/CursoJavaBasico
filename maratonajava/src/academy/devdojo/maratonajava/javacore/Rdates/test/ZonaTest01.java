package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZonaTest01 {
    public static void main(String[] args) {
        final Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zona = ZoneId.of("Asia/Dhaka");
        System.out.println(zona);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(zona);
        System.out.println(zonedDateTime);
        System.out.println();
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant.atZone(zona));

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println(japaneseDate);

        LocalDate miejiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(miejiEraLocalDate);
        System.out.println(meijiEra);
    }
}
