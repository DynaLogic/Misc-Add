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

package com.johnsmith0508.miscadd.init;

import com.johnsmith0508.miscadd.block.BlockMA;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JohnSmith0508 on 4/5/15 at 6:21 PM.
 */
public class ModBlocks
{
    public static Block testBlock = new BlockMA();
    public static void init()
    {
        GameRegistry.registerBlock(testBlock,"Test_Block");
    }
}
