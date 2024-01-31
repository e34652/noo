package jan.day10;

import java.util.Scanner;

class Book {
		String title, author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}

public class BookArray {
		
		public static void main(String[] args) {
			Book[] book = new Book[2]; // Book 배열 선언
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < book.length; i++) {
				System.out.print("제목>>");
				String title = scanner.nextLine();
				System.out.print("저자>>");
				String author = scanner.nextLine();
				book[i] = new Book(title, author); // 배열 원소 객체 생성
			}
			for (int i = 0; i < book.length; i++) {
				System.out.print("(" + book[i].title + ", " + book[i].author + ")");
			}
			System.out.println("찾고싶은 책을 입력하세요");
			String name = scanner.nextLine();
			for (int i = 0; i < book.length; i++) {
				if(book[i].title.equals(name)) {
					System.out.println("저자 =" + book[i].author);
				}
			}
				
				scanner.close();
		
	}
}