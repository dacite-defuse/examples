package svComp.alarm.impl;
import de.wwu.mulib.Mulib;

/* This class serves as a search region and prepares the input values for the symbolic execution. */
public class DaciteSymbolicDriverForMainTest {
    public static void dacite_symbolic_driver_alarmFunctional() {
        /* Input values */
        svComp.alarm.impl.InfusionManagerOutputs arg1 = new InfusionManagerOutputs();//Mulib.rememberedFreeObject("arg1", svComp.alarm.impl.InfusionManagerOutputs.class);
        svComp.alarm.impl.TopLevelModeOutputs arg2 = new TopLevelModeOutputs();//Mulib.rememberedFreeObject("arg2", svComp.alarm.impl.TopLevelModeOutputs.class);
        svComp.alarm.impl.SystemMonitorOutput arg3 = new SystemMonitorOutput();//Mulib.rememberedFreeObject("arg3", svComp.alarm.impl.SystemMonitorOutput.class);
        svComp.alarm.impl.LogOutput arg4 = new LogOutput();//Mulib.rememberedFreeObject("arg4", svComp.alarm.impl.LogOutput.class);
        svComp.alarm.impl.OperatorCommands arg5 = new OperatorCommands();//Mulib.rememberedFreeObject("arg5", svComp.alarm.impl.OperatorCommands.class);
        svComp.alarm.impl.DrugDatabaseInputs arg6 = new DrugDatabaseInputs();//Mulib.rememberedFreeObject("arg6", svComp.alarm.impl.DrugDatabaseInputs.class);
        svComp.alarm.impl.DeviceSensorInputs arg7 = new DeviceSensorInputs();//Mulib.rememberedFreeObject("arg7", svComp.alarm.impl.DeviceSensorInputs.class);
        svComp.alarm.impl.DeviceConfigurationInputs arg8 = new DeviceConfigurationInputs();//Mulib.rememberedFreeObject("arg8", svComp.alarm.impl.DeviceConfigurationInputs.class);
        svComp.alarm.impl.SystemStatusOutputs arg9 = new SystemStatusOutputs(); //Mulib.rememberedFreeObject("arg9", svComp.alarm.impl.SystemStatusOutputs.class);
        svComp.alarm.impl.ConfigOutputs arg10 = new ConfigOutputs();//Mulib.rememberedFreeObject("arg10", svComp.alarm.impl.ConfigOutputs.class);
        svComp.alarm.impl.AlarmOutputs arg11 = new AlarmOutputs();//Mulib.rememberedFreeObject("arg11", svComp.alarm.impl.AlarmOutputs.class);
        svComp.alarm.impl.B arg12 = new B(); //Mulib.rememberedFreeObject("arg12", svComp.alarm.impl.B.class);
        svComp.alarm.impl.DW arg13 = new DW();//Mulib.rememberedFreeObject("arg13", svComp.alarm.impl.DW.class);
        AlarmFunctional arg0 = new AlarmFunctional();//Mulib.rememberedFreeObject("arg0", AlarmFunctional.class);
        Mulib.remember(arg1, "arg1");
        Mulib.remember(arg2, "arg2");
        Mulib.remember(arg3, "arg3");
        Mulib.remember(arg4, "arg4");
        Mulib.remember(arg5, "arg5");
        Mulib.remember(arg6, "arg6");
        Mulib.remember(arg7, "arg7");
        Mulib.remember(arg8, "arg8");
        Mulib.remember(arg9, "arg9");
        Mulib.remember(arg10, "arg10");
        Mulib.remember(arg11, "arg11");
        Mulib.remember(arg12, "arg12");
        Mulib.remember(arg13, "arg13");
        Mulib.remember(arg0, "arg0");
        arg0.alarmFunctional(arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10,arg11,arg12,arg13);
        Mulib.remember(arg1, "arg1AfterExec");
        Mulib.remember(arg2, "arg2AfterExec");
        Mulib.remember(arg3, "arg3AfterExec");
        Mulib.remember(arg4, "arg4AfterExec");
        Mulib.remember(arg5, "arg5AfterExec");
        Mulib.remember(arg6, "arg6AfterExec");
        Mulib.remember(arg7, "arg7AfterExec");
        Mulib.remember(arg8, "arg8AfterExec");
        Mulib.remember(arg9, "arg9AfterExec");
        Mulib.remember(arg10, "arg10AfterExec");
        Mulib.remember(arg11, "arg11AfterExec");
        Mulib.remember(arg12, "arg12AfterExec");
        Mulib.remember(arg13, "arg13AfterExec");
        Mulib.remember(arg0, "arg0AfterExec");
    }
    public static void dacite_symbolic_driver_alarmFunctionalInit() {
        /* Input values */
        svComp.alarm.impl.B arg1 = new B();//Mulib.rememberedFreeObject("arg1", svComp.alarm.impl.B.class);
        svComp.alarm.impl.DW arg2 = new DW();//Mulib.rememberedFreeObject("arg2", svComp.alarm.impl.DW.class);
        AlarmFunctional arg0 = new AlarmFunctional();//Mulib.rememberedFreeObject("arg0", AlarmFunctional.class);
        Mulib.remember(arg1, "arg1");
        Mulib.remember(arg2, "arg2");
        Mulib.remember(arg0, "arg0");
        arg0.alarmFunctionalInit(arg1,arg2);
        Mulib.remember(arg1, "arg1AfterExec");
        Mulib.remember(arg2, "arg2AfterExec");
        Mulib.remember(arg0, "arg0AfterExec");
    }
}
