package com.xuchaoji.spigot;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class SpigotBlankPlugin extends JavaPlugin {
	//�������ʱִ�д˷���
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"[BlankPlugin]�ѳɹ����أ�");
	}
	
	//���ͣ��ʱִ�дη���
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED+"[BlankPlugin]��ͣ�ã�");
	}

}
