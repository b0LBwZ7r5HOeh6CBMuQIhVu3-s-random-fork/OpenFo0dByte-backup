/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.URI
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiYesNo
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.Util
 *  net.minecraft.util.Util$EnumOS
 *  org.lwjgl.Sys
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package awsl;

import awsl.Class207;
import awsl.Class215;
import awsl.Class381;
import awsl.Class390;
import awsl.Class391;
import awsl.Class565;
import awsl.Class681;
import awsl.Class707;
import awsl.Class709;
import awsl.Class91;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Util;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class375
extends Class390 {
    private int Field1777;
    private float Field1778;
    private Class391 Field1779;
    private Class391 Field1780;
    private Class391 Field1781;
    private Class391 Field1782 = new Class391();
    private Class391 Field1783;
    private Class391 Field1784;
    private boolean Field1785;
    private boolean Field1786;
    private boolean Field1787;
    private boolean Field1788;
    private boolean Field1789;
    private boolean Field1790;

    public Class375(Class381 a, int a2, int a3, String a4) {
        super(a, a2, a3, "PresetList", a4);
        this.Field1779 = new Class391();
        this.Field1780 = new Class391();
        this.Field1781 = new Class391();
        this.Field1784 = new Class391();
        this.Field1909 = this.Field1919.Field1874;
        this.Field1910 = 18;
        this.Field1920 = "PresetList";
    }

    @Override
    public void Method411(int a, int a2) {
        super.Method411(a, a2);
        if (this.Field1785) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u91cd\u65b0\u52a0\u8f7d\u914d\u7f6e\u6587\u4ef6\u5939\u5217\u8868");
        }
        if (this.Field1788) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u6253\u5f00\u4fdd\u5b58\u914d\u7f6e\u7684\u6587\u4ef6\u5939");
        }
        if (this.Field1786) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u8f7d\u5165\u5f53\u524d\u914d\u7f6e");
        }
        if (this.Field1787) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u5220\u9664\u5f53\u524d\u914d\u7f6e");
        }
        if (this.Field1789) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u6dfb\u52a0\u4e00\u4e2a\u65b0\u914d\u7f6e");
        }
        if (this.Field1790) {
            GlobalModule.INSTANCE.Field3190.Method1808("\u66ff\u6362\u5f53\u524d\u914d\u7f6e");
        }
        this.Field1910 = (int)((float)Class215.Method2649().Method1799() * (Class565.Field2636.Field2625 + 2.0f) + 19.0f);
        this.Field1919.Method1384();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void Method412(int a, int a2) {
        void a3;
        float f = this.Field1907 + 2;
        int a4 = Class390.Method1318();
        float a5 = this.Field1908 + 2;
        float a6 = 2.0f;
        RenderUtils.Method1103((float)this.Field1907 + a6, a5, (float)this.Field1909 - a6 * 2.0f, this.Field1910 - 18, new Color(255, 255, 255, 40).getRGB());
        int a7 = 0;
        if (a7 < Class215.Method2649().Method1799()) {
            Class207 a8 = (Class207)Class215.Method2649().get(a7);
            if ((float)a >= a3 + 0.5f && (float)a <= (float)(this.Field1907 + this.Field1909) - a6 * 2.0f - 1.0f && (float)a2 >= a5 + 0.5f && (float)a2 < a5 + Class565.Field2636.Field2625 + 3.0f) {
                this.Field1777 = a7;
                RenderUtils.Method1103((float)(a3 + 0.5f), a5 + 0.5f, (float)this.Field1909 - a6 * 2.0f - 1.0f, Class565.Field2636.Method1227(a8.Method2419()) + 2.0f, Class681.Method900(Class707.Method1828(), 0.5f));
                this.Field1784 = new Class391((float)(a3 + 1.5f + (float)this.Method1310() - 39.0f), a5 + 1.5f, 10.0f, 9.0f);
                RenderUtils.Method1103((float)(a3 + 1.5f + (float)this.Method1310() - 39.0f), a5 + 1.5f, 10.0f, 9.0f, this.Field1790 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
                Class565.Field2639.Method1217("z", this.Field1907 + this.Method1310() - 34, a5 + 2.0f, new Color(0xF8F8F8).getRGB());
                this.Field1780 = new Class391((float)(a3 + 1.5f + (float)this.Method1310() - 28.0f), a5 + 1.5f, 10.0f, 9.0f);
                RenderUtils.Method1103((float)(a3 + 1.5f + (float)this.Method1310() - 28.0f), a5 + 1.5f, 10.0f, 9.0f, this.Field1786 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
                Class565.Field2639.Method1217("m", this.Field1907 + this.Method1310() - 23, a5 + 2.0f, new Color(0xF8F8F8).getRGB());
                this.Field1781 = new Class391((float)(a3 + 1.5f + (float)this.Method1310() - 17.0f), a5 + 1.5f, 10.0f, 9.0f);
                RenderUtils.Method1103((float)(a3 + 1.5f + (float)this.Method1310() - 17.0f), a5 + 1.5f, 10.0f, 9.0f, this.Field1787 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
                Class565.Field2639.Method1217("q", this.Field1907 + this.Method1310() - 12, a5 + 2.0f, new Color(0xF8F8F8).getRGB());
            }
            Class565.Field2636.Method1217(a8.Method2419(), (float)(a3 + 2.0f), a5 + 2.0f + this.Field1778, new Color(0xD5D5D5).getRGB());
            a5 += Class565.Field2636.Method1227(a8.Method2419()) + 2.0f;
            ++a7;
            Class91.Method3647(new String[3]);
        }
        a5 = this.Field1908 + this.Field1910 - 14;
        RenderUtils.Method1103((float)a3, a5, 12.0f, 12.0f, this.Field1785 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
        Class565.Field2640.Method1217("e", this.Field1907 + 4, a5 + 1.0f, new Color(0xF8F8F8).getRGB());
        this.Field1779 = new Class391((float)a3, a5, 12.0f, 12.0f);
        RenderUtils.Method1103((float)(a3 + 14.0f), a5, 12.0f, 12.0f, this.Field1788 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
        Class565.Field2640.Method1217("l", this.Field1907 + 18, a5 + 1.0f, new Color(0xF8F8F8).getRGB());
        this.Field1782 = new Class391((float)(a3 + 14.0f), a5, 12.0f, 12.0f);
        RenderUtils.Method1103((float)(a3 + 14.0f), a5, 12.0f, 12.0f, this.Field1788 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
        Class565.Field2640.Method1217("l", this.Field1907 + 18, a5 + 1.0f, new Color(0xF8F8F8).getRGB());
        this.Field1782 = new Class391((float)(a3 + 14.0f), a5, 12.0f, 12.0f);
        RenderUtils.Method1103((float)(a3 + (float)this.Method1310() - 16.0f), a5, 12.0f, 12.0f, this.Field1789 ? Class681.Method2699(Class707.Method1828(), 15) : Class707.Method1828());
        Class565.Field2640.Method1217("y", this.Field1907 + this.Method1310() - 12, a5 + 1.0f, this.Field1789 ? Class681.Method2699(new Color(0xF8F8F8).getRGB(), 15) : new Color(0xF8F8F8).getRGB());
        this.Field1783 = new Class391((float)(a3 + (float)this.Method1310() - 16.0f), a5, 12.0f, 12.0f);
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        this.Field1915 = this.Method1311(a, a2) && this.Field1919.Method1392(a, a2);
        this.Field1788 = MathUtils.Method550(a, a2, this.Field1782) && this.Field1915;
        this.Field1785 = MathUtils.Method550(a, a2, this.Field1779) && this.Field1915;
        this.Field1786 = MathUtils.Method550(a, a2, this.Field1780) && this.Field1915;
        this.Field1787 = MathUtils.Method550(a, a2, this.Field1781) && this.Field1915;
        this.Field1789 = MathUtils.Method550(a, a2, this.Field1783) && this.Field1915;
        this.Field1790 = MathUtils.Method550(a, a2, this.Field1784) && this.Field1915;
        if (!this.Field1918 && Mouse.isButtonDown((int)0)) {
            this.Method415(a2);
        }
        this.Field1918 = a3;
    }

    @Override
    public void Method414() {
        this.Field1915 = false;
        this.Field1788 = false;
        this.Field1785 = false;
        this.Field1786 = false;
        this.Field1787 = false;
        this.Field1789 = false;
        this.Field1790 = false;
    }

    private void Method415(int a) {
        block15: {
            Class207 a2;
            int a3 = Class390.Method1318();
            if (this.Field1789) {
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new Class709(GlobalModule.INSTANCE.Field3190));
            }
            if (this.Field1785) {
                GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Reloaded Preset Config", Types.INFO));
                GlobalModule.INSTANCE.fileManager.loadConfigs();
            }
            if (this.Field1790) {
                a2 = (Class207)Class215.Method2649().get(this.Field1777);
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiYesNo((arg_0, arg_1) -> Class375.Method417(a2, arg_0, arg_1), "Config - " + EnumChatFormatting.RED + a2.Method2419(), "Are you sure you want to replace the config? \n \u60a8\u786e\u5b9a\u8981\u66ff\u6362\u5f53\u524d\u914d\u7f6e\u5417\uff1f", 0));
            }
            if (this.Field1786) {
                a2 = (Class207)Class215.Method2649().get(this.Field1777);
                GlobalModule.INSTANCE.fileManager.Method787(a2.Method2419(), Keyboard.isKeyDown((int)42));
                GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Loaded \u00a7c" + a2.Method2419() + " \u00a7fConfig \u00a7aSuccessfully", Types.SUCCESS));
            }
            if (this.Field1787) {
                a2 = (Class207)Class215.Method2649().get(this.Field1777);
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiYesNo((arg_0, arg_1) -> this.Method416(a2, arg_0, arg_1), "Config - " + EnumChatFormatting.RED + a2.Method2419(), "Are you sure you want to remove the config? \n \u60a8\u786e\u5b9a\u8981\u5220\u9664\u5f53\u524d\u914d\u7f6e\u5417\uff1f", 0));
            }
            if (!this.Field1788) break block15;
            a2 = new File(String.valueOf((Object)(System.getProperty((String)"user.home") + File.separator + GlobalModule.clientName)));
            if (!a2.exists()) {
                a2.mkdirs();
            }
            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Configuration folder opened", Types.INFO));
            String a4 = a2.getAbsolutePath();
            if (Util.getOSType() == Util.EnumOS.OSX) {
                try {
                    Runtime.getRuntime().exec(new String[]{"/usr/bin/open", a4});
                    return;
                }
                catch (IOException iOException) {
                }
            }
            if (Util.getOSType() == Util.EnumOS.WINDOWS) {
                String a5 = String.format((String)"cmd.exe /C start \"Open file\" \"%s\"", (Object[])new Object[]{a4});
                try {
                    Runtime.getRuntime().exec(a5);
                    return;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            boolean a6 = false;
            try {
                Class a7 = Class.forName((String)"java.awt.Desktop");
                Object a8 = a7.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                a7.getMethod("browse", new Class[]{URI.class}).invoke(a8, new Object[]{a2.toURI()});
            }
            catch (Throwable a9) {
                a6 = true;
            }
            Sys.openURL((String)("file://" + a4));
        }
    }

    private void Method416(Class207 a, boolean a2, int a3) {
        Class215.Method2649().remove(this.Field1777);
        GlobalModule.INSTANCE.fileManager.deleteConfig(a.Method2419());
        GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Remove Config \u00a7a" + a.Method2419(), Types.INFO));
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)GlobalModule.INSTANCE.Field3190);
    }

    private static void Method417(Class207 a, boolean a2, int a3) {
        GlobalModule.INSTANCE.fileManager.Method786(a.Method2419());
        GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Config", "Replace Config \u00a7a" + a.Method2419(), Types.INFO));
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)GlobalModule.INSTANCE.Field3190);
    }

    private static IOException Method418(IOException iOException) {
        return iOException;
    }
}