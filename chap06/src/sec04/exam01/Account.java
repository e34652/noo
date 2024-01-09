package sec04.exam01;

import java.util.Scanner;

public class Account {
	String id; // 아이디 필드
	String pw; // 비밀번호 필드
	int age;
	
	public Account() { // 생성자
		System.out.println("Account()");
	}
	
	/*public Account(Scanner scan, String sd, int sage) { // 매개변수 타입과 개수가 일치하므로 동일한 생성자로 인식함
		this.id = id;
		this.age = age;
	}*/
	
	public Account(Scanner scan, String id, int age) { // 생성자 오버로딩
		this.id = id;
		this.age = age;
	}
	
	public Account(Scanner scan, String id, String pw) { // 생성자 오버로딩
		this.id = id;
		this.pw = pw;
		
	}
	
	public Account(Scanner scan, String id, String pw, int age) { // 생성자 오버로딩
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}

	
}
