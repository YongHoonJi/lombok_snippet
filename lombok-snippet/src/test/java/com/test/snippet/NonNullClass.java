package com.test.snippet;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class NonNullClass {
	private String reasone;
	public NonNullClass(@NonNull String r) {
		this.reasone = r;
	}

}
