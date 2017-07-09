import seabattlelogic.GameField;
import seabattlelogic.GameFieldException;

public class Application {

    public static void main(String[] args) throws GameFieldException {
        GameField gameField = new GameField();
        try {
            gameField.setShip(7, 7, GameField.Direction.EAST, 4);
        } catch (GameFieldException e) {
            System.out.println(e.getMessage());
        }
        gameField.printGameField();
    }

}
