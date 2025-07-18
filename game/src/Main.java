import context.GameContext;
import enums.GameCommand;
import utils.PrintUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var context = new GameContext(10, 20);
        var command = GameCommand.START;

        // внутри этого цикла разрешено только изменять порядок вызова команд
        // нельзя добавлять дополнительный код
        // для обмена информацией между методами пользуйся контекстом context
        // это главный цикл игры, в котором происходит игра. Игра будет продолжаться, пока игрок не захочет выйти
        while (!command.equals(GameCommand.EXIT)) {
            processCommand(command, context);
            printGame(context);
            command = readGameCommand(scanner);
            PrintUtils.clearConsole(); //очистим поле игры
        }

        System.out.println("Игра завершена. Нажмите Enter для выхода.");
        scanner.nextLine();
    }

    /**
     * Метод для обработки команд игрока. В зависимости от команды выполняются различные действия над контекстом.
     * @param command
     * @param context
     */
    private static void processCommand(GameCommand command, GameContext context) {
        switch (command) {
            case START:
                System.out.println("Игра началась!");
                break;
            case STOP:
                System.out.println("Игра остановлена.");
                break;
            case PAUSE:
                System.out.println("Игра приостановлена.");
                break;
            case RESUME:
                System.out.println("Игра возобновлена.");
                break;
            case RESTART:
                restartGame(context);
                System.out.println("Игра перезапущена.");
                break;
            case HELP:
                System.out.println("Список доступных команд: START, STOP, PAUSE, RESUME, RESTART, HELP, SCORE, LEVEL_UP, LEVEL_DOWN, SAVE, LOAD, UNDO, REDO, CHEAT, DEBUG, EXIT");
                break;
            case SCORE:
                System.out.println("Ваш текущий счет: 100"); // Пример вывода счета
                break;
            case LEVEL_UP:
                System.out.println("Уровень повышен!");
                break;
            case LEVEL_DOWN:
                System.out.println("Уровень понижен.");
                break;
            case SAVE:
                System.out.println("Игра сохранена.");
                break;
            case LOAD:
                System.out.println("Игра загружена.");
                break;
            case UNDO:
                System.out.println("Последнее действие отменено.");
                break;
            case REDO:
                System.out.println("Последнее действие повторено.");
                break;
            case CHEAT:
                System.out.println("Чит активирован!");
                break;
            case DEBUG:
                System.out.println("Режим отладки включен.");
                break;
            default:
                System.out.println("Неизвестная команда. Попробуйте снова.");
                break;
        }
    }

    private static void restartGame(GameContext context) {
        context = new GameContext(10, 20); //Создадим контекст игры заново, все, что было сотрём
    }

    private static GameCommand readGameCommand(Scanner scanner) {
        GameCommand command;
        System.out.println("Введите команду:");
        String input = scanner.nextLine();

        command = GameCommand.fromString(input);
        return command;
    }

    private static void printGame(GameContext context) {
        // Здесь будет логика для вывода текущего состояния игры на консоль
        // Например, можно вывести игровое поле, текущий счет и т.д.
        System.out.println("Текущее состояние игры");
    }
}