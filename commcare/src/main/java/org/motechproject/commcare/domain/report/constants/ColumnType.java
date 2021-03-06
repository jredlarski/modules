package org.motechproject.commcare.domain.report.constants;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public enum ColumnType {
    FIELD("field"),
    EXPANDED("expanded");

    private final String type;

    ColumnType(String type) {
        this.type = type;
    }

    public static class ColumnTypeDeserializer implements JsonDeserializer<ColumnType> {

        @Override
        public ColumnType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            String value = json.getAsString();
            return ColumnType.valueOf(value.toUpperCase());
        }
    }
}
