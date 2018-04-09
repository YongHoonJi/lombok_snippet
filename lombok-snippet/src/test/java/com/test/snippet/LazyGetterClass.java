package com.test.snippet;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

public class LazyGetterClass {
	@Getter private final int age = 11;
	@Getter(lazy=true) private final List<String> large = something();
	private List<String> something() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Arrays.asList("1", "2", "3");
	}
}
