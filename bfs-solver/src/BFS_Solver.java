
import java.util.List;

public class BFS_Solver {

    public static void main(String[] args) throws Exception {
        SudokuBoard board = new SudokuBoard(
                List.of(
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                        List.of(4, 5, 6, 7, 8, 9, 1, 2, 3),
                        List.of(7, 8, 9, 1, 2, 3, 4, 5, 6),
                        List.of(2, 3, 4, 5, 6, 7, 8, 9, 1),
                        List.of(5, 6, 7, 8, 9, 1, 2, 3, 4),
                        List.of(8, 9, 1, 2, 3, 4, 5, 6, 7),
                        List.of(3, 4, 5, 6, 7, 8, 9, 1, 2),
                        List.of(6, 7, 8, 9, 1, 2, 3, 4, 5),
                        List.of(9, 1, 2, 3, 4, 5, 6, 7, 8)
                )
        );

        System.out.println(board.toString());
    }
}
