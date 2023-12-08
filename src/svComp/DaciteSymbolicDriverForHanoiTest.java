package svComp;
import de.wwu.mulib.Mulib;
import svComp.Hanoi;

/* This class serves as a search region and prepares the input values for the symbolic execution. */
public class DaciteSymbolicDriverForHanoiTest {
    public static void dacite_symbolic_driver_applyHanoi() {
        /* Input values */
        int arg1 = Mulib.rememberedFreeInt("arg1");
        int arg2 = Mulib.rememberedFreeInt("arg2");
        int arg3 = Mulib.rememberedFreeInt("arg3");
        int arg4 = Mulib.rememberedFreeInt("arg4");
        Hanoi arg0 = Mulib.rememberedFreeObject("arg0", Hanoi.class);
        arg0.applyHanoi(arg1,arg2,arg3,arg4);
        Mulib.remember(arg0, "arg0AfterExec");
    }
    public static int dacite_symbolic_driver_hanoi() {
        /* Input values */
        int arg1 = Mulib.rememberedFreeInt("arg1");
        Hanoi arg0 = Mulib.rememberedFreeObject("arg0", Hanoi.class);
        int r0 = arg0.hanoi(arg1);
        Mulib.remember(arg0, "arg0AfterExec");
        return r0;
    }
}
