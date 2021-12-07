package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO; 
import one.digitalinnovation.personapi.entities.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return (PhoneDTO) ((Object) PhoneDTO.builder());
    }

    private static void build() {
		// TODO Auto-generated method stub
		
	}

	private static void type(PhoneType phoneType) {
		// TODO Auto-generated method stub
		
	}

	private static void number(String phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	public static Object createFakeEntity() {
        return ((Object) Phone.builder());
    }

	private static void id(long phoneId) {
		// TODO Auto-generated method stub
		
	}
}
