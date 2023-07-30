package mari.mcaccel.initializers;

import mari.mcaccel.McAccel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockInit {

    public static final Block JACK_O_LANTERN_CHECK  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_CREEPER  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_DERP  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_EVIL  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_HEART  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_HEROBRINE  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_SHOUT  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_SMILE  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static final Block JACK_O_LANTERN_X  = new CarvedPumpkinBlock(FabricBlockSettings.create().luminance(14).sounds(BlockSoundGroup.WOOD));
    public static void InitializeBlocks(){


        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_check"), JACK_O_LANTERN_CHECK);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_check"), new BlockItem(JACK_O_LANTERN_CHECK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_creeper"), JACK_O_LANTERN_CREEPER);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_creeper"), new BlockItem(JACK_O_LANTERN_CREEPER, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_derp"), JACK_O_LANTERN_DERP);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_derp"), new BlockItem(JACK_O_LANTERN_DERP, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_evil"), JACK_O_LANTERN_EVIL);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_evil"), new BlockItem(JACK_O_LANTERN_EVIL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_heart"), JACK_O_LANTERN_HEART);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_heart"), new BlockItem(JACK_O_LANTERN_HEART, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_herobrine"), JACK_O_LANTERN_HEROBRINE);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_herobrine"), new BlockItem(JACK_O_LANTERN_HEROBRINE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_shout"), JACK_O_LANTERN_SHOUT);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_shout"), new BlockItem(JACK_O_LANTERN_SHOUT, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_smile"), JACK_O_LANTERN_SMILE);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_smile"), new BlockItem(JACK_O_LANTERN_SMILE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(McAccel.MOD_ID, "jack_o_lantern_x"), JACK_O_LANTERN_X);
        Registry.register(Registries.ITEM, new Identifier(McAccel.MOD_ID, "jack_o_lantern_x"), new BlockItem(JACK_O_LANTERN_X, new FabricItemSettings()));


    }

}
