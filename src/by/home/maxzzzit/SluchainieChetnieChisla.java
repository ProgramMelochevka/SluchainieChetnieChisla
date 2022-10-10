package by.home.maxzzzit;

public class SluchainieChetnieChisla {

	public static void main(String[] args) {
		// Цикл генерирует 40 случайных чисел из диапазона от 1 до 6.
		// Цикл выводит на экран (в одну строку) только те из сгенерированных случайных чисел,
		// которые имеют четное значение.
		int diap;
		System.out.println("Выводим только четные числа ");
		for (int i = 0; i < 40; i++) {
			diap = 1 + (int) (Math.random() * 6);
			if (diap % 2 == 0)
				System.out.print(diap + " ");
		}
	}

}
