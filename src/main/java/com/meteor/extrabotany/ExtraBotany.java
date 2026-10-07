package com.meteor.extrabotany;

import java.util.LinkedHashSet;
import java.util.Set;

import net.minecraft.util.EnumChatFormatting;

import com.meteor.extrabotany.client.ClientProxy;
import com.meteor.extrabotany.common.CommonProxy;
import com.meteor.extrabotany.common.core.util.LogHelper;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.KnowledgeType;

@Mod(
    name = "ExtraBotany",
    modid = ExtraBotany.MODID,
    version = ExtraBotany.VERSION,
    acceptedMinecraftVersions = "[1.7.10]",
    canBeDeactivated = false,
    dependencies = "required-after:Botania;" + "required-after:Baubles;")
public class ExtraBotany {

    // 1. 常量集中定义
    public static final String MODID = "ExtraBotany";
    public static final String VERSION = "1.0-r20";

    @Mod.Instance(ExtraBotany.MODID)
    public static ExtraBotany instance;

    @SidedProxy(
        clientSide = "com.meteor.extrabotany.client.ClientProxy",
        serverSide = "com.meteor.extrabotany.common.CommonProxy")
    public static CommonProxy proxy;

    public static boolean debug = false;

    // 2. 模组联动检测
    public static boolean arsmagicaLoaded = false;
    public static boolean candycraftLoaded = false;
    public static boolean pamLoaded = false;
    public static boolean buildcraftLoaded = false;
    public static boolean thaumcraftLoaded = false;
    public static boolean minetweakerLoaded = false;

    // 3. Botania 知识类型
    public static KnowledgeType extraKnowledge;
    public static KnowledgeType legendaryKnowledge;

    // 4. 创造栏 & 花列表
    public static final ExtraBotanyCreativeTab tabExtraBotany = new ExtraBotanyCreativeTab();
    public static Set<String> subtilesForCreativeMenu = new LinkedHashSet<String>();

    public static void addSubTileToCreativeMenu(String key) {
        subtilesForCreativeMenu.add(key);
    }

    public ExtraBotany() {
        LogHelper.info("ExtraBotany is loading...");
    }

    public static ClientProxy clientProxy() {
        if (proxy.isClient()) {
            return ((ClientProxy) proxy);
        }
        throw new IllegalStateException("Accessed ClientProxy from dedicated server");
    }

    @Mod.EventHandler
    public static void preInit(final FMLPreInitializationEvent event) {
        arsmagicaLoaded = Loader.isModLoaded("arsmagica2");
        candycraftLoaded = Loader.isModLoaded("candycraftmod");
        pamLoaded = Loader.isModLoaded("harvestcraft");
        buildcraftLoaded = Loader.isModLoaded("BuildCraft|Energy");
        thaumcraftLoaded = Loader.isModLoaded("Thaumcraft");
        minetweakerLoaded = Loader.isModLoaded("MineTweaker3");
        extraKnowledge = BotaniaAPI.registerKnowledgeType("extra", EnumChatFormatting.DARK_AQUA, false);
        legendaryKnowledge = BotaniaAPI.registerKnowledgeType("legendary", EnumChatFormatting.DARK_RED, false);
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    @Mod.EventHandler
    public void processMessage(FMLInterModComms.IMCEvent event) {
        for (FMLInterModComms.IMCMessage m : event.getMessages()) {
            LogHelper.info(m.key);
        }
    }
}
