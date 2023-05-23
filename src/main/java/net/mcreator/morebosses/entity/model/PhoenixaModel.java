package net.mcreator.morebosses.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.morebosses.entity.PhoenixaEntity;

public class PhoenixaModel extends AnimatedGeoModel<PhoenixaEntity> {
	@Override
	public ResourceLocation getAnimationResource(PhoenixaEntity entity) {
		return new ResourceLocation("more_bosses", "animations/phoenix.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PhoenixaEntity entity) {
		return new ResourceLocation("more_bosses", "geo/phoenix.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PhoenixaEntity entity) {
		return new ResourceLocation("more_bosses", "textures/entities/" + entity.getTexture() + ".png");
	}

}
