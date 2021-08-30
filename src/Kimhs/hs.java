package Kimhs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import main.StDTO;

public class hs {
	public void select() {
		System.out.println("==== 학생관리 프로그램 ====");
		System.out.println("입력할 형태 선택");
		System.out.println("1.list    2.map\n입력 >>>>> ");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		switch(sel) {
			case 1:
				listMethod();
				break;
			case 2:
				mapMethod();
				break;
			default :
				System.out.println("1과 2중 하나만 입력하세요.");
				break;
			}
		}
	
	public void listMethod() {
		Scanner input = new Scanner(System.in);
		ArrayList<StDTO> list = new ArrayList<StDTO>();
		String name, stNum;
		int num;
		while(true) {
			System.out.println("1.등록 2.보기 3.종료");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("학번 입력 : ");
				stNum = input.next();
				System.out.println("이름 입력 : ");
				name = input.next();
				
				StDTO dto = new StDTO();
				dto.setStNum(stNum);
				dto.setName(name);
				list.add(dto);
				break;
			case 2:
				System.out.println("--- 모든 정보 보기 ---");
				for(int i=0; i<list.size(); i++) {
					//StDTO s = list.get(i);
					//System.out.println(s.getStNum());
					System.out.println("학번 : " + list.get(i).getStNum());
					System.out.println("이름 : " + list.get(i).getName());
					System.out.println("-------------------------");
				}
				break;
			case 3:
				System.out.println("프로그램 종료"); return;
			}
		}

	}
	
	public void mapMethod() {
		Scanner input = new Scanner(System.in);
		HashMap<String, StDTO> map = new HashMap<String,StDTO>();
		String name, stNum;
		int num;
		while(true) {
			System.out.println("1.등록 2.보기 3.종료");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("학번 입력 : ");
				stNum = input.next();
				System.out.println("이름 입력 : ");
				name = input.next();	
				StDTO dto = new StDTO();
				dto.setStNum(stNum);
				dto.setName(name);
				map.put(dto.getStNum(), dto);				
				break;
			case 2:
				System.out.println("--- 모든 정보 보기 ---");
				Set set = map.keySet();
				Iterator<String> it = set.iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println("학번 : " + key + "\n이름 : " + map.get(key).getName());
				}
				break;
			case 3:
				System.out.println("프로그램 종료"); return;
			}
		}
	}

}

