package armstrongSayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number;
		int basamakSayisi = 0;
		int basamakDegeri;
		int basamakUstu;
		int tempNumber;
		int total = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Say� giriniz: ");
		number = scan.nextInt();
		tempNumber = number;

		/*
		 * Girilen say�n�n ka� basamakl� oldu�unu bulur
		 */
		while (tempNumber != 0) {
			tempNumber /= 10;
			basamakSayisi++;
		}

		tempNumber = number;

		/*
		 * Girilen say�da bulunan rakamlar�n basamak say�s� kadar kuvvetini al�r ve t�m
		 * kuvvetleri toplar.
		 */
		while (tempNumber != 0) {
			basamakDegeri = tempNumber % 10;
			basamakUstu = 1;
			for (int i = 1; i <= basamakSayisi; i++) {
				basamakUstu *= basamakDegeri;
			}
			total += basamakUstu;
			tempNumber /= 10;
		}

		/*
		 * rakamlar�n basamak say�s� kadar al�nan kuvvetlerinin toplam�n�n say�n�n
		 * kendisine e�it olup olmad���n�n kontrol�n� yapar
		 */
		if (total == number) {
			System.out.println(number + " say�s� bir armstrong say�d�r.");
		} else {
			System.out.println(number + " say�s� bir armstrong say� DE��LD�R.");
		}
	}

}
