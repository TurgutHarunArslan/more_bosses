package net.mcreator.morebosses.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.morebosses.network.MoreBossesModVariables;
import net.mcreator.morebosses.init.MoreBossesModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TpProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(MoreBossesModEnchantments.DASH.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
				&& (entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).dashcoldown == 0) {
			speed = 5;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 50, 3, 3, 3, 1);
			entity.setDeltaMovement(new Vec3((Math.sin(entity.getYRot() * (-1) * 0.017453292) * Math.cos(entity.getXRot() * 0.017453292) * speed), (Math.sin(entity.getXRot() * 0.017453292) * (-1) * speed),
					(Math.cos(entity.getYRot() * (-1) * 0.017453292) * Math.cos(entity.getXRot() * 0.017453292) * speed)));
			{
				double _setval = 100;
				entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dashcoldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(MoreBossesModEnchantments.DASH.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
				&& (entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).dashcoldown != 0) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(((entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).dashcoldown / 20 + " Seconds Left")), (true));
		}
	}
}
