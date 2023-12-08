package svComp;
import de.wwu.mulib.Mulib;

/* This class serves as a search region and prepares the input values for the symbolic execution. */
public class DaciteSymbolicDriverForWbsTest {
    public static void dacite_symbolic_driver_update() {
        /* Input values */
        int arg1 = Mulib.rememberedFreeInt("arg1");
        boolean arg2 = Mulib.rememberedFreeBoolean("arg2");
        boolean arg3 = Mulib.rememberedFreeBoolean("arg3");
        // Assure invariants hold by using the constructor:
        WBS arg0 = new WBS();
        Mulib.remember(arg0, "arg0");
        arg0.update(arg1,arg2,arg3);
        Mulib.remember(arg0, "arg0AfterExec");
    }
}
