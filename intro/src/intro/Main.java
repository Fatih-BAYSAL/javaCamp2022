package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade Suresi";

		System.out.println(altMetin);

		int vade = 12;
		double dolarDun = 18.25;
		double dolarBugun = 18.25;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);

		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

	}

}
