package lv.javaguru.lessons.lesson1.task15;




import org.junit.Before;
import org.junit.Test;

import static lv.javaguru.lessons.lesson1.task15.Queens.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class QueensTest {

    public int[][] field;

    @Before
    public void setUp() {
        field = Queens.createField();
    }

    @Test
    public void shouldReturnFalseIfNotCompleted() {
        boolean isComplete = isComplete(field);
        assertFalse(isComplete);
    }

    @Test
    public void shouldReturnTrueIfCompleted() throws Exception {
        field[0][5]=1;
        field[1][3]=1;
        field[2][6]=1;
        field[3][0]=1;
        field[4][7]=1;
        field[5][1]=1;
        field[6][4]=1;
        field[7][2]=1;
        boolean isComplete = isComplete(field);
        assertTrue(isComplete);

    }

    @Test
    public void shouldReturnTrueIfQueenInRow() throws Exception {
        field[3][3] = 1;
        boolean isQueenInRow = isQueenInRow(field, 3);
        assertTrue(isQueenInRow);
    }

    @Test
    public void shouldReturnTrueIfQueenInColumn() throws Exception {
        field[3][5] = 1;
        boolean isQueenInColumn = isQueenInColumn(field, 5);
        assertTrue(isQueenInColumn);
    }

    @Test
    public void shouldReturnTrueIfQueenInDownDiagonal() throws Exception {
        field[3][6] = 1;
        boolean isQueenInDownDiagonal = isQueenInDownDiagonal(field, 4, 5);
        assertTrue(isQueenInDownDiagonal);
    }

    @Test
    public void shouldReturnTrueIfQueenInUpDiagonal() throws Exception {
        field[3][5] = 1;
        boolean isQueenInUpDiagonal = isQueenInUpDiagonal(field, 3, 5);
        assertTrue(isQueenInUpDiagonal);
    }

    @Test
    public void shouldReturnFalseIfQueenOnHit() throws Exception {
        field[1][2] = 1;
        boolean isFreeToPut = isFreeToPut(field, 2, 1);
        assertFalse(isFreeToPut);
    }

    @Test
    public void shouldReturnTrueIfFreeToPut() throws Exception {
        boolean isFreeToPut = isFreeToPut(field, 0, 0);
        assertTrue(isFreeToPut);
    }
}
