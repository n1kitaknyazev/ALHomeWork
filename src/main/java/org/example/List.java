package org.example;

public interface List<T> {
    void add(T e); // Добавление элемента в конец списка
    void add(int index, T e); // Добавление элемента на определенную позицию
    T get(int i); // Получение элемента по индексу
    T remove(int i); // Удаление элемента по индексу
    void clear(); // Очистка списка
    int size(); // Получение размера списка
    boolean contains(T e); // Проверка, содержит ли список данный элемент
    int indexOf(T e); // Получение индекса данного элемента в списке
    boolean isEmpty(); // Проверка, пуст ли список
}
