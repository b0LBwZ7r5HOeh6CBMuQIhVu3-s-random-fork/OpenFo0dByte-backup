/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 */
package trash.foodbyte.module;

import awsl.Class91;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.AimAssist;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.combat.AntiKB;
import trash.foodbyte.module.impl.combat.AutoClicker;
import trash.foodbyte.module.impl.combat.AutoHeal;
import trash.foodbyte.module.impl.combat.AutoSword;
import trash.foodbyte.module.impl.combat.HitBox;
import trash.foodbyte.module.impl.combat.KeepSprint;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.module.impl.combat.Reach;
import trash.foodbyte.module.impl.combat.Velocity;
import trash.foodbyte.module.impl.combat.WTap;
import trash.foodbyte.module.impl.movement.Fly;
import trash.foodbyte.module.impl.movement.LegitSpeed;
import trash.foodbyte.module.impl.movement.NoFall;
import trash.foodbyte.module.impl.movement.NoJumpDelay;
import trash.foodbyte.module.impl.movement.NoSlowDown;
import trash.foodbyte.module.impl.movement.Packour;
import trash.foodbyte.module.impl.movement.SafeWalk;
import trash.foodbyte.module.impl.movement.Speed;
import trash.foodbyte.module.impl.movement.Sprint;
import trash.foodbyte.module.impl.player.AntiObbyTrap;
import trash.foodbyte.module.impl.player.AutoArmor;
import trash.foodbyte.module.impl.player.AutoFish;
import trash.foodbyte.module.impl.player.AutoTool;
import trash.foodbyte.module.impl.player.ChestStealer;
import trash.foodbyte.module.impl.player.FastPlace;
import trash.foodbyte.module.impl.player.Freecam;
import trash.foodbyte.module.impl.player.InvCleaner;
import trash.foodbyte.module.impl.player.InvWalk;
import trash.foodbyte.module.impl.player.NameProtect;
import trash.foodbyte.module.impl.player.RodAimbot;
import trash.foodbyte.module.impl.player.SuperPlace;
import trash.foodbyte.module.impl.player.WaterBucket;
import trash.foodbyte.module.impl.player.Zoot;
import trash.foodbyte.module.impl.render.ArmorHud;
import trash.foodbyte.module.impl.render.Arrow;
import trash.foodbyte.module.impl.render.BedESP;
import trash.foodbyte.module.impl.render.BlockOverlay;
import trash.foodbyte.module.impl.render.Chams;
import trash.foodbyte.module.impl.render.ChinaHat;
import trash.foodbyte.module.impl.render.ClickGui;
import trash.foodbyte.module.impl.render.ESP;
import trash.foodbyte.module.impl.render.FullBright;
import trash.foodbyte.module.impl.render.Hud;
import trash.foodbyte.module.impl.render.Inventory;
import trash.foodbyte.module.impl.render.ItemESP;
import trash.foodbyte.module.impl.render.ItemRender;
import trash.foodbyte.module.impl.render.ItemTag;
import trash.foodbyte.module.impl.render.NameTag;
import trash.foodbyte.module.impl.render.NoFov;
import trash.foodbyte.module.impl.render.NoHurtcam;
import trash.foodbyte.module.impl.render.Particles;
import trash.foodbyte.module.impl.render.Perspective;
import trash.foodbyte.module.impl.render.Radar;
import trash.foodbyte.module.impl.render.ShowEntity;
import trash.foodbyte.module.impl.render.StorageESP;
import trash.foodbyte.module.impl.render.Tracers;
import trash.foodbyte.module.impl.render.Trajectories;
import trash.foodbyte.module.impl.render.ViewClip;
import trash.foodbyte.module.impl.skyblock.AutoMelody;
import trash.foodbyte.module.impl.skyblock.DungeonHelper;
import trash.foodbyte.module.impl.skyblock.Experimentation;
import trash.foodbyte.module.impl.skyblock.GhostBlocks;
import trash.foodbyte.module.impl.skyblock.SecretAura;
import trash.foodbyte.module.impl.skyblock.SlayerHelper;
import trash.foodbyte.module.impl.skyblock.StackNBT;
import trash.foodbyte.module.impl.world.AutoGG;
import trash.foodbyte.module.impl.world.ChatFilter;
import trash.foodbyte.module.impl.world.ChatTranslator;
import trash.foodbyte.module.impl.world.CopsCrims;
import trash.foodbyte.module.impl.world.Crasher;
import trash.foodbyte.module.impl.world.Disabler;
import trash.foodbyte.module.impl.world.FastBreak;
import trash.foodbyte.module.impl.world.LightningTrack;
import trash.foodbyte.module.impl.world.LobbyGift;
import trash.foodbyte.module.impl.world.MCF;
import trash.foodbyte.module.impl.world.MurderMystery;
import trash.foodbyte.module.impl.world.Panic;
import trash.foodbyte.module.impl.world.PenShen;
import trash.foodbyte.module.impl.world.Timer;
import trash.foodbyte.module.impl.world.UHCFastCraft;
import trash.foodbyte.module.impl.world.UHCFind;
import trash.foodbyte.module.impl.world.Waypoints;
import trash.foodbyte.module.impl.world.XRay;

public class ModuleManager {
    public static ArrayList modules = new ArrayList();

