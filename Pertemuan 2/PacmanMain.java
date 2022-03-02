import java.util.Scanner;

public class PacmanMain{
	public static void main(String[] args){
		Pacman m = new Pacman();
		Scanner sc = new Scanner(System.in);
		m.x = 0;
		m.y = 0;
		
		System.out.print("Batas x = ");
		m.width = sc.nextInt();
		System.out.print("Batas y = ");
		m.height = sc.nextInt();
		
		for (;;) {
            System.out.print("\nPilih Arah : \n1.Move Left\n2.Move Right\n3.Move Up\n4.Move Down\n5.Exit\nPilihan Anda = ");
            int input = sc.nextInt();
            if (m.x == 0 && input == 1) {
                System.out.println("\nPacman kurang atau melebihi batas");
                m.printPosition(m.x, m.y);
                continue;
            } else if (m.y == 0 && input == 2) {
                System.out.println("\nPacman kurang atau melebihi batas");
                m.printPosition(m.x, m.y);
                continue;
            } else if (m.x == m.width && input == 3) {
                System.out.println("\nPacman kurang atau melebihi batas");
                m.printPosition(m.x, m.y);
                continue;
            } else if (m.y == m.height && input == 4) {
                System.out.println("\nPacman kurang atau melebihi batas");
                m.printPosition(m.x, m.y);
                continue;
            }

            if (input == 1) {
                m.moveLeft(m.x);
                m.printPosition(m.x, m.y);
            } else if (input == 2) {
                m.moveRight(m.x);
                m.printPosition(m.x, m.y);
            } else if (input == 3) {
                m.moveUp(m.y);
                m.printPosition(m.x, m.y);
            } else if (input == 4) {
                m.moveDown(m.y);
                m.printPosition(m.x, m.y);
            } else {
                System.out.println("\nTERIMA KASIH\n");
                break;
            }
	}
	}
}