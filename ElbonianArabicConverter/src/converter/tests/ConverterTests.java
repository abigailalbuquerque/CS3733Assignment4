package converter.tests;

import converter.ElbonianArabicConverter;
import converter.exceptions.MalformedNumberException;
import converter.exceptions.ValueOutOfBoundsException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for the ElbonianArabicConverter class.
 */
public class ConverterTests {

    //Tests to see that Elbonian Numerals are assigned correctly to their specific Arabic Numerals
    @Test
    public void ElbonianToArabic_M() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("M");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 1000);
    }

    @Test
    public void ElbonianToArabic_N() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("N");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 5000);
    }

    @Test
    public void ElbonianToArabic_n() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("n");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 4000);
    }

    @Test
    public void ElbonianToArabic_C() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("C");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 100);
    }

    @Test
    public void ElbonianToArabic_D() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("D");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 500);
    }

    @Test
    public void ElbonianToArabic_d() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("d");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 400);
    }

    @Test
    public void ElbonianToArabic_X() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("X");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 10);
    }

    @Test
    public void ElbonianToArabic_L() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("L");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 50);
    }

    @Test
    public void ElbonianToArabic_l() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("l");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 40);
    }

    @Test
    public void ElbonianToArabic_I() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("I");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 1);
    }

    @Test
    public void ElbonianToArabic_V() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("V");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 5);
    }

    @Test
    public void ElbonianToArabic_v() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("v");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 4);
    }

    //Elbonian Numeral Rule 1
    @Test
    public void ElbonianToArabic_MMMCCCXXXIII() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("MMMCCCXXXIII");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 3333);
    }

    @Test
    public void greatestToLeast() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("MMMCCCXXXIII");
        boolean testNumber = number.GreatestToLeast("MMMCCCXXXIII");
        assertEquals(testNumber, true);
    }
/*

    @Test
    public void ArabicToElbonianSampleTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("I");
        assertEquals(converter.toArabic(), 1);
    }

    //Test to see if the Arabic integers are assigned to the right Elbonian numerals
    @Test
    public void ArabicToElbonian_1000() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("1000");
        String testnumeral = numeral.toElbonian(1000);
        assertEquals(testnumeral, "N");
    }

    @Test
    public void ArabicToElbonian_5000() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("5000");
        String testnumeral = numeral.toElbonian(5000);
        assertEquals(testnumeral, "M");
    }

    @Test
    public void ArabicToElbonian_4000() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("4000");
        String testnumeral = numeral.toElbonian(4000);
        assertEquals(testnumeral, "n");
    }

    @Test
    public void ArabicToElbonian_100() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("100");
        String testnumeral = numeral.toElbonian(100);
        assertEquals(testnumeral, "C");
    }

    @Test
    public void ArabicToElbonian_500() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("500");
        String testnumeral = numeral.toElbonian(500);
        assertEquals(testnumeral, "D");
    }

    @Test
    public void ArabicToElbonian_400() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("400");
        String testnumeral = numeral.toElbonian(400);
        assertEquals(testnumeral, "d");
    }

    @Test
    public void ArabicToElbonian_10() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("10");
        String testnumeral = numeral.toElbonian(10);
        assertEquals(testnumeral, "X");
    }

    @Test
    public void ArabicToElbonian_50() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("50");
        String testnumeral = numeral.toElbonian(50);
        assertEquals(testnumeral, "L");
    }

    @Test
    public void ArabicToElbonian_40() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("40");
        String testnumeral = numeral.toElbonian(40);
        assertEquals(testnumeral, "l");
    }

    @Test
    public void ArabicToElbonian_1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("1");
        String testnumeral = numeral.toElbonian(1);
        assertEquals(testnumeral, "I");
    }

    @Test
    public void ArabicToElbonian_5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("5");
        String testnumeral = numeral.toElbonian(5);
        assertEquals(testnumeral, "V");
    }

    @Test
    public void ArabicToElbonian_4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("4");
        String testnumeral = numeral.toElbonian(4);
        assertEquals(testnumeral, "v");
    }

    @Test
    public void ArabicToElbonian_3333() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("3333");
        String testnumeral = numeral.toElbonian(3333);
        assertEquals(testnumeral, "MMMCCCXXXIII");
    }













    @Test(expected = MalformedNumberException.class)
    public void malformedNumberTest() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new MalformedNumberException("TEST");

    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void valueOutOfBoundsTest() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new ValueOutOfBoundsException("0");
    }

 */

    // TODO Add more test cases
}
