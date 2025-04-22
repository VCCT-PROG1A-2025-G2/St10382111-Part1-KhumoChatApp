

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import khumochatapp.ChatUser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author khumo St10382111@vcconnect.edu.za
 */

public class ChatUserTest {


    @Test
    public void testUsernameCorrectFormat() {
        assertTrue(ChatUser.checkUserName("kyl_1"));
    }

    @Test
    public void testUsernameIncorrectFormat() {
        assertFalse(ChatUser.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testPasswordComplexitySuccess() {
        assertTrue(ChatUser.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordComplexityFail() {
        assertFalse(ChatUser.checkPasswordComplexity("password"));
    }

    @Test
    public void testCellPhoneNumberCorrect() {
        assertTrue(ChatUser.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testCellPhoneNumberIncorrect() {
        assertFalse(ChatUser.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testRegisterUserSuccess() {
        ChatUser user = new ChatUser("kyl_1", "Ch&&sec@ke99!", "John", "Doe", "+27838968976");
        assertEquals("Welcome John, Doe it is great to see you.", user.registerUser());
    }

    @Test
    public void testRegisterUserInvalidUsername() {
        ChatUser user = new ChatUser("kyle!!!!!!!", "Ch&&sec@ke99!", "John", "Doe", "+27838968976");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", user.registerUser());
    }

    @Test
    public void testRegisterUserInvalidPassword() {
        ChatUser user = new ChatUser("kyl_1", "password", "John", "Doe", "+27838968976");
        assertEquals("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", user.registerUser());
    }

    @Test
    public void testRegisterUserInvalidCell() {
        ChatUser user = new ChatUser("kyl_1", "Ch&&sec@ke99!", "John", "Doe", "08966553");
        assertEquals("Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.", user.registerUser());
    }

    @Test
    public void testLoginSuccess() {
        ChatUser user = new ChatUser("kyl_1", "Ch&&sec@ke99!", "John", "Doe", "+27838968976");
        user.registerUser();
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        ChatUser user = new ChatUser("kyl_1", "Ch&&sec@ke99!", "John", "Doe", "+27838968976");
        user.registerUser();
        assertFalse(user.loginUser("wrong", "wrong"));
    }
}



