/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.network.play.server.S08PacketPlayerPosLook
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.MathHelper
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import awsl.Class208;
import awsl.Class345;
import awsl.Class630;
import awsl.Class633;
import awsl.Class653;
import awsl.Class654;
import eventapi.EventTarget;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Speed
extends Module {
    public ModeValue Field2431 = new ModeValue("Speed", "Speed Mode", "Hypixel", new String[]{"WatchDog", "WatchDogLow", "Hypixel", "JumpStrafe"}, "\u7ed5\u8fc7\u6a21\u5f0f{\u6b63\u5e38\u4e00\u822cSpeed,Hypixel}");
    public FloatValue Field2432 = new FloatValue("Speed", "Timer Boost", 1.0, 0.5, 2.0, 0.1, "Timer\u52a0\u901f");
    public BooleanValue Field2433 = new BooleanValue("Speed", "Strafe Look", true);
    public BooleanValue Field2434 = new BooleanValue("Speed", "Timer Boost", true);
    public BooleanValue Field2435 = new BooleanValue("Speed", "LagBack Check", true);
    public static TimeHelper Field2436 = new TimeHelper();
    private int Field2437;
    private double Field2438;
    private double Field2439;
    private double Field2440;

    public Speed() {
        super("Speed", "Speed", Category.MOVEMENT);
        this.setHideModule(true);
    }

    @Override
    public String getDescription() {
        return "\u52a0\u901f\u8fb9\u8df3\u8fb9\u8dd1";
    }

    @Override
    public boolean canUse() {
        return GlobalModule.INSTANCE.Field3186 == null || !PermissionManager.canUseModule("speed");
    }

    @Override
    public void onEnable() {
        this.Field2438 = 0.0;
        this.Field2437 = 0;
    }

    @Override
    public void Method279() {
        ReflectionUtils.setTimerSpeed(1.0f);
    }

    @EventTarget
    public void Method762(Class633 a) {
    }

    @EventTarget
    public void Method801(Class654 a) {
    }

    @EventTarget
    public void Method755(Class653 a) {
    }

    @EventTarget(value=3)
    public void Method712(EventMotion a) {
        boolean bl = Class167.Method1501();
        this.setDisplayTag(this.Field2431.getMode());
        boolean bl2 = bl;
        if (a.isPre()) {
            if (this.Field2433.Method2509().booleanValue() && this.Method713() && !Speed.mc.thePlayer.isSneaking()) {
                a.setYaw(this.Method276() / ((float)Math.PI / 180));
            }
            if (this.Field2431.isCurrentMode("JumpStrafe")) {
                if (Speed.mc.thePlayer.onGround && Class208.Method2466()) {
                    Class208.Method2481(Class208.Method2474() - Math.random() / 50.0);
                    if (Class208.Method2466()) {
                        if (this.Field2434.Method2509().booleanValue()) {
                            ReflectionUtils.setTimerSpeed(this.Field2432.Method2744().floatValue());
                        }
                        Speed.mc.thePlayer.jump();
                        Speed.mc.thePlayer.motionY = Class208.Method2484(0.39999998688697813);
                        a.setY(Speed.mc.thePlayer.motionY);
                    }
                    ReflectionUtils.setTimerSpeed(1.0f);
                }
                Class208.Method2479();
            }
            if (this.Field2431.isCurrentMode("WatchDog") && Class208.Method2466()) {
                if (Speed.mc.thePlayer.onGround) {
                    Speed.mc.thePlayer.motionY = Class208.Method2484(0.42f);
                    this.Field2438 = 0.3323;
                    if (Speed.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
                        this.Field2438 = 0.465023;
                    }
                    ReflectionUtils.setTimerSpeed(this.Field2432.Method2744().floatValue());
                }
                this.Field2438 -= 0.006;
                Class208.Method2487(this.Field2438);
            }
            if (this.Field2431.isCurrentMode("WatchDogLow")) {
                if (this.Field2434.Method2509().booleanValue()) {
                    ReflectionUtils.setTimerSpeed(this.Field2432.Method2744().floatValue());
                }
                if (Class208.Method2466() && Speed.mc.thePlayer.onGround) {
                    this.Field2439 = 1.2f;
                    Speed.mc.thePlayer.motionY = 0.31999998688697817;
                }
                Class208.Method2487(Class208.Method2478() * (double)0.90151f * this.Field2439);
                if (this.Field2439 > 1.0) {
                    this.Field2439 -= 0.05;
                }
            }
        }
    }

    private float Method1779() {
        double a = (Double)Class345.Method340(Speed.mc.thePlayer, new String[]{ObfuscatedClasses.lastReportedPosX.getObfuscatedName()});
        double a2 = (Double)Class345.Method340(Speed.mc.thePlayer, new String[]{ObfuscatedClasses.lastReportedPosY.getObfuscatedName()}) + (double)Speed.mc.thePlayer.getEyeHeight();
        double a3 = (Double)Class345.Method340(Speed.mc.thePlayer, new String[]{ObfuscatedClasses.lastReportedPosZ.getObfuscatedName()});
        double a4 = Speed.mc.thePlayer.posX;
        double a5 = Speed.mc.thePlayer.posY + (double)Speed.mc.thePlayer.getEyeHeight();
        double a6 = Speed.mc.thePlayer.posZ;
        double a7 = a - a4;
        double a8 = a2 - a5;
        double a9 = a3 - a6;
        double a10 = Math.sqrt((double)(Math.pow((double)a7, (double)2.0) + Math.pow((double)a9, (double)2.0)));
        double a11 = Math.toDegrees((double)Math.atan2((double)a9, (double)a7)) + 90.0;
        double a12 = Math.toDegrees((double)Math.atan2((double)a10, (double)a8));
        return (float)a11;
    }

    @EventTarget
    public void Method274(Class630 a) {
        if (this.Field2431.isCurrentMode("Hypixel") && a.Method3502().booleanValue()) {
            double a2 = Class208.Method2474();
            if (Class208.Method2466()) {
                if (this.Field2434.Method2509().booleanValue() && !Class208.Method2469(0.0) && Speed.mc.thePlayer.ticksExisted > 5) {
                    ReflectionUtils.setTimerSpeed(this.Field2432.Method2744().floatValue() + Class208.Method2464());
                }
                if (Class208.Method2467()) {
                    Speed.mc.thePlayer.motionY = Class208.Method2484(0.42f);
                    a.Method3507(Speed.mc.thePlayer.motionY);
                    this.Field2437 = 0;
                }
                switch (this.Field2437) {
                    case 0: {
                        this.Field2438 = a2 * 2.15;
                        break;
                    }
                    case 1: {
                        this.Field2438 *= 0.58;
                        break;
                    }
                    case 4: {
                        this.Field2438 = a2 * 1.2;
                        break;
                    }
                    default: {
                        this.Field2438 = this.Field2438 / 100.0 * 98.5;
                    }
                }
                ++this.Field2437;
                double[] a3 = Class208.Method2476(this.Method276(), Math.max((double)a2, (double)this.Field2438));
                a.Method3505(a3[0]);
                a.Method3509(a3[1]);
            } else {
                ReflectionUtils.setTimerSpeed(1.0f);
                Speed.mc.thePlayer.motionX = 0.0;
                a.Method3505(0.0);
                Speed.mc.thePlayer.motionZ = 0.0;
                a.Method3509(0.0);
            }
        }
    }

    public float Method276() {
        float a = Speed.mc.thePlayer.rotationYaw;
        if (Speed.mc.thePlayer.moveForward < 0.0f) {
            a += 180.0f;
        }
        float a2 = 1.0f;
        if (Speed.mc.thePlayer.moveForward < 0.0f) {
            a2 = -0.5f;
        } else if (Speed.mc.thePlayer.moveForward > 0.0f) {
            a2 = 0.5f;
        }
        if (Speed.mc.thePlayer.moveStrafing > 0.0f) {
            a -= 90.0f * a2;
        }
        if (Speed.mc.thePlayer.moveStrafing < 0.0f) {
            a += 90.0f * a2;
        }
        a = (float)((double)a * 0.017453292);
        return a;
    }

    private double Method1780() {
        this.Field2440 = Math.toRadians((double)Speed.mc.thePlayer.rotationYaw);
        boolean a = Class167.Method1501();
        boolean a2 = Speed.mc.thePlayer.moveForward > 0.0f;
        boolean a3 = Speed.mc.thePlayer.moveForward < 0.0f;
        boolean a4 = Speed.mc.thePlayer.moveStrafing > 0.0f;
        boolean a5 = Speed.mc.thePlayer.moveStrafing < 0.0f;
        boolean a6 = true;
        boolean a7 = true;
        double a8 = MathHelper.wrapAngleTo180_double((double)Speed.mc.thePlayer.rotationYaw);
        if (this.Field2440 == Double.NaN) {
            this.Field2440 = a8;
        }
        double a9 = 45.0;
        if (Math.abs((double)(a8 - this.Field2440)) > 45.0 && Math.abs((double)(a8 - this.Field2440)) < 315.0) {
            if (a8 > this.Field2440) {
                a8 += a9;
            }
            a8 -= a9;
        }
        this.Field2440 = a8;
        return Math.toRadians((double)a8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Method713() {
        if (Speed.mc.gameSettings.keyBindForward.isKeyDown()) return true;
        if (Speed.mc.gameSettings.keyBindBack.isKeyDown()) return true;
        if (Speed.mc.gameSettings.keyBindLeft.isKeyDown()) return true;
        if (!Speed.mc.gameSettings.keyBindRight.isKeyDown()) return false;
        return true;
    }

    @EventTarget
    public void Method273(EventPacket a) {
        if (this.Field2435.Method2509().booleanValue() && a.getPacket() instanceof S08PacketPlayerPosLook) {
            this.setState(false);
        }
    }
}