import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		DepthFirstSearchMazeGenerator gen = new DepthFirstSearchMazeGenerator();
		Tile[][] t = gen.generateMaze(10,10);
		for(Tile[] r : t) {
			for(Tile c : r) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}