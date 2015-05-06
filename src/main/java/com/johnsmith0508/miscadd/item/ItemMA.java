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

package com.johnsmith0508.miscadd.item;

import com.johnsmith0508.miscadd.creativeTab.TabMa;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.item.Item;

/**
 * Created by JohnSmith0508 on 4/5/15 at 9:08 PM.
 */
public class ItemMA extends Item
{
    private static String name = "DevItem";
    public ItemMA()
    {
        this.setCreativeTab(TabMa.MA_TAB);
        this.setUnlocalizedName(name);
    }

    public static String getName()
    {
        return name;
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Ref.RESCOURCE_PREFIX +unlocalizedName);
    }
}
