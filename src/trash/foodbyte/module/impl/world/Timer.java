/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.module.impl.world;

import awsl.Class635;
import eventapi.EventTarget;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.value.FloatValue;

public class Timer
extends Module {
    private boolean Field2273;
    public FloatValue Field2274 = new FloatValue("Timer", "Timer", 1.07, 1.0, 2.0, 0.01, "\u53d8\u901f\u9f7f\u8f6e(Hyp\u6700\u597d\u522b\u5f000.01\u90fd\u53ef\u80fdBanned)");

    public Timer() {
        super("Timer", Category.WORLD);
    }

    @Override
    public String getDescription() {
        return "\u53d8\u901f";
    }

    @EventTarget
    private void Method747(Class635 a) {
        if (!a.Method3587().equals((Object)Timer.mc.thePlayer)) {
            return;
        }
        this.Field2273 = !this.Field2273;
        this.setDisplayTag(this.Field2274.Method2744().toString());
        ReflectionUtils.setTimerSpeed(this.Field2273 ? 1.0f : this.Field2274.Method2744().floatValue());
    }

    @Override
    public void Method279() {
        ReflectionUtils.setTimerSpeed(1.0f);
    }
}