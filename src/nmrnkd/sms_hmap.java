package nmrnkd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import main.StDTO;


public class sms_hmap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, StDTO> map = new HashMap<String, StDTO>();
		String name, stNum; int num;	
		
		System.out.println("HashMap으로 구현한 프로그램");
		
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
				
				map.put(name, dto);
				
				break;
			
			case 2:
				System.out.println("--- 모든 정보 보기 ---");
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					StDTO s = map.get( it.next() );
					System.out.println("학번 : "+s.getStNum());
					System.out.println("이름 : "+s.getName());
				}break;

			case 3:
				System.out.println("프로그램 종료");  return ;
			}
		}
	}
}
 