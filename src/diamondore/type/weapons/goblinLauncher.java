package diamondore.type.weapons;


import arc.math.*;
import arc.util.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.entities.Units;
import mindustry.entities.bullet.*;
import mindustry.entities.units.WeaponMount;
import mindustry.content.*;

public class goblinLauncher extends Weapon{
    BasicBulletType GLauncherBullet = new BasicBulletType(){{
        lifetime = 55f;
        damage = 20f;
        splashDamage = 30f;
        splashDamageRadius = 25f;
        buildingDamageMultiplier = 0.5f;
        width = 16f;
        height = 16f;
        lightRadius = 17f;
        lightOpacity = 1.15f;
        shrinkY = 0f;
        shrinkX = 0.5f;
        despawnEffect = Fx.shockwave;
        hitEffect = Fx.flakExplosionBig;
        hitSound = Sounds.explosion;
        trailEffect = Fx.mine;
        speed = 6.7f;
        fragBullets = 8;
        fragBullet = GLauncherFrag;
        fragLifeMin = 0.2f;
        fragVelocityMin = 1 / 7f;
        fragVelocityMax = 11 / 6f;
        collidesAir = true;
        collides = true;
        reflectable = true;
        trailChance = 1f;
        frontColor = arc.graphics.Color.valueOf("#EDF3A9");
        trailColor = arc.graphics.Color.valueOf("#EDF3A9");
        hitColor = arc.graphics.Color.valueOf("#66dd88");
        backColor = arc.graphics.Color.valueOf("#44ee77");
        lightColor = arc.graphics.Color.valueOf("#aaff77");
        sprite = "diamondbomb";
    }};
    BasicBulletType GLauncherFrag = new BasicBulletType(){{
        lifetime = 80f;
        damage = 12f;
        buildingDamageMultiplier = 0.5f;
        width = 4f;
        height = 4f;
        lightRadius = 4f;
        lightOpacity = 1.15f;
        shrinkY = 0f;
        shrinkX = 0f;
        despawnEffect = Fx.pointHit;
        hitEffect = Fx.smeltsmoke;
        shootEffect = Fx.shootHeal;
        speed = 1.2f;
        drag = 0.01f;
        frontColor = arc.graphics.Color.valueOf("#EDF3A9");
        hitColor = arc.graphics.Color.valueOf("#EDF3A9");
        backColor = arc.graphics.Color.valueOf("#aaee77");
        lightColor = arc.graphics.Color.valueOf("#aaff77");
        pierce = true;
        pierceBuilding = true;
        hittable = false;
        reflectable = false;
        absorbable = false;
        sprite = "diamondbullet";
    }};
    public goblinLauncher(float x, float y, boolean mirr){
        super("goblinLauncher");
        this.x = x;
        this.y = y;
        reload = 72f;
        cooldownTime = 18f;
        shoot.shots  = 1;
        inaccuracy = 0f;
        recoil = 0f;
        shootCone = 2f;
        rotateSpeed = 4f;
        rotate = true;
        mirror = mirr;
        soundPitchMin = 0.67f;
        soundPitchMax = 0.83f;
        shootSound = Sounds.railgun;
        bullet = GLauncherBullet;
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