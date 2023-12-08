package svComp.infusion.impl;

import svComp.Verifier;

public class AlarmOutputs {
  public int isAudioDisabled = Verifier.nondetInt();
  public int notificationMessage = Verifier.nondetInt();
  public int audioNotificationCommand = Verifier.nondetInt();
  public int highestLevelAlarm = Verifier.nondetInt();
  public int logMessageId = Verifier.nondetInt();
}
