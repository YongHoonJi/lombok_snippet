package com.test.snippet;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class AllArgsClass {
	@NonNull private String name;
	@NonNull private String addr;
}
