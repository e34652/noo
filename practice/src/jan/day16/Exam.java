package jan.day16;

class Solution {
	public String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int idx = 0; idx < code.length(); idx++) {
			if (mode == 0) {
				if (!code.substring(idx, idx + 1).equals("1") && idx % 2 == 0) {
					answer = answer + code.charAt(idx);
				}
				if (code.substring(idx, idx + 1).equals("1")) {
					mode = 1;
				}
			} else if (mode == 1) {
				if (!code.substring(idx, idx + 1).equals("1") && idx % 2 == 1) {
					answer = answer + code.charAt(idx);
				}
				if (code.substring(idx, idx + 1).equals("1")) {
					mode = 0;
				}
			}
		}
		if (answer.equals("")) {
			answer = "EMPTY";
		}
		return answer;
	}
}