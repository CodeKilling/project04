package jieun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import main.StDTO;

public class Je_hash {
	private String name = null, stNum = null;
	private int num = 0;
	Scanner sc = new Scanner(System.in);
	HashMap<String, StDTO> map = new HashMap<String, StDTO>();
	public void display() {
		boolean bool = true;
		while(bool) {
			System.out.println("1.등록  2.보기  3.종료");
			num = sc.nextInt();
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
		
		if(map.containsKey(stNum)) {
			System.out.println("이미 등록된 학번입니다.");
		}else {
			StDTO st = new StDTO();
			st.setStNum(stNum); st.setName(name);
			map.put(stNum, st);
			System.out.println("등록 완료");
		}
		
	}
	public void view() {
		System.out.println("1.모두보기  2.검색");
		num = sc.nextInt();
		if(num==1) {
			System.out.println("--- 모든 정보 보기 ---");
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				StDTO s = map.get(it.next());
				System.out.println("학번 : " + s.getStNum());
				System.out.println("이름 : " + s.getName());
				System.out.println("-------------------");
			}
		}else if (num==2){
			System.out.print("학번 입력 : "); stNum = sc.next();
			if(map.containsKey(stNum)) {
				StDTO s1 = map.get(stNum);
				System.out.println("학번 : " + s1.getStNum());
				System.out.println("이름 : " + s1.getName());
			}else {
				System.out.println("없는 학번입니다.");
			}
		}else {
			System.out.println("1번 또는 2번을 입력해주세요.");
		}	
	}
}
	