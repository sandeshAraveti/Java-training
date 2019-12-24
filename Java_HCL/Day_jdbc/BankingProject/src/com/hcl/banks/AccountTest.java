package com.hcl.banks;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	static Account account=null;
	@BeforeClass
	public static void setUp(){
		account=new Account();
		
	}

	@Test
	public void testGettersAndSetters(){
		
		account=new Account();
		account.setAccountNo(1);
		account.setFirstName("Sravani");
		account.setLastName("HCL");
		account.setCity("Chennai");
		account.setState("TN");
		account.setAmount(77444);
		account.setCheqFacil("yes");
		account.setAccountType("savings");
		assertEquals(1,account.getAccountNo());
		assertEquals("Sravani", account.getFirstName());
		assertEquals("HCL",account.getLastName());
		assertEquals("Chennai",account.getCity());
		assertEquals("TN",account.getState());
		assertEquals(77444,account.getAmount());
		assertEquals("yes",account.getCheqFacil());
		assertEquals("savings",account.getAccountType());
		

}
	
}
