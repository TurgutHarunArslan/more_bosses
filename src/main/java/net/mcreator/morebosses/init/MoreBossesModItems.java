
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morebosses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.morebosses.item.TestItem;
import net.mcreator.morebosses.item.FireItem;
import net.mcreator.morebosses.item.FireFeatherItem;
import net.mcreator.morebosses.MoreBossesMod;

public class MoreBossesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreBossesMod.MODID);
	public static final RegistryObject<Item> FIRE_HELMET = REGISTRY.register("fire_helmet", () -> new FireItem.Helmet());
	public static final RegistryObject<Item> FIRE_CHESTPLATE = REGISTRY.register("fire_chestplate", () -> new FireItem.Chestplate());
	public static final RegistryObject<Item> FIRE_LEGGINGS = REGISTRY.register("fire_leggings", () -> new FireItem.Leggings());
	public static final RegistryObject<Item> FIRE_BOOTS = REGISTRY.register("fire_boots", () -> new FireItem.Boots());
	public static final RegistryObject<Item> FIRE_FEATHER = REGISTRY.register("fire_feather", () -> new FireFeatherItem());
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> PHOENIXA_SPAWN_EGG = REGISTRY.register("phoenixa_spawn_egg", () -> new ForgeSpawnEggItem(MoreBossesModEntities.PHOENIXA, -1, -1, new Item.Properties().tab(MoreBossesModTabs.TAB_MORE_BOSSES)));
}
