import java.util.Scanner;
class J1Tugas1{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		double biaya = 4500, diskon = 0.05, pendapatan=0, total;
		int berat[] = {4, 15, 6, 11};
		String nama[] = {"Ani", "Budi", "Beni", "Cita"};
		
		System.out.println("=======SMILE LAUNDRY=======");
		System.out.println("Berat Laundry Ani\t: " +berat[0] +"kg");
		System.out.println("Berat Laundry Budi\t: " +berat[1] +"kg");
		System.out.println("Berat Laundry Beni\t: " +berat[2] +"kg");
		System.out.println("Berat Laundry Cita\t: " +berat[3] +"kg");
		
		for(int i=0; i<berat.length; i++){
			if(berat[i]>10){
				total = berat[i]*0.05*biaya;
			}else{
				total = berat[i]*biaya;
			}
			System.out.println("Total " +nama[i] +"\t: Rp" +total);
			pendapatan += total;
		}
		System.out.println("Pendapatan Smile Laundry sebesar Rp" +pendapatan);
	}
}