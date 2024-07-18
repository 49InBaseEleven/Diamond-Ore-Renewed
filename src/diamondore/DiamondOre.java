package diamondore;

import arc.*;
import arc.util.*;
import diamondore.content.*;
import mindustry.game.EventType.*;
import mindustry.game.*;
import mindustry.mod.*;

import static java.lang.Float.*;

public class DiamondOre extends Mod{
    public DiamondOre() {
        Events.on(WorldLoadEvent.class, e -> Team.sharded.cores().each(c -> {
            if(isNaN(c.health)) c.health = c.maxHealth;
        }));
    }
    @Override
    public void loadContent(){
        Log.info("Loading some very sparkly content");
        DOBlocks.load();
        DOItems.load();
        DOLiquids.load();
        DOTechTree.load();
        DOUnitTypes.load();
        //DOSectors.load();
    }
}
