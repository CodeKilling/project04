package main;

import java.util.Scanner;


import jieun.*;
import psy.PsyST;
import Kimhs.hs;
import sangjin.Sj_Hash;
import sangjin.Sj_array;


public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		PsyST psy = new PsyST();
		Sj_array sjar = new Sj_array();
		Sj_Hash sjhs = new Sj_Hash();
		
		while(true) {
			System.out.println("1.박상진");
			System.out.println("2.김여진");
			System.out.println("3.김형석");
			System.out.println("4.문지은");
			System.out.println("5.박선영");
			input = sc.nextInt();
			
			switch(input) {
			case 1:
				sjar.main(args);
				sjhs.main(args);
				break;
			case 2:
				break;
			case 3:
				hs h = new hs();
				h.select();
				break;
			case 4:
				System.out.println("1.ArrayList  2.HashMap");
				input = sc.nextInt();
				if(input==1) {
					Je_array ja = new Je_array();
					ja.display();
				}else if(input==2) {
					Je_hash jh = new Je_hash();
					jh.display();
				}else {
					System.out.println("1번 또는 2번을 선택해주세요.");
				}
				break;
			case 5:
				psy.display();
				break;
			case 6:
				System.out.println("Program Exit.");
				System.exit(0);
			default:
				break;
			}
			
		}
	}
}
