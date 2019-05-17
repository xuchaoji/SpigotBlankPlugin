package com.xuchaoji.spigot;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class SpigotBlankPlugin extends JavaPlugin {
	//插件加载时执行此方法
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"[BlankPlugin]已成功加载！");
	}
	
	//插件停用时执行次方法
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED+"[BlankPlugin]已停用！");
	}

}
