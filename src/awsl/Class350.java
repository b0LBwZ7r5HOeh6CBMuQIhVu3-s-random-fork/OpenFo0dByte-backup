/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Graphics
 *  java.awt.Image
 *  java.awt.Point
 *  java.awt.image.BufferedImage
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.HashMap
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class187;
import awsl.Class196;
import awsl.Class347;
import awsl.Class348;
import awsl.Class91;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.GlobalModule;

public class Class350 {
    public static float Field1680 = 1.0f;
    private static HashMap Field1681 = new HashMap();
    public static HashMap Field1682 = new HashMap();

    public static Point Method30() {
        int a;
        Minecraft a2 = Minecraft.getMinecraft();
        int a3 = a2.gameSettings.guiScale;
        a3 = 1000;
        for (a = 0; a < a3 && a2.displayWidth / (a + 1) >= 320 && a2.displayHeight / (a + 1) >= 240; ++a) {
        }
        a = 2;
        return new Point(Mouse.getX() / a, a2.displayHeight / a - Mouse.getY() / a - 1);
    }

    public static void Method31(double a, int a2, double a3, double a4, double a5, boolean a6, boolean a7) {
        Class350.Method32(a, a2, a3, a4, a5, a6, a7, 0.0f, 0.0f, 0.0f);
    }

    public static void Method32(double a, int a2, double a3, double a4, double a5, boolean a6, boolean a7, float a8, float a9, float a10) {
        double a11 = a;
        GlStateManager.alphaFunc((int)516, (float)0.0f);
        GL11.glLineWidth((float)1.0f);
        for (double a12 = 0.5; a12 < (double)a2; a12 += 0.5) {
            double a13;
            GL11.glColor4d((double)a8, (double)a9, (double)a10, (double)a11);
            GL11.glBegin((int)1);
            GL11.glVertex2d((double)(a3 + a12), (double)(a4 - a12));
            GL11.glVertex2d((double)(a3 + a12), (double)(a5 + a12));
            GL11.glEnd();
            a11 = a13 = a - a12 / (double)a2;
        }
    }

    public static void Method33(double a, int a2, double a3, double a4, double a5, boolean a6, boolean a7) {
        Class350.Method34(a, a2, a3, a4, a5, a6, a7, 0.0f, 0.0f, 0.0f);
    }

    public static void Method34(double a, int a2, double a3, double a4, double a5, boolean a6, boolean a7, float a8, float a9, float a10) {
        double a11 = a;
        GlStateManager.alphaFunc((int)516, (float)0.0f);
        GL11.glLineWidth((float)1.0f);
        for (double a12 = 0.0; a12 < (double)a2; a12 += 0.5) {
            double a13;
            GL11.glColor4d((double)a8, (double)a9, (double)a10, (double)a11);
            GL11.glBegin((int)1);
            GL11.glVertex2d((double)(a4 - a12), (double)(a3 + a12));
            GL11.glVertex2d((double)(a5 + a12), (double)(a3 + a12));
            GL11.glEnd();
            a11 = a13 = a - a12 / (double)a2;
        }
    }

