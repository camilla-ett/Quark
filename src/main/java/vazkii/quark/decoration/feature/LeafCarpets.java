/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [03/07/2016, 19:03:56 (GMT)]
 */
package vazkii.quark.decoration.feature;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vazkii.quark.base.handler.RecipeHandler;
import vazkii.quark.base.module.Feature;
import vazkii.quark.decoration.block.BlockLeafCarpet;
import vazkii.quark.decoration.block.BlockLeafCarpet.Variants;

public class LeafCarpets extends Feature {

	public static Block leaf_carpet;
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		leaf_carpet = new BlockLeafCarpet();
		
		Variants[] variants = Variants.class.getEnumConstants();
		for(int i = 0; i < variants.length; i++) {
			ItemStack stack = variants[i].baseStack;
			RecipeHandler.addOreDictRecipe(new ItemStack(leaf_carpet, 3, i), 
					"LL",
					'L', stack.copy());
		}
	}
	
}