/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class266;
import eventapi.Event;

public abstract class Class249
implements Event,
Class266 {
    private boolean Field1380;
    private static String Field1381;

    protected Class249() {
    }

    @Override
    public boolean Method2241() {
        return this.Field1380;
    }

    @Override
    public void Method2300(boolean a) {
        this.Field1380 = a;
    }

    public static void Method2301(String string) {
        Field1381 = string;
    }

    public static String Method2302() {
        return Field1381;
    }

    static {
        if (Class249.Method2302() == null) {
            Class249.Method2301("rII19b");
        }
    }
}