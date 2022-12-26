
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.villagerampageanddefence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.villagerampageanddefence.block.SkyShardBlock;
import net.mcreator.villagerampageanddefence.VillageRampageAndDefenceMod;

public class VillageRampageAndDefenceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VillageRampageAndDefenceMod.MODID);
	public static final RegistryObject<Block> SKY_SHARD = REGISTRY.register("sky_shard", () -> new SkyShardBlock());
}
