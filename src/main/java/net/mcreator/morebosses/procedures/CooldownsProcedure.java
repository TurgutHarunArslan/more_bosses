package net.mcreator.morebosses.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.morebosses.network.MoreBossesModVariables;

import javax.annotation.Nullable;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CooldownsProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).dashcoldown > 0) {
				{
					double _setval = (entityiterator.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).dashcoldown - 1;
					entityiterator.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dashcoldown = _setval;
						capability.syncPlayerVariables(entityiterator);
					});
				}
			}
		}
	}
}
