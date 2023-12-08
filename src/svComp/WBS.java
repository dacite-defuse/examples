package svComp;

// HW: Taken from https://github.com/SymbolicPathFinder/jpf-symbc/blob/master/src/examples/WBS.java and https://github.com/sosy-lab/sv-benchmarks/blob/master/java/java-ranger-regression/WBS/impl/WBS.java

/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * Symbolic Pathfinder (jpf-symbc) is licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// HW: The class has been renamed and altered to fit Mulib.
public class WBS {

    // Internal state
    private int WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE = 0;
    private int WBS_Node_WBS_BSCU_rlt_PRE1 = 0;
    private int WBS_Node_WBS_rlt_PRE2 = 100;

    // Outputs
    public int Nor_Pressure = 0;
    public int Alt_Pressure = 0;
    public int Sys_Mode = 0;

    public void update(int PedalPos, boolean AutoBrake, boolean Skid) {
        int WBS_Node_WBS_AS_MeterValve_Switch; // 4
        int WBS_Node_WBS_AccumulatorValve_Switch; // 5
        int WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch; // 6
        boolean WBS_Node_WBS_BSCU_Command_Is_Normal_Relational_Operator; // 7
        int WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1; // 8
        int WBS_Node_WBS_BSCU_Command_Switch; // 9
        boolean WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6; // 10
        int WBS_Node_WBS_BSCU_SystemModeSelCmd_Unit_Delay; // 11
        int WBS_Node_WBS_BSCU_Switch2; // 12
        int WBS_Node_WBS_BSCU_Switch3; // 13
        int WBS_Node_WBS_BSCU_Unit_Delay1; // 14
        int WBS_Node_WBS_Green_Pump_IsolationValve_Switch; // 15
        int WBS_Node_WBS_SelectorValve_Switch; // 16
        int WBS_Node_WBS_SelectorValve_Switch1; // 17
        int WBS_Node_WBS_Unit_Delay2; // 18

        WBS_Node_WBS_Unit_Delay2 = WBS_Node_WBS_rlt_PRE2;
        WBS_Node_WBS_BSCU_Unit_Delay1 = WBS_Node_WBS_BSCU_rlt_PRE1;
        WBS_Node_WBS_BSCU_SystemModeSelCmd_Unit_Delay = WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE;

        WBS_Node_WBS_BSCU_Command_Is_Normal_Relational_Operator =
                (WBS_Node_WBS_BSCU_SystemModeSelCmd_Unit_Delay == 0);

        if ((PedalPos == 0)) {
            WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 = 0;
        } else {
            if ((PedalPos == 1)) {
                WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 = 1;
            } else {
                if ((PedalPos == 2)) {
                    WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 = 2;
                } else {
                    if ((PedalPos == 3)) {
                        WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 = 3;
                    } else {
                        if ((PedalPos == 4)) {
                            WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 = 4;
                        } else {
                            WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 = 0;
                        }
                    }
                }
            }
        }

        if ((AutoBrake && WBS_Node_WBS_BSCU_Command_Is_Normal_Relational_Operator)) {
            WBS_Node_WBS_BSCU_Command_Switch = 1;
        } else {
            WBS_Node_WBS_BSCU_Command_Switch = 0;
        }

        WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6 =
                ((((!(WBS_Node_WBS_BSCU_Unit_Delay1 == 0)) && (WBS_Node_WBS_Unit_Delay2 <= 0))
                        && WBS_Node_WBS_BSCU_Command_Is_Normal_Relational_Operator)
                        || (!WBS_Node_WBS_BSCU_Command_Is_Normal_Relational_Operator));

        if (WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6) {
            if (Skid) WBS_Node_WBS_BSCU_Switch3 = 0;
            else WBS_Node_WBS_BSCU_Switch3 = 4;
        } else {
            WBS_Node_WBS_BSCU_Switch3 = 4;
        }

        if (WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6) {
            WBS_Node_WBS_Green_Pump_IsolationValve_Switch = 0;
        } else {
            WBS_Node_WBS_Green_Pump_IsolationValve_Switch = 5;
        }

        if ((WBS_Node_WBS_Green_Pump_IsolationValve_Switch >= 1)) {
            WBS_Node_WBS_SelectorValve_Switch1 = 0;
        } else {
            WBS_Node_WBS_SelectorValve_Switch1 = 5;
        }

        if ((!WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6)) {
            WBS_Node_WBS_AccumulatorValve_Switch = 0;
        } else {
            if ((WBS_Node_WBS_SelectorValve_Switch1 >= 1)) {
                WBS_Node_WBS_AccumulatorValve_Switch = WBS_Node_WBS_SelectorValve_Switch1;
            } else {
                WBS_Node_WBS_AccumulatorValve_Switch = 5;
            }
        }

        if ((WBS_Node_WBS_BSCU_Switch3 == 0)) {
            WBS_Node_WBS_AS_MeterValve_Switch = 0;
        } else {
            if ((WBS_Node_WBS_BSCU_Switch3 == 1)) {
                WBS_Node_WBS_AS_MeterValve_Switch = (WBS_Node_WBS_AccumulatorValve_Switch / 4);
            } else {
                if ((WBS_Node_WBS_BSCU_Switch3 == 2)) {
                    WBS_Node_WBS_AS_MeterValve_Switch = (WBS_Node_WBS_AccumulatorValve_Switch / 2);
                } else {
                    if ((WBS_Node_WBS_BSCU_Switch3 == 3)) {
                        WBS_Node_WBS_AS_MeterValve_Switch = ((WBS_Node_WBS_AccumulatorValve_Switch / 4) * 3);
                    } else {
                        if ((WBS_Node_WBS_BSCU_Switch3 == 4)) {
                            WBS_Node_WBS_AS_MeterValve_Switch = WBS_Node_WBS_AccumulatorValve_Switch;
                        } else {
                            WBS_Node_WBS_AS_MeterValve_Switch = 0;
                        }
                    }
                }
            }
        }

        if (Skid) {
            WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch = 0;
        } else {
            WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch =
                    (WBS_Node_WBS_BSCU_Command_Switch + WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1);
        }

        if (WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6) {
            Sys_Mode = 1;
        } else {
            Sys_Mode = 0;
        }

        if (WBS_Node_WBS_BSCU_SystemModeSelCmd_Logical_Operator6) {
            WBS_Node_WBS_BSCU_Switch2 = 0;
        } else {
            if (((WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch >= 0)
                    && (WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch < 1))) {
                WBS_Node_WBS_BSCU_Switch2 = 0;
            } else {
                if (((WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch >= 1)
                        && (WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch < 2))) {
                    WBS_Node_WBS_BSCU_Switch2 = 1;
                } else {
                    if (((WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch >= 2)
                            && (WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch < 3))) {
                        WBS_Node_WBS_BSCU_Switch2 = 2;
                    } else {
                        if (((WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch >= 3)
                                && (WBS_Node_WBS_BSCU_Command_AntiSkidCommand_Normal_Switch < 4))) {
                            WBS_Node_WBS_BSCU_Switch2 = 3;
                        } else {
                            WBS_Node_WBS_BSCU_Switch2 = 4;
                        }
                    }
                }
            }
        }

        if ((WBS_Node_WBS_Green_Pump_IsolationValve_Switch >= 1)) {
            WBS_Node_WBS_SelectorValve_Switch = WBS_Node_WBS_Green_Pump_IsolationValve_Switch;
        } else {
            WBS_Node_WBS_SelectorValve_Switch = 0;
        }

        if ((WBS_Node_WBS_BSCU_Switch2 == 0)) {
            Nor_Pressure = 0;
        } else {
            if ((WBS_Node_WBS_BSCU_Switch2 == 1)) {
                Nor_Pressure = (WBS_Node_WBS_SelectorValve_Switch / 4);
            } else {
                if ((WBS_Node_WBS_BSCU_Switch2 == 2)) {
                    Nor_Pressure = (WBS_Node_WBS_SelectorValve_Switch / 2);
                } else {
                    if ((WBS_Node_WBS_BSCU_Switch2 == 3)) {
                        Nor_Pressure = ((WBS_Node_WBS_SelectorValve_Switch / 4) * 3);
                    } else {
                        if ((WBS_Node_WBS_BSCU_Switch2 == 4)) {
                            Nor_Pressure = WBS_Node_WBS_SelectorValve_Switch;
                        } else {
                            Nor_Pressure = 0;
                        }
                    }
                }
            }
        }

        if ((WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 == 0)) {
            Alt_Pressure = 0;
        } else {
            if ((WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 == 1)) {
                Alt_Pressure = (WBS_Node_WBS_AS_MeterValve_Switch / 4);
            } else {
                if ((WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 == 2)) {
                    Alt_Pressure = (WBS_Node_WBS_AS_MeterValve_Switch / 2);
                } else {
                    if ((WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 == 3)) {
                        Alt_Pressure = ((WBS_Node_WBS_AS_MeterValve_Switch / 4) * 3);
                    } else {
                        if ((WBS_Node_WBS_BSCU_Command_PedalCommand_Switch1 == 4)) {
                            Alt_Pressure = WBS_Node_WBS_AS_MeterValve_Switch;
                        } else {
                            Alt_Pressure = 0;
                        }
                    }
                }
            }
        }

        WBS_Node_WBS_rlt_PRE2 = Nor_Pressure;

        WBS_Node_WBS_BSCU_rlt_PRE1 = WBS_Node_WBS_BSCU_Switch2;

        WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE = Sys_Mode;
    }

