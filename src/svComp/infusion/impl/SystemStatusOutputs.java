package svComp.infusion.impl;
import svComp.Verifier;

public class SystemStatusOutputs {
  public boolean reservoirEmpty = Verifier.nondetBoolean();
  public int reservoirVolume = Verifier.nondetInt();
  public int volumeInfused = Verifier.nondetInt();
  public int logMessageId = Verifier.nondetInt();
  public boolean inTherapy = Verifier.nondetBoolean();
}
