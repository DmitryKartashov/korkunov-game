package utils;

public final class PrintUtils {
    /**
     * Метод для очистки консоли
     * Очищает консоль в зависимости от операционной системы
     * Для Windows используется команда cls, для Unix-подобных систем - ANSI escape code для очистки экрана
     * Если возникают ошибки, они будут выведены в стек-трейс
     * Этот метод может быть использован для очистки консоли перед выводом нового состояния игры
     * Пример использования: PrintUtils.clearConsole();
     */
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
