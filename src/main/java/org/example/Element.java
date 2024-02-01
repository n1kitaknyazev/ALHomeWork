package org.example;

public class Element {
    private String value; // Значение элемента

    public Element(String value) { // Конструктор класса
        this.value = value;
    }

    public String getValue() { // Получение значения
        return value;
    }

    public void setValue(String value) { // Установка значения
        this.value = value;
    }

    @Override
    public String toString() { // Возвращение строкового представления объекта
        return value;
    }
}
