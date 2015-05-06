/*
 * Copyright (c) 2015. Logan Waldman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.johnsmith0508.miscadd.block;

import com.johnsmith0508.miscadd.creativeTab.TabMa;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 4/5/15 at 6:25 PM.
 */
public class BlockMA extends Block
{

    public BlockMA()
    {
        super(Material.rock);
        this.setCreativeTab(TabMa.MA_TAB);
        this.setUnlocalizedName("testblock");
        this.setHardness(3.0f);
        this.setResistance(3.0f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Block setUnlocalizedName(String name) {
        return super.setUnlocalizedName(Ref.RESCOURCE_PREFIX+name);
    }
}
