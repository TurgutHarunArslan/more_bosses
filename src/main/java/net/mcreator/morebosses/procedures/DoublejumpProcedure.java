package net.mcreator.morebosses.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.morebosses.network.MoreBossesModVariables;

public class DoublejumpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).Dbjumped < 2) {
			{
				double _setval = (entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MoreBossesModVariables.PlayerVariables())).Dbjumped + 1;
				entity.getCapability(MoreBossesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dbjumped = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.75, (entity.getDeltaMovement().z())));
			entity.setDeltaMovement(new Vec3(Math.sin(Math.toRadians(entity.getYRot() + 180)), (entity.getDeltaMovement().y()), Math.cos(Math.toRadians(entity.getYRot()))));
		}
	}
}
