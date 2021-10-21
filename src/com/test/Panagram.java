package com.test;

public class Panagram {
	public static void main(String[] args) {
		System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
	}

	public static String pangrams(String s) {
		s = s.replaceAll("\\s", "");

		if (s.chars().distinct().count() == 26) {
			s = "pangram";
		} else {
			s = "not pangram";
		}
		return s;
	}

}
