package com.thinkerbot;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class Commands extends ListenerAdapter {
    public String prefix = "!";

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(prefix + "test")){
            event.getChannel().sendMessage("Hey there, I'm alive!");
        }

//        if (event.isFromType(ChannelType.PRIVATE))
//        {
//            System.out.printf("[PM] %s: %s\n", event.getAuthor().getName(),
//                    event.getMessage().getContentDisplay());
//        }
//        else
//        {
//            System.out.printf("[%s][%s] %s: %s\n", event.getGuild().getName(),
//                    event.getChannel().getName(), Objects.requireNonNull(event.getMember()).getEffectiveName(),
//                    event.getMessage().getContentDisplay());
//        }
    }
}
