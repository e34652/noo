package jan.day15;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) { // 주소 복사가 아닌 장소 
		String[] arr = {"0", "1", "2", "3"};
		
		String[] newArr = new String[arr.length];
		
		for(String str : newArr) {
			System.out.println(str);
		}
		System.arraycopy(arr, 0, newArr, 0, newArr.length);
		for (String str : newArr) {
			System.out.println(str);
		}
		//더 좋아진 배열 복사
		String[] newArr1 = Arrays.copyOf(arr, arr.length);
		for (String str : newArr1) {
			System.out.println(str);
		}
		
	}

}
