package jan.day31;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);// 0.5초 멈춤
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}  
		}

	}

}
