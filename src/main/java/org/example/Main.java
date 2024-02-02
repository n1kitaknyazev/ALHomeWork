package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Element> list = new MyArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Получить элемент");
                System.out.println("4. Очистить список");
                System.out.println("5. Получить размер списка");
                System.out.println("6. Отсортировать список");
                System.out.println("7. Отобразить весь список");
                System.out.println("8. Выход");
                System.out.print("Выберите действие: ");
                String action = scanner.nextLine();

                switch (action) {
                    case "1":
                        System.out.print("Введите значение элемента: ");
                        String value = scanner.nextLine();
                        list.add(new Element(value));
                        break;
                    case "2":
                        System.out.print("Введите индекс элемента для удаления: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // consume newline left-over
                        list.remove(index);
                        break;
                    case "3":
                        System.out.print("Введите индекс элемента: ");
                        int i = scanner.nextInt();
                        scanner.nextLine(); // consume newline left-over
                        System.out.println("Элемент: " + list.get(i).getValue());
                        break;
                    case "4":
                        list.clear();
                        System.out.println("Список очищен");
                        break;
                    case "5":
                        System.out.println("Размер списка: " + list.size());
                        break;
                    case "6":
                        Sorter.quickSort(list);
                        System.out.println("Список отсортирован");
                        break;
                    case "7":
                        for (int j = 0; j < list.size(); j++) {
                            System.out.println((j + 1) + ". " + list.get(j).getValue());
                        }
                        break;
                    case "8":
                        System.out.println("Выход из программы");
                        return;
                    default:
                        System.out.println("Неверный ввод. Пожалуйста, попробуйте еще раз.");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено некорректное значение. Пожалуйста, введите число.");
                scanner.nextLine(); // consume the invalid input
            } catch (Exception e) {
                System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
            }
        }
    }
}
