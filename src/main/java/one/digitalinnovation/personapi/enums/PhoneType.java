package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor; 
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    PhoneType(String string) {
		this.description = "";
		
	}

	private final String description;
}
