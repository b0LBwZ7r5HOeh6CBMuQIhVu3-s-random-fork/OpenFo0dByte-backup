/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Toolkit
 *  java.awt.datatransfer.DataFlavor
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  org.lwjgl.input.Keyboard
 */
package awsl;

import awsl.Class392;
import awsl.Class697;
import awsl.Class713;
import awsl.Class715;
import awsl.Class91;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

public final class Class706
extends GuiScreen {
    public static Runnable Field3047;
    private final GuiScreen Field3048;
    public static String Field3049;
    private Class697 Field3050;
    private Class713 Field3051;
    private Class713 Field3052;
    private static String Field3053;

    public Class706(GuiScreen a) {
        this.Field3048 = a;
    }

    public void Method1801() {
        String string = Class706.Method1809();
        int a = this.height / 4 + 24;
        this.buttonList.Method2530((Object)new Class715(0, this.width / 2 - 100, a + 72, "Login"));
        this.buttonList.Method2530((Object)new Class715(2, this.width / 2 - 100, a + 72 + 24, "Import user:pass"));
        this.buttonList.Method2530((Object)new Class715(1, this.width / 2 - 100, a + 72 + 48, "Back"));
        this.buttonList.Method2530((Object)new Class715(9, this.width - 88, 7, 60, 20, "Microsoft"));
        this.Field3051 = new Class713(1, this.mc.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
        this.Field3052 = new Class713(2, this.mc.fontRendererObj, this.width / 2 - 100, 100, 200, 20);
        this.Field3051.Method2042(128);
        String a2 = string;
        this.Field3051.Method1808("");
        this.Field3052.Method2042(128);
        this.Field3052.Method1808("");
        this.Field3051.Method2046(true);
        Keyboard.enableRepeatEvents((boolean)true);
        Field3049 = "Idle...";
        Class91.Method3647(new String[1]);
    }

    protected void Method1802(GuiButton a) {
        String a2 = Class706.Method1809();
        switch (a.id) {
            case 0: {
                this.Field3050 = new Class697(this.Field3051.Method1809(), this.Field3052.Method1809());
                this.Field3050.start();
            }
            case 1: {
                this.mc.displayGuiScreen(this.Field3048);
            }
            case 2: {
                Object a3 = null;
                try {
                    a3 = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                }
                catch (Exception a4) {
                }
                if (!a3.contains((CharSequence)":")) break;
                String[] a5 = a3.split(":");
                this.Field3051.Method1808(a5[0]);
                this.Field3052.Method1808(a5[1]);
            }
            case 9: {
                Field3049 = "Logging in...";
                Object a3 = new Thread(Field3047);
                a3.start();
                break;
            }
        }
    }

    public void Method1803(int a, int a2, float a3) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.mc.fontRendererObj, "Alt Login", this.width / 2, 20, -1);
        this.drawCenteredString(this.mc.fontRendererObj, Field3049, this.width / 2, 29, -1);
        this.drawString(this.mc.fontRendererObj, "Username / E-Mail", this.width / 2 - 100, 50, -7829368);
        this.drawString(this.mc.fontRendererObj, "Password", this.width / 2 - 100, 90, -7829368);
        this.Field3051.Method2040();
        String a4 = this.Field3052.Method1809();
        this.Field3052.Method1808(a4.replaceAll("(?s).", "*"));
        this.Field3052.Method2040();
        this.Field3052.Method1808(a4);
        super.Method1803(a, a2, a3);
    }

    protected void Method1804(char a, int a2) {
        try {
            super.Method1804(a, a2);
        }
        catch (IOException a3) {
            a3.printStackTrace();
        }
        if (a == '\t') {
            if (!this.Field3051.Method2047() && !this.Field3052.Method2047()) {
                this.Field3051.Method2046(true);
            } else {
                this.Field3051.Method2046(this.Field3052.Method2047());
                this.Field3052.Method2046(!this.Field3051.Method2047());
            }
        }
        if (a == '\r') {
            this.Method1802((GuiButton)this.buttonList.get(0));
        }
        this.Field3051.Method2038(a, a2);
        this.Field3052.Method2038(a, a2);
    }

    protected void Method1805(int a, int a2, int a3) {
        try {
            super.Method1805(a, a2, a3);
        }
        catch (IOException a4) {
            a4.printStackTrace();
        }
        this.Field3051.Method2039(a, a2, a3);
        this.Field3052.Method2039(a, a2, a3);
    }

    public void Method1806() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    public void Method1807() {
        this.Field3051.Method1814();
        this.Field3052.Method1814();
    }

    static {
        Class706.Method1808(null);
        Field3047 = new Class392();
        Field3049 = "Idle...";
    }

    public static void Method1808(String string) {
        Field3053 = string;
    }

    public static String Method1809() {
        return Field3053;
    }

    private static Exception Method1810(Exception exception) {
        return exception;
    }
}