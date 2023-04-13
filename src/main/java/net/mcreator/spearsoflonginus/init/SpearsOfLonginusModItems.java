
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spearsoflonginus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.spearsoflonginus.item.UpperFalseLanceItem;
import net.mcreator.spearsoflonginus.item.TridentTrueLonginusItem;
import net.mcreator.spearsoflonginus.item.TridentFalseItem;
import net.mcreator.spearsoflonginus.item.TransformedGaiusItem;
import net.mcreator.spearsoflonginus.item.SpinePartItem;
import net.mcreator.spearsoflonginus.item.LowerFalseLanceItem;
import net.mcreator.spearsoflonginus.item.HelixPartItem;
import net.mcreator.spearsoflonginus.item.HeavySpearItem;
import net.mcreator.spearsoflonginus.item.GaiusItem;
import net.mcreator.spearsoflonginus.item.CassiusItem;
import net.mcreator.spearsoflonginus.SpearsOfLonginusMod;

public class SpearsOfLonginusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpearsOfLonginusMod.MODID);
	public static final RegistryObject<Item> TRIDENT_FALSE = REGISTRY.register("trident_false", () -> new TridentFalseItem());
	public static final RegistryObject<Item> TRIDENT_TRUE_LONGINUS = REGISTRY.register("trident_true_longinus", () -> new TridentTrueLonginusItem());
	public static final RegistryObject<Item> LOWER_FALSE_LANCE = REGISTRY.register("lower_false_lance", () -> new LowerFalseLanceItem());
	public static final RegistryObject<Item> UPPER_FALSE_LANCE = REGISTRY.register("upper_false_lance", () -> new UpperFalseLanceItem());
	public static final RegistryObject<Item> HEAVY_SPEAR = REGISTRY.register("heavy_spear", () -> new HeavySpearItem());
	public static final RegistryObject<Item> CASSIUS = REGISTRY.register("cassius", () -> new CassiusItem());
	public static final RegistryObject<Item> GAIUS = REGISTRY.register("gaius", () -> new GaiusItem());
	public static final RegistryObject<Item> TRANSFORMED_GAIUS = REGISTRY.register("transformed_gaius", () -> new TransformedGaiusItem());
	public static final RegistryObject<Item> HELIX_PART = REGISTRY.register("helix_part", () -> new HelixPartItem());
	public static final RegistryObject<Item> SPINE_PART = REGISTRY.register("spine_part", () -> new SpinePartItem());
}
