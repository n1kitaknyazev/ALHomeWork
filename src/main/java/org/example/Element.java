package org.example;

<<<<<<< HEAD
public class Element {
    private String value; // Значение элемента

    public Element(String value) { // Конструктор класса
        this.value = value;
    }

    public String getValue() { // Получение значения
        return value;
    }

    public void setValue(String value) { // Установка значения
=======
public class Element implements Comparable<Element> {
    private String value;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
>>>>>>> bae5afd (Initial commit)
        this.value = value;
    }

    @Override
<<<<<<< HEAD
    public String toString() { // Возвращение строкового представления объекта
        return value;
    }
=======
    public String toString() {
        return value;
    }

    @Override
    public int compareTo(Element other) {
        return this.value.compareTo(other.getValue());
    }
>>>>>>> bae5afd (Initial commit)
}
