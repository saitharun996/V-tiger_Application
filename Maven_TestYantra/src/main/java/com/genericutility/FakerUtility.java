package com.genericutility;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class FakerUtility {
	Faker faker = new Faker();
	public void fakeAddressCity() 
	{
		
		String address=faker.address().city();
		
		System.out.println(address);
		
	}
	
	public void fakeName()
	{
		Name name = faker.name();
		
		System.out.println(name);
		
	}
	
	public void fakerCompanyName()
	{
		String company = faker.company().name();
		
		System.out.println(company);
	}

}
