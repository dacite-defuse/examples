package svComp;
import de.wwu.mulib.Mulib;
import svComp.SatGcd;

/*
 * This class serves as a search region and prepares the input values for the symbolic execution.
 * Mulib can be used via the static methods in the 'de.wwu.mulib.Mulib' class.
 * For instance, Mulib.freeInt() generates a new symbolic int value.
 * Other methods for initializing symbolic primitives include {freeDouble(), freeFloat(), freeLong(), freeShort(), freeByte(), freeChar(), freeBoolean()}.
 * A value can be 'remembered' using Mulib.remember(value, nameToRememberBy). There are also shortcuts such as Mulib.rememberedFreeInt(nameToRememberBy).
 * Remembered values should be called 'argX' or 'argXAfterExec'. They can then be used to assert a state before executing a method or after executing a method, respectively.
 * If an input parameter is named, the 'X' in the name used for remembering should correspond to the parameter number of the method under test.
 * Mulib.freeObject(Class-Object) can be used to either initialize an object the fields of which are lazily initialized to symbolic values or symbolic arrays.
 * Exemplary uses are: 
 *  (1) Mulib.freeObject(A.class), which creates an instance of type A for which all fields are symbolic;
 *  (2) Mulib.freeObject(int[].class) which creates an array for which all elements are symbolic values and for which the length has not yet been determined.
 *  (3) Mulib.freeObject(A[][].class) which creates an array of arrays with elements of type A, all of which are symbolic.
 * Note that no constructor is executed while initializing these values.
 * Via Mulib.assume(constraint) constraints can be added. For instance, given a symbolic int i, Mulib.assume(i < 42) will assure that i never is equal or larger than 42.
 * The value range of primitive values can be set immediately using, e.g., Mulib.freeInt(lowerBound, upperBound).
*/
public class DaciteSymbolicDriverForSatGcdTest {
    public static int dacite_symbolic_driver_gcd() {
        /* Input values */
        int arg0 = Mulib.rememberedFreeInt("arg0");
        int arg1 = Mulib.rememberedFreeInt("arg1");
        int r0 = SatGcd.gcd(arg0,arg1);
        return r0;
    }
}
