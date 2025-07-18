package enums;

public enum GameCommand {
    START,
    STOP,
    PAUSE,
    RESUME,
    RESTART,
    QUIT,
    HELP,
    SCORE,
    LEVEL_UP,
    LEVEL_DOWN,
    SAVE,
    LOAD,
    UNDO,
    REDO,
    CHEAT,
    DEBUG,
    EXIT;

    /**
     * Метод для преобразования строки в объект GameCommand.
     * Игнорирует регистр символов.
     *
     * @param command строковое представление команды
     * @return объект GameCommand или null, если строка не соответствует ни одному значению
     */
    public static GameCommand fromString(String command) {
        if (command == null) {
            return null;
        }
        try {
            // Преобразование строки в верхний регистр и поиск соответствующего значения
            return GameCommand.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Возвращаем null, если команда не найдена
            return null;
        }
    }
}
