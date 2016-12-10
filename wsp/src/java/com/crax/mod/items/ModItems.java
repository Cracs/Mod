package com.crax.mod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems 
{
    

	public static void createItems()
    {  
		Item tutorialItem = new BasicItem("tutorialItem").setRegistryName("tutorialItem");
    	{
    		GameRegistry.register(tutorialItem);
    	}

    }
    
}
