import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Masukan Banyaknya Mahasiswa : ");
		int n = reader.nextInt();
		double rerata=0;
		Mahasiswa[] mahasiswa = new Mahasiswa[n];
		for (int i = 0; i < n; i++) 
		{
			mahasiswa[i] = new Mahasiswa();
			System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");
			mahasiswa[i].nilai = reader.nextInt();
			rerata += mahasiswa[i].nilai;
		}
		rerata /= n;
		System.out.println("Maka, Rata-rata Nilainya adalah "+rerata);
		System.out.println("Developed by : Wildan Muhammad Fikri");
		reader.close();
	}

}
