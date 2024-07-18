package diamondore.content;

import arc.graphics.*;
import arc.graphics.g2d.TextureRegion;
import arc.struct.*;
import mindustry.content.*;
import mindustry.content.Blocks;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;

public class DOBlocks{
    public static Block ancientDebris, ancientMetalDecay, ancientMetalPanelDamaged, ancientMetalPanel, ancientMetalTileDamaged, ancientMetalTile, ancientMetal, ancientVentHorizontal, ancientVentVertical, ancientVent, ancientWreckage, darkSporePine, darkmoss, darkmossRocks, sporeClusterDark, sporeDarkmoss, sporeWaterDeep, sporeWaterDeepEdge, sporeWaterEdge, sporeWater, sporeCluster,  
    
    oreAncientScrap, oreDiamond, 
    
    crystalCell, largeCrystalCell, matrixProcessor, superMatrixProcessor, ultraMatrixProcessor, 
    
    ancientMetalWall, largeAncientMetalWall, hugeAncientMetalWall, giganticAncientMetalWall, diamondWall, largeDiamondWall, hugeDiamondWall, giganticDiamondWall, darkSporeBlock, largeDarkSporeBlock, crystallizedDoor, largeCrystallizedDoor, 
    
    diamondDrill, miniDiamondDrill, organicDrill, omniDrill, precisionOmniDrill, advancedCultivator, darkCultivator, ancientOilDrill, aquaDrill, 
    
    ancientPump, cryoPump, ancientMetalConduit, crystalConduit, ancientLiquidBridge, ancientLiquidTank, ancientLiquidRepository, bulkLiquidTank, 
    
    ancientMetalConveyor, crystalConveyor, massConveyor, sporeConveyor, ancientItemBridge, massDistributor, omegaRouter, bulkDriver, 
    
    ancientADM, ancientContainer, ancientCrate, ancientEnergyShield, ancientHasteObelisk, ancientLaunchSilo, ancientMendingObelisk, ancientRepository, ancientUnloader, ancientVault, cargoLaunchPad, cryoDiamondVault, cryoDriveProjector, diamondVault, omniVault, phaseMender, 
    
    ancientBatteryLarge, ancientBattery, ancientDecaygen, ancientEnergyNodeLarge, ancientEnergyNode, ancientHeatPanel, ancientSolarGenerator, differentialReactor, reinforcedPowerDistributor, diamondSolarPanel, surgeReactor, surgeBattery, 
    
    ancientForge, ancientRefinery, bulkFurnace, bulkBlender, bulkSeparator, cryogemCompressor, cryogemDissipator, darkSporePress, diamondSynthesizer, bulkCentrifuge, industrialDiamondPress, largeAncientForge, bulkMelter, bulkBlastMixer, bulkCompressor, bulkPyratiteMixer, bulkSmelter, mutator, stringSolidifier, stringMaker, alloySurgeForge, waterDecorruptor, 
    
    beastFactory, faeFactory, warshipFactory, swarmFactory, cataclysmFactory, abyssalFactory, hardenedReconstructor, ancientReconstructor;

