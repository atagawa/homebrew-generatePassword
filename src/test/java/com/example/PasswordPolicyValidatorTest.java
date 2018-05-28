package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordPolicyValidatorTest {

    @Test
    public void constractorTest() {
        PasswordPolicyValidator passwordPolicyValidator = new PasswordPolicyValidator();
        assertNotNull(passwordPolicyValidator.getErrors());
    }

    @Test
    public void validateFalseTest() {
        PasswordPolicyValidator passwordPolicyValidator = new PasswordPolicyValidator();
        boolean haserror = passwordPolicyValidator.validate(new Policy());
        assertFalse(haserror);
    }

    @Test
    public void validateTrueMinTest() {
        PasswordPolicyValidator passwordPolicyValidator = new PasswordPolicyValidator();
        boolean haserror = passwordPolicyValidator.validate(new Policy(0, -1, true));
        assertTrue(haserror);
    }

    @Test
    public void validateTrueMaxTest() {
        PasswordPolicyValidator passwordPolicyValidator = new PasswordPolicyValidator();
        boolean haserror = passwordPolicyValidator.validate(new Policy(80, 6, true));
        assertTrue(haserror);
    }

}
