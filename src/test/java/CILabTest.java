

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    //This test checks a string with two capitals with lower case inbetween
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("DasKapital");
        assertEquals(false, myString.detectCapitalUse());

    }

    //This test checks a string with no capitals
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("nocapital");
        assertEquals(true, myString.detectCapitalUse());
    }

    //This test checks a string with alternating case
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("mIxEdCaSe");
        assertEquals(false, myString.detectCapitalUse());
    }

    //This test checks a string with only the first two capitalized and the rest lower case
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("FIrsttwo");
        assertEquals(false, myString.detectCapitalUse());
    }

    //This test checks a string with all lower case except for the last two characters
    @Test
    public void detectCapitalUseTest5() {
        myString.setString("lasttWO");
        assertEquals(false, myString.detectCapitalUse());
    }

    //This test checks a string with all lower case except for two capital characters
    //in the middle of the string
    @Test
    public void detectCapitalUseTest6() {
        myString.setString("twoinTHemiddle");
        assertEquals(false, myString.detectCapitalUse());
    }

    //This test checks a string with all capitals
    @Test
    public void detectCapitalUseTest7() {
        myString.setString("LOL");
        assertEquals(true, myString.detectCapitalUse());
    }
    



}
