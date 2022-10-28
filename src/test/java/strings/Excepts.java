package strings;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Excepts {
    public static void main(String[] args) throws MalformedURLException {
        try {
            // Путь к несуществующему файлу, чтобы произошло исключение
            Files.lines(Paths.get("Путь до несуществующего файла"), StandardCharsets.UTF_8).forEach(System.out::println);
        } catch  (NoSuchFileException noSuchFileException){
            System.out.println("Проблемы с доступом к файлу");
        } catch (AccessDeniedException accessDeniedException){
            System.out.println("Проблемы с доступом к файлу");
        } catch (IOException ioException){
            System.out.println("Неизвестная ошибка");

        }

        // Заведомо неверная строка URL для генерации исключения
        String url = "htt://qa-mesto.praktikum-services.ru/";
        // Оберни следующие две строки в блок кода с ошибкой, который может сгенерировать исключение
        /* В этом коде строка преобразуется в объект URL, который используют для установки
        http/https соединения с удаленным сервером, с которым происходит обмен информацией */
        try {
            URL obj = new URL(url);
            System.out.println(obj);
        } catch (MalformedURLException malformedURLException){
            System.out.println("Ошибка в URL");
        }



}
}
