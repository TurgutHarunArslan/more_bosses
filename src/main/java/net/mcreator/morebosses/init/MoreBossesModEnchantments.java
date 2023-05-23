
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morebosses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.morebosses.enchantment.DashEnchantment;
import net.mcreator.morebosses.MoreBossesMod;

public class MoreBossesModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MoreBossesMod.MODID);
	public static final RegistryObject<Enchantment> DASH = REGISTRY.register("dash", () -> new DashEnchantment());
}
