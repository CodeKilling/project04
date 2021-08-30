package nmrnkd;

import java.util.ArrayList;
import java.util.Scanner;

import main.StDTO;

public class sms_arr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StDTO> list = new ArrayList<StDTO>();
		
		int num; String name, stNum;
		
		System.out.println("List로 구현합니다.");
		System.out.println("ArrayList로 구현한 프로그램");

		while(true) {
			System.out.println("1.등록 2.보기 3.종료");
			num = input.nextInt();
		
			switch(num) {
			case 1:
				System.out.println("학번 입력");
				stNum = input.next();
				System.out.println("이름 입력");
				name = input.next();
				
				StDTO dto = new StDTO();
				dto.setStNum(stNum);
				dto.setName(name);
				
				list.add(dto);
				
				break;
			case 2:
				System.out.println("--- 모든 정보 출력 ---");
				for(int i=0 ; i<list.size() ; i++) {
					System.out.println("학번 : "+list.get(i).getStNum());
					System.out.println("이름 : "+list.get(i).getName());
					System.out.println("---------------------");
				}
				break;
			case 3:
				System.out.println("프로그램 종료");  return ;
			}
		}
	}
}
