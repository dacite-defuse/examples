package svComp.infusion.impl;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class Main {

  @Test
  public void test() {
    InfusionMgrFunctional infusionMgr = new InfusionMgrFunctional();

    B localB = new B();

    DW localDW = new DW();

    infusionMgr.init(localB, localDW);

    TopLevelModeOutputs rtuTlmModeIn = new TopLevelModeOutputs();

    OperatorCommands rtuOpCmdIn = new OperatorCommands();

    PatientInputs rtuPatientIn = new PatientInputs();

    ConfigOutputs rtuConfigIn = new ConfigOutputs();

    AlarmOutputs rtuAlarmIn = new AlarmOutputs();

    SystemStatusOutputs rtuSysStatIn = new SystemStatusOutputs();

    InfusionManagerOutputs rtyImOut = new InfusionManagerOutputs();

    if ((0 <= rtuConfigIn.infusionTotalDuration)
        && (0 <= rtuConfigIn.vtbiTotal)
        && (0 <= rtuConfigIn.flowRateBasal)
        && (0 <= rtuConfigIn.flowRateIntermittentBolus)
        && (0 <= rtuConfigIn.durationIntermittentBolus)
        && (0 <= rtuConfigIn.intervalIntermittentBolus)
        && (0 <= rtuConfigIn.flowRatePatientBolus)
        && (0 <= rtuConfigIn.durationPatientBolus)
        && (0 <= rtuConfigIn.lockoutPeriodPatientBolus)
        && (0 <= rtuConfigIn.maxNumberOfPatientBolus)
        && (0 <= rtuConfigIn.flowRateKVO)
        && (0 <= rtuConfigIn.enteredReservoirVolume)
        && (0 <= rtuConfigIn.configured)
        && (0 <= rtuAlarmIn.highestLevelAlarm)
        && (0 <= rtuSysStatIn.volumeInfused)
        && (rtuConfigIn.infusionTotalDuration <= 255)
        && (rtuConfigIn.vtbiTotal <= 255)
        && (rtuConfigIn.flowRateBasal <= 255)
        && (rtuConfigIn.flowRateIntermittentBolus <= 255)
        && (rtuConfigIn.durationIntermittentBolus <= 255)
        && (rtuConfigIn.intervalIntermittentBolus <= 255)
        && (rtuConfigIn.flowRatePatientBolus <= 255)
        && (rtuConfigIn.durationPatientBolus <= 255)
        && (rtuConfigIn.lockoutPeriodPatientBolus <= 255)
        && (rtuConfigIn.maxNumberOfPatientBolus <= 255)
        && (rtuConfigIn.flowRateKVO <= 255)
        && (rtuConfigIn.enteredReservoirVolume <= 255)
        && (rtuConfigIn.configured <= 255)
        && (rtuAlarmIn.highestLevelAlarm <= 255)
        && (rtuSysStatIn.volumeInfused <= 255)) {

      infusionMgr.infusionMgrFunctional(
          rtuTlmModeIn,
          rtuOpCmdIn,
          rtuPatientIn,
          rtuConfigIn,
          rtuAlarmIn,
          rtuSysStatIn,
          rtyImOut,
          localB,
          localDW);

      boolean checkCondition;
      boolean checkOutput;

      // Prop1: mode_range
      checkCondition =
          ((rtyImOut.currentSystemMode == 0)
              || (rtyImOut.currentSystemMode == 1)
              || (rtyImOut.currentSystemMode == 2)
              || (rtyImOut.currentSystemMode == 3)
              || (rtyImOut.currentSystemMode == 4)
              || (rtyImOut.currentSystemMode == 6)
              || (rtyImOut.currentSystemMode == 7)
              || (rtyImOut.currentSystemMode == 8));
      assert checkCondition;
    }
  }
}
