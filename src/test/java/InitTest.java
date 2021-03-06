import AWS_Shared.AWSSharedUtils;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class InitTest {

    /*
        Run this test to confirm you have changed all of the appropriate settings

        It doesn't check your settings are correct however.
     */

    @Test
    public void checkCredsAreSet() {
        assertNotEquals(AWSSharedUtils.creds.getAWSAccessKeyId(), "XXX");
        assertNotEquals(AWSSharedUtils.creds.getAWSSecretKey(), "XXX");
        assertNotEquals(AWSSharedUtils.recieverEmailAddress, "XXX");
        assertNotNull(AWSSharedUtils.region);

    }
}
