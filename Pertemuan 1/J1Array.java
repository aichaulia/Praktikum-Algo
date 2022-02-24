import java.util.Scanner;
class J1Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
		//bunga[0] = "Aglonema";
		//bunga[1] = "Keladi";
		//bunga[2] = "Alocasia";
		//bunga[3] = "Mawar";
		
		System.out.print("Jumlah Kolom : ");
		int kolom = sc.nextInt();
		System.out.print("Jumlah Baris : ");
		int baris = sc.nextInt();
		
		int harga[] = {75000, 50000, 60000, 10000};
		int stock [][] = {
			{10, 5, 15, 7},
			{6, 11, 9, 12},
			{2, 10, 10, 5},
			{5, 7, 12, 9}
		};
		for(int i=0; i<4; i++){
			System.out.print("\t\t" +bunga[i]);
		}
		for(int a=0; a<4; a++){
			for(int b=0; b<5; b++){
				System.out.print(stock[a][b] +"\t\t");
			}
		System.out.println();
		}
	}
}