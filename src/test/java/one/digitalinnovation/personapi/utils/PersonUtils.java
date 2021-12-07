package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.entities.Phone;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class PersonUtils {

    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Peleias";
    private static final String CPF_NUMBER = "369.333.878-79";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return (PersonDTO) ((Object) PersonDTO.builder()); 
    }

   
	private static String FIRST_NAME() {
	
		return null;
	}

	
	private static void build() {
		
	}

	
	private static void phones1(Iterable<Object> list) {
		
	}

	
	private static void birthDate(String string) {
		
	}

	
	private static void cpf(String cpfNumber) {
		
	}

	
	private static void lastName(String lastName) {
		
	}

	
	private static void first(Object name) {
		
	}

	
	private static Object Name(String firstName) {
		
		return null;
	}

	public static Person createFakeEntity() {
        return (Person) (( (Object) Person.builder));
    }

	private static void phones1(List<Phone> singletonList) {
		
	}

	private static void phones(List<Phone> singletonList) {
		
	}

	private static void birthDate(LocalDate birthDate) { 
		
	}

	private static void firstName(String firstName) {
		
	}

	private static void id(long personId) {
		
	}


}


