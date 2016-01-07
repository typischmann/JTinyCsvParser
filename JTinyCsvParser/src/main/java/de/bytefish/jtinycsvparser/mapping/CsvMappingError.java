package de.bytefish.jtinycsvparser.mapping;

public class CsvMappingError {

    private int index;
    private String value;
    private String message;

    public CsvMappingError(int index, String value, String message) {
        this.index = index;
        this.value = value;
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}