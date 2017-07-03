import seabattlelogic.GameField;

/**
 * Created by Virus on 01.07.2017.
 */
public class Application {

    public static void main(String[] args) {
        GameField gameField = new GameField();
        gameField.setShip(2,3, GameField.Direction.EAST, 3);
        gameField.printGameField();
    }

}
