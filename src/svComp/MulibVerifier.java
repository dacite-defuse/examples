// This file is part of the SV-Benchmarks collection of verification tasks:
// https://github.com/sosy-lab/sv-benchmarks
//
// SPDX-FileCopyrightText: Contributed by Peter Schrammel
// SPDX-FileCopyrightText: 2011-2020 The SV-Benchmarks Community
//
// SPDX-License-Identifier: Apache-2.0

package svComp;

import de.wwu.mulib.Mulib;

import java.util.Random;

public final class MulibVerifier {
  public static void assume(boolean condition) {
    if (!condition) {
      Runtime.getRuntime().halt(1);
    }
  }

  public static boolean nondetBoolean() {
    return Mulib.freeBoolean();
  }

  public static byte nondetByte() {
    return (byte) Mulib.freeByte();
  }

  public static char nondetChar() {
    return (char) Mulib.freeChar();
  }

  public static short nondetShort() {
    return Mulib.freeShort();
  }

  public static int nondetInt() {
    return Mulib.freeInt();
  }

  public static long nondetLong() {
    return Mulib.freeLong();
  }

  public static float nondetFloat() {
    return Mulib.freeFloat();
  }

  public static double nondetDouble() {
    return Mulib.freeDouble();
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
