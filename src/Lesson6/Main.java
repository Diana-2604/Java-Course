/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем HHD или SSD
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

package Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteBooks db = new NoteBooks();
        db.addNotebook(new Notebook("Lenovo", "Windows 11", 2, 8, true, 34_999));
        db.addNotebook(new Notebook("HP", "Windows 11", 4, 12, true, 47_999));
        db.addNotebook(new Notebook("Digma", "Windows 10", 2, 4, true, 15_899));
        db.addNotebook(new Notebook("Apple", "macOS", 8, 8, false, 84_999));
        db.addNotebook(new Notebook("Lenovo", "Windows 10", 4, 8, false, 66_999));
        db.addNotebook(new Notebook("HP", "Windows 10", 4, 16, false, 69_999));
        db.addNotebook(new Notebook("Honor", "Windows 10", 4, 8, false, 54_999));
        db.addNotebook(new Notebook("Huawei", "Windows 11", 4, 16, false, 77_999));
        db.addNotebook(new Notebook("Huawei", "Windows 11", 14, 16, false, 106_999));
        db.addNotebook(new Notebook("Haier", "Windows 11", 4, 4, false, 29_999));

        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "Brand");
        filter.put(2, "OS");
        filter.put(3, "Number of cores");
        filter.put(4, "RAM volume");
        filter.put(5, "Sensor screen");
        filter.put(6, "Price");

        Map<Integer, String> custom = params(filter);
        System.out.println("Выбранные параметры поиска: " + custom);
        if (custom.size() == 1) {
            System.out.println(filterResults(custom, db));
        } else if (custom.size() > 1 && custom.size() < 7) {
            var target = new ArrayList<>(custom.keySet());
            NoteBooks temp = filterResults(custom, db);
            int i = 0;
            while (i < custom.size()) {
                custom.remove(target.get(i));
                NoteBooks result = filterResults(custom, temp);
                if (!temp.equals(result)) {
                    temp = result;
                }
                i++;
                System.out.println(result);
            }
        } else {
            System.out.println(db.getNotebooks());
        }
    }

    public static NoteBooks filterResults(Map<Integer, String> custom, NoteBooks db) {
        var result = new ArrayList<Notebook>();

        if (custom.containsKey(1)) {
            result.addAll(db.getNotebooksByBrand(custom.get(1)));
        } else if (custom.containsKey(2)) {
            result.addAll(db.getNotebooksByOS(custom.get(2)));
        } else if (custom.containsKey(3)) {
            result.addAll(db.getNotebooksByCores(Integer.parseInt(custom.get(3))));
        } else if (custom.containsKey(4)) {
            result.addAll(db.getNotebooksByRAM(Integer.parseInt(custom.get(4))));
        } else if (custom.containsKey(5)) {
            result.addAll(db.getNotebooksBySensor(Boolean.parseBoolean(custom.get(5))));
        } else if (custom.containsKey(6)) {
            result.addAll(db.getNotebooksByPrice(Integer.parseInt(custom.get(6))));
        }

        NoteBooks filterResult = new NoteBooks();
        for (Notebook notebook : result) {
            filterResult.addNotebook(notebook);
        }

        return filterResult;
    }

    public static Map<Integer, String> params(Map<Integer, String> filter) {

        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> custom = new HashMap<>();
        System.out.println("Выберите цифру критерия фильтрации: ");
        System.out.println(filter);
        while (true) {
            String input = iScanner.nextLine();
            if (Objects.equals(input, "0")) {
                System.out.println("Выход из окна выбора фильтров");
                break;
            }
            if (Objects.equals(input, "1")) {
                System.out.println("Введите название бренда для поиска: ");
                String line = iScanner.nextLine();
                custom.put(Integer.parseInt(input), line);
                System.out.println("Выберите цифру 1-6 для продолжения выборки или введите 0 для перехода к поиску");
                continue;
            }
            if (Objects.equals(input, "2")) {
                System.out.println("Введите название операционной системы для поиска: ");
                String line = iScanner.nextLine();
                custom.put(Integer.parseInt(input), line);
                System.out.println("Выберите цифру 1-6 для продолжения выборки или введите 0 для перехода к поиску");
                continue;
            }
            if (Objects.equals(input, "3")) {
                System.out.println("Введите минимальное желаемое количество ядер: ");
                String line = iScanner.nextLine();
                custom.put(Integer.parseInt(input), line);
                System.out.println("Выберите цифру 1-6 для продолжения выборки или введите 0 для перехода к поиску");
                continue;
            }
            if (Objects.equals(input, "4")) {
                System.out.println("Введите минимальный желаемый объем RAM: ");
                String line = iScanner.nextLine();
                custom.put(Integer.parseInt(input), line);
                System.out.println("Выберите цифру 1-6 для продолжения выборки или введите 0 для перехода к поиску");
                continue;
            }
            if (Objects.equals(input, "5")) {
                System.out.println("Укажите необходимость сенсорного экрана (true/false): ");
                String line = iScanner.nextLine();
                custom.put(Integer.parseInt(input), line);
                System.out.println("Выберите цифру 1-6 для продолжения выборки или введите 0 для перехода к поиску");
                continue;
            }
            if (Objects.equals(input, "6")) {
                System.out.println("Введите минимальную цену для поиска: ");
                String line = iScanner.nextLine();
                custom.put(Integer.parseInt(input), line);
                System.out.println("Выберите цифру 1-6 для продолжения выборки или введите 0 для перехода к поиску");
            }
        }
        iScanner.close();
        return custom;
    }
}

