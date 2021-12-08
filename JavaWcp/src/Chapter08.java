
public class Chapter08 {
	public static void main(String[] args) {
		int num = 0;
		while (num < 5) {
			num++;
			System.out.println(num * num);
		}
		int[] array = { 4, 5, 2, 1 };
		for (int x = 0 ; x < array.length; x++) {
			System.out.println(array[x]);
		}
		for (int x : array ) {
			if (x % 2 == 0) {
				continue;
			} else {
				System.out.println(x);
			}
		}
	}
}
