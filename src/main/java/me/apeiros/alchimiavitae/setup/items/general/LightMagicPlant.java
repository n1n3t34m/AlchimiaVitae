package me.apeiros.alchimiavitae.setup.items.general;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import me.apeiros.alchimiavitae.AlchimiaUtils;
import me.apeiros.alchimiavitae.setup.AlchimiaItems;

public class LightMagicPlant extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	public LightMagicPlant(ItemGroup ig) {
		super(ig, AlchimiaItems.LIGHT_MAGIC_PLANT, AlchimiaUtils.RecipeTypes.PLANT_INFUSION_CHAMBER, new ItemStack[]{
				new ItemStack(Material.OAK_SAPLING), SlimefunItems.MAGIC_LUMP_3, null,
				null, null, null,
				null, null, null
		});
	}

	// {{{ Prevent placement
	@Nonnull
	@Override
	public ItemUseHandler getItemHandler() {
		return PlayerRightClickEvent::cancel;
	}
	// }}}

}
