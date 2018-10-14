package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double highest = peeps.get(1);
		for (int i = 1; i < peeps.size(); i++) {
			if (peeps.get(i) > highest) {
				highest = peeps.get(i);
			}
		}
		return highest;
	}

	public static String findLongestWord(List<String> words) {
		String currentLongest = words.get(1);
		int highest = words.get(1).length();
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).length() > highest) {
				highest = words.get(i).length();
				currentLongest = words.get(i);
			}
		}
		return currentLongest;
	}

	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals(" ... --- ... ")) {

				return true;
			}
		}
		return false;
	}

	public static ArrayList<Double> sortScores(List<Double> message) {
		ArrayList<Double> output = new ArrayList<Double>();
		ArrayList<Double> message2 = new ArrayList<>(message);
		for (int i = 0; i < message2.size()*15; i++) {
			int index = 0;
			double current = message2.get(index);
			for (int j = 1; j < message2.size(); j++) {
				if (message2.get(j) < current) {
					current = message2.get(j);
					index = j;
				}
			}
			output.add(current);
			message2.remove(index);
		}
		return output;
	}
	
	public static List<String> sortDNA(List<String> a){
		ArrayList<String> b = new ArrayList<>(a);
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int i = 0; i < b.size()-1; i++) {
				if (b.get(i).length() > b.get(i+1).length()) {
					String temp = b.get(i+1);
					b.set(i+1, b.get(i));
					b.set(i, temp);
					swap = true;
				}
			}
		}
		return b;
	}
	
	public static List<String> sortWords(List<String> a){
		List<String> b = a;
		boolean swap = true;
		while(swap) {
			for (int i = 0; i < b.size()-1; i++) {
				if (b.get(i).compareTo(b.get(i+1)) < 0) {
					String temp = b.get(i+1);
					b.set(i+1, b.get(i));
					b.set(i, temp);
					swap = true;
				}
			}
		}
		System.out.println(b);
		return b;
	}
}
