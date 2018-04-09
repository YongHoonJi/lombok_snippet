package com.test.snippet;

import lombok.Value;

// field is private and final. 
// @AllArgsConstructor , toString, equals, hashCode
@Value
public class ValueClass {
	String name;
	String addr;
}
