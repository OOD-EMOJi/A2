/**
*	The MazeGenerator interface serves as a part of the Strategy 
*	pattern for generating mazes. This is used to easily create and 
*	change algorithms for maze generation without changing the Maze class.
*
*	The Maze Class carries a member of this class, and uses it in its generateMaze(int w, int h) 
*   method.
**/
public interface MazeGenerator {
	
	/**
	*	This method creates a Tile[][] for the Maze in its generateMaze(int w, int h) method.
	* 	IMPORTANT: This method does not promise a Tile[][] of the size w x h. The w and h 
	*	parameters are just integers to determine the width and height of the maze. 
	*	ie. Each implementation of MazeGenerator can return a different sized Tile[][]. 
	*	(See DepthFirstSearchMazeGenerator )
	*	@param w - width input for the maze generator
	*	@param h - height input for the maze generator 
	*	@return Tile[][] - a valid maze
	**/
    Tile[][] generateMaze(int w, int h);
}