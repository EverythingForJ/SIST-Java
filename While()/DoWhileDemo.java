/*
작성자 : 김준환
작성목적 : 로또 번호 뽑기
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class DoWhileDemo {
	public static void main(String[] args) {
		int rand1, rand2, rand3, rand4, rand5, rand6;
		do{
			rand1 = (int)(Math.random()*45+1);	// 1부터 6까지 랜덤 숫자 얻기
			rand2 = (int)(Math.random()*45+1);
			rand3 = (int)(Math.random()*45+1);
			rand4 = (int)(Math.random()*45+1);
			rand5 = (int)(Math.random()*45+1);
			rand6 = (int)(Math.random()*45+1);
		}while(rand1 == rand2 || rand1 == rand3 || rand1 == rand4 || rand1 == rand5 ||  rand1 == rand6
			 || rand2 == rand1 || rand2 == rand3 ||  rand2 == rand4 ||  rand2 == rand5 ||  rand2 == rand6
			|| rand3 == rand1 || rand3 == rand2||  rand3 == rand4 ||  rand3 == rand5 ||  rand3 == rand6
			 || rand4 == rand1 || rand4 == rand2 || rand4 == rand3 || rand4 == rand5 ||  rand4 == rand6
			|| rand5 == rand1 || rand5 == rand2 ||  rand5 == rand3 ||  rand5 == rand4 ||  rand5 == rand6
			 || rand6 == rand1 || rand6 == rand2 ||  rand6 == rand3 ||  rand6 == rand4 || rand6 == rand5);
		System.out.println(rand1+", "+rand2+", "+rand3+", "+rand4+", "+rand5+", "+rand6);
	}
}