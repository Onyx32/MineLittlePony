package com.minelittlepony.transform;

import com.minelittlepony.model.capabilities.IModel;

import net.minecraft.entity.EntityLivingBase;

public interface PonyPosture<T extends EntityLivingBase> {
    PonyPosture<EntityLivingBase> ELYTRA = new PostureElytra();
    PonyPosture<? extends EntityLivingBase> FLIGHT = new PostureFlight();
    PonyPosture<? extends EntityLivingBase> SWIMMING = new PostureSwimming();
    PonyPosture<EntityLivingBase> FALLING = new PostureFalling();

    default boolean applies(EntityLivingBase entity) {
        return true;
    }

    void transform(IModel model, T entity, double motionX, double motionY, double motionZ, float yaw, float ticks);
}
