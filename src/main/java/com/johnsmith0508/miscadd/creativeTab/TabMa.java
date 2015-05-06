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

package com.johnsmith0508.miscadd.creativeTab;

import com.johnsmith0508.miscadd.init.ModBlocks;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by JohnSmith0508 on 4/5/15 at 6:27 PM.
 */
public class TabMa
{
    public static CreativeTabs MA_TAB = new CreativeTabs(Ref.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.testBlock);
        }
    };
}
