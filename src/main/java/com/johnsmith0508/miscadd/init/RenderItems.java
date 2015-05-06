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

import com.johnsmith0508.miscadd.item.ItemMA;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by JohnSmith0508 on 5/5/15 at 5:49 PM.
 */
public class RenderItems
{
    public static void init(FMLInitializationEvent event)
    {
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(ModItems.testItem,0,new ModelResourceLocation(Ref.RESCOURCE_PREFIX+ ItemMA.getName(),"inventory"));
        }
    }
}
