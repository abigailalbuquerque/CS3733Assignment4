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
    public void ArabicToElbonian_2120() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("2120");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "MMCXX");
    }

    @Test
    public void ArabicToElbonian_312() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("312");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "CCCXII");
    }

    @Test
    public void ElbonianToArabic_CCCXII() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("CCCXII");
        int testnumeral = numeral.toArabic();
        assertEquals(testnumeral, 312);
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
    public void ElbonianToArabic_NMDCVI() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("NMDCVI");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 6606);
    }

    @Test
    public void ElbonianToArabic_MV() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("MV");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 1005);
    }

    @Test
    public void ElbonianToArabic_9999() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("NnDdLlVv");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 9999);
    }

    @Test
    public void ArabicToElbonian_9999() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("9999");
        String testNumber = number.toElbonian();
        assertEquals(testNumber, "NnDdLlVv");
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

    @Test
    public void ArabicToElbonianSampleTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("I");
        assertEquals(converter.toArabic(), 1);
    }

    //Test to see if the Arabic integers are assigned to the right Elbonian numerals
    @Test
    public void ArabicToElbonian_1000() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("1000");
        String testNumeral = numeral.toElbonian();
        assertEquals(testNumeral, "M");
    }

    @Test
    public void ArabicToElbonian_5000() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("5000");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "N");
    }

    @Test
    public void ArabicToElbonian_4000() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("4000");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "n");
    }

    @Test
    public void ArabicToElbonian_100() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("100");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "C");
    }

    @Test
    public void ArabicToElbonian_500() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("500");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "D");
    }

    @Test
    public void ArabicToElbonian_400() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("400");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "d");
    }

    @Test
    public void ArabicToElbonian_10() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("10");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "X");
    }

    @Test
    public void ArabicToElbonian_50() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("50");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "L");
    }

    @Test
    public void ArabicToElbonian_40() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("40");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "l");
    }

    @Test
    public void ArabicToElbonian_1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("1");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "I");
    }

    @Test
    public void ArabicToElbonian_5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("5");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "V");
    }

    @Test
    public void ArabicToElbonian_4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("4");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "v");
    }

    @Test
    public void ArabicToElbonian_3333() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("3333");
        String testnumeral = numeral.toElbonian();
        assertEquals(testnumeral, "MMMCCCXXXIII");
    }

    @Test
    public void validSpacesTest1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter(" 1000");
        String testNumeral = numeral.toElbonian();
        assertEquals(testNumeral, "M");
    }

    @Test
    public void validSpacesTest2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter(" 1000 ");
        String testNumeral = numeral.toElbonian();
        assertEquals(testNumeral, "M");
    }

    @Test
    public void validSpacesTest3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter numeral = new ElbonianArabicConverter("1000 ");
        String testNumeral = numeral.toElbonian();
        assertEquals(testNumeral, "M");
    }

    @Test
    public void validSpacesTest4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter(" M");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 1000);
    }

    @Test
    public void validSpacesTest5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter("M ");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 1000);
    }

    @Test
    public void validSpacesTest6() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter number = new ElbonianArabicConverter(" M ");
        int testNumber = number.toArabic();
        assertEquals(testNumber, 1000);
    }



    //@Test(expected = MalformedNumberException.class)
    //public void malformedNumberTest() throws MalformedNumberException, ValueOutOfBoundsException {
    //  throw new MalformedNumberException("TEST");
    //}

    /**
     * test cases for spaces between, after, and before the number string
     * @throws MalformedNumberException
     * @throws ValueOutOfBoundsException
     */
    @Test(expected = MalformedNumberException.class)
    public void spacesTest1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" 2 0 ");
    }

    @Test(expected = MalformedNumberException.class)
    public void spacesTest3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" MIII d");
    }

    @Test(expected = MalformedNumberException.class)
    public void Rule1_I1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" MIIII");
    }

    @Test(expected = MalformedNumberException.class)
    public void Rule1_M() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" MMMMI");
    }

    @Test(expected = MalformedNumberException.class)
    public void Rule7_M() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" MMIM");
    }

    @Test(expected = MalformedNumberException.class)
    public void Rule1_I2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" MIIII");
    }

    @Test(expected = MalformedNumberException.class)
    public void spacesTest4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" XXXw");
    }

    /**
     * Test case for MalformedNumberException
     * @throws MalformedNumberException
     * @throws ValueOutOfBoundsException
     */

    @Test(expected = MalformedNumberException.class)
    public void ArabicElbonianTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" MMM9");
    }

    @Test(expected = MalformedNumberException.class)
    public void ElbonianArabicTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter(" 786X");
    }

    //Elbonian numeral rule exceptions
    //can have no more than 3 of the same letter
    @Test(expected = MalformedNumberException.class)
    public void MMMMTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("MMMM");
    }

    @Test(expected = MalformedNumberException.class)
    public void CCCCTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("CCCC");
    }

    @Test(expected = MalformedNumberException.class)
    public void XXXXTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("XXXX");
    }

    @Test(expected = MalformedNumberException.class)
    public void IIIITest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("IIIdI");
    }

    //these letters can not appear together
    @Test(expected = MalformedNumberException.class)
    public void cDTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("cD");
    }

    @Test(expected = MalformedNumberException.class)
    public void lXTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("lX");
    }

    @Test(expected = MalformedNumberException.class)
    public void vITest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("vI");
    }

    @Test(expected = MalformedNumberException.class)
    public void nMTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("nM");
    }

    //letters that can only appear once
    @Test(expected = MalformedNumberException.class)
    public void nTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("nnnn");
    }

    @Test(expected = MalformedNumberException.class)
    public void NTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("NN");
    }

    @Test(expected = MalformedNumberException.class)
    public void DTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("DDD");
    }

    @Test(expected = MalformedNumberException.class)
    public void dTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("dddddddd");
    }

    @Test(expected = MalformedNumberException.class)
    public void LTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("LL");
    }

    @Test(expected = MalformedNumberException.class)
    public void lTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("lll");
    }

    @Test(expected = MalformedNumberException.class)
    public void VTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("VV");
    }

    @Test(expected = MalformedNumberException.class)
    public void vTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("vvv");
    }

    //out of order
    @Test(expected = MalformedNumberException.class)
    public void wrongOrder1Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("lDCM");
    }

    @Test(expected = MalformedNumberException.class)
    public void wrongOrder2Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("MMLC");
    }

    //bad letter
    @Test(expected = MalformedNumberException.class)
    public void badLetterTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("lkDfg");
    }

    //decimal test
    @Test(expected = MalformedNumberException.class)
    public void decimal1Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("5.6");
    }

    @Test(expected = MalformedNumberException.class)
    public void decimal2Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("3678.87");
    }

    //test cases for ValueOutOfBoundsException
    @Test(expected = ValueOutOfBoundsException.class)
    public void outOfBounds1Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("0");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void outOfBounds2Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("10000");
    }


    //negative tests
    @Test(expected = ValueOutOfBoundsException.class)
    public void outOfBounds3Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("-8");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void outOfBounds4Test() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("-40000");
    }
}
