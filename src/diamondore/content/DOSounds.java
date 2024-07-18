package diamondore.content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import arc.struct.Seq;
import mindustry.Vars;

import java.lang.reflect.Field;

public class DOSounds{
	public static Sound
    ancientDecay = new Sound(),
    ancientForeshadowHit = new Sound(),
    ancientMetalStep = new Sound(),
    ancientShockArtillery = new Sound(),
    artilleryHit = new Sound(),
    battleshipPlasma = new Sound(),
    blasterShot = new Sound(),
    goblinHealBombBoom = new Sound(),
    goblinPlasmaBoom = new Sound(),
    goblinPlasmaHeal = new Sound(),
    gunShoot = new Sound(),
    illithidAbility = new Sound(),
    illithidDeath = new Sound(),
    illithidHurt1 = new Sound(),
    illithidHurt2 = new Sound(),
    illithidHurt3 = new Sound(),
    illithidHurt4 = new Sound(),
    lokiShoot = new Sound(),
    medBeam1 = new Sound(),
    medBeam2 = new Sound(),
    medBeam3 = new Sound(),
    odinShoot = new Sound(),
    overdriverActivate = new Sound(),
    plasmaBallShoot = new Sound(),
    plasmaBallShoot2 = new Sound(),
    purgerCharge = new Sound(),
    purgerPlasmaBoom = new Sound(),
    scoutSalvo = new Sound(),
    shockMissile = new Sound(),
    sporesplat = new Sound(),
    sporeWaterWalk = new Sound(),
    stormSalvo = new Sound(),
    strikeZap = new Sound(),
    strikeZapBig = new Sound(),
    stringmake = new Sound(),
    stringsolid = new Sound(),
    surgeReactorOverheat = new Sound(),
    swings = new Sound(),
    tempestShockBullet = new Sound(),
    thorShoot = new Sound(),
    thorThorKaboom = new Sound(),
    vultureAttack = new Sound(),
    warblePulse = new Sound(),
    YggdrasilCharge = new Sound(),
    yggdrasilfire = new Sound(),
    yggdrasilPlasmaExplode = new Sound();
	
	public static void load(){
		Class<?> c = DOSounds.class;
		Seq<Field> fields = new Seq<>(c.getFields());
		try{
			for(Field f : fields)f.set(null, loadSound(f.getName()));
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	
	private static Sound loadSound(String soundName){
		if(!Vars.headless){
			String name = "sounds/" + soundName;
			String path = Vars.tree.get(name + ".ogg").exists() ? name + ".ogg" : name + ".mp3";
			
			Sound sound = new Sound();
			
			AssetDescriptor<?> desc = Core.assets.load(path, Sound.class, new SoundLoader.SoundParameter(sound));
			desc.errored = Throwable::printStackTrace;
			return sound;
		}else return new Sound();
	}
}