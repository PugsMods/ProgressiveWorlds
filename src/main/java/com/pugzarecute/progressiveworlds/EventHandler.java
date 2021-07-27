package com.pugzarecute.progressiveworlds;

import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Progressiveworlds.MOD_ID , bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
    @SubscribeEvent
    public static void advEarnEvent (AdvancementEvent event){
    //event.getAdvancement()
    }
    @SubscribeEvent
    public static void itemGainEven(PlayerEvent.ItemPickupEvent event){

    }
}