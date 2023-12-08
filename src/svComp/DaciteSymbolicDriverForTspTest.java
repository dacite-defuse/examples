package svComp;
import de.wwu.mulib.Mulib;
import svComp.TSP;

/* This class serves as a search region and prepares the input values for the symbolic execution. */
public class DaciteSymbolicDriverForTspTest {
    public static int dacite_symbolic_driver_solve() {
        /* Input values */
        int N = Mulib.freeInt();
        int[][] D = Mulib.freeObject(int[][].class);
        Mulib.assume(D.length <= 4);
        // Assure invariants hold by using provided constructor:
        TSP arg0 = new TSP(N, D);
        Mulib.remember(arg0, "arg0");
        int r0 = arg0.solve();
        Mulib.remember(arg0, "arg0AfterExec");
        return r0;
    }
}
