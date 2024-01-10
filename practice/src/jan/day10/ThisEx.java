package jan.day10;

public class ThisEx {
	int x;
	int y;
	int z;
	
	
	@Override
	public String toString() {
		return "ThisEx [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	public ThisEx(int x) {
		
		//this.x = x;
		
		
	}

	

	public ThisEx(int x, int y) {
		//this.x = x;
		//this.y = y;|
		
		this(x, y,1000);
		System.out.println(x +"ㅁㄴㅇ");
	}
	
	
	public ThisEx(int x, int y, int z) {
		
		System.out.println(x +""+ y + z +"ㅇㄴㅁ");
		
	}


	public static void main(String[] args) {
		ThisEx thisEx = new ThisEx(150, 200); 

	}



	
	}

