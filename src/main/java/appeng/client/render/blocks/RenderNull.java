/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.client.render.blocks;


import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import appeng.api.util.ModelGenerator;
import appeng.block.AEBaseBlock;
import appeng.client.ItemRenderType;
import appeng.client.render.BaseBlockRender;
import appeng.tile.AEBaseTile;


public class RenderNull extends BaseBlockRender<AEBaseBlock, AEBaseTile>
{

	public RenderNull()
	{
		super( false, 20 );
	}

	@Override
	public void renderInventory( final AEBaseBlock block, final ItemStack is, final ModelGenerator renderer, final ItemRenderType type, final Object[] obj )
	{

	}

	@Override
	public boolean renderInWorld( final AEBaseBlock block, final IBlockAccess world, final BlockPos pos, final ModelGenerator renderer )
	{
		return true;
	}
}
