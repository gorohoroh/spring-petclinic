package org.springframework.samples.petclinic.model;

import jakarta.persistence.Basic;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FirstName {
	private String firstName;

	public char[] toCharArray() {
		return firstName.toCharArray();
	}

	public int length() {
		return firstName.length();
	}
}
