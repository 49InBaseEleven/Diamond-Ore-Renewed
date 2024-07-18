package diamondore;

import arc.util.*;
import diamondore.content.*;
import mindustry.mod.*;

public class DiamondOre extends Mod{

    public DiamondOre(){
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
