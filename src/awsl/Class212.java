/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ConcurrentModificationException
 *  java.util.List
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.entity.Entity
 *  net.minecraft.inventory.Slot
 *  net.minecraft.util.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class681;
import awsl.Class91;
import java.awt.Color;
import java.util.ConcurrentModificationException;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.Slot;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.utils.Wrapper;

public class Class212 {
    static Minecraft Field1191 = Wrapper.INSTANCE.Method2868();
    FontRenderer Field1192 = Wrapper.INSTANCE.Method2873();
    private static Frustum Field1193 = new Frustum();
    private static String Field1194;

    public static void Method2538(float a, float a2, float a3, Runnable a4) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)a, (float)a2, (float)0.0f);
        GL11.glScalef((float)a3, (float)a3, (float)1.0f);
        GL11.glTranslatef((float)(-a), (float)(-a2), (float)0.0f);
        a4.Method1339();
        GL11.glPopMatrix();
    }

    public static void Method2539(float a, float a2, float a3) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)a, (float)a2, (float)0.0f);
        GlStateManager.scale((float)a3, (float)a3, (float)1.0f);
        GlStateManager.translate((float)(-a), (float)(-a2), (float)0.0f);
    }

    public static void Method2540() {
        GlStateManager.popMatrix();
    }

    public static void Method2541(int a, float a2) {
        float a3 = (float)(a >> 16 & 0xFF) / 255.0f;
        float a4 = (float)(a >> 8 & 0xFF) / 255.0f;
        float a5 = (float)(a & 0xFF) / 255.0f;
        GlStateManager.color((float)a3, (float)a4, (float)a5, (float)a2);
    }

    public static void Method2542(int a) {
        Class212.Method2541(a, (float)(a >> 24 & 0xFF) / 255.0f);
    }

    public static void Method2543(Color a) {
        a = Color.white;
        Class212.Method2544((float)a.getRed() / 255.0f, (float)a.getGreen() / 255.0f, (float)a.getBlue() / 255.0f, (float)a.getAlpha() / 255.0f);
    }

    public static void Method2544(double a, double a2, double a3, double a4) {
        GL11.glColor4d((double)a, (double)a2, (double)a3, (double)a4);
    }

    public static boolean Method2545(float a, float a2, float a3, float a4, float a5, float a6) {
        return a >= a3 && a2 >= a4 && a < a3 + a5 && a2 < a4 + a6;
    }

    /*
     * Exception decompiling
     */
    public static void Method2546(List a) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at cuchaz.enigma.source.cfr.CfrSource.ensureDecompiled(CfrSource.java:81)
         *     at cuchaz.enigma.source.cfr.CfrSource.asString(CfrSource.java:50)
         *     at cuchaz.enigma.EnigmaProject$JarExport.decompileClass(EnigmaProject.java:298)
         *     at cuchaz.enigma.EnigmaProject$JarExport.lambda$decompileStream$1(EnigmaProject.java:274)
         *     at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
         *     at java.base/java.util.AbstractList$RandomAccessSpliterator.forEachRemaining(AbstractList.java:720)
         *     at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
         *     at java.base/java.util.stream.ForEachOps$ForEachTask.compute(ForEachOps.java:290)
         *     at java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:754)
         *     at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
         *     at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
         *     at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
         *     at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
         *     at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void Method2547(int a, int a2, double a3, int a4) {
        float a5 = (float)(a4 >> 24 & 0xFF) / 255.0f;
        float a6 = (float)(a4 >> 16 & 0xFF) / 255.0f;
        float a7 = (float)(a4 >> 8 & 0xFF) / 255.0f;
        float a8 = (float)(a4 & 0xFF) / 255.0f;
        GL11.glColor4f((float)a6, (float)a7, (float)a8, (float)a5);
        GL11.glBegin((int)6);
        for (int a9 = 0; a9 <= 18; ++a9) {
            double a10 = Math.sin((double)((double)(a9 * 20) * Math.PI / 180.0)) * a3;
            double a11 = Math.cos((double)((double)(a9 * 20) * Math.PI / 180.0)) * a3;
            GL11.glVertex2d((double)((double)a + a10), (double)((double)a2 + a11));
        }
        GL11.glEnd();
    }

    public static void Method2548(int a, int a2, double a3, int a4, int a5) {
        float a6 = (float)(a4 >> 24 & 0xFF) / 255.0f;
        float a7 = (float)(a4 >> 16 & 0xFF) / 255.0f;
        float a8 = (float)(a4 >> 8 & 0xFF) / 255.0f;
        float a9 = (float)(a4 & 0xFF) / 255.0f;
        GL11.glColor4f((float)a7, (float)a8, (float)a9, (float)a6);
        GL11.glBegin((int)6);
        for (int a10 = 0; a10 <= 360 / a5; ++a10) {
            double a11 = Math.sin((double)((double)(a10 * a5) * Math.PI / 180.0)) * a3;
            double a12 = Math.cos((double)((double)(a10 * a5) * Math.PI / 180.0)) * a3;
            GL11.glVertex2d((double)((double)a + a11), (double)((double)a2 + a12));
        }
        GL11.glEnd();
    }

    public static boolean Method2549(Entity a) {
        return Class212.Method2550(a.getEntityBoundingBox()) || a.ignoreFrustumCheck;
    }

    public static boolean Method2550(AxisAlignedBB a) {
        Entity a2 = Wrapper.INSTANCE.Method2868().getRenderViewEntity();
        Field1193.setPosition(a2.posX, a2.posY, a2.posZ);
        return Field1193.isBoundingBoxInFrustum(a);
    }

    public void Method2551(double a, double a2, double a3, boolean a4, Color a5) {
        Class212.Method2555(a, a2, a3, 360.0, a4, a5);
    }

    public void Method2552(double a, double a2, double a3, boolean a4) {
        this.Method2556(a, a2, a3, 360, a4);
    }

    public static void Method2553(double a, double a2, double a3, Color a4) {
        Class212.Method2557(a, a2, a3, 360, a4);
    }

    public void Method2554(double a, double a2, double a3) {
        this.Method2558(a, a2, a3, 360);
    }

    public static void Method2555(double a, double a2, double a3, double a4, boolean a5, Color a6) {
        a3 /= 2.0;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2884);
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        Class212.Method2543(a6);
        GL11.glLineWidth((float)2.0f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)6);
        for (double a7 = 0.0; a7 <= a4 / 4.0; a7 += 1.0) {
            double a8 = a7 * 4.0 * (Math.PI * 2) / 360.0;
            GL11.glVertex2d((double)(a + a3 * Math.cos((double)a8) + a3), (double)(a2 + a3 * Math.sin((double)a8) + a3));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GlStateManager.enableAlpha();
        GlStateManager.enableDepth();
        GL11.glEnable((int)2884);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        Class212.Method2543(Color.white);
    }

    public void Method2556(double a, double a2, double a3, int a4, boolean a5) {
        Class212.Method2555(a, a2, a3, a4, a5, null);
    }

    public static void Method2557(double a, double a2, double a3, int a4, Color a5) {
        Class212.Method2555(a, a2, a3, a4, true, a5);
    }

    public void Method2558(double a, double a2, double a3, int a4) {
        Class212.Method2555(a, a2, a3, a4, true, null);
    }

    public static void Method2559(float a, float a2, float a3, float a4, float a5, int a6, float a7, int a8) {
        double a9;
        String a10 = Class212.Method2566();
        if (a6 == 0xFFFFFF) {
            a6 = Class681.WHITE.Field2962;
        }
        if (a8 == 0xFFFFFF) {
            a8 = Class681.WHITE.Field2962;
        }
        if (a5 < 0.0f) {
            a5 = 0.0f;
        }
        if (a5 > a3 / 2.0f) {
            a5 = a3 / 2.0f;
        }
        if (a5 > a4 / 2.0f) {
            a5 = a4 / 2.0f;
        }
        Class212.Method2560(a + a5, a2 + a5, a3 - a5 * 2.0f, a4 - a5 * 2.0f, a6);
        Class212.Method2560(a + a5, a2, a3 - a5 * 2.0f, a5, a6);
        Class212.Method2560(a + a5, a2 + a4 - a5, a3 - a5 * 2.0f, a5, a6);
        Class212.Method2560(a, a2 + a5, a5, a4 - a5 * 2.0f, a6);
        Class212.Method2560(a + a3 - a5, a2 + a5, a5, a4 - a5 * 2.0f, a6);
        Class212.Method2561();
        Class212.Method2542(a6);
        GL11.glBegin((int)6);
        float a11 = a + a5;
        float a12 = a2 + a5;
        GL11.glVertex2d((double)a11, (double)a12);
        int a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        int a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)(a14 + 180) / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
            Class91.Method3647(new String[4]);
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a11 = a + a3 - a5;
        a12 = a2 + a5;
        GL11.glVertex2d((double)a11, (double)a12);
        a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)(a14 + 90) / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a11 = a + a5;
        a12 = a2 + a4 - a5;
        GL11.glVertex2d((double)a11, (double)a12);
        a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)(a14 + 270) / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        a11 = a + a3 - a5;
        a12 = a2 + a4 - a5;
        GL11.glVertex2d((double)a11, (double)a12);
        a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a14 = 0;
        if (a14 < a13 + 1) {
            a9 = Math.PI * 2 * (double)a14 / (double)(a13 * 4);
            GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
            ++a14;
        }
        GL11.glEnd();
        Class212.Method2542(a8);
        GL11.glLineWidth((float)a7);
        GL11.glBegin((int)3);
        a11 = a + a5;
        a12 = a2 + a5;
        a14 = a13 = (int)Math.min((float)Math.max((float)a5, (float)10.0f), (float)90.0f);
        a9 = Math.PI * 2 * (double)(a14 + 180) / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)(a + a5), (double)a2);
        GL11.glVertex2d((double)(a + a3 - a5), (double)a2);
        a11 = a + a3 - a5;
        a12 = a2 + a5;
        a14 = a13;
        a9 = Math.PI * 2 * (double)(a14 + 90) / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a5));
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a4 - a5));
        a11 = a + a3 - a5;
        a12 = a2 + a4 - a5;
        a14 = a13;
        a9 = Math.PI * 2 * (double)a14 / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)(a + a3 - a5), (double)(a2 + a4));
        GL11.glVertex2d((double)(a + a5), (double)(a2 + a4));
        a11 = a + a5;
        a12 = a2 + a4 - a5;
        a14 = a13;
        a9 = Math.PI * 2 * (double)(a14 + 270) / (double)(a13 * 4);
        GL11.glVertex2d((double)((double)a11 + Math.sin((double)a9) * (double)a5), (double)((double)a12 + Math.cos((double)a9) * (double)a5));
        --a14;
        GL11.glVertex2d((double)a, (double)(a2 + a4 - a5));
        GL11.glVertex2d((double)a, (double)(a2 + a5));
        GL11.glEnd();
        Class212.Method2562();
    }

    public static void Method2560(float a, float a2, float a3, float a4, int a5) {
        Class212.Method2561();
        Class212.Method2542(a5);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)a, (double)a2);
        GL11.glVertex2d((double)(a + a3), (double)a2);
        GL11.glVertex2d((double)(a + a3), (double)(a2 + a4));
        GL11.glVertex2d((double)a, (double)(a2 + a4));
        GL11.glEnd();
        Class212.Method2562();
    }

    public static void Method2561() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
    }

    public static void Method2562() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    public static void Method2563(int a, int a2, Slot a3, int a4) {
        int a5 = a + a3.xDisplayPosition;
        int a6 = a2 + a3.yDisplayPosition;
        Class212.Method2559(a5, a6, 16.0f, 16.0f, 1.0f, -1, 2.0f, a4);
    }

    public static void Method2564(Slot a, Color a2) {
        Gui.drawRect((int)a.xDisplayPosition, (int)a.yDisplayPosition, (int)(a.xDisplayPosition + 16), (int)(a.yDisplayPosition + 16), (int)a2.getRGB());
    }

    static {
        Class212.Method2565(null);
    }

    public static void Method2565(String string) {
        Field1194 = string;
    }

    public static String Method2566() {
        return Field1194;
    }

    private static ConcurrentModificationException Method2567(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}