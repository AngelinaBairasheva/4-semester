package junit.passw_validator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SDS on 19.02.2016.
 */
public class PswdUtilTest {
    //�������� �� ������������ ������
    @Test
    public void testPasswsCorrect(){
        boolean isCorrect= PswdUtil.validatePassword("test1Pasw");
        Assert.assertEquals(true, isCorrect);
    }
    //�������� �� ������� 3 ���������� �������
    @Test
    public void testThreeSameSymbols() {
        boolean isCorrect= PswdUtil.validatePassword("test111Pasw");
        Assert.assertEquals(false, isCorrect);
    }
    //�������� ����� ������
    @Test
    public void testPasswordsLength(){
        boolean isCorrect=PswdUtil.validatePassword("Test1");
        Assert.assertEquals(false, isCorrect);
    }
    //�������� �� ���������� ������
    @Test
    public void testContentPassword(){
        boolean isCorrect=PswdUtil.validatePassword("TestPassword");
        Assert.assertEquals(false, isCorrect);
    }
    //�������� �� ���������� ,!:;
    @Test
    public void testPasswordsSigns(){
        boolean isCorrect=PswdUtil.validatePassword("Test1,Password");
        Assert.assertEquals(false, isCorrect);
    }
    //�������� �� ������ ��������
    @Test(expected = NullPointerException.class)
    public void testPasswordsNull(){
        boolean isCorrect=PswdUtil.validatePassword(null);
        Assert.assertEquals(false, isCorrect);
    }
}
