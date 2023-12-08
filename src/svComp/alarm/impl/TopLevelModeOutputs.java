package svComp.alarm.impl;

import svComp.Verifier;

public class TopLevelModeOutputs {
  public boolean systemOn = Verifier.nondetBoolean();
  public boolean requestConfirmStop = Verifier.nondetBoolean();
  public int logMessageId = Verifier.nondetInt();
}
