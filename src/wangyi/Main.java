package wangyi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> ns = new ArrayList<>();
		do {
		  String string = scanner.nextLine();
		  if (string.equals("")) {
		    break;
		  }
		  ns.add(string.toUpperCase());
		} while (true);

		HashSet< String> set = new HashSet<>();
	
		for(int i=0;i<ns.size();i++){

			String[] str = ns.get(i).trim().split("\\s");
			for(int j= 0;j<str.length;j++){
				set.add(str[j]);
			}
			
		}
		int count =0;
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			iterator.next();
			count++;
		}
		System.out.println(count);
		
		

    }
}
