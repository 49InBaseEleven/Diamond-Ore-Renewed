package diamondore.content;

import arc.graphics.*;
import mindustry.content.StatusEffects;
import mindustry.type.*;

public class DOLiquids{
    public static Liquid phaseString, corruptWater;

    public static void load(){
        phaseString = new Liquid("phase-string", Color.valueOf("fff3d6")) {{
            temperature = 0.5f;
            heatCapacity = 2.7f;
            explosiveness = 3.14f;
            viscosity = 0.01f;
            effect = StatusEffects.corroded;
            coolant = true;
            barColor = Color.valueOf("f19583");
            lightColor = Color.valueOf("ffd59388");
        }};

        corruptWater = new Liquid("corrupt-water", Color.valueOf("355085")) {{
            temperature = 0.5f;
            flammability = 0.05f;
            heatCapacity = 0.1f;
            explosiveness = 90.01f;
            viscosity = 0.999999f;
            effect = StatusEffects.sapped;
            barColor = Color.valueOf("007a96");
            lightColor = Color.valueOf("00659666");
        }};
    }
}