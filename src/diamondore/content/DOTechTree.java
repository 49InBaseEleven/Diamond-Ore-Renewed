package diamondore.content;

import static mindustry.content.Items.*;
import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;
import static diamondore.content.DOBlocks.*;
import static diamondore.content.DOItems.*;
import static diamondore.content.DOLiquids.*;
import static diamondore.content.DOUnitTypes.*;

public class DOTechTree{
    public static void load(){
        launchPad.techNode.children.add(
            node(cargoLaunchPad, () -> {
                node(ancientLaunchSilo, () -> {
                });
            })
        );
        distributor.techNode.children.add(
            node(massDistributor, () -> {
                node(omegaRouter, () -> {
                });
            })
        );
        vault.techNode.children.add(
            node(diamondVault, () -> {
                node(cryoDiamondVault, () -> {
                    node(ancientCrate, () -> {
                        node(ancientContainer);
                        node(ancientVault, () -> {
                            node(ancientRepository, () -> {
                            });
                        });
                    });
                    node(omniVault, () -> {
                    });
                });
            })
        );
        massDriver.techNode.children.add(
            node(bulkDriver, () -> {
            })
        );
        titaniumConveyor.techNode.children.add(
            node(crystalConveyor, () -> {
            })
        );
        armoredConveyor.techNode.children.add(
            node(ancientMetalConveyor, () -> {
                node(ancientItemBridge, () -> {
                });
            })
        );
        plastaniumConveyor.techNode.children.add(
            node(massConveyor, () -> {
                node(sporeConveyor, () -> {
                });
            })
        );
        liquidTank.techNode.children.addAll(
            node(ancientLiquidTank, () -> {
                node(ancientLiquidRepository, () -> {
                });
            }),
            node(bulkLiquidTank, () -> {
            })
        );
        platedConduit.techNode.children.add(
            node(ancientMetalConduit, () -> {
                node(ancientLiquidBridge, () -> {
                });
            })
        );
        pulseConduit.techNode.children.add(
            node(crystalConduit, () -> {
            })
        );
        impulsePump.techNode.children.add(
            node(cryoPump, () -> {
            })
        );
        cultivator.techNode.children.add(
            node(advancedCultivator, () -> {
                node(darkCultivator, () -> {
                });
            })
        );
        blastDrill.techNode.children.addAll(
            node(omniDrill, () -> {
            }),
            node(precisionOmniDrill, () -> {
            })
        );
        waterExtractor.techNode.children.add(
            node(aquaDrill, () -> {
            })
        );
        oilExtractor.techNode.children.addAll(
            node(ancientOilDrill, () -> {
            }),
            node(organicDrill, () -> {
            })
        );
        pneumaticDrill.techNode.children.add(
            node(diamondDrill, () -> {
                node(miniDiamondDrill, () -> {
                });
            })
        );
        pyratiteMixer.techNode.children.add(
            node(bulkPyratiteMixer, () -> {
            })
        );
        blastMixer.techNode.children.add(
            node(bulkBlastMixer, () -> {
            })
        );
        sporePress.techNode.children.add(
            node(darkSporePress, () -> {
            })
        );
        coalCentrifuge.techNode.children.add(
            node(bulkCentrifuge, () -> {
            })
        );
        plastaniumCompressor.techNode.children.add(
            node(bulkCompressor, () -> {
            })
        );
        multiPress.techNode.children.add(
            node(diamondSynthesizer, () -> {
                node(industrialDiamondPress, () -> {
                });
            })
        );
        phaseWeaver.techNode.children.addAll(
            node(stringMaker, () -> {
            }),
            node(stringSolidifier, () -> {
            })
        );
        kiln.techNode.children.add(
            node(bulkFurnace, () -> {
            })
        );
        melter.techNode.children.add(
            node(bulkMelter, () -> {
                node(bulkSeparator, () -> {
                });
            })
        );
        surgeSmelter.techNode.children.addAll(
            node(ancientForge, () -> {
                node(largeAncientForge, () -> {
                });
                node(ancientRefinery, () -> {
                });
            }),
            node(alloySurgeForge, () -> {
            })
        );
        cryofluidMixer.techNode.children.addAll(
            node(bulkBlender, () -> {
            }),
            node(cryogemCompressor, () -> {
                node(cryogemDissipator, () -> {
                });
            })
        );
        memoryBank.techNode.children.add(
            node(crystalCell, () -> {
                node(largeCrystalCell, () -> {
                });
            })
        );
        hyperProcessor.techNode.children.add(
            node(matrixProcessor, () -> {
                node(superMatrixProcessor, () -> {
                    node(ultraMatrixProcessor, () -> {
                    });
                });
            })
        );
        powerNodeLarge.techNode.children.add(
            node(ancientEnergyNode, () -> {
                node(ancientEnergyNodeLarge, () -> {
                });
            })
        );
        surgeTower.techNode.children.add(
            node(reinforcedPowerDistributor, () -> {
            })
        );
        battery.techNode.children.add(
            node(ancientBattery, () -> {
                node(ancientBatteryLarge, () -> {
                });
            })
        );
        batteryLarge.techNode.children.add(
            node(surgeBattery, () -> {
            })
        );
        mendProjector.techNode.children.add(
            node(phaseMender, () -> {
                node(ancientEnergyShield, () -> {
                    node(cryoDriveProjector, () -> {
                        node(ancientHasteObelisk, () -> {
                        });
                    });
                });
                node(ancientMendingObelisk, () -> {
                });
            })
        );
        thermalGenerator.techNode.children.add(
            node(ancientHeatPanel, () -> {
                node(differentialReactor, () -> {
                    node(ancientDecaygen, () -> {
                    });
                });
            })
        );
        impactReactor.techNode.children.add(
            node(surgeReactor, () -> {
            })
        );
        solarPanel.techNode.children.add(
            node(diamondSolarPanel, () -> {
                node(ancientSolarGenerator, () -> {
                });
            })
        );
        plastaniumWall.techNode.children.add(
            node(diamondWall, () -> {
                node(largeDiamondWall, () -> {
                    node(hugeDiamondWall, () -> {
                    });
                    node(giganticDiamondWall, () -> {
                    });
                });
            })
        );
        surgeWall.techNode.children.add(
            node(ancientMetalWall, () -> {
                node(largeAncientMetalWall, () -> {
                    node(hugeAncientMetalWall, () -> {
                    });
                    node(giganticAncientMetalWall, () -> {
                    });
                });
            })
        );
        plastaniumWall.techNode.children.add(
            node(diamondWall, () -> {
                node(largeDiamondWall, () -> {
                    node(hugeDiamondWall, () -> {
                        node(giganticDiamondWall, () -> {
                        });
                    });
                });
            })
        );
        //turrets here
        groundFactory.techNode.children.add(
            node(swarmFactory, () -> {
                node(gnat, () ->{
                    node(firefly, () ->{
                        node(beetle, () ->{
                            node(scarab, () ->{
                                node(cicada, () ->{
                                });
                            });
                        });
                    });
                });
                node(faeFactory, () ->{
                    node(spriite, () ->{
                        node(gnome, () ->{
                            node(pixie, () ->{
                                node(nymph, () ->{
                                    node(goblin, () ->{
                                    });
                                });
                            });
                        });
                    });
                    node(beastFactory, () ->{
                        node(sparrow, () ->{
                            node(crow, () ->{
                                node(owl, () ->{
                                    node(falcon, () ->{
                                        node(vulture, () ->{
                                        });
                                    });
                                });
                            });
                        });
                    });
                });
            })
        );
        airFactory.techNode.children.add(
            node(warshipFactory, () -> {
                node(scout, () ->{
                    node(fighter, () ->{
                        node(destroyer, () ->{
                            node(cruiser, () ->{
                                node(battleship, () ->{
                                });
                            });
                        });
                    });
                });
                node(cataclysmFactory, () ->{
                    node(squall, () ->{
                        node(derecho, () ->{
                            node(blizzard, () ->{
                                node(hailstorm, () ->{
                                    node(firestorm, () ->{
                                    });
                                });
                            });
                        });
                    });
                });
            })
        );
        navalFactory.techNode.children.add(
            node(abyssalFactory, () ->{
                node(siren, () ->{
                    node(serpent, () ->{
                        node(scylla, () ->{
                            node(charybdis, () ->{
                                node(leviathan, () ->{
                                });
                            });
                        });
                    });
                });
            })
        );
        multiplicativeReconstructor.techNode.children.add(
            node(hardenedReconstructor, () -> {
                node(ancientReconstructor, () -> {
                });
            })
        );
        water.techNode.children.add(
            node(corruptWater)
        );
        cryofluid.techNode.children.add(
            node(cryogem)
        );
        surgeAlloy.techNode.children.add(
            node(ancientAlloy)
        );
        phaseFabric.techNode.children.add(
            node(phaseString)
        );
        sporePod.techNode.children.add(
            node(darkSporePod)
        );
    }
}