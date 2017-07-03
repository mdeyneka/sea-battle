import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import seabattlelogic.GameField;

public class GameFieldTest {

    @Test
    public void testSetShipNorth() {
        GameField gameField = new GameField();
        gameField.setShip(1, 1, GameField.Direction.NORTH, 2);

        GameField.Field[] row0 = {GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row1 = {GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row2 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row3 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row4 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row5 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row6 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row7 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row8 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row9 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};

        assertArrayEquals(row0, gameField.fields[0]);
        assertArrayEquals(row1, gameField.fields[1]);
        assertArrayEquals(row2, gameField.fields[2]);
        assertArrayEquals(row3, gameField.fields[3]);
        assertArrayEquals(row4, gameField.fields[4]);
        assertArrayEquals(row5, gameField.fields[5]);
        assertArrayEquals(row6, gameField.fields[6]);
        assertArrayEquals(row7, gameField.fields[7]);
        assertArrayEquals(row8, gameField.fields[8]);
        assertArrayEquals(row9, gameField.fields[9]);
    }

    @Test
    public void testSetShipSouth() {
        GameField gameField = new GameField();
        gameField.setShip(1, 1, GameField.Direction.SOUTH, 3);

        GameField.Field[] row0 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row1 = {GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row2 = {GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row3 = {GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row4 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row5 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row6 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row7 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row8 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row9 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};

        assertArrayEquals(row0, gameField.fields[0]);
        assertArrayEquals(row1, gameField.fields[1]);
        assertArrayEquals(row2, gameField.fields[2]);
        assertArrayEquals(row3, gameField.fields[3]);
        assertArrayEquals(row4, gameField.fields[4]);
        assertArrayEquals(row5, gameField.fields[5]);
        assertArrayEquals(row6, gameField.fields[6]);
        assertArrayEquals(row7, gameField.fields[7]);
        assertArrayEquals(row8, gameField.fields[8]);
        assertArrayEquals(row9, gameField.fields[9]);
    }

    @Test
    public void testSetShipWest() {
        GameField gameField = new GameField();
        gameField.setShip(5, 5, GameField.Direction.WEST, 4);

        GameField.Field[] row0 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row1 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row2 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row3 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row4 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row5 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.CONTAIN, GameField.Field.CONTAIN,
                GameField.Field.CONTAIN, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row6 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row7 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row8 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row9 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};

        assertArrayEquals(row0, gameField.fields[0]);
        assertArrayEquals(row1, gameField.fields[1]);
        assertArrayEquals(row2, gameField.fields[2]);
        assertArrayEquals(row3, gameField.fields[3]);
        assertArrayEquals(row4, gameField.fields[4]);
        assertArrayEquals(row5, gameField.fields[5]);
        assertArrayEquals(row6, gameField.fields[6]);
        assertArrayEquals(row7, gameField.fields[7]);
        assertArrayEquals(row8, gameField.fields[8]);
        assertArrayEquals(row9, gameField.fields[9]);
    }

    @Test
    public void testSetShipEast() {
        GameField gameField = new GameField();
        gameField.setShip(2, 3, GameField.Direction.EAST, 3);

        GameField.Field[] row0 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row1 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row2 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row3 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.CONTAIN, GameField.Field.CONTAIN, GameField.Field.CONTAIN,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row4 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row5 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row6 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row7 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row8 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};
        GameField.Field[] row9 = {GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY,
                GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY, GameField.Field.EMPTY};

        assertArrayEquals(row0, gameField.fields[0]);
        assertArrayEquals(row1, gameField.fields[1]);
        assertArrayEquals(row2, gameField.fields[2]);
        assertArrayEquals(row3, gameField.fields[3]);
        assertArrayEquals(row4, gameField.fields[4]);
        assertArrayEquals(row5, gameField.fields[5]);
        assertArrayEquals(row6, gameField.fields[6]);
        assertArrayEquals(row7, gameField.fields[7]);
        assertArrayEquals(row8, gameField.fields[8]);
        assertArrayEquals(row9, gameField.fields[9]);
    }
}