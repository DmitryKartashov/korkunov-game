package context;

/**
 * Контекст игры, который может содержать различные данные, необходимые для управления состоянием игры.
 * В данном случае добавлены поля для длины и ширины игрового поля. (по началу пускай игровое поле будет простой прямоугольной формы)
 * Вы можете расширить этот класс, добавив другие необходимые параметры или методы.
 */
public class GameContext {
    int fieldLength; //Длина игрового поля
    int fieldWidth; //Ширина игрового поля

    public GameContext(int fieldLength, int fieldWidth) {
        this.fieldLength = fieldLength;
        this.fieldWidth = fieldWidth;
    }
}
