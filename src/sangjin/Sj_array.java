package sangjin;

import java.util.ArrayList;
import java.util.Scanner;

import main.StDTO;

public class Sj_array {
	public static void main(String[] args) {
		ArrayList<StDTO> list = new ArrayList<StDTO>();
		int num;
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
				list.add(dto);
				break;
			case 2:
				System.out.println("=== 모든 정보 출력 ===");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("이름 : " + list.get(i).getName());
					System.out.println("학번 : " + list.get(i).getStNum());
					System.out.println("==============");
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;

			}
		}
	}
}
