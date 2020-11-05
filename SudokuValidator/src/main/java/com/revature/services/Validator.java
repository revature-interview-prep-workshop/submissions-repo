package com.revature.services;

import java.util.Arrays;
import java.util.HashSet;

public class Validator {
	
	public boolean isValid(String[][] a) {
		if(!(validateHorizontal(a) && validateVertical(a) && validateSquares(a))) {
			return false;
		}
		
		System.out.println(validateHorizontal(a));
		System.out.println(validateVertical(a));
		System.out.println(validateSquares(a));
		
		return true;
	};
	
	public boolean validateHorizontal(String[][] a) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
			HashSet<String> set = new HashSet<String>();
			if(!(a[i][j].equals("."))) {
				if(set.add(a[i][j])== false){
					return false;
				}
				}
			set.clear();
			}
		}
		return true;
	}
		
	public boolean validateVertical(String[][] a) {
	
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
			HashSet<String> set = new HashSet<String>();
			if(!(a[i][j].equals("."))) {
				if(set.add(a[j][i]) == false){
					return false;
					}
				}
			set.clear();
			}
		}
		return true;
	}		
	
	public boolean validateSquares (String[][] a) {
		for(int i = 1; i <= 8; i+=3) {
			for(int j = 1; j <= 8; j+=3) {
				HashSet<String> set = new HashSet<String>();
				if(!(a[i][j].equals("."))) {
					if(set.add(a[i-1][j-1]) == false &&
					   set.add(a[i-1][j]) == false &&
					   set.add(a[i-1][j+1]) == false &&
					   set.add(a[i][j-1]) == false &&
					   set.add(a[i][j]) == false &&
					   set.add(a[i][j+1]) == false &&
					   set.add(a[i+1][j-1]) == false &&
					   set.add(a[i+1][j]) == false &&
					   set.add(a[i+1][j+1]) == false){
						return false;
					}
			}
				set.clear();
			}	
	}
	return true;
	}
	
	
	public boolean validateDiagonals(String[][] a) {
		
		
		return true;
	}
}
