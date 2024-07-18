package diamondore.type.weapons;


import arc.math.*;
import arc.util.*;
import mindustry.entities.Units;
import mindustry.entities.bullet.*;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.*;
import mindustry.content.*;
import mindustry.type.*;
import diamondore.content.*;

public class goblinBomb extends Weapon{
    ArtilleryBulletType goblinBombBullet = new ArtilleryBulletType(){{
        lifetime = 200f;
        damage = 300f;
        splashDamage = 250f;
        splashDamageRadius = 200f;
        buildingDamageMultiplier = 0.5f;
        width = 20f;
        height = 20f;
        lightRadius = 17f;
        lightOpacity = 1.15f;
        shrinkY = 0f;
        shrinkX = 0.75f;
        despawnEffect = Fx.greenBomb;
        hitEffect = Fx.flakExplosionBig;
        hitSound = DOSounds.goblinPlasmaBoom;
        shootEffect = Fx.healWave;
        smokeEffect = Fx.shootBigSmoke;
        speed = 3f;
        collidesAir = true;
        reflectable = false;
        trailChance = 1f;
        frontColor = arc.graphics.Color.valueOf("#EDF3A9");
        hitColor = arc.graphics.Color.valueOf("#66dd88");
        backColor = arc.graphics.Color.valueOf("#44ee77");
        lightColor = arc.graphics.Color.valueOf("#aaff77");
        sprite = "diamondbullet";

    }};
    public goblinBomb(float x, float y){
        super("goblinBomb");
        this.x = x;
        this.y = y;
        reload = 275f;
        cooldownTime = 275f;
        heatColor = arc.graphics.Color.valueOf("#EDF3A9");
        shoot.shots = 1;
        inaccuracy = 0f;
        recoil = 0f;
        shootY = 0f;
        shootCone = 1f;
        rotateSpeed = 3f;
        ignoreRotation = true;
        rotate = true;
        mirror = false;
        soundPitchMin = 0.57f;
        soundPitchMax = 0.63f;
        shootSound = Sounds.explosionbig;
        bullet = goblinBombBullet;
    }
    @Override
    protected Teamc findTarget(Unit unit, float x, float y, float range, boolean air, boolean ground){
        Teamc tar = Units.closest(unit.team, x, y, range, u -> u != unit && u.damaged());
        if(tar != null)return tar;
        return Units.closestTarget(unit.team, x, y, range + Math.abs(shootY), u -> u.checkTarget(air, ground), t -> ground);
    }
    //OwOILoveYou
    @Override
    protected void handleBullet(Unit unit, WeaponMount mount, Bullet bullet){
        if(mount.target.team() == unit.team) {
            bullet.damage *= -1f;
        }
        if(continuous){
            float
                weaponRotation = unit.rotation - 90 + (rotate ? mount.rotation : baseRotation),
                mountX = unit.x + Angles.trnsx(unit.rotation - 90, x, y),
                mountY = unit.y + Angles.trnsy(unit.rotation - 90, x, y),
                bulletX = mountX + Angles.trnsx(weaponRotation, this.shootX, this.shootY),
                bulletY = mountY + Angles.trnsy(weaponRotation, this.shootX, this.shootY);
            //make sure the length updates to the last set value
            Tmp.v1.trns(bulletRotation(unit, mount, bulletX, bulletY), shootY + mount.aimY).add(bulletX, bulletY);
            bullet.aimX = Tmp.v1.x;
            bullet.aimY = Tmp.v1.y;
        }
    }
}