package com.el.onboarding.junit.romanNumerals.services;

import java.util.Map;
import java.util.TreeMap;

public class HinduToRomanNumeralConverter {
	Map<Integer, String> map = new TreeMap<Integer, String>();

	public HinduToRomanNumeralConverter() {
		
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
	}

	public String convert(int numberToConvert) {
		
		String s = "";
		
		
		Integer ceiling = ((TreeMap<Integer,String>) map).ceilingKey(numberToConvert);
		
		while(numberToConvert > 0) {
			int floor = ((TreeMap<Integer,String>) map).floorKey(numberToConvert);
			s += map.get(floor);
			numberToConvert -= floor;	
		}
		
		return s;
	}
}
