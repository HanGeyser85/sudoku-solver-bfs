
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class BFS_Solver {

    public static void main(String[] args) throws Exception {
        try (
                FileWriter outputBoard = new FileWriter("OUTPUT.txt"); FileWriter outputTree = new FileWriter("OUTPUT_TREE.txt")) {
            SudokuBoard board = new SudokuBoard(
                    Arrays.asList(
                            new ArrayList<>(Arrays.asList(0, 0, 3, 4, 5, 6, 7, 8, 9)),
                            new ArrayList<>(Arrays.asList(4, 0, 6, 0, 0, 9, 0, 0, 3)),
                            new ArrayList<>(Arrays.asList(7, 0, 0, 1, 0, 0, 0, 5, 0)),
                            new ArrayList<>(Arrays.asList(2, 0, 0, 0, 0, 7, 0, 0, 0)),
                            new ArrayList<>(Arrays.asList(5, 6, 0, 8, 0, 0, 0, 0, 0)),
                            new ArrayList<>(Arrays.asList(8, 9, 1, 0, 0, 0, 5, 0, 7)),
                            new ArrayList<>(Arrays.asList(3, 4, 0, 0, 7, 0, 9, 0, 0)),
                            new ArrayList<>(Arrays.asList(6, 0, 0, 0, 0, 0, 0, 0, 0)),
                            new ArrayList<>(Arrays.asList(9, 1, 2, 3, 0, 5, 6, 7, 8))
                    )
            );
            Solver solver = new Solver();

            outputBoard.write(board.toString());
            solver.GenerateSolutionTree(board);
            SolutionTree solution = solver.solution;
            SudokuBoard solvedBoard = solver.TraverseSolutionTree(solution.root) == null ? board
                    : solver.TraverseSolutionTree(solution.root);

            outputBoard.write(solvedBoard.toString());
            outputTree.write(solution.toString());
        }
    }
}
