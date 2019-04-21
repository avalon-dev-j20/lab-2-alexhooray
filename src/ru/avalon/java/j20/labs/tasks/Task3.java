package src.ru.avalon.java.j20.labs.tasks;

import src.ru.avalon.java.j20.labs.Task;

import java.io.*;
import java.util.*;
/**
 * Задание №3
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных с
 * использованием буферизованных типов данных".
 */
public class Task3 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("src/resources/strings/countries_buffered_mode_output.txt");
        Collection<String> lines = read(input);
        write(output, lines);

        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Реализовать метод read.
         *
         *    При чтении файла следует пользоваться типами данных:
         *    FileReader и BufferedReader.
         *
         * 2. Реализовать метод write.
         *
         *    При реализации метода следует пользоваться типами данных:
         *    PrintWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в коллекцию строк.
     *
     * <p>Каждый элемент коллекции представляет собой
     * отдельную строку файла.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private Collection<String> read(File file) throws IOException {
        try (Reader reader = new FileReader(file);
        BufferedReader buf = new BufferedReader(reader)) {
            Collection<String> res = new ArrayList<>();
            String line;
            while ((line = buf.readLine()) != null) {
                res.add(line + "\n");
            }
            return res;
        }
    }

    /**
     * Выполняет запись коллекции строковых элементов в файл.
     *
     * <p>Каждый элемент коллекции должен быть записан в
     * файл отдельной строкой.
     *
     * @param file файл
     * @param collection коллекция строк
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, Collection<String> collection) throws IOException {
        try(Writer writer = new PrintWriter(file)) {
            for (String s: collection) {
                writer.write(s);
            }
        }
    }
}
