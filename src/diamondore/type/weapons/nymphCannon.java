package diamondore.type.weapons;


import arc.math.*;
import arc.util.*;
import mindustry.entities.Units;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.pattern.ShootPattern;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.content.*;

public class nymphCannon extends Weapon{
    ArtilleryBulletType nymphBullet = new ArtilleryBulletType(){{
        lifetime = 74f;
        damage = 30f;
        splashDamage = 225f;
        splashDamageRadius = 60f;
        buildingDamageMultiplier = 0.5f;
        width = 16f;
        height = 16f;
        lightRadius = 17f;
        lightOpacity = 1.15f;
        shrinkY = 0f;
        shrinkX = 0.5f;
        despawnEffect = Fx.shockwave;
        hitEffect = Fx.explosion;
        hitSound = Sounds.plasmaboom;
        speed = 5f;
        collidesAir = true;
        collides = true;
        reflectable = true;
        trailChance = 1f;
        frontColor = arc.graphics.Color.valueOf("#EDF3A9");
        hitColor = arc.graphics.Color.valueOf("#66dd88");
        backColor = arc.graphics.Color.valueOf("#44ee77");
        lightColor = arc.graphics.Color.valueOf("#aaff77");
        sprite = "diamondbomb";

    }};
    public nymphCannon(float x, float y){
        super("nymphCannon");
        this.x = x;
        this.y = y;
        reload = 72f;
        cooldownTime = 18f;
        shoot = new ShootPattern(){{
            shots  = 1;
        }};
        inaccuracy = 0f;
        recoil = 0f;
        shootCone = 2f;
        rotateSpeed = 4f;
        rotate = true;
        mirror = true;
        soundPitchMin = 0.67f;
        soundPitchMax = 0.83f;
        shootSound = Sounds.boom;
        bullet = nymphBullet;
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