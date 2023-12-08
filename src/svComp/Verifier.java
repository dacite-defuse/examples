// This file is part of the SV-Benchmarks collection of verification tasks:
// https://github.com/sosy-lab/sv-benchmarks
//
// SPDX-FileCopyrightText: Contributed by Peter Schrammel
// SPDX-FileCopyrightText: 2011-2020 The SV-Benchmarks Community
//
// SPDX-License-Identifier: Apache-2.0

package svComp;

import java.util.Random;

public final class Verifier {
  public static void assume(boolean condition) {
    if (!condition) {
      Runtime.getRuntime().halt(1);
    }
  }

  public static boolean nondetBoolean() {
    return true;// new Random(5).nextBoolean();
  }

  public static byte nondetByte() {
    return (byte) (new Random(5).nextInt());
  }

  public static char nondetChar() {
    return (char) (new Random(5).nextInt());
  }

  public static short nondetShort() {
    return (short) (new Random(100).nextInt(255));
  }

  public static int nondetInt() {
    Random random = new Random();
    return random.nextInt(255);
  }

  public static long nondetLong() {
    return new Random(5).nextLong();
  }

  public static float nondetFloat() {
    return new Random(5).nextFloat();
  }

  public static double nondetDouble() {
    return new Random(5).nextDouble();
  }

  public static String nondetString() {
    Random random = new Random();
    int size = random.nextInt();
    assume(size >= 0);
    byte[] bytes = new byte[size];
    random.nextBytes(bytes);
    return new String(bytes);
  }
}
