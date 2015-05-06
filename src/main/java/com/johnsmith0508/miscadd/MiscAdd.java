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

package com.johnsmith0508.miscadd;

import com.johnsmith0508.miscadd.init.ModBlocks;
import com.johnsmith0508.miscadd.init.ModItems;
import com.johnsmith0508.miscadd.init.RenderItems;
import com.johnsmith0508.miscadd.proxy.IProxy;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by JohnSmith0508 on 4/5/15 at 5:31 PM.
 */
@Mod(version = Ref.VERSION, modid = Ref.MOD_ID, name = Ref.MOD_NAME)
public class MiscAdd
{
    @SidedProxy(clientSide = Ref.CLIENT_PROXY_CLASS, serverSide = Ref.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Ref.MOD_ID)
    public static MiscAdd instance;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RenderItems.init(event);
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}
