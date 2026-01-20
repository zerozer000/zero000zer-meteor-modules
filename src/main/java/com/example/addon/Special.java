package com.example.addon;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.TitleScreen; // Screen to show after disconnecting
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;

public class Special {
    public static void Quit()
    {
        Text text = Text.of("aaa");
        MinecraftClient client = MinecraftClient.getInstance();
        new DeathScreen(text, false);
        //client.disconnect(new DeathScreen(text, false));
    }
}
