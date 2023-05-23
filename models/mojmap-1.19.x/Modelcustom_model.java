// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Rwing;
	private final ModelPart Lwing;
	private final ModelPart Body;
	private final ModelPart Head;

	public Modelcustom_model(ModelPart root) {
		this.Rwing = root.getChild("Rwing");
		this.Lwing = root.getChild("Lwing");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Rwing = partdefinition.addOrReplaceChild("Rwing", CubeListBuilder.create(),
				PartPose.offset(-5.5F, 24.0F, -2.0F));

		PartDefinition cube_r1 = Rwing
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(2, 2).addBox(-4.5F, 0.0F, -0.5F, 14.0F, 0.0F, 17.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = Rwing.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 36).addBox(-5.5F, 1.0F, -4.5F, 8.0F, 0.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Lwing = partdefinition.addOrReplaceChild("Lwing", CubeListBuilder.create(),
				PartPose.offset(4.5F, 24.0F, -2.0F));

		PartDefinition cube_r3 = Lwing
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 19).addBox(-4.5F, 0.0F, -16.5F, 14.0F, 0.0F, 17.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = Lwing.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(30, 38).addBox(-5.5F, 1.0F, -27.5F, 8.0F, 0.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 0.0F, 3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(35, 0)
						.addBox(-5.5F, 0.4F, 5.9F, 11.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(31, 22)
						.addBox(-4.5F, -0.6F, -8.1F, 9.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(45, 53)
						.addBox(-2.5F, -2.6F, -9.1F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 12)
						.addBox(-3.5F, -1.6F, -8.1F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.5F, 1.4F, -5.1F, 7.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 23.6F, 2.1F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -3.75F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 43)
						.addBox(0.0F, -6.75F, -7.0F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 21.75F, -7.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Rwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}