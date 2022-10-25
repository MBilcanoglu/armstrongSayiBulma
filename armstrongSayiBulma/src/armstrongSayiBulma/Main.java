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

		System.out.print("Sayý giriniz: ");
		number = scan.nextInt();
		tempNumber = number;

		/*
		 * Girilen sayýnýn kaç basamaklý olduðunu bulur
		 */
		while (tempNumber != 0) {
			tempNumber /= 10;
			basamakSayisi++;
		}

		tempNumber = number;

		/*
		 * Girilen sayýda bulunan rakamlarýn basamak sayýsý kadar kuvvetini alýr ve tüm
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
		 * rakamlarýn basamak sayýsý kadar alýnan kuvvetlerinin toplamýnýn sayýnýn
		 * kendisine eþit olup olmadýðýnýn kontrolünü yapar
		 */
		if (total == number) {
			System.out.println(number + " sayýsý bir armstrong sayýdýr.");
		} else {
			System.out.println(number + " sayýsý bir armstrong sayý DEÐÝLDÝR.");
		}
	}

}