    public static void Method35() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2884);
    }

    public static void Method36() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2884);
    }

    public static void Method37() {
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3042);
    }

    public static void Method38(Color a) {
        GL11.glColor4f((float)((float)a.getRed() / 255.0f), (float)((float)a.getGreen() / 255.0f), (float)((float)a.getBlue() / 255.0f), (float)((float)a.getAlpha() / 255.0f));
    }

    public static void Method39(Color a, float a2) {
        GL11.glColor4f((float)((float)a.getRed() / 255.0f), (float)((float)a.getGreen() / 255.0f), (float)((float)a.getBlue() / 255.0f), (float)a2);
    }

    public static void Method40(int a, int a2, int a3, int a4, boolean a5) {
        if (!GlobalModule.Field3169.getValue() || !OpenGlHelper.shadersSupported) {
            return;
        }
        GL11.glEnable((int)3089);
        Class350.Method43(a, a2, a3, a4);
        Class350.Method41(a5);
        GL11.glDisable((int)3089);
    }

    public static void Method41(boolean a) {
        if (!GlobalModule.Field3169.getValue() || !OpenGlHelper.shadersSupported) {
            return;
        }
        GL11.glPushMatrix();
        Class347.Field1663.framebufferRenderExt(Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight, true);
        GL11.glPopMatrix();
        Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();
        GlStateManager.enableDepth();
    }

    public static void Method42(boolean a) {
        if (!GlobalModule.Field3169.getValue() || !OpenGlHelper.shadersSupported) {
            return;
        }
        GL11.glPushMatrix();
        Class347.Field1663.framebufferRenderExt(Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight, true);
        GL11.glPopMatrix();
        Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();
        GlStateManager.enableDepth();
    }

    public static void Method43(int a, int a2, int a3, int a4) {
        Minecraft a5 = Minecraft.getMinecraft();
        ScaledResolution a6 = new ScaledResolution(a5);
        GL11.glScissor((int)(a * a6.getScaleFactor()), (int)(a5.displayHeight - a2 * a6.getScaleFactor() - (a4 -= a2) * a6.getScaleFactor()), (int)((a3 -= a) * a6.getScaleFactor()), (int)(a4 * a6.getScaleFactor()));
    }

    public static void Method44(boolean a) {
        if (!GlobalModule.Field3169.getValue() || !OpenGlHelper.shadersSupported) {
            return;
        }
        Minecraft a2 = Minecraft.getMinecraft();
        if (a2.thePlayer != null && a2.thePlayer.ticksExisted > 10) {
            a2.getFramebuffer().unbindFramebuffer();
            Class347.Field1663.bindFramebuffer(true);
            a2.getFramebuffer().framebufferRenderExt(a2.displayWidth, a2.displayHeight, true);
            if (OpenGlHelper.shadersSupported && Class347.Method376() != null) {
                GlStateManager.matrixMode((int)5890);
                GlStateManager.pushMatrix();
                GlStateManager.loadIdentity();
                Class347.Method376().loadShaderGroup(Field1680);
                GlStateManager.popMatrix();
            }
            Class347.Field1663.unbindFramebuffer();
            a2.getFramebuffer().bindFramebuffer(true);
            a2.entityRenderer.setupOverlayRendering();
        }
    }

    public static int Method45() {
        return -1;
    }

    public static int Method46(Color a) {
        return a.getAlpha() << 24 | a.getRed() << 16 | a.getGreen() << 8 | a.getBlue();
    }

    public static void Method47() {
        if (GlobalModule.Field3169.getValue()) {
            Class350.Method39(new Color(0.05f, 0.05f, 0.05f, 0.3f), 0.2f);
        } else {
            Class350.Method39(new Color(0, 153, 255), 0.7f);
        }
    }

    public static void Method48(int a, int a2, int a3, int a4, int a5) {
        Class350.Method49(a, a2, a3, a4, a5, new Color(0, 0, 0, GlobalModule.Field3169.getValue() ? 120 : 100));
    }

    public static void Method49(int a, int a2, int a3, int a4, int a5, Color a6) {
        GlStateManager.alphaFunc((int)516, (float)0.01f);
        float a7 = (float)(a -= a5) - 0.25f;
        float a8 = (float)(a2 -= a5) + 0.25f;
        int a9 = (a3 += a5 * 2) * (a4 += a5 * 2) + a3 + a6.hashCode() * a5 + a5;
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2884);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3042);
        int a10 = -1;
        if (Field1681.containsKey((Object)a9)) {
            a10 = (Integer)Field1681.Method2665((Object)a9);
            GlStateManager.bindTexture((int)a10);
        } else {
            BufferedImage a11 = new BufferedImage(a3, a4, 2);
            Graphics a12 = a11.getGraphics();
            a12.setColor(a6);
            a12.fillRect(a5, a5, a3 - a5 * 2, a4 - a5 * 2);
            a12.dispose();
            Class187 a13 = new Class187(a5);
            BufferedImage a14 = a13.Method62(a11, null);
            a10 = TextureUtil.uploadTextureImageAllocate((int)TextureUtil.glGenTextures(), (BufferedImage)a14, (boolean)true, (boolean)false);
            Field1681.put((Object)a9, (Object)a10);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)a7, (float)a8);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)a7, (float)(a8 + (float)a4));
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)(a7 + (float)a3), (float)(a8 + (float)a4));
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex2f((float)(a7 + (float)a3), (float)a8);
        GL11.glEnd();
        GL11.glDisable((int)3553);
    }

    /*
     * WARNING - void declaration
     */
    public static void Method50(int a, int a2, int a3, int a4, int a5, int a6) {
        void a7;
        Minecraft a8 = Minecraft.getMinecraft();
        ScaledResolution a9 = new ScaledResolution(a8);
        double a10 = 1.0 / (double)a9.getScaleFactor();
        int n = 2;
        boolean bl = Class348.Method371();
        int a11 = (a3 *= a9.getScaleFactor()) / a7;
        int a12 = (a4 *= a9.getScaleFactor()) / a7;
        int a13 = 3;
        int a14 = a * a2 * a3 * a4 * a5 + a3 + a4 + a5 + a + a2;
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2884);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3042);
        boolean a15 = bl;
        int a16 = -1;
        if (Field1682.containsKey((Object)a14)) {
            a16 = (Integer)Field1682.Method2665((Object)a14);
            GlStateManager.bindTexture((int)a16);
            Class91.Method3647(new String[4]);
        }
        ByteBuffer a17 = BufferUtils.createByteBuffer((int)(a3 * a4 * a13)).order(ByteOrder.nativeOrder());
        GL11.glReadPixels((int)a, (int)(a8.displayHeight - a2 - a4), (int)a3, (int)a4, (int)6407, (int)5121, (ByteBuffer)a17);
        BufferedImage a18 = new BufferedImage(a3, a4, 1);
        int a19 = 0;
        if (a19 < a3) {
            int a20 = 0;
            if (a20 < a4) {
                int a21 = (a19 + a3 * a20) * a13;
                int a22 = a17.get(a21) & 0xFF;
                int a23 = a17.get(a21 + 1) & 0xFF;
                int a24 = a17.get(a21 + 2) & 0xFF;
                a18.setRGB(a19, a4 - (a20 + 1), 0xFF000000 | a22 << 16 | a23 << 8 | a24);
                ++a20;
            }
            ++a19;
        }
        Class196 a22 = new Class196(a5, a5, a6);
        BufferedImage a25 = new BufferedImage(a11, a12, a18.getType());
        Graphics a26 = a25.getGraphics();
        a26.drawImage((Image)a18, 0, 0, a11, a12, null);
        a26.dispose();
        BufferedImage a27 = a22.Method62(a25, null);
        a16 = TextureUtil.uploadTextureImageAllocate((int)TextureUtil.glGenTextures(), (BufferedImage)a27, (boolean)true, (boolean)false);
        Field1682.put((Object)a14, (Object)a16);
        GL11.glPushMatrix();
        GL11.glScaled((double)a10, (double)a10, (double)a10);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)a, (float)a2);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)a, (float)(a2 + a4));
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)(a + a3), (float)(a2 + a4));
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex2f((float)(a + a3), (float)a2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)3553);
    }
}