    public static void load() {
        ((Reconstructor) Blocks.additiveReconstructor).addUpgrade(DOUnitTypes.sparrow, DOUnitTypes.crow);
        ((Reconstructor) Blocks.additiveReconstructor).addUpgrade(DOUnitTypes.spriite, DOUnitTypes.gnome);
        ((Reconstructor) Blocks.additiveReconstructor).addUpgrade(DOUnitTypes.scout, DOUnitTypes.fighter);
        ((Reconstructor) Blocks.additiveReconstructor).addUpgrade(DOUnitTypes.gnat, DOUnitTypes.firefly);
        ((Reconstructor) Blocks.additiveReconstructor).addUpgrade(DOUnitTypes.squall, DOUnitTypes.derecho);
        ((Reconstructor) Blocks.additiveReconstructor).addUpgrade(DOUnitTypes.siren, DOUnitTypes.serpent);
        ((Reconstructor) Blocks.multiplicativeReconstructor).addUpgrade(DOUnitTypes.crow, DOUnitTypes.owl);
        ((Reconstructor) Blocks.multiplicativeReconstructor).addUpgrade(DOUnitTypes.gnome, DOUnitTypes.pixie);
        ((Reconstructor) Blocks.multiplicativeReconstructor).addUpgrade(DOUnitTypes.fighter, DOUnitTypes.destroyer);
        ((Reconstructor) Blocks.multiplicativeReconstructor).addUpgrade(DOUnitTypes.firefly, DOUnitTypes.beetle);
        ((Reconstructor) Blocks.multiplicativeReconstructor).addUpgrade(DOUnitTypes.derecho, DOUnitTypes.blizzard);
        ((Reconstructor) Blocks.multiplicativeReconstructor).addUpgrade(DOUnitTypes.serpent, DOUnitTypes.scylla);
        
        //Section Environment
        
        ancientDebris = new OreBlock("ancient-debris", DOItems.ancientAlloy){{
            playerUnmineable = true;
            oreDefault = true;
            variants = 8;
            oreScale = 9f;
            oreThreshold = 0.96f;
        }};
        
        ancientMetal = new StaticWall("ancient-metal"){{
            variants = 5;
            fillsTile = false;
        }};
        
        ancientMetalDecay = new StaticWall("ancient-metal-decay"){{
            variants = 5;
            fillsTile = false;
        }};
        
        ancientMetalPanel = new Floor("ancient-metal-panel"){{
            blendGroup = ancientMetalTile;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            decoration = DOBlocks.ancientWreckage;
            wall = DOBlocks.ancientMetal;
        }};
        
        ancientMetalPanelDamaged = new Floor("ancient-metal-panel-damaged"){{
            blendGroup = ancientMetalTile;
            variants = 9;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            decoration = DOBlocks.ancientWreckage;
            wall = DOBlocks.ancientMetalDecay;
        }};
        
        ancientMetalTile = new Floor("ancient-metal-tile"){{
            blendGroup = ancientMetalTile;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            decoration = DOBlocks.ancientWreckage;
            wall = DOBlocks.ancientMetal;
        }};
        
        ancientMetalTileDamaged = new Floor("ancient-metal-tile-damaged"){{
            blendGroup = ancientMetalTile;
            variants = 9;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            decoration = DOBlocks.ancientWreckage;
            wall = DOBlocks.ancientMetalDecay;
        }};
        
        ancientVent = new Floor("ancient-vent"){{
            walkEffect = Fx.none;
            blendGroup = ancientMetalTile;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            attributes.set(Attribute.heat, 1f);
            attributes.set(Attribute.water, 1f);
        }};
        
        ancientVentHorizontal = new Floor("ancient-vent-horizontal"){{
            walkEffect = Fx.none;
            blendGroup = ancientMetalTile;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            attributes.set(Attribute.heat, 1f);
            attributes.set(Attribute.water, 1f);
        }};
        
        ancientVentVertical = new Floor("ancient-vent-vertical"){{
            walkEffect = Fx.none;
            blendGroup = ancientMetalTile;
            walkSound = DOSounds.ancientMetalStep;
            walkSoundVolume = 0.8f;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 1.5f;
            attributes.set(Attribute.heat, 1f);
            attributes.set(Attribute.water, 1f);
        }};
        
        ancientWreckage = new Prop("ancient-wreckage"){{
            requirements(Category.effect, BuildVisibility.editorOnly, with(DOItems.ancientScrap, 12));
            variants = 5;
            replaceable = false;
            buildCostMultiplier = 60f;
        }};
        
        darkmoss = new Floor("darkmoss"){{
            variants = 6;
            dragMultiplier = 1.5f;
            speedMultiplier = 0.95f;
            walkEffect = Fx.none;
            wall = DOBlocks.darkmossRocks;
            decoration = DOBlocks.sporeClusterDark;
            attributes.set(Attribute.spores, 0.25f);
            attributes.set(Attribute.water, 0.125f);
            attributes.set(Attribute.oil, 0.9f);
        }};
        
        darkmossRocks = new StaticWall("darkmoss-rocks"){{
            variants = 9;
        }};
        
        darkSporePine = new StaticTree("dark-spore-pine");
        
        oreAncientScrap = new OreBlock("ore-ancient-scrap", DOItems.ancientScrap){{
            playerUnmineable = true;
            oreDefault = true;
            variants = 6;
            oreScale = 20f;
            oreThreshold = 0.9f;
        }};
        
        oreDiamond = new OreBlock("ore-diamond", DOItems.diamond){{
            playerUnmineable = true;
            oreDefault = true;
            variants = 6;
            oreScale = 19.7f;
            oreThreshold = 0.917f;
        }};
        
        sporeClusterDark = new Prop("spore-cluster-dark"){{
            requirements(Category.effect, BuildVisibility.editorOnly, with(DOItems.darkSporePod, 8));
            variants = 6;
        }};
        
        sporeDarkmoss = new Floor("spore-darkmoss"){{
            variants = 6;
            dragMultiplier = 1.5f;
            speedMultiplier = 0.925f;
            walkEffect = Fx.none;
            wall = DOBlocks.darkmossRocks;
            decoration = DOBlocks.sporeClusterDark;
            attributes.set(Attribute.spores, 0.45f);
            attributes.set(Attribute.water, 0.25f);
            attributes.set(Attribute.oil, 1.3f);
        }};

        sporeWaterEdge = new Floor("spore-water-edge"){{
            dragMultiplier = 2.5f;
            speedMultiplier = 0.25f;
            status = StatusEffects.corroded;
            statusDuration = 150;
            walkEffect = Fx.sapped;
            drownUpdateEffect = Fx.melting;
            cacheLayer = CacheLayer.water;
            walkSound = DOSounds.sporeWaterWalk;
            isLiquid = true;
            liquidDrop = DOLiquids.corruptWater;
            blendGroup = Blocks.water;
            attributes.set(Attribute.spores, 0.75f);
            attributes.set(Attribute.oil, 4f);
        }};
        
        sporeWater = new Floor("spore-water"){{
            variants = 6;
            dragMultiplier = 2.5f;
            speedMultiplier = 0.25f;
            status = StatusEffects.corroded;
            statusDuration = 150;
            walkEffect = Fx.sapped;
            drownUpdateEffect = Fx.melting;
            cacheLayer = CacheLayer.water;
            walkSound = DOSounds.sporeWaterWalk;
            isLiquid = true;
            liquidDrop = DOLiquids.corruptWater;
            blendGroup = Blocks.water;
            edge = "spore-water-edge";
            attributes.set(Attribute.spores, 0.75f);
            attributes.set(Attribute.oil, 4f);
        }};

        sporeWaterDeepEdge = new Floor("spore-water-deep-edge"){{
            dragMultiplier = 2.5f;
            liquidMultiplier = 1.8f;
            speedMultiplier = 0.125f;
            status = StatusEffects.corroded;
            statusDuration = 300f;
            walkEffect = Fx.sapped;
            drownUpdateEffect = Fx.melting;
            cacheLayer = CacheLayer.water;
            walkSound = DOSounds.sporeWaterWalk;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 0.9f;
            isLiquid = true;
            liquidDrop = DOLiquids.corruptWater;
            blendGroup = Blocks.water;
            drownTime = 90f;
            attributes.set(Attribute.spores, 1f);
        }};
        
        sporeWaterDeep = new Floor("spore-water-deep"){{
            variants = 6;
            dragMultiplier = 2.5f;
            liquidMultiplier = 1.8f;
            speedMultiplier = 0.125f;
            status = StatusEffects.corroded;
            statusDuration = 300f;
            walkEffect = Fx.sapped;
            drownUpdateEffect = Fx.melting;
            cacheLayer = CacheLayer.water;
            walkSound = DOSounds.sporeWaterWalk;
            walkSoundPitchMin = 0.6f;
            walkSoundPitchMax = 0.9f;
            isLiquid = true;
            liquidDrop = DOLiquids.corruptWater;
            blendGroup = Blocks.water;
            edge = "spore-water-deep-edge";
            drownTime = 90f;
            attributes.set(Attribute.spores, 1f);
        }};
        
        //Section Logic
        
        crystalCell = new MemoryBlock("crystal-cell"){{
            requirements(Category.logic, with(Items.graphite, 50, Items.silicon, 200, Items.metaglass, 50, Items.titanium, 15, Items.plastanium, 15, Items.phaseFabric, 15, DOItems.diamond, 30));
            health = 400;
            memoryCapacity = 96;
        }};
        
        largeCrystalCell = new MemoryBlock("large-crystal-cell"){{
            requirements(Category.logic, with(Items.graphite, 250, Items.silicon, 600, Items.metaglass, 250, Items.titanium, 75, Items.plastanium, 75, Items.surgeAlloy, 25, Items.phaseFabric, 75, DOItems.diamond, 150, DOItems.cryogem, 45));
            health = 1600;
            memoryCapacity = 768;
            buildCostMultiplier = 0.55f;
            size = 2;
        }};
        
        matrixProcessor = new LogicBlock("matrix-processor"){{
            requirements(Category.logic, with(Items.lead, 800, Items.silicon, 200, Items.surgeAlloy, 105, DOItems.diamond, 55, DOItems.cryogem, 35));
            health = 300;
            range = 120;
            instructionsPerTick = 5;
            buildCostMultiplier = 0.325f;
            hasPower = true;
            consumePower(2f);
        }};
        
        superMatrixProcessor = new LogicBlock("super-matrix-processor"){{
            requirements(Category.logic, with(Items.copper, 900, Items.lead, 1300, Items.silicon, 450, Items.surgeAlloy, 325, DOItems.diamond, 170, DOItems.cryogem, 200));
            health = 1200;
            size = 2;
            range = 300;
            instructionsPerTick = 30;
            buildCostMultiplier = 0.325f;
            hasPower = true;
            consumePower(9f);
        }};
        
        ultraMatrixProcessor = new LogicBlock("ultra-matrix-processor"){{
            requirements(Category.logic, with(Items.copper, 1400, Items.lead, 2200, Items.silicon, 975, Items.surgeAlloy, 550, Items.phaseFabric, 325, DOItems.diamond, 400, DOItems.cryogem, 500));
            health = 2700;
            size = 3;
            range = 750;
            instructionsPerTick = 60;
            buildCostMultiplier = 0.325f;
            hasPower = true;
            consumePower(22f);
        }};
        
        //Section Defence
        
        ancientMetalWall = new Wall("ancient-metal-wall"){{
            requirements(Category.defense, with(DOItems.ancientAlloy, 10, DOItems.cryogem, 1));
            health = 2000;
            lightningChance = 0.3f;
            lightningDamage = 60f;
            lightningLength = 20;
            lightningColor = Color.valueOf("DECF5B");
            insulated = true;
            buildCostMultiplier = 0.55f;
        }};
        
        largeAncientMetalWall = new Wall("large-ancient-metal-wall"){{
            requirements(Category.defense, ItemStack.mult(ancientMetalWall.requirements, 4));
            health = 2000 * 4;
            size = 2;
            lightningChance = 0.25f;
            lightningDamage = 55f;
            lightningLength = 33;
            lightningColor = Color.valueOf("DECF5B");
            insulated = true;
            buildCostMultiplier = 0.5f;
        }};
        
        hugeAncientMetalWall = new Wall("huge-ancient-metal-wall"){{
            requirements(Category.defense, ItemStack.mult(ancientMetalWall.requirements, 9));
            health = 2000 * 9;
            size = 3;
            lightningChance = 0.2f;
            lightningDamage = 50f;
            lightningLength = 48;
            lightningColor = Color.valueOf("DECF5B");
            insulated = true;
            buildCostMultiplier = 0.45f;
        }};
        
        giganticAncientMetalWall = new Wall("gigantic-ancient-metal-wall"){{
            requirements(Category.defense, ItemStack.mult(ancientMetalWall.requirements, 16));
            health = 2000 * 16;
            size = 4;
            lightningChance = 0.15f;
            lightningDamage = 45f;
            lightningLength = 70;
            lightningColor = Color.valueOf("DECF5B");
            insulated = true;
            buildCostMultiplier = 0.4f;
        }};
        
        diamondWall = new Wall("diamond-wall"){{
            requirements(Category.defense, with(DOItems.diamond, 8));
            health = 1500;
            absorbLasers = true;
            buildCostMultiplier = 2.5f;
        }};
        
        largeDiamondWall = new Wall("large-diamond-wall"){{
            requirements(Category.defense, ItemStack.mult(diamondWall.requirements, 4));
            health = 1500 * 4;
            size = 2;
            absorbLasers = true;
            buildCostMultiplier = 2f;
        }};
        
        hugeDiamondWall = new Wall("huge-diamond-wall"){{
            requirements(Category.defense, ItemStack.mult(diamondWall.requirements, 9));
            health = 1500 * 9;
            size = 3;
            absorbLasers = true;
            buildCostMultiplier = 1.2f;
        }};
        
        giganticDiamondWall = new Wall("gigantic-diamond-wall"){{
            requirements(Category.defense, ItemStack.mult(diamondWall.requirements, 16));
            health = 1500 * 16;
            size = 4;
            absorbLasers = true;
            buildCostMultiplier = 0.85f;
        }};
        
        darkSporeBlock = new MendProjector("dark-spore-block"){{
            requirements(Category.defense, with(DOItems.darkSporePod, 5));
            health = 1000;
            buildCostMultiplier = 2.5f;
            envDisabled |= Env.scorching;
        }};
        
        largeDarkSporeBlock = new MendProjector("large-dark-spore-block"){{
            requirements(Category.defense, ItemStack.mult(darkSporeBlock.requirements, 4));
            health = 1000 * 4;
            size = 2;
            buildCostMultiplier = 2.5f;
            envDisabled |= Env.scorching;
        }};
        
        crystallizedDoor = new Door("crystallized-door"){{
            requirements(Category.defense, with(Items.graphite, 24, Items.silicon, 16, Items.titanium, 4, Items.metaglass, 4, Items.thorium, 4, DOItems.diamond, 30,DOItems.cryogem, 12));
            health = 1200;
            absorbLasers = true;
            buildCostMultiplier = 3.75f;
        }};
        
        largeCrystallizedDoor = new Door("large-crystallized-door"){{
            requirements(Category.defense, ItemStack.mult(crystallizedDoor.requirements, 4));
            health = 1200 * 4;
            size = 2;
            absorbLasers = true;
            buildCostMultiplier = 3.75f;
        }};
        
        //Section Production
        
        diamondDrill = new Drill("diamond-drill"){{
            requirements(Category.production, ItemStack.mult(miniDiamondDrill.requirements, 4));
            drillTime = 18;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            tier = 6;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.freezing;
            warmupSpeed = 0.015f;
            itemCapacity = 30;
            liquidCapacity = 30;
            liquidBoostIntensity = 2f;

            consumePower(1.4f);
            consumeLiquid(Liquids.cryofluid, 0.1f).boost();
        }};
        
        miniDiamondDrill = new Drill("mini-diamon-drill"){{
            requirements(Category.production, with(Items.silicon, 25, Items.titanium, 25, Items.thorium, 1, DOItems.diamond, 5, DOItems.cryogem, 1));
            drillTime = 36;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            tier = 6;
            updateEffect = Fx.pulverizeSmall;
            drillEffect = Fx.freezing;
            warmupSpeed = 0.005f;
            itemCapacity = 15;
            liquidCapacity = 15;
            liquidBoostIntensity = 4;

            consumePower(1f);
            consumeLiquid(Liquids.cryofluid, 0.025f).boost();
        }};
        
        organicDrill = new Fracker("organic-drill"){{
            requirements(Category.production, with(Items.plastanium, 50, Items.thorium, 25, DOItems.cryogem, 45, DOItems.darkSporePod, 65));
            health = 150;
            result = Liquids.oil;
            pumpAmount = 0.06f;
            hasPower = true;
            hasLiquids = true;
            attribute = Attribute.oil;
            liquidCapacity = 10;
            baseExplosiveness = 10f;
            itemUseTime = 60f;
            updateEffect = Fx.oily;
            updateEffectChance = 0.04f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-rotator", 1.5f, true), new DrawRegion("-top"));

            consumePower(0.375f);
        }};
        
        ancientOilDrill = new Fracker("ancient-oil-drill"){{
            requirements(Category.production, with(Items.silicon, 445, Items.thorium, 252, Items.surgeAlloy, 250, DOItems.ancientAlloy, 165));
            health = 3200;
            result = Liquids.oil;
            pumpAmount = 0.9f;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 10;
            liquidCapacity = 120f;
            baseExplosiveness = 75f;
            attribute = Attribute.oil;
            itemUseTime = 20f;
            updateEffect = Fx.oily;
            updateEffectChance = 0.125f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-rotator", 0.8f, true), new DrawRegion("-top"));

            consumeItem(Items.sand, 1);
            consumePower(14f);
            consumeLiquid(Liquids.water, 0.15f);
        }};
        
        omniDrill = new Drill("omni-drill"){{
            requirements(Category.production, ItemStack.mult(precisionOmniDrill.requirements, 5));
            health = 200;
            drillTime = 25;
            size = 5;
            tier = 10;
            warmupSpeed = 1f;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 120;
            liquidCapacity = 120;
            baseExplosiveness = 5000f;
            hardnessDrillMultiplier = 0f;
            buildCostMultiplier = 0.43227f;
            updateEffect = Fx.overdriven;
            updateEffectChance = 0.5f;
            drillEffect = Fx.hitMeltdown;
            heatColor = Color.valueOf("aacccc");
            liquidBoostIntensity = 3f;

            consumePower(3f);
            consumeLiquid(DOLiquids.phaseString, 0.9f).boost();
        }};
        
        precisionOmniDrill = new Drill("precision-omni-drill"){{
            requirements(Category.production, with(Items.silicon, 500, Items.metaglass, 1500, Items.blastCompound, 15, Items.thorium, 1500, Items.surgeAlloy, 500, Items.phaseFabric, 50, DOItems.diamond, 500, DOItems.cryogem, 500, DOItems.ancientAlloy, 125));
            health = 400;
            drillTime = 125;
            tier = 10;
            warmupSpeed = 1f;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 30;
            liquidCapacity = 60;
            baseExplosiveness = 500f;
            hardnessDrillMultiplier = 0f;
            buildCostMultiplier = 0.43227f;
            updateEffect = Fx.overdriven;
            updateEffectChance = 0.25f;
            drillEffect = Fx.pointHit;
            heatColor = Color.valueOf("aacccc");
            liquidBoostIntensity = 3f;
            
            consumeLiquid(DOLiquids.phaseString, 0.055f).boost();
        }};
        
        advancedCultivator = new AttributeCrafter("advanced-cultivator"){{
            requirements(Category.production, with(Items.copper, 200, Items.lead, 500, Items.silicon, 200, Items.thorium, 50, DOItems.diamond, 10));
            health = 450;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;
            liquidCapacity = 45;
            outputItem = new ItemStack(Items.sporePod, 2);
            floating = true;
            craftTime = 100f;
            craftEffect = Fx.none;
            envRequired |= Env.spores;
            attribute = Attribute.spores;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-top"));

            consumePower(3.225f);
            consumeLiquid(Liquids.water, 0.2f);
        }};
        
        darkCultivator = new Separator("dark-cultivator"){{
            requirements(Category.production, with(Items.copper, 35, Items.lead, 65, Items.graphite, 20, Items.surgeAlloy, 255, DOItems.diamond, 15, DOItems.cryogem, 45));
            health = 666;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 10;
            liquidCapacity = 120;
            baseExplosiveness = 250f;
            results = with(DOItems.darkSporePod, 1, Items.sporePod, 5);
            floating = true;
            craftTime = 540f;
            envRequired |= Env.spores;
            loopSound = Sounds.wave;
            loopSoundVolume = 0.51f;
            ambientSound = Sounds.drill;
            ambientSoundVolume = 0.01f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-top"));

            consumePower(15f);
            consumeLiquid(DOLiquids.corruptWater, 0.15f);
        }};
        
        aquaDrill = new SolidPump("aqua-drill"){{
            requirements(Category.production, with(Items.silicon, 25, Items.metaglass, 15, Items.titanium, 50, DOItems.cryogem, 5));
            health = 150;
            result = Liquids.water;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 20;
            pumpAmount = 0.25f;
            attribute = Attribute.water;
            envRequired |= Env.groundWater;
            rotateSpeed = 3f;
            updateEffect = Fx.wet;
            updateEffectChance = 0.04f;
            hasShadow = false;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-rotator", 1f, true), new DrawRegion("-top"));

            consumePower(2f);
        }};
        
        //Section Liquid
        
        ancientPump = new Pump("ancient-pump"){{
            requirements(Category.liquid, with(Items.lead, 150, Items.silicon, 200, Items.metaglass, 300, Items.phaseFabric, 45, DOItems.diamond, 125, DOItems.ancientAlloy, 100));
            health = 1200;
            size = 2;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 600;
            pumpAmount = 1.25f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion());

            consumePower(2.5f);
        }};
        
