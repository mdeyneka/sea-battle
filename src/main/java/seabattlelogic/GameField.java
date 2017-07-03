package seabattlelogic;

public class GameField {

    public enum Field {
        EMPTY,
        SHOOTED,
        CONTAIN,
        DAMAGED
    }

    public enum Direction {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    public Field fields[][];

    public GameField() {
        fields = new Field[10][10];
        setGameFieldAsEmpty();
    }
    public GameField(int x, int y) {
        fields = new Field[x][y];
        setGameFieldAsEmpty();
    }

    public void setShip(int positionX, int positionY, Direction direction, int lenght) {
        switch(direction) {
            case NORTH:
                for (int i = 0; i < lenght; ++i) {
                    fields[positionY - i][positionX] = Field.CONTAIN;
                }
                break;
            case SOUTH:
                for (int i = 0; i < lenght; ++i) {
                    fields[positionY + i][positionX] = Field.CONTAIN;
                }
                break;
            case WEST:
                for (int i = 0; i < lenght; ++i) {
                    fields[positionY][positionX - i] = Field.CONTAIN;
                }
                break;
            case EAST:
                for (int i = 0; i < lenght; ++i) {
                    fields[positionY][positionX + i] = Field.CONTAIN;
                }
                break;
        }
    }

    private void setGameFieldAsEmpty() {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = Field.EMPTY;
            }
        }
    }
    
    public void printGameField() {
        String string="";
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                if (fields[i][j] == Field.EMPTY) {
                    string = string.concat("E");
                } else if (fields[i][j] == Field.CONTAIN) {
                    string = string.concat("C");
                } else if (fields[i][j] == Field.SHOOTED) {
                    string = string.concat("S");
                }

            }
            string = string.concat("\n");
        }
        System.out.println(string);
    }
    
    
}