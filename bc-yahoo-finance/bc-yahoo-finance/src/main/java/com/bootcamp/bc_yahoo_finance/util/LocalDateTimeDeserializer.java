package com.bootcamp.bc_yahoo_finance.util;


import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
  @Override
  public LocalDateTime deserialize(JsonParser jsonParser,
      DeserializationContext context) throws IOException {
    // JSON -> LocalDateTime
    String timestamp = jsonParser.getText();
    Instant instant = Instant.parse(timestamp);

    ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Hong_Kong"));
    System.out.println(zonedDateTime.toLocalDate());
    return zonedDateTime.toLocalDateTime();
  }
}