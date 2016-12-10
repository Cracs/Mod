package com.crax.mod.client.render.items;

import com.crax.mod.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public final class ItemRenderRegister 
{
    public static void registerItemRenderer() 
    {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.tutorialItem, 0, new ModelResourceLocation("tut:tutorial_item", "inventory"));
    }
}
