/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package awsl;

import awsl.Class728;
import awsl.Class91;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Class711
extends CreativeTabs {
    public Class711() {
        super(creativeTabArray.length, "Special blocks");
    }

    public void Method1975(List a) {
        super.Method1975(a);
        a.Method2530((Object)new ItemStack(Blocks.command_block));
        a.Method2530((Object)new ItemStack(Items.command_block_minecart));
        a.Method2530((Object)new ItemStack(Blocks.barrier));
        a.Method2530((Object)new ItemStack(Blocks.dragon_egg));
        int n = Class728.Method1999();
        a.Method2530((Object)new ItemStack(Blocks.brown_mushroom_block));
        int n2 = n;
        a.Method2530((Object)new ItemStack(Blocks.red_mushroom_block));
        a.Method2530((Object)new ItemStack(Blocks.farmland));
        a.Method2530((Object)new ItemStack(Blocks.mob_spawner));
        a.Method2530((Object)new ItemStack(Blocks.lit_furnace));
        if (Class91.Method3648() == null) {
            Class728.Method1998(++n2);
        }
    }

    public Item Method1976() {
        return new ItemStack(Blocks.command_block).getItem();
    }

    public String Method1977() {
        return "Special blocks";
    }

    public boolean Method1978() {
        return false;
    }
}