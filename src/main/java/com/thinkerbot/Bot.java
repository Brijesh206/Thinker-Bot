package com.thinkerbot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class Bot {

    private final ShardManager shardManager;

    public Bot() throws LoginException{
        String token = "MTAwNzk0Nzk4NjEyNDQwNjgwNA.GMV7xK.YNW2yXxd5zxc1_BdxrXBnxPsbqhCzvhA3oHhgw";
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.watching("Test!"));
        shardManager = builder.build();
    }

    public ShardManager getShardManager() {
        return shardManager;
    }

    public static void main(String[] args) throws LoginException {

        try{
            Bot bot = new Bot();
        }catch (Exception e){
            System.out.println("Error : Provided bot token is invalid");
        }

    }
}
