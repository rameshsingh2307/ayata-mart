package com.ayata.ayatamart.timestamp;

import java.sql.Timestamp;
import java.time.Instant;

public class DateTime {
    public long timeStamp()
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        Instant instant = timestamp.toInstant();
        return instant.toEpochMilli();

        // Convert Instant to Timestamp
        // Timestamp tsFromInstant = Timestamp.from(instant);
        // System.out.println(tsFromInstant.getTime());
    }
}
