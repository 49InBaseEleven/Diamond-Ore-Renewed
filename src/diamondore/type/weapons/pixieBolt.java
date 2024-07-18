package diamondore.type.weapons;


import arc.math.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.entities.units.WeaponMount;
import diamondore.content.*;

public class pixieBolt extends Weapon{
    BasicBulletType pixieBullet = new BasicBulletType(){{
        lifetime = 50f;
        damage = 30f;
        buildingDamageMultiplier = 0.5f;
        width = 8f;
        height = 8f;
        lightRadius = 8f;
        lightOpacity = 1.15f;
        shrinkY = 0f;
        shrinkX = 0f;
        despawnEffect = Fx.heal;
        hitEffect = Fx.smeltsmoke;
        shootEffect = Fx.shootHeal;
        speed = 4f;
        trailChance = 1f;
        frontColor = arc.graphics.Color.valueOf("#EDF3A9ff");
        hitColor = arc.graphics.Color.valueOf("#99dd55ff");
        backColor = arc.graphics.Color.valueOf("#aaee77ff");
        lightColor = arc.graphics.Color.valueOf("#aaff77ff");
        pierce = true;
        pierceBuilding = true;
        hittable = false;
        reflectable = false;
        absorbable = false;
        sprite = "diamondbullet";
        hitSound = DOSounds.tempestShockBullet;
    }};
    public pixieBolt(float x, float y){
        super("pixie-bolt");
        this.x = x;
        this.y = y;
        reload = 27f;
        cooldownTime = 18f;
        shoot.shots = 1;
        inaccuracy = 0f;
        recoil = 0f;
        shootCone = 2f;
        rotateSpeed = 8f;
        rotate = true;
        mirror = true;
        soundPitchMin = 0.67f;
        soundPitchMax = 0.83f;
        shootSound = Sounds.blaster;
        bullet = pixieBullet;
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