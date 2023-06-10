import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        boolean isCapitalUsageCorrect = myString.detectCapitalUse();
        assertTrue(isCapitalUsageCorrect);


    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetCode");
        boolean isCapitalUsageCorrect = myString.detectCapitalUse();
        assertFalse(isCapitalUsageCorrect);
    }


}
