
import java.util.List;

public class SudokuBoard {

    List<List<Integer>> board;

    public SudokuBoard(List<List<Integer>> board) {
        this.board = board;
    }

    public boolean isSolved() {
        for (List<Integer> row : board) {
            for (Integer cell : row) {
                if (cell == 0) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (rowCheck[board.get(i).get(j) - 1]) {
                    return false;
                }
                rowCheck[board.get(i).get(j) - 1] = true;
            }

            boolean[] colCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (colCheck[board.get(j).get(i) - 1]) {
                    return false;
                }
                colCheck[board.get(j).get(i) - 1] = true;
            }

            boolean[] squareCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int row = 3 * (i / 3) + j / 3;
                int col = 3 * (i % 3) + j % 3;
                if (squareCheck[board.get(row).get(col) - 1]) {
                    return false;
                }
                squareCheck[board.get(row).get(col) - 1] = true;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔═╤═╤═╦═╤═╤═╦═╤═╤═╗\n");
        for (List<Integer> row : board) {
            sb.append("║");
            for (int i = 0; i < 9; i++) {
                sb.append(row.get(i) == 0 ? " " : row.get(i));
                if (i % 3 == 2) {
                    sb.append("║");
                } else {
                    sb.append("│");
                }
            }

            sb.append("\n");

            if ((row == board.get(2) || row == board.get(5)) && row != board.get(8)) {
                sb.append("╠═╪═╪═╬═╪═╪═╬═╪═╪═╣\n");
            } else if (row != board.get(8)) {
                sb.append("╟─┼─┼─╫─┼─┼─╫─┼─┼─╢\n");
            }
        }
        sb.append("╚═╧═╧═╩═╧═╧═╩═╧═╧═╝");
        return sb.toString();
    }
}
