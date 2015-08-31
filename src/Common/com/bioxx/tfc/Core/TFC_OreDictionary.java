package com.bioxx.tfc.Core;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

public class TFC_OreDictionary
{
	public static void registerOreDict()
	{
		final int WILD = OreDictionary.WILDCARD_VALUE;

		//Wood & Trees
		OreDictionary.registerOre("logWood", new ItemStack(TFCItems.logs, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.logNatural, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.logNatural2, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.woodHoriz, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.woodHoriz2, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.woodHoriz3, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.woodHoriz4, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.woodVert, 1, WILD));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.woodVert2, 1, WILD));

		OreDictionary.registerOre("plankWood", new ItemStack(TFCBlocks.planks, 1, WILD));
		OreDictionary.registerOre("plankWood", new ItemStack(TFCBlocks.planks2, 1, WILD));

		OreDictionary.registerOre("woodLumber", new ItemStack(TFCItems.singlePlank, 1, WILD));

		OreDictionary.registerOre("stickWood", new ItemStack(TFCItems.stick));

		OreDictionary.registerOre("treeSapling", new ItemStack(TFCBlocks.sapling, 1, WILD));
		OreDictionary.registerOre("treeSapling", new ItemStack(TFCBlocks.sapling2, 1, WILD));

		OreDictionary.registerOre("treeLeaves", new ItemStack(TFCBlocks.leaves, 1, WILD));
		OreDictionary.registerOre("treeLeaves", new ItemStack(TFCBlocks.leaves2, 1, WILD));

		//Ores
		OreDictionary.registerOre("oreNormalCopper", new ItemStack(TFCItems.oreChunk, 1, 0)); //Native Copper
		OreDictionary.registerOre("oreNormalCopper", new ItemStack(TFCItems.oreChunk, 1, 9)); //Malachite
		OreDictionary.registerOre("oreNormalCopper", new ItemStack(TFCItems.oreChunk, 1, 13)); //Tetrahedrite		
		OreDictionary.registerOre("oreSmallCopper", new ItemStack(TFCItems.smallOreChunk, 1, 0)); //Native Copper
		OreDictionary.registerOre("oreSmallCopper", new ItemStack(TFCItems.smallOreChunk, 1, 9)); //Malachite
		OreDictionary.registerOre("oreSmallCopper", new ItemStack(TFCItems.smallOreChunk, 1, 13)); //Tetrahedrite		
		OreDictionary.registerOre("oreRichCopper", new ItemStack(TFCItems.oreChunk, 1, 35)); //Native Copper
		OreDictionary.registerOre("oreRichCopper", new ItemStack(TFCItems.oreChunk, 1, 44)); //Malachite
		OreDictionary.registerOre("oreRichCopper", new ItemStack(TFCItems.oreChunk, 1, 48)); //Tetrahedrite		
		OreDictionary.registerOre("orePoorCopper", new ItemStack(TFCItems.oreChunk, 1, 49)); //Native Copper
		OreDictionary.registerOre("orePoorCopper", new ItemStack(TFCItems.oreChunk, 1, 58)); //Malachite
		OreDictionary.registerOre("orePoorCopper", new ItemStack(TFCItems.oreChunk, 1, 62)); //Tetrahedrite

		OreDictionary.registerOre("oreNormalGold", new ItemStack(TFCItems.oreChunk, 1, 1)); //Native Gold
		OreDictionary.registerOre("oreSmallGold", new ItemStack(TFCItems.smallOreChunk, 1, 1)); //Native Gold
		OreDictionary.registerOre("oreRichGold", new ItemStack(TFCItems.oreChunk, 1, 36)); //Native Gold
		OreDictionary.registerOre("orePoorGold", new ItemStack(TFCItems.oreChunk, 1, 50)); //Native Gold

		OreDictionary.registerOre("oreNormalPlatinum", new ItemStack(TFCItems.oreChunk, 1, 2)); //Native Platinum
		OreDictionary.registerOre("oreSmallPlatinum", new ItemStack(TFCItems.smallOreChunk, 1, 2)); //Native Platinum
		OreDictionary.registerOre("oreRichPlatinum", new ItemStack(TFCItems.oreChunk, 1, 37)); //Native Platinum
		OreDictionary.registerOre("orePoorPlatinum", new ItemStack(TFCItems.oreChunk, 1, 51)); //Native Platinum

		OreDictionary.registerOre("oreNormalIron", new ItemStack(TFCItems.oreChunk, 1, 3)); //Hematite
		OreDictionary.registerOre("oreNormalIron", new ItemStack(TFCItems.oreChunk, 1, 10)); //Magnetite
		OreDictionary.registerOre("oreNormalIron", new ItemStack(TFCItems.oreChunk, 1, 11)); //Limonite
		OreDictionary.registerOre("oreSmallIron", new ItemStack(TFCItems.smallOreChunk, 1, 3)); //Hematite
		OreDictionary.registerOre("oreSmallIron", new ItemStack(TFCItems.smallOreChunk, 1, 10)); //Magnetite
		OreDictionary.registerOre("oreSmallIron", new ItemStack(TFCItems.smallOreChunk, 1, 11)); //Limonite		
		OreDictionary.registerOre("oreRichIron", new ItemStack(TFCItems.oreChunk, 1, 38)); //Hematite
		OreDictionary.registerOre("oreRichIron", new ItemStack(TFCItems.oreChunk, 1, 45)); //Magnetite
		OreDictionary.registerOre("oreRichIron", new ItemStack(TFCItems.oreChunk, 1, 46)); //Limonite		
		OreDictionary.registerOre("orePoorIron", new ItemStack(TFCItems.oreChunk, 1, 52)); //Hematite
		OreDictionary.registerOre("orePoorIron", new ItemStack(TFCItems.oreChunk, 1, 59)); //Magnetite
		OreDictionary.registerOre("orePoorIron", new ItemStack(TFCItems.oreChunk, 1, 60)); //Limonite

		OreDictionary.registerOre("oreNormalSilver", new ItemStack(TFCItems.oreChunk, 1, 4)); //Native Silver
		OreDictionary.registerOre("oreSmallSilver", new ItemStack(TFCItems.smallOreChunk, 1, 4)); //Native Silver
		OreDictionary.registerOre("oreRichSilver", new ItemStack(TFCItems.oreChunk, 1, 39)); //Native Silver
		OreDictionary.registerOre("orePoorSilver", new ItemStack(TFCItems.oreChunk, 1, 53)); //Native Silver

		OreDictionary.registerOre("oreNormalTin", new ItemStack(TFCItems.oreChunk, 1, 5)); //Cassiterite
		OreDictionary.registerOre("oreSmallTin", new ItemStack(TFCItems.smallOreChunk, 1, 5)); //Cassiterite
		OreDictionary.registerOre("oreRichTin", new ItemStack(TFCItems.oreChunk, 1, 40)); //Cassiterite
		OreDictionary.registerOre("orePoorTin", new ItemStack(TFCItems.oreChunk, 1, 54)); //Cassiterite

		OreDictionary.registerOre("oreNormalLead", new ItemStack(TFCItems.oreChunk, 1, 6)); //Galena
		OreDictionary.registerOre("oreSmallLead", new ItemStack(TFCItems.smallOreChunk, 1, 6)); //Galena
		OreDictionary.registerOre("oreRichLead", new ItemStack(TFCItems.oreChunk, 1, 41)); //Galena
		OreDictionary.registerOre("orePoorLead", new ItemStack(TFCItems.oreChunk, 1, 55)); //Galena

		OreDictionary.registerOre("oreNormalBismuth", new ItemStack(TFCItems.oreChunk, 1, 7)); //Bismuthinite
		OreDictionary.registerOre("oreSmallBismuth", new ItemStack(TFCItems.smallOreChunk, 1, 7)); //Bismuthinite
		OreDictionary.registerOre("oreRichBismuth", new ItemStack(TFCItems.oreChunk, 1, 42)); //Bismuthinite
		OreDictionary.registerOre("orePoorBismuth", new ItemStack(TFCItems.oreChunk, 1, 56)); //Bismuthinite

		OreDictionary.registerOre("oreNormalNickel", new ItemStack(TFCItems.oreChunk, 1, 8)); //Garnierite
		OreDictionary.registerOre("oreSmallNickel", new ItemStack(TFCItems.smallOreChunk, 1, 8)); //Garnierite
		OreDictionary.registerOre("oreRichNickel", new ItemStack(TFCItems.oreChunk, 1, 43)); //Garnierite
		OreDictionary.registerOre("orePoorNickel", new ItemStack(TFCItems.oreChunk, 1, 57)); //Garnierite

		OreDictionary.registerOre("oreNormalZinc", new ItemStack(TFCItems.oreChunk, 1, 12)); //Sphalerite
		OreDictionary.registerOre("oreSmallZinc", new ItemStack(TFCItems.smallOreChunk, 1, 12)); //Sphalerite
		OreDictionary.registerOre("oreRichZinc", new ItemStack(TFCItems.oreChunk, 1, 47)); //Sphalerite
		OreDictionary.registerOre("orePoorZinc", new ItemStack(TFCItems.oreChunk, 1, 61)); //Sphalerite

		OreDictionary.registerOre("oreCoal", new ItemStack(TFCItems.oreChunk, 1, 14)); //Bituminous Coal
		OreDictionary.registerOre("oreCoal", new ItemStack(TFCItems.oreChunk, 1, 15)); //Lignite

		OreDictionary.registerOre("oreKaolinite", new ItemStack(TFCItems.oreChunk, 1, 16));
		OreDictionary.registerOre("oreGypsum", new ItemStack(TFCItems.oreChunk, 1, 17));
		OreDictionary.registerOre("oreSatinspar", new ItemStack(TFCItems.oreChunk, 1, 18));
		OreDictionary.registerOre("oreSelenite", new ItemStack(TFCItems.oreChunk, 1, 19));
		OreDictionary.registerOre("oreGraphite", new ItemStack(TFCItems.oreChunk, 1, 20));
		OreDictionary.registerOre("oreDiamond", new ItemStack(TFCItems.oreChunk, 1, 21)); //Kimberlite
		OreDictionary.registerOre("orePetrifiedWood", new ItemStack(TFCItems.oreChunk, 1, 22));
		OreDictionary.registerOre("oreSulfur", new ItemStack(TFCItems.oreChunk, 1, 23));
		OreDictionary.registerOre("oreJet", new ItemStack(TFCItems.oreChunk, 1, 24));
		OreDictionary.registerOre("oreMicrocline", new ItemStack(TFCItems.oreChunk, 1, 25));
		OreDictionary.registerOre("oreUranium", new ItemStack(TFCItems.oreChunk, 1, 26)); //Pitchblende

		OreDictionary.registerOre("oreRedstone", new ItemStack(TFCItems.oreChunk, 1, 27)); //Cinnabar
		OreDictionary.registerOre("oreRedstone", new ItemStack(TFCItems.oreChunk, 1, 28)); //Cryolite

		OreDictionary.registerOre("oreSaltpeter", new ItemStack(TFCItems.oreChunk, 1, 29));
		OreDictionary.registerOre("oreSerpentine", new ItemStack(TFCItems.oreChunk, 1, 30));
		OreDictionary.registerOre("oreSylvite", new ItemStack(TFCItems.oreChunk, 1, 31));
		OreDictionary.registerOre("oreBorax", new ItemStack(TFCItems.oreChunk, 1, 32));
		OreDictionary.registerOre("oreOlivine", new ItemStack(TFCItems.oreChunk, 1, 33));
		OreDictionary.registerOre("oreLapis", new ItemStack(TFCItems.oreChunk, 1, 34));

		//Ore Powders
		OreDictionary.registerOre("dustFlux", new ItemStack(TFCItems.powder, 1, 0)); //Flux
		OreDictionary.registerOre("dustKaolinite", new ItemStack(TFCItems.powder, 1, 1)); //Kaolinite
		OreDictionary.registerOre("dustGraphite", new ItemStack(TFCItems.powder, 1, 2)); //Graphite
		OreDictionary.registerOre("dustSulfur", new ItemStack(TFCItems.powder, 1, 3)); //Sulfur
		OreDictionary.registerOre("dustSaltpeter", new ItemStack(TFCItems.powder, 1, 4)); //Saltpeter
		OreDictionary.registerOre("dustLapis", new ItemStack(TFCItems.powder, 1, 6)); //Lapis
		OreDictionary.registerOre("dustSalt", new ItemStack(TFCItems.powder, 1, 9)); //Salt

		//Ingots
		OreDictionary.registerOre("ingotBismuth", new ItemStack(TFCItems.bismuthIngot));
		OreDictionary.registerOre("ingotTin", new ItemStack(TFCItems.tinIngot));
		OreDictionary.registerOre("ingotZinc", new ItemStack(TFCItems.zincIngot));
		OreDictionary.registerOre("ingotCopper", new ItemStack(TFCItems.copperIngot));
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.bronzeIngot));
		OreDictionary.registerOre("ingotBismuthBronze", new ItemStack(TFCItems.bismuthBronzeIngot));
		OreDictionary.registerOre("ingotBlackBronze", new ItemStack(TFCItems.blackBronzeIngot));
		OreDictionary.registerOre("ingotBrass", new ItemStack(TFCItems.brassIngot));
		OreDictionary.registerOre("ingotLead", new ItemStack(TFCItems.leadIngot));
		OreDictionary.registerOre("ingotGold", new ItemStack(TFCItems.goldIngot));
		OreDictionary.registerOre("ingotRoseGold", new ItemStack(TFCItems.roseGoldIngot));
		OreDictionary.registerOre("ingotSilver", new ItemStack(TFCItems.silverIngot));
		OreDictionary.registerOre("ingotSterlingSilver", new ItemStack(TFCItems.sterlingSilverIngot));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(TFCItems.platinumIngot));
		OreDictionary.registerOre("ingotWroughtIron", new ItemStack(TFCItems.wroughtIronIngot));
		OreDictionary.registerOre("ingotIron", new ItemStack(TFCItems.wroughtIronIngot));
		OreDictionary.registerOre("ingotNickel", new ItemStack(TFCItems.nickelIngot));
		OreDictionary.registerOre("ingotPigIron", new ItemStack(TFCItems.pigIronIngot));
		OreDictionary.registerOre("ingotSteel", new ItemStack(TFCItems.steelIngot));
		OreDictionary.registerOre("ingotBlackSteel", new ItemStack(TFCItems.blackSteelIngot));
		OreDictionary.registerOre("ingotRedSteel", new ItemStack(TFCItems.redSteelIngot));
		OreDictionary.registerOre("ingotBlueSteel", new ItemStack(TFCItems.blueSteelIngot));
		OreDictionary.registerOre("ingotUnknown", new ItemStack(TFCItems.unknownIngot));

		//Double Ingots
		OreDictionary.registerOre("ingotDoubleBismuth", new ItemStack(TFCItems.bismuthIngot2x));
		OreDictionary.registerOre("ingotDoubleTin", new ItemStack(TFCItems.tinIngot2x));
		OreDictionary.registerOre("ingotDoubleZinc", new ItemStack(TFCItems.zincIngot2x));
		OreDictionary.registerOre("ingotDoubleCopper", new ItemStack(TFCItems.copperIngot2x));
		OreDictionary.registerOre("ingotDoubleBronze", new ItemStack(TFCItems.bronzeIngot2x));
		OreDictionary.registerOre("ingotDoubleBismuthBronze", new ItemStack(TFCItems.bismuthBronzeIngot2x));
		OreDictionary.registerOre("ingotDoubleBlackBronze", new ItemStack(TFCItems.blackBronzeIngot2x));
		OreDictionary.registerOre("ingotDoubleBrass", new ItemStack(TFCItems.brassIngot2x));
		OreDictionary.registerOre("ingotDoubleLead", new ItemStack(TFCItems.leadIngot2x));
		OreDictionary.registerOre("ingotDoubleGold", new ItemStack(TFCItems.goldIngot2x));
		OreDictionary.registerOre("ingotDoubleRoseGold", new ItemStack(TFCItems.roseGoldIngot2x));
		OreDictionary.registerOre("ingotDoubleSilver", new ItemStack(TFCItems.silverIngot2x));
		OreDictionary.registerOre("ingotDoubleSterlingSilver", new ItemStack(TFCItems.sterlingSilverIngot2x));
		OreDictionary.registerOre("ingotDoublePlatinum", new ItemStack(TFCItems.platinumIngot2x));
		OreDictionary.registerOre("ingotDoubleWroughtIron", new ItemStack(TFCItems.wroughtIronIngot2x));
		OreDictionary.registerOre("ingotDoubleNickel", new ItemStack(TFCItems.nickelIngot2x));
		OreDictionary.registerOre("ingotDoublePigIron", new ItemStack(TFCItems.pigIronIngot2x));
		OreDictionary.registerOre("ingotDoubleSteel", new ItemStack(TFCItems.steelIngot2x));
		OreDictionary.registerOre("ingotDoubleBlackSteel", new ItemStack(TFCItems.blackSteelIngot2x));
		OreDictionary.registerOre("ingotDoubleRedSteel", new ItemStack(TFCItems.redSteelIngot2x));
		OreDictionary.registerOre("ingotDoubleBlueSteel", new ItemStack(TFCItems.blueSteelIngot2x));

		//Sheets
		OreDictionary.registerOre("plateBismuth", new ItemStack(TFCItems.bismuthSheet));
		OreDictionary.registerOre("plateTin", new ItemStack(TFCItems.tinSheet));
		OreDictionary.registerOre("plateZinc", new ItemStack(TFCItems.zincSheet));
		OreDictionary.registerOre("plateCopper", new ItemStack(TFCItems.copperSheet));
		OreDictionary.registerOre("plateBronze", new ItemStack(TFCItems.bronzeSheet));
		OreDictionary.registerOre("plateBismuthBronze", new ItemStack(TFCItems.bismuthBronzeSheet));
		OreDictionary.registerOre("plateBlackBronze", new ItemStack(TFCItems.blackBronzeSheet));
		OreDictionary.registerOre("plateBrass", new ItemStack(TFCItems.brassSheet));
		OreDictionary.registerOre("plateLead", new ItemStack(TFCItems.leadSheet));
		OreDictionary.registerOre("plateGold", new ItemStack(TFCItems.goldSheet));
		OreDictionary.registerOre("plateRoseGold", new ItemStack(TFCItems.roseGoldSheet));
		OreDictionary.registerOre("plateSilver", new ItemStack(TFCItems.silverSheet));
		OreDictionary.registerOre("plateSterlingSilver", new ItemStack(TFCItems.sterlingSilverSheet));
		OreDictionary.registerOre("platePlatinum", new ItemStack(TFCItems.platinumSheet));
		OreDictionary.registerOre("plateWroughtIron", new ItemStack(TFCItems.wroughtIronSheet));
		OreDictionary.registerOre("plateNickel", new ItemStack(TFCItems.nickelSheet));
		OreDictionary.registerOre("platePigIron", new ItemStack(TFCItems.pigIronSheet));
		OreDictionary.registerOre("plateSteel", new ItemStack(TFCItems.steelSheet));
		OreDictionary.registerOre("plateBlackSteel", new ItemStack(TFCItems.blackSteelSheet));
		OreDictionary.registerOre("plateRedSteel", new ItemStack(TFCItems.redSteelSheet));
		OreDictionary.registerOre("plateBlueSteel", new ItemStack(TFCItems.blueSteelSheet));

		//Double Sheets
		OreDictionary.registerOre("plateDoubleBismuth", new ItemStack(TFCItems.bismuthSheet2x));
		OreDictionary.registerOre("plateDoubleTin", new ItemStack(TFCItems.tinSheet2x));
		OreDictionary.registerOre("plateDoubleZinc", new ItemStack(TFCItems.zincSheet2x));
		OreDictionary.registerOre("plateDoubleCopper", new ItemStack(TFCItems.copperSheet2x));
		OreDictionary.registerOre("plateDoubleBronze", new ItemStack(TFCItems.bronzeSheet2x));
		OreDictionary.registerOre("plateDoubleBismuthBronze", new ItemStack(TFCItems.bismuthBronzeSheet2x));
		OreDictionary.registerOre("plateDoubleBlackBronze", new ItemStack(TFCItems.blackBronzeSheet2x));
		OreDictionary.registerOre("plateDoubleBrass", new ItemStack(TFCItems.brassSheet2x));
		OreDictionary.registerOre("plateDoubleLead", new ItemStack(TFCItems.leadSheet2x));
		OreDictionary.registerOre("plateDoubleGold", new ItemStack(TFCItems.goldSheet2x));
		OreDictionary.registerOre("plateDoubleRoseGold", new ItemStack(TFCItems.roseGoldSheet2x));
		OreDictionary.registerOre("plateDoubleSilver", new ItemStack(TFCItems.silverSheet2x));
		OreDictionary.registerOre("plateDoubleSterlingSilver", new ItemStack(TFCItems.sterlingSilverSheet2x));
		OreDictionary.registerOre("plateDoublePlatinum", new ItemStack(TFCItems.platinumSheet2x));
		OreDictionary.registerOre("plateDoubleWroughtIron", new ItemStack(TFCItems.wroughtIronSheet2x));
		OreDictionary.registerOre("plateDoubleNickel", new ItemStack(TFCItems.nickelSheet2x));
		OreDictionary.registerOre("plateDoublePigIron", new ItemStack(TFCItems.pigIronSheet2x));
		OreDictionary.registerOre("plateDoubleSteel", new ItemStack(TFCItems.steelSheet2x));
		OreDictionary.registerOre("plateDoubleBlackSteel", new ItemStack(TFCItems.blackSteelSheet2x));
		OreDictionary.registerOre("plateDoubleRedSteel", new ItemStack(TFCItems.redSteelSheet2x));
		OreDictionary.registerOre("plateDoubleBlueSteel", new ItemStack(TFCItems.blueSteelSheet2x));

		OreDictionary.registerOre("plateDoubleAnyBronze", new ItemStack(TFCItems.bronzeSheet2x));
		OreDictionary.registerOre("plateDoubleAnyBronze", new ItemStack(TFCItems.bismuthBronzeSheet2x));
		OreDictionary.registerOre("plateDoubleAnyBronze", new ItemStack(TFCItems.blackBronzeSheet2x));

		//Gems
		OreDictionary.registerOre("gemChippedAgate", new ItemStack(TFCItems.gemAgate));
		OreDictionary.registerOre("gemChippedAmethyst", new ItemStack(TFCItems.gemAmethyst));
		OreDictionary.registerOre("gemChippedBeryl", new ItemStack(TFCItems.gemBeryl));
		OreDictionary.registerOre("gemChippedDiamond", new ItemStack(TFCItems.gemDiamond));
		OreDictionary.registerOre("gemChippedEmerald", new ItemStack(TFCItems.gemEmerald));
		OreDictionary.registerOre("gemChippedGarnet", new ItemStack(TFCItems.gemGarnet));
		OreDictionary.registerOre("gemChippedJade", new ItemStack(TFCItems.gemJade));
		OreDictionary.registerOre("gemChippedJasper", new ItemStack(TFCItems.gemJasper));
		OreDictionary.registerOre("gemChippedOpal", new ItemStack(TFCItems.gemOpal));
		OreDictionary.registerOre("gemChippedRuby", new ItemStack(TFCItems.gemRuby));
		OreDictionary.registerOre("gemChippedSapphire", new ItemStack(TFCItems.gemSapphire));
		OreDictionary.registerOre("gemChippedTopaz", new ItemStack(TFCItems.gemTopaz));
		OreDictionary.registerOre("gemChippedTourmaline", new ItemStack(TFCItems.gemTourmaline));

		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemAgate));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemAmethyst));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemBeryl));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemDiamond));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemEmerald));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemGarnet));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemJade));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemJasper));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemOpal));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemRuby));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemSapphire));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemTopaz));
		OreDictionary.registerOre("gemChipped", new ItemStack(TFCItems.gemTourmaline));

		OreDictionary.registerOre("gemFlawedAgate", new ItemStack(TFCItems.gemAgate, 1, 1));
		OreDictionary.registerOre("gemFlawedAmethyst", new ItemStack(TFCItems.gemAmethyst, 1, 1));
		OreDictionary.registerOre("gemFlawedBeryl", new ItemStack(TFCItems.gemBeryl, 1, 1));
		OreDictionary.registerOre("gemFlawedDiamond", new ItemStack(TFCItems.gemDiamond, 1, 1));
		OreDictionary.registerOre("gemFlawedEmerald", new ItemStack(TFCItems.gemEmerald, 1, 1));
		OreDictionary.registerOre("gemFlawedGarnet", new ItemStack(TFCItems.gemGarnet, 1, 1));
		OreDictionary.registerOre("gemFlawedJade", new ItemStack(TFCItems.gemJade, 1, 1));
		OreDictionary.registerOre("gemFlawedJasper", new ItemStack(TFCItems.gemJasper, 1, 1));
		OreDictionary.registerOre("gemFlawedOpal", new ItemStack(TFCItems.gemOpal, 1, 1));
		OreDictionary.registerOre("gemFlawedRuby", new ItemStack(TFCItems.gemRuby, 1, 1));
		OreDictionary.registerOre("gemFlawedSapphire", new ItemStack(TFCItems.gemSapphire, 1, 1));
		OreDictionary.registerOre("gemFlawedTopaz", new ItemStack(TFCItems.gemTopaz, 1, 1));
		OreDictionary.registerOre("gemFlawedTourmaline", new ItemStack(TFCItems.gemTourmaline, 1, 1));

		OreDictionary.registerOre("gemAgate", new ItemStack(TFCItems.gemAgate, 1, 2));
		OreDictionary.registerOre("gemAmethyst", new ItemStack(TFCItems.gemAmethyst, 1, 2));
		OreDictionary.registerOre("gemBeryl", new ItemStack(TFCItems.gemBeryl, 1, 2));
		OreDictionary.registerOre("gemDiamond", new ItemStack(TFCItems.gemDiamond, 1, 2));
		OreDictionary.registerOre("gemEmerald", new ItemStack(TFCItems.gemEmerald, 1, 2));
		OreDictionary.registerOre("gemGarnet", new ItemStack(TFCItems.gemGarnet, 1, 2));
		OreDictionary.registerOre("gemJade", new ItemStack(TFCItems.gemJade, 1, 2));
		OreDictionary.registerOre("gemJasper", new ItemStack(TFCItems.gemJasper, 1, 2));
		OreDictionary.registerOre("gemOpal", new ItemStack(TFCItems.gemOpal, 1, 2));
		OreDictionary.registerOre("gemRuby", new ItemStack(TFCItems.gemRuby, 1, 2));
		OreDictionary.registerOre("gemSapphire", new ItemStack(TFCItems.gemSapphire, 1, 2));
		OreDictionary.registerOre("gemTopaz", new ItemStack(TFCItems.gemTopaz, 1, 2));
		OreDictionary.registerOre("gemTourmaline", new ItemStack(TFCItems.gemTourmaline, 1, 2));

		OreDictionary.registerOre("gemFlawlessAgate", new ItemStack(TFCItems.gemAgate, 1, 3));
		OreDictionary.registerOre("gemFlawlessAmethyst", new ItemStack(TFCItems.gemAmethyst, 1, 3));
		OreDictionary.registerOre("gemFlawlessBeryl", new ItemStack(TFCItems.gemBeryl, 1, 3));
		OreDictionary.registerOre("gemFlawlessDiamond", new ItemStack(TFCItems.gemDiamond, 1, 3));
		OreDictionary.registerOre("gemFlawlessEmerald", new ItemStack(TFCItems.gemEmerald, 1, 3));
		OreDictionary.registerOre("gemFlawlessGarnet", new ItemStack(TFCItems.gemGarnet, 1, 3));
		OreDictionary.registerOre("gemFlawlessJade", new ItemStack(TFCItems.gemJade, 1, 3));
		OreDictionary.registerOre("gemFlawlessJasper", new ItemStack(TFCItems.gemJasper, 1, 3));
		OreDictionary.registerOre("gemFlawlessOpal", new ItemStack(TFCItems.gemOpal, 1, 3));
		OreDictionary.registerOre("gemFlawlessRuby", new ItemStack(TFCItems.gemRuby, 1, 3));
		OreDictionary.registerOre("gemFlawlessSapphire", new ItemStack(TFCItems.gemSapphire, 1, 3));
		OreDictionary.registerOre("gemFlawlessTopaz", new ItemStack(TFCItems.gemTopaz, 1, 3));
		OreDictionary.registerOre("gemFlawlessTourmaline", new ItemStack(TFCItems.gemTourmaline, 1, 3));

		OreDictionary.registerOre("gemExquisiteAgate", new ItemStack(TFCItems.gemAgate, 1, 4));
		OreDictionary.registerOre("gemExquisiteAmethyst", new ItemStack(TFCItems.gemAmethyst, 1, 4));
		OreDictionary.registerOre("gemExquisiteBeryl", new ItemStack(TFCItems.gemBeryl, 1, 4));
		OreDictionary.registerOre("gemExquisiteDiamond", new ItemStack(TFCItems.gemDiamond, 1, 4));
		OreDictionary.registerOre("gemExquisiteEmerald", new ItemStack(TFCItems.gemEmerald, 1, 4));
		OreDictionary.registerOre("gemExquisiteGarnet", new ItemStack(TFCItems.gemGarnet, 1, 4));
		OreDictionary.registerOre("gemExquisiteJade", new ItemStack(TFCItems.gemJade, 1, 4));
		OreDictionary.registerOre("gemExquisiteJasper", new ItemStack(TFCItems.gemJasper, 1, 4));
		OreDictionary.registerOre("gemExquisiteOpal", new ItemStack(TFCItems.gemOpal, 1, 4));
		OreDictionary.registerOre("gemExquisiteRuby", new ItemStack(TFCItems.gemRuby, 1, 4));
		OreDictionary.registerOre("gemExquisiteSapphire", new ItemStack(TFCItems.gemSapphire, 1, 4));
		OreDictionary.registerOre("gemExquisiteTopaz", new ItemStack(TFCItems.gemTopaz, 1, 4));
		OreDictionary.registerOre("gemExquisiteTourmaline", new ItemStack(TFCItems.gemTourmaline, 1, 4));

		//Fuel
		OreDictionary.registerOre("gemCoal", new ItemStack(Items.coal, 1, 0));
		OreDictionary.registerOre("gemCoal", new ItemStack(TFCItems.coal, 1, 0));
		OreDictionary.registerOre("gemCharcoal", new ItemStack(Items.coal, 1, 1));
		OreDictionary.registerOre("gemCharcoal", new ItemStack(TFCItems.coal, 1, 1));

		//Stone
		OreDictionary.registerOre("stone", new ItemStack(TFCBlocks.stoneIgEx, 1, WILD));
		OreDictionary.registerOre("stone", new ItemStack(TFCBlocks.stoneIgIn, 1, WILD));
		OreDictionary.registerOre("stone", new ItemStack(TFCBlocks.stoneMM, 1, WILD));
		OreDictionary.registerOre("stone", new ItemStack(TFCBlocks.stoneSed, 1, WILD));

		//Cobblestone
		OreDictionary.registerOre("cobblestone", new ItemStack(TFCBlocks.stoneIgExCobble, 1, WILD));
		OreDictionary.registerOre("cobblestone", new ItemStack(TFCBlocks.stoneIgInCobble, 1, WILD));
		OreDictionary.registerOre("cobblestone", new ItemStack(TFCBlocks.stoneMMCobble, 1, WILD));
		OreDictionary.registerOre("cobblestone", new ItemStack(TFCBlocks.stoneSedCobble, 1, WILD));

		OreDictionary.registerOre("stoneCobble", new ItemStack(TFCBlocks.stoneIgExCobble, 1, WILD));
		OreDictionary.registerOre("stoneCobble", new ItemStack(TFCBlocks.stoneIgInCobble, 1, WILD));
		OreDictionary.registerOre("stoneCobble", new ItemStack(TFCBlocks.stoneMMCobble, 1, WILD));
		OreDictionary.registerOre("stoneCobble", new ItemStack(TFCBlocks.stoneSedCobble, 1, WILD));

		//Stone Bricks
		OreDictionary.registerOre("stoneBricks", new ItemStack(Blocks.stonebrick));
		OreDictionary.registerOre("stoneBricks", new ItemStack(TFCBlocks.stoneIgExBrick, 1, WILD));
		OreDictionary.registerOre("stoneBricks", new ItemStack(TFCBlocks.stoneIgInBrick, 1, WILD));
		OreDictionary.registerOre("stoneBricks", new ItemStack(TFCBlocks.stoneMMBrick, 1, WILD));
		OreDictionary.registerOre("stoneBricks", new ItemStack(TFCBlocks.stoneSedBrick, 1, WILD));

		//Smooth Stone
		OreDictionary.registerOre("stoneSmooth", new ItemStack(TFCBlocks.stoneIgExSmooth, 1, WILD));
		OreDictionary.registerOre("stoneSmooth", new ItemStack(TFCBlocks.stoneIgInSmooth, 1, WILD));
		OreDictionary.registerOre("stoneSmooth", new ItemStack(TFCBlocks.stoneMMSmooth, 1, WILD));
		OreDictionary.registerOre("stoneSmooth", new ItemStack(TFCBlocks.stoneSedSmooth, 1, WILD));

		//Crafting Table
		OreDictionary.registerOre("craftingTableWood", new ItemStack(TFCBlocks.workbench));
		OreDictionary.registerOre("craftingTableWood", new ItemStack(Blocks.crafting_table));

		//Dyes
		OreDictionary.registerOre("dyeBlack", new ItemStack(TFCItems.dye, 1, 0));
		OreDictionary.registerOre("dyeRed", new ItemStack(TFCItems.powder, 1, 5));
		OreDictionary.registerOre("dyeRed", new ItemStack(TFCItems.dye, 1, 1));
		OreDictionary.registerOre("dyeGreen", new ItemStack(TFCItems.powder, 1, 8));
		OreDictionary.registerOre("dyeGreen", new ItemStack(TFCItems.dye, 1, 2));
		OreDictionary.registerOre("dyeBrown", new ItemStack(TFCItems.dye, 1, 3));
		OreDictionary.registerOre("dyeBlue", new ItemStack(TFCItems.powder, 1, 6));
		OreDictionary.registerOre("dyeBlue", new ItemStack(TFCItems.dye, 1, 4));
		OreDictionary.registerOre("dyePurple", new ItemStack(TFCItems.dye, 1, 5));
		OreDictionary.registerOre("dyeCyan", new ItemStack(TFCItems.dye, 1, 6));
		OreDictionary.registerOre("dyeLightGray", new ItemStack(TFCItems.dye, 1, 7));
		OreDictionary.registerOre("dyeGray", new ItemStack(TFCItems.dye, 1, 8));
		OreDictionary.registerOre("dyePink", new ItemStack(TFCItems.dye, 1, 9));
		OreDictionary.registerOre("dyeLime", new ItemStack(TFCItems.dye, 1, 10));
		OreDictionary.registerOre("dyeYellow", new ItemStack(TFCItems.powder, 1, 7));
		OreDictionary.registerOre("dyeYellow", new ItemStack(TFCItems.dye, 1, 11));
		OreDictionary.registerOre("dyeLightBlue", new ItemStack(TFCItems.dye, 1, 12));
		OreDictionary.registerOre("dyeMagenta", new ItemStack(TFCItems.dye, 1, 13));
		OreDictionary.registerOre("dyeOrange", new ItemStack(TFCItems.dye, 1, 14));
		OreDictionary.registerOre("dyeWhite", new ItemStack(TFCItems.dye, 1, 15));

		//Materials
		OreDictionary.registerOre("materialLeather", new ItemStack(Items.leather));
		OreDictionary.registerOre("materialLeather", new ItemStack(TFCItems.leather));

		OreDictionary.registerOre("materialString", new ItemStack(Items.string));
		OreDictionary.registerOre("materialString", new ItemStack(TFCItems.woolYarn));

		OreDictionary.registerOre("materialCloth", new ItemStack(TFCItems.woolCloth));
		OreDictionary.registerOre("materialCloth", new ItemStack(TFCItems.silkCloth));
		OreDictionary.registerOre("materialWool", new ItemStack(TFCItems.wool, 1, WILD));

		//Tools
		for (Item chisel : Recipes.chisels)
			OreDictionary.registerOre("itemChisel", new ItemStack(chisel, 1, WILD));

		for (Item hammer : Recipes.hammers)
			OreDictionary.registerOre("itemHammer", new ItemStack(hammer, 1, WILD));

		for (Item knife : Recipes.knives)
			OreDictionary.registerOre("itemKnife", new ItemStack(knife, 1, WILD));

		for (Item saw : Recipes.saws)
			OreDictionary.registerOre("itemSaw", new ItemStack(saw, 1, WILD));

		//Miscellaneous Items
		OreDictionary.registerOre("lumpClay", new ItemStack(Items.clay_ball));
		OreDictionary.registerOre("lumpClay", new ItemStack(TFCItems.clayBall, 1, 0));

		OreDictionary.registerOre("itemArrow", new ItemStack(Items.arrow));
		OreDictionary.registerOre("itemArrow", new ItemStack(TFCItems.arrow));

		OreDictionary.registerOre("itemReed", new ItemStack(Items.reeds));
		OreDictionary.registerOre("itemReed", new ItemStack(TFCItems.reeds));

		OreDictionary.registerOre("itemRock", new ItemStack(TFCItems.looseRock, 1, WILD));

		OreDictionary.registerOre("bucketEmpty", new ItemStack(Items.bucket));
		OreDictionary.registerOre("bucketEmpty", new ItemStack(TFCItems.woodenBucketEmpty));
		OreDictionary.registerOre("bucketEmpty", new ItemStack(TFCItems.redSteelBucketEmpty));
		OreDictionary.registerOre("bucketEmpty", new ItemStack(TFCItems.blueSteelBucketEmpty));

		OreDictionary.registerOre("bucketWater", new ItemStack(Items.water_bucket));
		OreDictionary.registerOre("bucketWater", new ItemStack(TFCItems.woodenBucketWater, 1, WILD));
		OreDictionary.registerOre("bucketWater", new ItemStack(TFCItems.redSteelBucketWater, 1, WILD));
		OreDictionary.registerOre("bucketWater", new ItemStack(TFCItems.woodenBucketSaltWater, 1, WILD));
		OreDictionary.registerOre("bucketWater", new ItemStack(TFCItems.redSteelBucketSaltWater, 1, WILD));

		OreDictionary.registerOre("bucketFreshWater", new ItemStack(TFCItems.woodenBucketWater, 1, WILD));
		OreDictionary.registerOre("bucketFreshWater", new ItemStack(TFCItems.redSteelBucketWater, 1, WILD));

		OreDictionary.registerOre("bucketSaltWater", new ItemStack(TFCItems.woodenBucketSaltWater, 1, WILD));
		OreDictionary.registerOre("bucketSaltWater", new ItemStack(TFCItems.redSteelBucketSaltWater, 1, WILD));

		OreDictionary.registerOre("bucketLava", new ItemStack(Items.lava_bucket));
		OreDictionary.registerOre("bucketLava", new ItemStack(TFCItems.blueSteelBucketLava));

		OreDictionary.registerOre("bucketMilk", new ItemStack(Items.milk_bucket));
		OreDictionary.registerOre("bucketMilk", new ItemStack(TFCItems.woodenBucketMilk));

		//Miscellaneous Blocks
		OreDictionary.registerOre("blockSand", new ItemStack(Blocks.sand));
		OreDictionary.registerOre("blockSand", new ItemStack(TFCBlocks.sand, 1, WILD));
		OreDictionary.registerOre("blockSand", new ItemStack(TFCBlocks.sand2, 1, WILD));

		OreDictionary.registerOre("blockDirt", new ItemStack(Blocks.dirt));
		OreDictionary.registerOre("blockDirt", new ItemStack(TFCBlocks.dirt, 1, WILD));
		OreDictionary.registerOre("blockDirt", new ItemStack(TFCBlocks.dirt2, 1, WILD));

		OreDictionary.registerOre("blockTorch", new ItemStack(Blocks.torch));
		OreDictionary.registerOre("blockTorch", new ItemStack(TFCBlocks.torch));

		OreDictionary.registerOre("blockPumpkin", new ItemStack(Blocks.pumpkin));
		OreDictionary.registerOre("blockPumpkin", new ItemStack(TFCBlocks.pumpkin));
		OreDictionary.registerOre("blockLitPumpkin", new ItemStack(Blocks.lit_pumpkin));
		OreDictionary.registerOre("blockLitPumpkin", new ItemStack(TFCBlocks.litPumpkin));
	}
}
