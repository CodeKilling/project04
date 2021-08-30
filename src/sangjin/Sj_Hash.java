package sangjin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import main.StDTO;

public class Sj_Hash {
	public static void main(String[] args) {
		int num;
		HashMap<String, StDTO> map = new HashMap<String, StDTO>();
		String name, stNum;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 등록 2. 보기 3. 종료");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("이름 입력 : ");
				name = sc.next();
				System.out.println("학번 입력 : ");
				stNum = sc.next();
				StDTO dto = new StDTO();
				dto.setName(name);
				dto.setStNum(stNum);
				map.put(name, dto);
				break;
			case 2:
				System.out.println("=== 모든 정보 보기 ===");
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					StDTO s= map.get(it.next());
					System.out.println(" 이름 : "+s.getName());
					System.out.println(" 학번 : "+s.getStNum());
				}
			case 3:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
