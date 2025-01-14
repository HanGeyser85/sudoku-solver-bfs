# sudoku-solver-bfs

This project is a Sudoku solver implemented using Breadth-First Search (BFS) algorithm. The solver takes a partially filled Sudoku board and attempts to fill in the missing values such that each row, column, and 3x3 subgrid contain all of the digits from 1 to 9.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Visual Studio Code with Java extensions

### Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/HanGeyser85/sudoku-solver-bfs.git
   cd sudoku-solver-bfs
   ```

2. Open the project in Visual Studio Code:

   ```sh
   code .
   ```

## Usage

1. Open `BFS_Solver.java` and add your own Sudoku puzzle.

2. Compile the project:

   ```sh
   javac -d bin src/**/*.java
   ```

3. Run the solver:

   ```sh
   java -cp bin com.example.sudokusolver.Main
   ```

4. In the `OUTPUT.txt` file will be the given board and the solved board. In the `OUTPUT_TREE.txt` file will be a tree structure depicting the tree that was traversed in order to find the solution using the BFS algorithm.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
