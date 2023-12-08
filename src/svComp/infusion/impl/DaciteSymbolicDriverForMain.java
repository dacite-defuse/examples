package svComp.infusion.impl;
import de.wwu.mulib.Mulib;

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
public class DaciteSymbolicDriverForMain {
    public static void dacite_symbolic_driver_init() {
        /* Input values */
        svComp.infusion.impl.B arg1 = Mulib.rememberedFreeObject("arg1", svComp.infusion.impl.B.class);
        svComp.infusion.impl.DW arg2 = Mulib.rememberedFreeObject("arg2", svComp.infusion.impl.DW.class);
        InfusionMgrFunctional arg0 = Mulib.rememberedFreeObject("arg0", InfusionMgrFunctional.class);
        arg0.init(arg1,arg2);
        Mulib.remember(arg1, "arg1AfterExec");
        Mulib.remember(arg2, "arg2AfterExec");
        Mulib.remember(arg0, "arg0AfterExec");
    }
    public static void dacite_symbolic_driver_infusionMgrFunctional() {
        /* Input values */
        svComp.infusion.impl.TopLevelModeOutputs arg1 = Mulib.rememberedFreeObject("arg1", svComp.infusion.impl.TopLevelModeOutputs.class);
        svComp.infusion.impl.OperatorCommands arg2 = Mulib.rememberedFreeObject("arg2", svComp.infusion.impl.OperatorCommands.class);
        svComp.infusion.impl.PatientInputs arg3 = Mulib.rememberedFreeObject("arg3", svComp.infusion.impl.PatientInputs.class);
        svComp.infusion.impl.ConfigOutputs arg4 = Mulib.rememberedFreeObject("arg4", svComp.infusion.impl.ConfigOutputs.class);
        svComp.infusion.impl.AlarmOutputs arg5 = Mulib.rememberedFreeObject("arg5", svComp.infusion.impl.AlarmOutputs.class);
        svComp.infusion.impl.SystemStatusOutputs arg6 = Mulib.rememberedFreeObject("arg6", svComp.infusion.impl.SystemStatusOutputs.class);
        svComp.infusion.impl.InfusionManagerOutputs arg7 = Mulib.rememberedFreeObject("arg7", svComp.infusion.impl.InfusionManagerOutputs.class);
        svComp.infusion.impl.B arg8 = Mulib.rememberedFreeObject("arg8", svComp.infusion.impl.B.class);
        svComp.infusion.impl.DW arg9 = Mulib.rememberedFreeObject("arg9", svComp.infusion.impl.DW.class);
        InfusionMgrFunctional arg0 = Mulib.rememberedFreeObject("arg0", InfusionMgrFunctional.class);
        arg0.infusionMgrFunctional(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9);
        Mulib.remember(arg1, "arg1AfterExec");
        Mulib.remember(arg2, "arg2AfterExec");
        Mulib.remember(arg3, "arg3AfterExec");
        Mulib.remember(arg4, "arg4AfterExec");
        Mulib.remember(arg5, "arg5AfterExec");
        Mulib.remember(arg6, "arg6AfterExec");
        Mulib.remember(arg7, "arg7AfterExec");
        Mulib.remember(arg8, "arg8AfterExec");
        Mulib.remember(arg9, "arg9AfterExec");
        Mulib.remember(arg0, "arg0AfterExec");
    }
}
