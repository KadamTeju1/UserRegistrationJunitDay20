
import org.junit.Assert;
import org.junit.Test;


public class ForTestingOfUserRegistration
{
    @Test
    public void testCase()
    {
        Assert.assertEquals("Valid", UserRegistrationTesting.getUserFirstName("Shilpa"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserLastName("Bhonde"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("shilpa123.shilpa@co.co.in"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserPhoneNumber("918888879983"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserPassword("Doremon@1234"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc@yahoo.com"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc-100@yahoo.com"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc.100@yahoo.com"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc111@abc.com"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc-100@abc.net"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc.100@abc.com.au"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc@1.com"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc@gmail.com"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("abc+100@gmail.com"));

    }
}