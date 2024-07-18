package diamondore.content;

import arc.graphics.*;
import mindustry.type.*;

public class DOItems {
    public static Item diamond, cryogem, darkSporePod, ancientAlloy, ancientScrap;
    public static void load() {
        diamond = new Item("diamond", Color.valueOf("88ccff")){{
            hardness = 5;
            cost = 3;
        }};
        
        cryogem = new Item("cryogem", Color.valueOf("aaffff")){{
            hardness =5;
            cost = 1;
        }};
        
        darkSporePod = new Item("dark-spore-pod", Color.valueOf("004c96")){{
            hardness = 5;
            flammability = 6.66f;
            cost = 1;
            radioactivity = 13.37f;
            explosiveness = 420.69f;
        }};
        
        ancientAlloy = new Item("ancient-alloy", Color.valueOf("e4bc5e")){{
            hardness =6;
            cost = 5;
            radioactivity = 18.75f;
        }};
        
        ancientScrap = new Item("ancient-scrap", Color.valueOf("8e5811")){{
            hardness = 5;
            radioactivity = 1.5f;
            explosiveness = 0.25f;
        }};
    }
}