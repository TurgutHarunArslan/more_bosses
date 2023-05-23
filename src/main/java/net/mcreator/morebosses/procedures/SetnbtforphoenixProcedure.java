package net.mcreator.morebosses.procedures;

import net.minecraft.world.entity.Entity;

public class SetnbtforphoenixProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("AttackVal", 0);
		entity.getPersistentData().putDouble("Dash", 0);
	}
}
