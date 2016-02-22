package junit.passw_validator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SDS on 19.02.2016.
 */
public class PswdUtilTest {
    //проверка на правильность пароля
    @Test
    public void testPasswsCorrect(){
        boolean isCorrect= PswdUtil.validatePassword("test1Pasw");
        Assert.assertEquals(true, isCorrect);
    }
    //проверка на наличия 3 одинаковых символа
    @Test
    public void testThreeSameSymbols() {
        boolean isCorrect= PswdUtil.validatePassword("test111Pasw");
        Assert.assertEquals(false, isCorrect);
    }
    //проверка длины пароля
    @Test
    public void testPasswordsLength(){
        boolean isCorrect=PswdUtil.validatePassword("Test1");
        Assert.assertEquals(false, isCorrect);
    }
    //проверка на содержимое пароля
    @Test
    public void testContentPassword(){
        boolean isCorrect=PswdUtil.validatePassword("TestPassword");
        Assert.assertEquals(false, isCorrect);
    }
    //проверка на остутствие ,!:;
    @Test
    public void testPasswordsSigns(){
        boolean isCorrect=PswdUtil.validatePassword("Test1,Password");
        Assert.assertEquals(false, isCorrect);
    }
    //проверка на пустое значение
    @Test(expected = NullPointerException.class)
    public void testPasswordsNull(){
        boolean isCorrect=PswdUtil.validatePassword(null);
        Assert.assertEquals(false, isCorrect);
    }
}
