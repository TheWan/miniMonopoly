package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
public class DeathNotification implements Observer {
    public void update(Player player){
        System.out.println(player.name + " gets broke!");
    }
}
