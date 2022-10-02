package com.userRegistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void checkFirstName() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
       Assert.assertEquals(true, ur.firstName("Sarita"));
    }
    @Test
    public void checkLastName() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		Assert.assertEquals(true, ur.lastName("Shinde"));
    }
    @Test
    public void checkMobileNum() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.phoneNumber("91 9177777777"));
    }
    @Test
    public void checkEmail() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.email("ashhhhbida1991@gami.com"));
    }
    @Test
    public void checkPassWordRule1() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.passwordRule1("ashusoju"));
    }
    @Test
    public void checkPassWordRule2() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.passwordRule1("Ashusoju"));
    }@Test
    public void checkPassWordRule3() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.passwordRule1("Ashusoju9"));
    }
    @Test
    public void checkPassWordRule4() throws UserRegistrationException{
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.passwordRule1("Ashuso9@"));
    }

}
