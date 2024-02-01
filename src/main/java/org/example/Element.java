package org.example;

public class Element implements Comparable<Element> {
    private String value;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int compareTo(Element other) {
        return this.value.compareTo(other.getValue());
    }
}
