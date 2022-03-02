public class Pacman{
	int x, y, width, height;
	
	void moveLeft(int j){
		x -= 1;
	}
	void moveRight(int j){
		x += 1;
	}
	void moveUp(int j){
		y += 1;
	}
	void moveDown(int j){
		y -= 1;
	}
	void printPosition(int x, int y){
		System.out.println("Pacman diposisi (x,y) = " +x +"," +y);
	}
}