package net.norois.learnmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {

    public static final FoodComponent COKE = new FoodComponent.Builder()
            .hunger(6).saturationModifier(1.00f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600), 1).build();
    public static final FoodComponent TALISMAN = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.25f).build();

}