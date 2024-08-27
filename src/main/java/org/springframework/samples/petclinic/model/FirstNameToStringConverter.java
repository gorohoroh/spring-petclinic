package org.springframework.samples.petclinic.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class FirstNameToStringConverter implements AttributeConverter<FirstName, String> {
	@Override
	public String convertToDatabaseColumn(FirstName firstName) {
		return firstName == null ? "" : firstName.getFirstName();
	}

	@Override
	public FirstName convertToEntityAttribute(String s) {
		return null;
	}
}
