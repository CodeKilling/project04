package psy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import main.StDTO;

public class PsyST {
	
	ArrayList<StDTO> arr = new ArrayList<StDTO>();
	HashMap<String, StDTO> map = new HashMap<String, StDTO>();
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		boolean flag = true;
		String stNum = null, name = null;
		
		while(flag) {
			System.out.println("1.등록");
			System.out.println("2.보기(ArrayList)");
			System.out.println("3.보기(HashMap)");
			System.out.println("4.나가기");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1:
				System.out.println("학번 입력 : ");
				stNum = sc.next();
				System.out.println("이름 입력 : ");
				name = sc.next();
				
				StDTO dto = new StDTO();
				dto.setStNum(stNum);
				dto.setName(name);
				
				arr.add(dto);
				map.put(stNum, dto);
				break;
			case 2:
				for(StDTO entry : arr) {
					System.out.println("학번 : " + entry.getStNum() 
					+ ", 이름 : " + entry.getName());
				}
				break;
			case 3:
				Iterator<HashMap.Entry<String, StDTO>> entries = map.entrySet().iterator();
				while(entries.hasNext()) {
					HashMap.Entry<String, StDTO> entry = entries.next();
					System.out.println("학번 : " + entry.getValue().getStNum()
							+ ", 이름 : " + entry.getValue().getName());
				}
				break;
			case 4:
				flag = false;
				System.out.println("exit.");
				break;
			default:
				break;
			}
		}
	}
}
