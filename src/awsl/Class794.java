/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package awsl;

import awsl.Class104;
import awsl.Class126;
import awsl.Class15;
import awsl.Class267;
import java.util.Iterator;
import java.util.List;

public class Class794 {
    public Class104 Field3559;
    public Class104 Field3560;
    public Class104 Field3561;
    public String Field3562;
    public List Field3563;
    public List Field3564;

    public Class794(Class104 a, Class104 a2, Class104 a3, String a4) {
        this.Field3559 = a;
        this.Field3560 = a2;
        this.Field3561 = a3;
        this.Field3562 = a4;
    }

    public void Method795(int a) {
        Class126 a2;
        Iterator iterator;
        int a3 = 0x42000000 | a << 8;
        int a4 = Class15.Method1984();
        if (this.Field3563 != null && (iterator = this.Field3563.Method1383()).Method932()) {
            a2 = (Class126)iterator.Method933();
            a2.Field975 = a3;
        }
        if (this.Field3564 != null && (iterator = this.Field3564.Method1383()).Method932()) {
            a2 = (Class126)iterator.Method933();
            a2.Field975 = a3;
        }
    }

    public void Method796(Class267 a) {
        Class126 a2;
        int a3 = Class15.Method1984();
        a.Method1960(this.Field3559.Method303(), this.Field3560.Method303(), this.Field3561 == null ? null : this.Field3561.Method303(), this.Field3562);
        int a4 = this.Field3563 == null ? 0 : this.Field3563.Method1799();
        int a5 = 0;
        if (a5 < a4) {
            a2 = (Class126)this.Field3563.get(a5);
            a2.Method646(a.Method1974(a2.Field975, a2.Field976, a2.Field973, true));
            ++a5;
        }
        if ((a5 = 0) < (a4 = this.Field3564 == null ? 0 : this.Field3564.Method1799())) {
            a2 = (Class126)this.Field3564.get(a5);
            a2.Method646(a.Method1974(a2.Field975, a2.Field976, a2.Field973, false));
            ++a5;
        }
    }
}