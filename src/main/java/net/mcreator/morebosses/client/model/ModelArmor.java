package net.mcreator.morebosses.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("more_bosses", "model_armor"), "main");
	public final ModelPart armorHead;
	public final ModelPart armorBody;
	public final ModelPart armorLeftArm;
	public final ModelPart armorRightArm;
	public final ModelPart armorLeftLeg;
	public final ModelPart armorRightLeg;
	public final ModelPart armorLeftBoot;
	public final ModelPart armorRightBoot;

	public ModelArmor(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
		this.armorBody = root.getChild("armorBody");
		this.armorLeftArm = root.getChild("armorLeftArm");
		this.armorRightArm = root.getChild("armorRightArm");
		this.armorLeftLeg = root.getChild("armorLeftLeg");
		this.armorRightLeg = root.getChild("armorRightLeg");
		this.armorLeftBoot = root.getChild("armorLeftBoot");
		this.armorRightBoot = root.getChild("armorRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F)).texOffs(32, 0).addBox(-5.0F, -15.9647F, 0.1363F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = armorHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-6.5F, -3.5F, -4.0F, 13.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -10.5F, 0.0F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition cube_r2 = armorHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 0).addBox(-4.5681F, -4.0F, -1.866F, 13.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5681F, -9.4647F, 2.0681F, -2.8798F, 0.0F, -3.1416F));
		PartDefinition cube_r3 = armorHead.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-4.5F, -3.5F, 0.0F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -12.4647F, 0.1363F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r4 = armorHead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 0).addBox(-8.4319F, -4.0F, -1.866F, 13.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5681F, -9.4647F, 2.0681F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition cube_r5 = armorHead.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 0).addBox(-6.5F, -3.5F, -4.0F, 13.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -10.5F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition armorBody = partdefinition.addOrReplaceChild("armorBody",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition armorLeftArm = partdefinition.addOrReplaceChild("armorLeftArm",
				CubeListBuilder.create().texOffs(40, 16).mirror().addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false).texOffs(29, 0).addBox(1.0F, -7.0F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition cube_r6 = armorLeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 0).addBox(-2.5F, -3.5F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -4.5F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r7 = armorLeftArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 0).addBox(0.5F, -3.5F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -4.5F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition armorRightArm = partdefinition.addOrReplaceChild("armorRightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(29, 0).addBox(-4.0F, -7.0F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition cube_r8 = armorRightArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 0).addBox(0.5F, -3.5F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -4.5F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r9 = armorRightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 0).addBox(-2.5F, -3.5F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -4.5F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition armorLeftLeg = partdefinition.addOrReplaceChild("armorLeftLeg", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition armorRightLeg = partdefinition.addOrReplaceChild("armorRightLeg", CubeListBuilder.create().texOffs(0, 48).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition armorLeftBoot = partdefinition.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition armorRightBoot = partdefinition.addOrReplaceChild("armorRightBoot", CubeListBuilder.create().texOffs(0, 16).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