        cryoPump = new Pump("cryo-pump"){{
            requirements(Category.liquid, with(Items.copper, 150, Items.silicon, 200, Items.metaglass, 300, Items.titanium, 125, Items.phaseFabric, 45, DOItems.cryogem, 100));
            health = 320;
            size = 4;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 300;
            pumpAmount = 1f;
            drawLiquidLight = false;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion());

            consumePower(1.6f);
        }};
        
        ancientMetalConduit = new ArmoredConduit("ancient-metal-conduit"){{
            requirements(Category.liquid, with(Items.graphite, 4, Items.silicon, 1, Items.metaglass, 4, DOItems.ancientAlloy, 2));
            health = 1500;
            solid = true;
            floating = true;
            hasLiquids = true;
            liquidCapacity = 20;
            liquidPressure = 15f;
            buildCostMultiplier = 0.5f;
        }};
        
        crystalConduit = new Conduit("crystal-conduit"){{
            requirements(Category.liquid, with(Items.graphite, 2, Items.silicon, 2, Items.metaglass, 2, DOItems.diamond, 2));
            health = 500;
            solid = true;
            floating = true;
            placeableLiquid = true;
            hasLiquids = true;
            liquidCapacity = 8;
            liquidPressure = 20f;
        }};
        
        ancientLiquidBridge = new LiquidBridge("ancient-liquid-bridge"){{
            requirements(Category.liquid, with(Items.graphite, 10, Items.metaglass, 25, Items.thorium, 30, Items.phaseFabric, 20, DOItems.diamond, 15, DOItems.ancientAlloy, 5));
            health = 320;
            canOverdrive = true;
            hasLiquids = true;
            liquidCapacity = 20;
            range = 18;
            baseExplosiveness = 15f;
            buildCostMultiplier = 0.325f;

            consumePower(6f);
        }};
        
        ancientLiquidTank = new LiquidRouter("ancient-liquid-tank"){{
            requirements(Category.liquid, with(Items.silicon, 100, Items.metaglass, 200, Items.titanium, 300, DOItems.cryogem, 35, DOItems.ancientAlloy, 55));
            health = 6000;
            size = 2;
            floating = true;
            hasLiquids = true;
            liquidCapacity = 2000;
        }};
        
        ancientLiquidRepository = new LiquidRouter("ancient-liquid-repository"){{
            requirements(Category.liquid, with(Items.metaglass, 1025, Items.titanium, 800, DOItems.cryogem, 125, DOItems.ancientAlloy, 125));
            health = 18000;
            size = 6;
            floating = true;
            hasLiquids = true;
            liquidCapacity = 15000;
        }};
        
        bulkLiquidTank = new LiquidRouter("bulk-liquid-tank"){{
            requirements(Category.liquid, with(Items.metaglass, 150, Items.titanium, 300, DOItems.diamond, 125, DOItems.cryogem, 25));
            health = 12500;
            size = 5;
            floating = true;
            hasLiquids = true;
            liquidCapacity = 6000;
        }};
        
        //Section Distribution
        
        ancientMetalConveyor = new ArmoredConveyor("ancient-metal-conveyor"){{
            requirements(Category.distribution, with(Items.plastanium, 2, Items.phaseFabric, 1, DOItems.cryogem, 1, DOItems.ancientAlloy, 1));
            health = 1800;
            solid = true;
            floating = true;
            insulated = true;
            absorbLasers = true;
            speed = 0.24f;
            displayedSpeed = 30f;
            underBullets = true;
            buildCostMultiplier = 0.3f;
        }};
        
        crystalConveyor = new Conveyor("crystal-conveyor"){{
            requirements(Category.distribution, with(Items.graphite, 3, Items.silicon, 2, DOItems.diamond, 1));
            health = 600;
            solid = true;
            speed = 0.24f;
            displayedSpeed = 30f;
            underBullets = true;
        }};
        
        massConveyor = new StackConveyor("mass-conveyor"){{
            requirements(Category.distribution, with(Items.surgeAlloy, 1, DOItems.diamond, 1, DOItems.darkSporePod, 1));
            health = 150;
            solid = true;
            floating = true;
            recharge = 1;
            speed = 8f / 60f;
            itemCapacity = 10;
            underBullets = true;
            loadEffect = Fx.absorb;
            unloadEffect = Fx.smeltsmoke;
        }};
        
        sporeConveyor = new StackConveyor("spore-conveyor"){{
            requirements(Category.distribution, with(Items.plastanium, 3, DOItems.darkSporePod, 1));
            health = 1200;
            solid = true;
            floating = true;
            placeableLiquid = true;
            speed = 2f / 60f;
            itemCapacity = 80;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;
            baseEfficiency = 1f;
            underBullets = true;

            consumePower(10f / 60f);
        }};
        
        ancientItemBridge = new ItemBridge("ancient-item-bridge"){{
            requirements(Category.distribution, with(Items.graphite, 10, Items.silicon, 25, Items.titanium, 30, Items.phaseFabric, 20, DOItems.diamond, 15, DOItems.ancientAlloy, 5));
            health = 320;
            range = 18;
            transportTime = 1f;
            canOverdrive = true;
            hasPower = true;
            buildCostMultiplier = 0.325f;
            baseExplosiveness = 15f;
            underBullets = true;

            consumePower(6f);
        }};
        
        massDistributor = new Router("mass-distributor"){{
            requirements(Category.distribution, with(Items.lead, 30, Items.graphite, 10, Items.titanium, 2, DOItems.diamond, 1));
            health = 540;
            size = 3;
            hasItems = true;
            itemCapacity = 50;
            speed = 5f;
            buildCostMultiplier = 1.1f;
        }};
        
        omegaRouter = new Router("omega-router"){{
            requirements(Category.distribution, with(Items.lead, 5, Items.silicon, 10, Items.plastanium, 1, Items.surgeAlloy, 5, DOItems.ancientAlloy, 5));
            health = 800;
            size = 4;
            speed = 2f;
            buildCostMultiplier = 0.2f;
            itemCapacity = 45;
        }};
        
        bulkDriver = new MassDriver("bulk-driver"){{
            requirements(Category.distribution, with(Items.copper, 300, Items.lead, 1250, Items.graphite, 25, Items.silicon, 750, Items.titanium, 1250, Items.plastanium, 25, Items.thorium, 500, Items.surgeAlloy, 25, Items.phaseFabric, 25, DOItems.diamond, 25));
            health = 4800;
            size = 4;
            range = 520;
            hasPower = true;
            hasItems = true;
            itemCapacity = 240;
            buildCostMultiplier = 4f / 3f;
            translation = 14f;
            knockback = 10f;
            shake = 6f;
            outlineIcon = false;
            shootEffect = Fx.shootBig2;
            smokeEffect = Fx.lancerLaserShoot;
            receiveEffect = Fx.mineHuge;

            consumePower(46.825f);
        }};
        
        //Section Effect

        ancientCrate = new StorageBlock("ancient-crate"){{
            requirements(Category.effect, with(Items.metaglass, 50, Items.thorium, 100, DOItems.ancientAlloy, 30));
            health = 1500;
            hasItems = true;
            itemCapacity = 1500;
            buildCostMultiplier = 1.4f;
        }};

        ancientContainer = new StorageBlock("ancient-container"){{
            requirements(Category.effect, ItemStack.mult(ancientCrate.requirements, 4));
            health = 6000;
            size = 2;
            hasItems = true;
            itemCapacity = 6000;
            buildCostMultiplier = 1.3f;
        }};

        ancientVault = new StorageBlock("ancient-vault"){{
            requirements(Category.effect, ItemStack.mult(ancientCrate.requirements, 9));
            health = 13500;
            size = 3;
            hasItems = true;
            itemCapacity = 13500;
            buildCostMultiplier = 1.2f;
        }};

        ancientRepository = new StorageBlock("ancient-repository"){{
            requirements(Category.effect, ItemStack.mult(ancientCrate.requirements, 16));
            health = 24000;
            size = 4;
            hasItems = true;
            itemCapacity = 24000;
            buildCostMultiplier = 1.1f;
        }};

        diamondVault = new StorageBlock("diamond-vault"){{
            requirements(Category.effect, with(Items.copper, 1500, Items.titanium, 1500, DOItems.diamond, 200));
            health = 1500;
            size = 4;
            hasItems = true;
            itemCapacity = 1500;
            buildCostMultiplier = 0.4f;
        }};

        cryoDiamondVault = new StorageBlock("cryo-diamond-vault"){{
            requirements(Category.effect, with(Items.lead, 1500, Items.metaglass, 500, Items.titanium, 1500, DOItems.diamond, 100, DOItems.cryogem, 100));
            health = 5000;
            size = 5;
            hasItems = true;
            itemCapacity = 8000;
            buildCostMultiplier = 2f / 3f;
        }};

        omniVault = new StorageBlock("omni-vault"){{
            requirements(Category.effect, with(Items.copper, 1500, Items.lead, 1500, Items.graphite, 1500, Items.silicon, 1500, Items.titanium, 1500, Items.plastanium, 1500, Items.thorium, 1500, Items.surgeAlloy, 1500, Items.phaseFabric, 1500, DOItems.diamond, 1500, DOItems.cryogem, 1500, DOItems.darkSporePod, 1500));
            health = 30625;
            size = 7;
            hasItems = true;
            itemCapacity = 54000;
            buildCostMultiplier = 2f / 3f;
        }};

        ancientUnloader = new Unloader("ancientUnloader"){{
            requirements(Category.effect, with(Items.silicon, 60, Items.titanium, 50, Items.plastanium, 35, DOItems.ancientAlloy, 15));
            health = 1500;
            speed = 3f;
        }};

        cargoLaunchPad = new LaunchPad("cargo-launch-pad"){{
            requirements(Category.effect, BuildVisibility.campaignOnly, with(Items.lead, 800, Items.silicon, 400, Items.plastanium, 400, Items.surgeAlloy, 400, DOItems.diamond, 400));
            health = 28800;
            size = 6;
            hasPower = true;
            itemCapacity = 800;
            launchTime = 1800f;
            buildCostMultiplier = 0.85f;
            lightColor = Color.valueOf("ffffff");

            consumePower(16f);
        }};

        ancientLaunchSilo = new LaunchPad("ancient-launch-silo"){{
            requirements(Category.effect, BuildVisibility.campaignOnly, with(Items.silicon, 400, Items.titanium, 800, Items.thorium, 1200, Items.phaseFabric, 400, DOItems.diamond, 400, DOItems.ancientAlloy, 400));
            health = 12500;
            size = 5;
            hasPower = true;
            itemCapacity = 3000;
            launchTime = 3600f;
            buildCostMultiplier = 0.65f;
            lightColor = Color.valueOf("eeeeaa");
            podRegion = new TextureRegion();
            
            consumePower(25);
        }};

        phaseMender = new MendProjector("phase-mender"){{
            requirements(Category.effect, with(Items.lead, 75, Items.silicon, 75, Items.surgeAlloy, 25, Items.phaseFabric, 125, DOItems.diamond, 300));
            health = 900;
            size = 3;
            hasPower = true;
            hasItems = true;
            itemCapacity = 4;
            range = 96f;
            reload = 40f;
            healPercent = 3f;
            phaseBoost = 5f;
            phaseRangeBoost = 48f;
            useTime = 600f;
            baseColor = Color.valueOf("81cce5");
            phaseColor = Color.valueOf("ffffff");

            consumePower(8f);
            consumeItem(DOItems.cryogem).boost();
        }};

        ancientMendingObelisk = new MendProjector("ancient-mending-obelisk"){{
            requirements(Category.effect, with(Items.plastanium, 300, Items.thorium, 375, Items.surgeAlloy, 125, DOItems.ancientAlloy, 225));
            health = 2400;
            size = 2;
            hasPower = true;
            hasItems = true;
            itemCapacity = 18;
            range = 60f;
            reload = 180f;
            healPercent = 20f;
            phaseBoost = -10f;
            phaseRangeBoost = 180f;
            useTime = 180f;
            baseColor = Color.valueOf("e5a57e88");
            phaseColor = Color.valueOf("e2bb7fbb");

            consumePower(8f);
            consumeItem(DOItems.cryogem).boost();
        }};

        ancientEnergyShield = new ForceProjector("ancient-energy-shield"){{
            requirements(Category.effect, with(Items.copper, 750, Items.silicon, 500, Items.plastanium, 125, Items.surgeAlloy, 250, DOItems.cryogem, 250, DOItems.ancientAlloy, 250));
            health = 2000;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 24;
            liquidCapacity = 30f;
            radius = 174f;
            shieldHealth = 3600f;
            phaseShieldBoost = 2400f;
            phaseRadiusBoost = 174f;
            phaseUseTime = 270f;
            cooldownNormal = 7.5f;
            cooldownLiquid = 37.5f;
            cooldownBrokenBase = 3.75f;
            baseExplosiveness = 25f;
            buildCostMultiplier = 2.7f;
            canOverdrive = true;
            sides = 3;

            consumePower(10f);
            consumeItem(DOItems.ancientAlloy, 1).boost();
        }};

        ancientHasteObelisk = new OverdriveProjector("ancient-haste-obelisk"){{
            requirements(Category.effect, with(Items.silicon, 800, Items.plastanium, 750, Items.thorium, 825, Items.surgeAlloy, 750, Items.phaseFabric, 650, DOItems.diamond, 500, DOItems.cryogem, 125, DOItems.ancientAlloy, 250));
            health = 3200;
            size = 4;
            hasPower = true;
            hasItems = true;
            itemCapacity = 14;
            range = 240f;
            speedBoost = 2f;
            speedBoostPhase = 3f;
            phaseRangeBoost = 240f;
            useTime = 120f;
            buildCostMultiplier = 0.75f;
            baseColor = Color.valueOf("82e4e988");
            phaseColor = Color.valueOf("00ffff");

            consumePower(25f);
            consumeItem(Items.surgeAlloy, 1).boost();
        }};

        cryoDriveProjector = new OverdriveProjector("cryo-drive-projector"){{
            requirements(Category.effect, with(Items.silicon, 75, Items.thorium, 75, Items.phaseFabric, 75, DOItems.diamond, 75, DOItems.cryogem, 75));
            health = 900;
            size = 3;
            hasPower = true;
            hasItems = true;
            range = 120f;
            speedBoost = 2f;
            speedBoostPhase = 1.5f;
            phaseRangeBoost = 120f;
            useTime = 120f;
            baseColor = Color.valueOf("a1ccb5");
            phaseColor = Color.valueOf("b8ffe9");

            consumePower(15f);
            consumeItem(DOItems.diamond, 1).boost();
        }};

        ancientADM = new ShockMine("ancient-ADM"){{
            requirements(Category.effect, with(Items.plastanium, 12, Items.thorium, 6, DOItems.ancientAlloy, 10));
            health = 300;
            length = 25;
            damage = 20f;
            tileDamage = 5f;
            tendrils = 18;
            cooldown = 40f;
            hasShadow = false;
            fillsTile = false;
            buildCostMultiplier = 1.35f;
        }};

        //Section Power

        ancientEnergyNode = new PowerNode("ancient-energy-node"){{
            requirements(Category.power, with(DOItems.diamond, 20, DOItems.cryogem, 5, DOItems.ancientAlloy, 5));
            health = 400;
            insulated = false;
            laserRange = 20f;
            maxNodes = 16;
            laserColor1 = Color.valueOf("C8C6FF");
            laserColor2 = Color.valueOf("595872");
        }};

        ancientEnergyNodeLarge = new PowerNode("large-ancient-energy-node"){{
            requirements(Category.power, ItemStack.mult(ancientEnergyNode.requirements, 4));
            health = 1400;
            size = 2;
            insulated = false;
            laserRange = 25f;
            maxNodes = 32;
            laserColor1 = Color.valueOf("C8C6FF");
            laserColor2 = Color.valueOf("595872");
        }};

        reinforcedPowerDistributor = new PowerNode("reinforced-power-distributor"){{
            requirements(Category.power, with(Items.copper, 45, Items.metaglass, 35, Items.thorium, 25, Items.phaseFabric, 15, DOItems.diamond, 10));
            health = 2160;
            size = 3;
            insulated = true;
            buildCostMultiplier = 1.4f;
            laserRange = 70f;
            maxNodes = 3;
            laserColor1 = Color.valueOf("C8C6FF");
            laserColor2 = Color.valueOf("595872");
        }};

        surgeBattery = new Battery("surge-battery"){{
            requirements(Category.power, with(Items.copper, 64, Items.lead, 320, Items.silicon, 120, Items.thorium, 50, DOItems.diamond, 100, DOItems.cryogem, 100));
            health = 8000;
            size = 4;
            buildCostMultiplier = 0.9f;
            baseExplosiveness = 2000f;
            emptyLightColor = Color.valueOf("333355");
            fullLightColor = Color.valueOf("ffe770");
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePowerBuffered(150000f);
        }};

        ancientBattery = new Battery("ancient-battery"){{
            requirements(Category.power, with(Items.silicon, 60, Items.titanium, 32, Items.plastanium, 80, DOItems.diamond, 40, DOItems.ancientAlloy, 15));
            health = 600;
            buildCostMultiplier = 0.35f;
            baseExplosiveness = 800f;
            emptyLightColor = Color.valueOf("888888");
            fullLightColor = Color.valueOf("6974c4");
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePowerBuffered(25000f);
        }};

        ancientBatteryLarge = new Battery("large-ancient-battery"){{
            requirements(Category.power, ItemStack.mult(ancientBattery.requirements, 4));
            health = 8000;
            size = 2;
            buildCostMultiplier = 0.3f;
            baseExplosiveness = 3200f;
            emptyLightColor = Color.valueOf("888888");
            fullLightColor = Color.valueOf("6974c4");
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePowerBuffered(250000);
        }};

        diamondSolarPanel = new SolarGenerator("diamond-solar-panel"){{
            requirements(Category.power, with(Items.lead, 100, Items.silicon, 100, Items.surgeAlloy, DOItems.diamond, 5));
            health = 300;
            size = 3;
            powerProduction = 3.8f;
        }};

        ancientSolarGenerator = new SolarGenerator("ancient-solar-generator"){{
            requirements(Category.power, with(Items.plastanium, 30, Items.thorium, 15, Items.phaseFabric, 18, DOItems.cryogem, 15, DOItems.ancientAlloy, 50));
            health = 1200;
            size = 2;
            powerProduction = 2f;
        }};

        ancientHeatPanel = new ThermalGenerator("ancient-heat-panel"){{
            requirements(Category.power, with(Items.lead, 100, Items.silicon, 200, Items.plastanium, 50, Items.surgeAlloy, 45, DOItems.diamond, 25, DOItems.ancientAlloy, 45));
            health = 100;
            size = 1;
            powerProduction = 5f;
            generateEffect = Fx.burning;
        }};

        surgeReactor = new NuclearReactor("surge-reactor"){{
            requirements(Category.power, with(Items.graphite, 275, Items.silicon, 300, Items.metaglass, 50, Items.thorium, 1050, Items.surgeAlloy, 550, Items.phaseFabric, 80, DOItems.diamond, 150, DOItems.cryogem, 50));
            health = 6000;
            size = 6;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 100;
            liquidCapacity = 300;
            baseExplosiveness = 50000f;
            explosionRadius = 12;
            explosionDamage = 9999999;
            buildCostMultiplier = 0.73227f;
            fuelItem = Items.surgeAlloy;
            itemDuration = 300f;
            coolantPower = 0.225f;
            heating = 0.02f;
            powerProduction = 500f / 3f;
            smokeThreshold = 0.5f;
            flashThreshold = 0.75f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawPower(), new DrawRegion("-top"));
            
            consumeItem(Items.surgeAlloy);
            consumeLiquid(Liquids.cryofluid, heating / coolantPower).update(false);
        }};

        differentialReactor = new NuclearReactor("differential-reactor"){{
            requirements(Category.power, with(Items.copper, 4000, Items.lead, 4000, Items.graphite, 1275, Items.silicon, 4000, Items.metaglass, 777, Items.titanium, 5000, Items.plastanium, 2275, Items.thorium, 3000, Items.surgeAlloy, 1500, Items.phaseFabric, 1000, DOItems.diamond, 1250, DOItems.cryogem, 5000));
            health = 9000;
            size = 6;
            hasItems = true;
            hasLiquids = false;
            itemCapacity = 30;
            buildCostMultiplier = 0.3f;
            baseExplosiveness = 9000f;
            explosionRadius = 50;
            explosionDamage = 99999999;
            insulated = true;
            absorbLasers = true; 
            itemDuration = 120f;
            powerProduction = 5600f / 3f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawDefault(), new DrawPower(), new DrawPlasma());
            
            consumePower(200f);
            consumeItems(with(DOItems.cryogem, 1, DOItems.darkSporePod, 1));
        }};

        ancientDecaygen = new ConsumeGenerator("ancient-decaygen"){{
            requirements(Category.power, with(Items.silicon, 100, Items.thorium, 100, DOItems.diamond, 25, DOItems.ancientAlloy, 25));
            health = 400;
            hasItems = true;
            itemCapacity = 10;
            itemDuration = 240;
            powerProduction = 8f;
            envEnabled = Env.any;
            generateEffect = Fx.smeltsmoke;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consume(new ConsumeItemRadioactive());
        }};


        //Section Crafting
        //Better Names DESPERATELY Needed

        alloySurgeForge = new GenericCrafter("alloy-surge-forge"){{
            requirements(Category.crafting, with(Items.graphite, 600, Items.silicon, 500, Items.titanium, 90, Items.surgeAlloy, 150, Items.phaseFabric, 100, DOItems.diamond, 200, DOItems.ancientAlloy, 20));
            health = 6500;
            size = 5;
            hasPower = true;
            hasItems = true;
            itemCapacity = 80;
            buildCostMultiplier = 0.6f;
            craftTime = 240f;
            outputItem = new ItemStack(Items.surgeAlloy, 42);
            craftEffect = Fx.bigShockwave;
            updateEffect = Fx.lightningShoot;
            updateEffectChance = 0.62f;
            loopSound = Sounds.pulseBlast;
            loopSoundVolume = 1.4f;
            ambientSound = Sounds.build;
            ambientSoundVolume = 0.4f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(32f);
            consumeItems(with(DOItems.ancientAlloy, 6, DOItems.cryogem, 1));
        }};

        ancientForge = new GenericCrafter("ancient-forge"){{
            requirements(Category.crafting, with(Items.copper, 2300, Items.silicon, 275, Items.metaglass, 750, Items.thorium, 350, Items.surgeAlloy, 450, Items.phaseFabric, 450, DOItems.diamond, 1000, DOItems.cryogem, 400));
            health = 4800;
            size = 4;
            hasPower = true;
            hasItems = true;
            itemCapacity = 60;
            craftTime = 55f;
            outputItem = new ItemStack(DOItems.ancientAlloy, 2);
            buildCostMultiplier = 0.65f;
            updateEffect = Fx.overdriven;
            updateEffectChance = 0.75f;
            craftEffect = Fx.bigShockwave;
            loopSound = Sounds.machine;
            loopSoundVolume = 1.75f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.75f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(105f);
            consumeItems(with(Items.lead, 4, Items.graphite, 3, Items.blastCompound, 1, Items.titanium, 2, Items.thorium, 4, Items.surgeAlloy, 5, Items.phaseFabric, 2, DOItems.diamond, 1));
            consumeLiquid(Liquids.slag, 1.2f);
        }};

        ancientRefinery = new GenericCrafter("ancient-refinery"){{
            requirements(Category.crafting, with(Items.graphite, 500, Items.silicon, 500, Items.titanium, 900, Items.plastanium, 150, Items.surgeAlloy, 1500, DOItems.diamond, 150));
            health = 2500;
            size = 5;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;
            liquidCapacity = 30f;
            baseExplosiveness = 2500f;
            craftTime = 90f;
            outputItem = new ItemStack(DOItems.ancientAlloy, 1);
            buildCostMultiplier = 0.5f;
            updateEffect = Fx.mine;
            updateEffectChance = 0.05f;
            craftEffect = Fx.mineBig;
            drawLiquidLight = true;
            loopSound = Sounds.conveyor;
            loopSoundVolume = 1.75f;
            ambientSound = Sounds.machine;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-top"));

            consumePower(200f);
            consumeItem(DOItems.ancientScrap, 4);
            consumeLiquid(Liquids.slag, 0.1f);
        }};

        bulkBlastMixer = new GenericCrafter("bulk-blast-mixer"){{
            requirements(Category.crafting, with(Items.lead, 200, Items.titanium, 130, Items.thorium, 35, DOItems.diamond, 35, DOItems.cryogem, 15));
            health = 2000;
            size = 3;
            hasPower = true;
            hasItems = true;
            itemCapacity = 30;
            craftTime = 85;
            outputItem = new ItemStack(Items.blastCompound, 6);
            craftEffect = Fx.mineBig;
            loopSound = Sounds.fire;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(3.76f);
            consumeItems(with(Items.coal, 1, Items.pyratite, 2, Items.sporePod, 4));
        }};

        bulkBlender = new AttributeCrafter("bulk-blender"){{
            requirements(Category.crafting, with(Items.lead, 300, Items.graphite, 175, Items.silicon, 150, Items.metaglass, 150, Items.thorium, 150, DOItems.diamond, 100, DOItems.cryogem, 500));
            health = 1280;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;
            liquidCapacity = 375f;
            buildCostMultiplier = 0.5f;
            craftTime = 240f;
            outputLiquid = new LiquidStack(Liquids.cryofluid, 480);
            attribute = Attribute.water;
            boostScale = 0.4f;
            updateEffect = Fx.freezing;
            updateEffectChance = 0.25f;
            craftEffect = Fx.mineBig;
            drawLiquidLight = true;
            loopSound = Sounds.respawning;
            loopSoundVolume = 1.15f;
            ambientSound = Sounds.machine;
            ambientSoundVolume = 0.35f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-rotator", 1.5f, true), new DrawRegion("-top"));

            consumePower(7.75f);
            consumeItem(Items.titanium, 12);
            consumeLiquid(Liquids.water, 5f / 3f);
        }};

        bulkCentrifuge = new GenericCrafter("bulk-centrifuge"){{
            requirements(Category.crafting, with(Items.lead, 200, Items.graphite, 100, Items.silicon, 15, Items.titanium, 85, DOItems.diamond, 125, DOItems.cryogem, 5));
            health = 1200;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 30;
            liquidCapacity = 150f;
            craftTime = 60f;
            outputItem = new ItemStack(Items.coal, 6);
            craftEffect = Fx.steam;
            updateEffect = Fx.oily;
            updateEffectChance = 0.75f;
            loopSound = Sounds.machine;
            loopSoundVolume = 1.05f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-rotator-a", 0.6f, true), new DrawRegion("-rotator-b", -0.6f, true));

            consumePower(6.7f);
            consumeLiquid(Liquids.oil, 0.12f);
        }};

        bulkCompressor = new GenericCrafter("bulk-compressor"){{
            requirements(Category.crafting, with(Items.lead, 300, Items.graphite, 130, Items.silicon, 175, Items.titanium, 200, Items.surgeAlloy, 35, DOItems.diamond,35));
            health = 1000;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 50;
            liquidCapacity = 50f;
            craftTime = 30f;
            outputItem = new ItemStack(Items.plastanium, 4);
            craftEffect = Fx.mine;
            loopSound = Sounds.respawning;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.2f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(3f);
            consumeItem(Items.titanium, 4);
            consumeLiquid(Liquids.oil, 0.4f);
        }};

        bulkFurnace = new GenericCrafter("bulk-furnace"){{
            requirements(Category.crafting, with(Items.copper, 600, Items.lead, 300, Items.graphite, 300, Items.metaglass, 900, Items.plastanium, 150, DOItems.diamond, 150));
            health = 900;
            size = 3;
            hasPower = true;
            hasItems = true;
            itemCapacity = 20;
            buildCostMultiplier = 0.5f;
            craftTime = 380f;
            outputItem = new ItemStack(Items.metaglass, 40);
            updateEffect = Fx.mine;
            updateEffectChance = 0.05f;
            craftEffect = Fx.mineBig;
            loopSound = Sounds.machine;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(50f / 3f);
            consumeItems(with(Items.sand, 15, Items.lead, 15, Items.blastCompound, 1));
        }};

        bulkMelter = new AttributeCrafter("bulk-melter"){{
            requirements(Category.crafting, with(Items.copper, 150, Items.lead, 175, Items.graphite, 225, Items.surgeAlloy, 75, DOItems.diamond, 25));
            health = 360;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 40;
            liquidCapacity = 225f;
            floating = true;
            baseExplosiveness = 50f;
            craftTime = 120f;
            outputLiquid = new LiquidStack(Liquids.slag, 1.1f);
            attribute = Attribute.heat;
            boostScale = 0.4f;
            craftEffect = Fx.hitMeltdown;
            updateEffect = Fx.fire;
            updateEffectChance = 0.85f;
            loopSound = Sounds.drill;
            loopSoundVolume = 1.51f;
            ambientSound = Sounds.drill;
            ambientSoundVolume = 0.08f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion());

            consumePower(25.35f);
            consumeItem(Items.scrap, 20);
        }};

        bulkPyratiteMixer = new GenericCrafter("bulk-pyratite-mixer"){{
            requirements(Category.crafting, with(Items.copper, 200, Items.lead, 130, Items.silicon, 35, DOItems.diamond, 15));
            health = 700;
            size = 3;
            hasPower = true;
            hasItems = true;
            itemCapacity = 20;
            craftTime = 40f;
            outputItem = new ItemStack(Items.pyratite, 3);
            craftEffect = Fx.mine;
            loopSound = Sounds.respawning;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawRegion("-top"));

            consumePower(1.65f);
            consumeItems(with(Items.lead, 5, Items.coal, 2, Items.sand, 4));
        }};

        bulkSeparator = new Separator("bulk-separator"){{
            requirements(Category.crafting, with(Items.copper, 120, Items.lead, 75, Items.graphite, 105, Items.silicon, 75, DOItems.diamond, 25, DOItems.cryogem, 65));
            health = 400;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 30;
            liquidCapacity = 30f;
            craftTime = 6f;
            results = with(Items.lead, 30, Items.graphite, 15, Items.titanium, 25, Items.thorium, 2);
            drawLiquidLight = true;
            loopSound = Sounds.respawning;
            loopSoundVolume = 1.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.45f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawRegion("-rotator", 0.8f, true));

            consumePower(7.2f);
            consumeLiquid(Liquids.slag, 4f / 15f);
        }};

        bulkSmelter = new GenericCrafter("bulk-smelter"){{
            requirements(Category.crafting, with(Items.copper, 175, Items.lead, 200, Items.graphite, 75, Items.silicon, 60, DOItems.diamond, 1));
            health = 2400;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 60;
            liquidCapacity = 90f;
            craftTime = 72f;
            outputItem = new ItemStack(Items.silicon, 15);
            updateEffect = Fx.smeltsmoke;
            updateEffectChance = 0.5f / 3f;
            loopSound = Sounds.respawning;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(3.8f);
            consumeItems(with(Items.sand, 6, Items.pyratite, 1, DOItems.cryogem, 1));
            consumeLiquid(Liquids.water, 0.1f);
        }};

        cryogemCompressor = new GenericCrafter("cryogem-compressor"){{
            requirements(Category.crafting, with(Items.lead, 400, Items.graphite, 175, Items.silicon, 150, DOItems.diamond, 225));
            health = 630;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 25;
            liquidCapacity = 150f;
            craftTime = 30f;
            outputItem = new ItemStack(DOItems.cryogem, 1);
            craftEffect = Fx.mineBig;
            drawLiquidLight = true;
            loopSound = Sounds.artillery;
            loopSoundVolume = 1.75f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion(), new DrawPower());

            consumePower(3f);
            consumeItem(DOItems.diamond, 1);
            consumeLiquid(Liquids.cryofluid, 2f);
        }};

        cryogemDissipator = new GenericCrafter("cryogem-dissipator"){{
            requirements(Category.crafting, with(Items.lead, 350, Items.silicon, 180, Items.titanium, 320, Items.phaseFabric, 150, DOItems.diamond, 100));
            health = 540;
            size = 2;
            hasPower = true;
            hasLiquids = true;
            liquidCapacity = 600f;
            craftTime = 15f;
            outputLiquid = new LiquidStack(Liquids.cryofluid, 2);
            updateEffect = Fx.wet;
            updateEffectChance = 0.38f;
            drawLiquidLight = true;
            loopSound = Sounds.splash;
            loopSoundVolume = 1.75f;
            ambientSound = Sounds.spray;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion());

            consumePower(4f);
            consumeItem(DOItems.cryogem, 1);
        }};

        darkSporePress = new AttributeCrafter("dark-spore-press"){{
            requirements(Category.crafting, with(Items.copper, 600, Items.silicon, 300, Items.metaglass, 125, Items.titanium, 300, Items.plastanium, 900, DOItems.darkSporePod, 150));
            health = 900;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 10;
            liquidCapacity = 600f;
            buildCostMultiplier = 0.75f;
            craftTime = 60f;
            outputLiquid = new LiquidStack(DOLiquids.corruptWater, 1f);
            attribute = Attribute.oil;
            boostScale = 0.05f;
            maxBoost = 2f;
            updateEffect = Fx.sporeSlowed;
            updateEffectChance = 0.15f;
            craftEffect = Fx.wet;
            loopSound = Sounds.respawning;
            loopSoundVolume = 1.25f;
            ambientSound = Sounds.conveyor;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion());

            consumePower(14f);
            consumeItem(DOItems.darkSporePod, 1);
            consumeLiquids(new LiquidStack(Liquids.water, 3f), new LiquidStack(Liquids.oil, 0.2f));
        }};

        diamondSynthesizer = new GenericCrafter("diamond-synthesizer"){{
            requirements(Category.crafting, with(Items.lead, 120, Items.graphite, 200, Items.silicon, 75, Items.titanium, 200, Items.surgeAlloy, 30));
            health = 2000;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 80;
            liquidCapacity = 20f;
            craftTime = 600f;
            outputItem = new ItemStack(DOItems.diamond, 1);
            craftEffect = Fx.pulverize;
            loopSound = Sounds.machine;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(1.8f);
            consumeItem(Items.graphite, 8);
            consumeLiquid(Liquids.slag, 6f / 60f);
        }};

        industrialDiamondPress = new GenericCrafter("industrial-diamond-press"){{
            requirements(Category.crafting, with(Items.lead, 550, Items.graphite, 600, Items.silicon, 275, Items.titanium, 400, Items.thorium, 200, Items.surgeAlloy, 120, DOItems.diamond, 50, DOItems.cryogem, 5));
            health = 9000;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 300;
            liquidCapacity = 80f;
            buildCostMultiplier = 0.7f;
            craftTime = 200f;
            outputItem = new ItemStack(DOItems.diamond, 5);
            craftEffect = Fx.mineBig;
            loopSound = Sounds.machine;
            loopSoundVolume = 0.95f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.5f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(37.63f);
            consumeItem(Items.graphite, 20);
            consumeLiquids(new LiquidStack(Liquids.slag, 15f / 60f), new LiquidStack(Liquids.oil, 6f / 60f));
        }};

        largeAncientForge = new GenericCrafter("large-ancient-forge"){{
            requirements(Category.crafting, with(Items.copper, 3000, Items.lead, 3000, Items.graphite, 1500, Items.silicon, 1500, Items.metaglass, 2000, Items.titanium, 1000, Items.plastanium, 5000, Items.thorium, 20, Items.surgeAlloy, 2500, Items.phaseFabric, 10, DOItems.diamond, 10000, DOItems.ancientAlloy, 1250));
            health = 10800;
            size = 6;
            hasPower = true;
            hasItems = true;
            itemCapacity = 200;
            buildCostMultiplier = 0.35f;
            craftTime = 240f;
            outputItem = new ItemStack(DOItems.ancientAlloy, 12);
            updateEffect = Fx.overdriven;
            updateEffectChance = 1f;
            craftEffect = Fx.bigShockwave;
            loopSound = Sounds.machine;
            loopSoundVolume = 4f;
            ambientSound = Sounds.respawning;
            ambientSoundVolume = 0.25f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawRegion("-top"));

            consumePower(315f);
            consumeItems(with(Items.copper, 47, Items.lead, 6, Items.metaglass, 10, Items.blastCompound, 6, Items.titanium, 33, Items.thorium, 16, Items.phaseFabric, 22));
        }};

        mutator = new AttributeCrafter("mutator"){{
            requirements(Category.crafting, with(Items.copper, 445, Items.metaglass, 130, Items.plastanium, 255, Items.thorium, 155, Items.phaseFabric, 125, DOItems.cryogem, 35));
            health = 1000;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 10;
            liquidCapacity = 10;
            floating = true;
            craftTime = 30f;
            outputItem = new ItemStack(DOItems.darkSporePod, 1);
            attribute = Attribute.spores;
            boostScale = 0.05f;
            maxBoost = 2f;
            updateEffect = Fx.vapor;
            updateEffectChance = 0.08f;
            craftEffect = Fx.sporeSlowed;
            loopSound = Sounds.respawning;
            loopSoundVolume = 1.45f;
            ambientSound = Sounds.machine;
            ambientSoundVolume = 0.125f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion(), new DrawPower());

            consumePower(22.5f);
            consumeItem(Items.sporePod, 1);
            consumeLiquid(DOLiquids.phaseString, 1f / 3f);
        }};

        stringMaker = new GenericCrafter("string-maker"){{
            requirements(Category.crafting, with(Items.copper, 350, Items.metaglass, 600, Items.plastanium, 320, Items.phaseFabric, 15, DOItems.diamond, 100, DOItems.cryogem, 100));
            health = 440;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 40;
            liquidCapacity = 30f;
            craftTime = 60f;
            outputLiquid = new LiquidStack(DOLiquids.phaseString, 6.2f);
            updateEffect = Fx.heatReactorSmoke;
            updateEffectChance = 0.25f;
            loopSound = DOSounds.stringmake;
            loopSoundVolume = 1.95f;
            ambientSound = DOSounds.stringmake;
            ambientSoundVolume = 0.25f;
            drawer = new DrawMulti(new DrawDefault(), new DrawPower());

            consumePower(7.5f);
            consumeItems(with(Items.sand, 5, Items.thorium, 10, DOItems.cryogem, 1));
        }};

        stringSolidifier = new GenericCrafter("string-solidifier"){{
            requirements(Category.crafting, with(Items.silicon, 275, Items.plastanium, 125, Items.thorium, 75, Items.surgeAlloy, 50, DOItems.diamond, 125, DOItems.cryogem, 150));
            health = 800;
            size = 4;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;
            liquidCapacity = 40f;
            craftTime = 30f;
            outputItem = new ItemStack(Items.phaseFabric, 5);
            updateEffect = Fx.melting;
            updateEffectChance = 0.25f;
            loopSound = DOSounds.stringsolid;
            loopSoundVolume = 1.95f;
            ambientSound = DOSounds.stringsolid;
            ambientSoundVolume = 0.25f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion(), new DrawRegion("-rotator", 1f, true));

            consumePower(9f);
            consumeLiquid(DOLiquids.phaseString, 4f);
        }};

        waterDecorruptor = new AttributeCrafter("water-decorruptor"){{
            requirements(Category.crafting, with(Items.metaglass, 550, Items.plastanium, 250, Items.thorium, 150, DOItems.diamond, 125, DOItems.cryogem, 150, DOItems.darkSporePod, 300));
            health = 1980;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 5;
            liquidCapacity = 450f;
            buildCostMultiplier = 0.5f;
            craftTime = 90f;
            outputLiquid = new LiquidStack(Liquids.water, 6);
            attribute = Attribute.spores;
            boostScale = 0.5f;
            maxBoost = 3f;
            updateEffect = Fx.freezing;
            updateEffectChance = 0.25f;
            craftEffect = Fx.absorb;
            loopSound = Sounds.respawning;
            loopSoundVolume = 1.15f;
            ambientSound = Sounds.machine;
            ambientSoundVolume = 0.35f;
            drawer = new DrawMulti(new DrawDefault(), new DrawLiquidRegion(), new DrawPower());

            consumePower(18.25f);
            consumeItem(DOItems.darkSporePod, 1);
            consumeLiquid(DOLiquids.corruptWater, 1f);
        }};

        //Section Units
        beastFactory = new UnitFactory("beast-factory"){{
            requirements(Category.units, with(Items.copper, 350, Items.lead, 500, Items.titanium, 80));
            size = 3;
            plans = Seq.with(new UnitPlan(DOUnitTypes.sparrow, 25f * 60f, with(Items.copper, 50, Items.lead, 30, Items.silicon, 15)));
            consumePower(2.4f);
        }};

        faeFactory = new UnitFactory("fae-factory"){{
            requirements(Category.units, with(Items.copper, 200, Items.lead, 560, Items.silicon, 300));
            size = 3;
            plans = Seq.with(new UnitPlan(DOUnitTypes.spriite, 20f * 60f, with(Items.lead, 30, Items.silicon, 20)));
            consumePower(2.4f);
        }};

        warshipFactory = new UnitFactory("warship-factory"){{
            requirements(Category.units, with(Items.copper, 400, Items.lead, 650, Items.thorium, 160));
            size = 3;
            plans = Seq.with(new UnitPlan(DOUnitTypes.scout, 40f * 60f, with(Items.lead, 200, Items.silicon, 45, Items.titanium, 50)));
            consumePower(2.4f);
        }};

        swarmFactory = new UnitFactory("swarm-factory"){{
            requirements(Category.units, with(Items.copper, 410, Items.lead, 300, Items.pyratite, 60));
            size = 3;
            plans = Seq.with(new UnitPlan(DOUnitTypes.gnat, 15f * 60f, with(Items.graphite, 20, Items.pyratite, 5)));
            consumePower(2.4f);
        }};

        cataclysmFactory = new UnitFactory("cataclysm-factory"){{
            requirements(Category.units, with(Items.copper, 620, Items.lead, 980, Items.surgeAlloy, 70));
            size = 3;
            plans = Seq.with(new UnitPlan(DOUnitTypes.squall, 30f * 60f, with(Items.copper, 100, Items.lead, 100, Items.silicon, 50)));
            consumePower(2.4f);
        }};

        abyssalFactory = new UnitFactory("abyssal-factory"){{
            requirements(Category.units, with(Items.copper, 550, Items.lead, 800, Items.metaglass, 200, Items.sporePod, 80));
            size = 3;
            plans = Seq.with(new UnitPlan(DOUnitTypes.siren, 20f * 60f, with(Items.silicon, 50, Items.metaglass, 35)));
            consumePower(2.4f);
            consumeLiquid(Liquids.oil, 0.2f);
        }};

        hardenedReconstructor = new Reconstructor("hardened-reconstructor"){{
            requirements(Category.units, with(Items.lead, 2500, Items.graphite, 1200, Items.silicon, 900, Items.thorium, 500, DOItems.diamond, 800));
            size = 7;
            constructTime = 40f * 60f;
            upgrades.addAll(
                new UnitType[]{DOUnitTypes.owl, DOUnitTypes.falcon},
                new UnitType[]{DOUnitTypes.pixie, DOUnitTypes.nymph},
                new UnitType[]{DOUnitTypes.destroyer, DOUnitTypes.cruiser},
                new UnitType[]{DOUnitTypes.beetle, DOUnitTypes.scarab},
                new UnitType[]{DOUnitTypes.blizzard, DOUnitTypes.hailstorm},
                new UnitType[]{DOUnitTypes.scylla, DOUnitTypes.charybdis}
            );
            consumePower(8f);
            consumeItems(with(Items.silicon, 850, Items.graphite, 620, DOItems.diamond, 350));
        }};

        ancientReconstructor = new Reconstructor("ancient-reconstructor"){{
            requirements(Category.units, with(Items.graphite, 5000, Items.silicon, 5600, Items.surgeAlloy, 1600, DOItems.diamond, 2000, DOItems.cryogem, 50, DOItems.ancientAlloy, 1000));
            size = 9;
            liquidCapacity = 300f;
            constructTime = 60f * 60f;
            upgrades.addAll(
                new UnitType[]{DOUnitTypes.falcon, DOUnitTypes.vulture},
                new UnitType[]{DOUnitTypes.nymph, DOUnitTypes.goblin},
                new UnitType[]{DOUnitTypes.cruiser, DOUnitTypes.battleship},
                new UnitType[]{DOUnitTypes.scarab, DOUnitTypes.cicada},
                new UnitType[]{DOUnitTypes.hailstorm, DOUnitTypes.firestorm},
                new UnitType[]{DOUnitTypes.charybdis, DOUnitTypes.leviathan}
            );
            consumePower(12f);
            consumeItems(with(Items.graphite, 600, Items.silicon, 1500, Items.surgeAlloy, 50, DOItems.diamond, 600, DOItems.ancientAlloy, 200));
            consumeLiquid(DOLiquids.phaseString, 8f);
        }};

        //Section Turrets
        //Fucking Nightmare
    }
}