package jieun;

import java.util.*;
import main.StDTO;
public class Je_array {
	private String name = null, stNum = null;
	Scanner sc = new Scanner(System.in);
	ArrayList<StDTO> arr = new ArrayList<StDTO>();
	public void display() {
		boolean bool = true;
		while(bool) {
			System.out.println("1.등록  2.보기  3.종료");
			int num = sc.nextInt();
			switch(num) {
			case 1 : enroll(); break;
			case 2 : view(); break;
			case 3 : bool = false; break;
			}
		}
	}
	public void enroll() {
		System.out.print("학번 입력 : "); stNum = sc.next();
		System.out.print("이름 입력 : "); name = sc.next();
		boolean du = false;
		
		for(int i=0; i<arr.size(); i++) {
			if(stNum.equals(arr.get(i).getName())) {
				System.out.println("이미 등록된 학번입니다.");
				du = true;
				break;
			}
		}
		
		if(!du) {
			StDTO st = new StDTO();
			st.setStNum(stNum); st.setName(name);
			arr.add(st);
			System.out.println("등록 완료");
		}
		
	}
	public void view() {
		System.out.println("--- 모든 정보 보기 ---");
		for(int i=0; i<arr.size(); i++) {
			System.out.println("학번 : " + arr.get(i).getStNum());
			System.out.println("이름 : " + arr.get(i).getName());
			System.out.println("--------------------");
		}
	}
}
