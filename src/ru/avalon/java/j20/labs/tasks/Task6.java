package src.ru.avalon.java.j20.labs.tasks;

import src.ru.avalon.java.j20.labs.Task;
import src.ru.avalon.java.j20.labs.models.Country;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException, ParseException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);

        /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
    private Collection<Country> read(File file) throws IOException, ParseException {
        try(Reader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader)) {
            Collection<Country> countries = new ArrayList<>();
            String line;
            while ((line = buf.readLine()) != null) {
                countries.add(Country.valueOf(line));
            }
            return countries;
        }
    }
}
