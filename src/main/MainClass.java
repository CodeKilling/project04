package main;

import java.util.Scanner;


import Kimhs.hs;
import sangjin.Sj_Hash;
import sangjin.Sj_array;
import nmrnkd.sms_arr;
import nmrnkd.sms_hmap;
<<<<<<< HEAD


=======
>>>>>>> nmrnkd

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		Sj_array sjar = new Sj_array();
		Sj_Hash sjhs = new Sj_Hash();
<<<<<<< HEAD
		sms_arr Nmrnkd_Arr = new sms_arr();
		sms_hmap Nmrnkd_Hmap = new sms_hmap();
=======
		sms_arr n_arr = new sms_arr();
		sms_hmap n_hmap = new sms_hmap();
		
>>>>>>> nmrnkd
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
<<<<<<< HEAD
				Nmrnkd_Arr.main(args);
				Nmrnkd_Hmap.main(args);
=======
				n_arr.main(args);
				n_hmap.main(args);
>>>>>>> nmrnkd
				break;
			case 3:
				hs h = new hs();
				h.select();
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
			
		}
	}

	private static void Nmrnkd_Hmap(String[] args) {
		// TODO Auto-generated method stub
		
	}

	private static void Nmrnkd_Arr(String[] args) {
		// TODO Auto-generated method stub
		
	}

	private static void sj() {
		// TODO Auto-generated method stub
		
	}

	private static void Sj_Hash() {
		// TODO Auto-generated method stub
		
	}

	private static void Sj_array() {
		// TODO Auto-generated method stub
		
	}
}