    public int getWBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE() {
        return WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE;
    }

    public void setWBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE(int WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE) {
        this.WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE = WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE;
    }

    public int getWBS_Node_WBS_BSCU_rlt_PRE1() {
        return WBS_Node_WBS_BSCU_rlt_PRE1;
    }

    public void setWBS_Node_WBS_BSCU_rlt_PRE1(int WBS_Node_WBS_BSCU_rlt_PRE1) {
        this.WBS_Node_WBS_BSCU_rlt_PRE1 = WBS_Node_WBS_BSCU_rlt_PRE1;
    }

    public int getWBS_Node_WBS_rlt_PRE2() {
        return WBS_Node_WBS_rlt_PRE2;
    }

    public void setWBS_Node_WBS_rlt_PRE2(int WBS_Node_WBS_rlt_PRE2) {
        this.WBS_Node_WBS_rlt_PRE2 = WBS_Node_WBS_rlt_PRE2;
    }

    public int getNor_Pressure() {
        return Nor_Pressure;
    }

    public void setNor_Pressure(int nor_Pressure) {
        Nor_Pressure = nor_Pressure;
    }

    public int getAlt_Pressure() {
        return Alt_Pressure;
    }

    public void setAlt_Pressure(int alt_Pressure) {
        Alt_Pressure = alt_Pressure;
    }

    public int getSys_Mode() {
        return Sys_Mode;
    }

    public void setSys_Mode(int sys_Mode) {
        Sys_Mode = sys_Mode;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof WBS)){
            return false;
        } else {
            WBS wbs = (WBS) obj;
            return wbs.Nor_Pressure == this.Nor_Pressure && wbs.Alt_Pressure == this.Alt_Pressure &&
                    wbs.WBS_Node_WBS_BSCU_rlt_PRE1 == this.WBS_Node_WBS_BSCU_rlt_PRE1 && wbs.Sys_Mode == this.Sys_Mode &&
                    wbs.WBS_Node_WBS_rlt_PRE2 == this.WBS_Node_WBS_rlt_PRE2 && wbs.WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE
                    == this.WBS_Node_WBS_BSCU_SystemModeSelCmd_rlt_PRE;
        }
    }
}
