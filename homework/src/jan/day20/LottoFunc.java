package jan.day20;

public class LottoFunc {

	private int[] nums = new int[6];
	
	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] num) {
		this.nums = num;
	}

	
	public int[] newNum(int[] num) {

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
		}
		return num;
	}

	public int[] dupCheck(int[] num) {

		AAA: while (true) {
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] == (num[j])) {
						num = newNum(num);
						continue AAA;
					}

				}
			}
			return num;
		}
	}

	public int[] sortNum(int[] num) {

		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}

}