    public ModuleManager() {
        this.addModule(new WTap());
        this.addModule(new AntiBot());
        this.addModule(new AntiKB());
        this.addModule(new AutoSword());
        this.addModule(new AutoHeal());
        this.addModule(new Reach());
        this.addModule(new HitBox());
        this.addModule(new AutoClicker());
        this.addModule(new AimAssist());
        this.addModule(new KillAura());
        this.addModule(new Velocity());
        this.addModule(new KeepSprint());
        this.addModule(new ClickGui());
        this.addModule(new Hud());
        this.addModule(new ESP());
        this.addModule(new ItemESP());
        this.addModule(new ChinaHat());
        this.addModule(new ItemTag());
        this.addModule(new BedESP());
        this.addModule(new ItemRender());
        this.addModule(new Chams());
        this.addModule(new Arrow());
        this.addModule(new Radar());
        this.addModule(new Inventory());
        this.addModule(new StorageESP());
        int[] nArray = Module.Method1041();
        this.addModule(new Perspective());
        this.addModule(new NameTag());
        this.addModule(new Tracers());
        this.addModule(new Trajectories());
        this.addModule(new ShowEntity());
        this.addModule(new NoFov());
        this.addModule(new BlockOverlay());
        this.addModule(new NoHurtcam());
        this.addModule(new ArmorHud());
        this.addModule(new FullBright());
        this.addModule(new ViewClip());
        this.addModule(new Particles());
        this.addModule(new Zoot());
        this.addModule(new InvWalk());
        this.addModule(new Freecam());
        this.addModule(new AutoArmor());
        this.addModule(new AutoTool());
        this.addModule(new AutoFish());
        this.addModule(new RodAimbot());
        this.addModule(new FastPlace());
        this.addModule(new SuperPlace());
        this.addModule(new WaterBucket());
        this.addModule(new InvCleaner());
        this.addModule(new NameProtect());
        int[] nArray2 = nArray;
        this.addModule(new ChestStealer());
        this.addModule(new AntiObbyTrap());
        this.addModule(new Fly());
        this.addModule(new Speed());
        this.addModule(new LegitSpeed());
        this.addModule(new Sprint());
        this.addModule(new NoFall());
        this.addModule(new Packour());
        this.addModule(new SafeWalk());
        this.addModule(new NoJumpDelay());
        this.addModule(new NoSlowDown());
        this.addModule(new XRay());
        this.addModule(new MCF());
        this.addModule(new Panic());
        this.addModule(new Timer());
        this.addModule(new AutoGG());
        this.addModule(new Crasher());
        this.addModule(new UHCFind());
        this.addModule(new PenShen());
        this.addModule(new Disabler());
        this.addModule(new LobbyGift());
        this.addModule(new FastBreak());
        this.addModule(new Waypoints());
        this.addModule(new ChatFilter());
        this.addModule(new CopsCrims());
        this.addModule(new UHCFastCraft());
        this.addModule(new ChatTranslator());
        this.addModule(new MurderMystery());
        this.addModule(new LightningTrack());
        this.addModule(new StackNBT());
        this.addModule(new GhostBlocks());
        this.addModule(new SecretAura());
        this.addModule(new SlayerHelper());
        this.addModule(new AutoMelody());
        this.addModule(new DungeonHelper());
        this.addModule(new Experimentation());
        modules.sort(Comparator.comparing(Module::getName));
        Class91.Method3647(new String[2]);
    }

    public void addModule(Module a) {
        modules.Method2530((Object)a);
    }

    public static ArrayList getModules() {
        ArrayList a = new ArrayList();
        Iterator iterator = modules.Method1383();
        int[] a2 = Module.Method1041();
        while (iterator.Method932()) {
            Module a3 = (Module)iterator.Method933();
            if (!a3.getState()) continue;
            a.Method2530((Object)a3);
            break;
        }
        return a;
    }

    public static Module getModule(String a) {
        Iterator iterator = modules.Method1383();
        while (iterator.Method932()) {
            Module a2 = (Module)iterator.Method933();
            if (!a2.getName().equalsIgnoreCase(a)) continue;
            return a2;
        }
        return null;
    }

    public static ArrayList getAllModules() {
        return modules;
    }

    public static Module getModule(Class a) {
        Iterator iterator = modules.Method1383();
        while (iterator.Method932()) {
            Module a2 = (Module)iterator.Method933();
            if (a2.getClass() != a) continue;
            return a2;
        }
        return null;
    }

    public static Module getModule2(Class a) {
        Iterator iterator = modules.Method1383();
        while (iterator.Method932()) {
            Module a2 = (Module)iterator.Method933();
            if (a2.getClass() != a) continue;
            return a2;
        }
        return null;
    }

    public static ArrayList getModulesNotRender() {
        ArrayList a = new ArrayList();
        Iterator iterator = modules.Method1383();
        int[] a2 = Module.Method1041();
        if (iterator.Method932()) {
            Module a3 = (Module)iterator.Method933();
            if (a3.getState() && a3.Method1024() != Category.RENDER) {
                a.Method2530((Object)a3);
            }
        }
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public static int Method2299(Category a) {
        void a2;
        boolean bl = false;
        Iterator iterator = modules.Method1383();
        int[] a3 = Module.Method1041();
        if (iterator.Method932()) {
            Module a4 = (Module)iterator.Method933();
            if (a4.Method1024() == a) {
                ++a2;
            }
        }
        return (int)a2;
    }
}