package com.jsmith.miscadd.init;import com.jsmith.miscadd.handler.ConfigurationHandler;import cpw.mods.fml.common.registry.GameRegistry;import net.minecraft.init.Blocks;import net.minecraft.init.Items;import net.minecraft.item.ItemStack;/** * Created by JohnSmith0508 on 3/8/14 at 8:55 PM. */public class Recipes{    public static void init()    {        /**         * Blocks         */        RegisterBlockCrafting(new ItemStack(Blocks.coal_block), new ItemStack(ModBlocks.denseCoal));        RegisterBlockCrafting(new ItemStack(Blocks.iron_block), new ItemStack(ModBlocks.denseIron));        RegisterBlockCrafting(new ItemStack(Blocks.diamond_block),new ItemStack(ModBlocks.denseDiamond));        RegisterBlockCrafting(new ItemStack(Blocks.emerald_block),new ItemStack(ModBlocks.denseEmerald));        RegisterBlockCrafting(new ItemStack(Blocks.gold_block), new ItemStack(ModBlocks.denseGold));        RegisterBlockCrafting(new ItemStack(Blocks.lapis_block), new ItemStack(ModBlocks.denseLapis));        RegisterBlockCrafting(new ItemStack(Blocks.quartz_block), new ItemStack(ModBlocks.denseQuartz));        RegisterBlockCrafting(new ItemStack(Blocks.redstone_block), new ItemStack(ModBlocks.denseRedstone));        RegisterBlockCrafting(new ItemStack(Blocks.obsidian), new ItemStack(ModBlocks.denseObsidian));        RegisterBlockCrafting(new ItemStack(ModItems.steelIngot), new ItemStack(ModBlocks.steelBlock));        /**         * Block uncrafting         */        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lapis_block, 9),new ItemStack(ModBlocks.denseLapis));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.coal_block, 9), new ItemStack(ModBlocks.denseCoal));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block,9),new ItemStack(ModBlocks.denseQuartz));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.redstone_block,9),new ItemStack(ModBlocks.denseRedstone));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_block,9),new ItemStack(ModBlocks.denseIron));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block,9),new ItemStack(ModBlocks.denseDiamond));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block,9),new ItemStack(ModBlocks.denseGold));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.emerald_block,9),new ItemStack(ModBlocks.denseEmerald));        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian,9),new ItemStack(ModBlocks.denseObsidian));        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelIngot,9),new ItemStack(ModBlocks.steelBlock));        /**         *Armor         */        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorBoots),            "e e",            "e e",'e',Items.emerald);        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorLegs),                "eee",                "e e",                "e e",'e',Items.emerald);        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorChest),                "e e",                "eee",                "eee",'e',Items.emerald);        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorHelm),                "eee",                "e e",'e',Items.emerald);        /**         * Config recipies         */        if(ConfigurationHandler.quartz)        {            GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz,4),new ItemStack(Blocks.quartz_block));        }        if(ConfigurationHandler.flesh)        {            RegisterBlockCrafting(new ItemStack(Items.rotten_flesh), new ItemStack(ModItems.dampLeather));            GameRegistry.addSmelting(ModItems.dampLeather,new ItemStack(Items.leather),1.0f);        }        /**         * Misc         */        GameRegistry.addRecipe(new ItemStack(ModItems.popcorn),                "sss", " b ",'s',Items.wheat_seeds,'b',Items.bucket);        GameRegistry.addSmelting(Blocks.iron_block,new ItemStack(ModItems.steelIngot,1),5);        GameRegistry.addRecipe(new ItemStack(ModItems.chancer),                "oeo",                " b "                ,'o',Blocks.obsidian,'e',Items.ender_eye,'b',Items.blaze_rod);        GameRegistry.addRecipe(new ItemStack(ModItems.diamondBucket),"dgd"," d ",'d',Items.diamond,'g',Blocks.glass);    }    private static void RegisterBlockCrafting(ItemStack input, ItemStack output)    {        GameRegistry.addRecipe(output, "ooo", "ooo", "ooo", 'o', input);    }}