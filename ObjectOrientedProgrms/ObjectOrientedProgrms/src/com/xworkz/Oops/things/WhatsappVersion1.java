package com.xworkz.Oops.things;

public class WhatsappVersion1 extends Whatsapp{
	public String version;
	public String settings;
	public String communities;
	public String updates;
	
	public static void WhatsApp(String version) {
		System.out.println(version);
	}
	public static void WhatsApp() {
		System.out.println("  ");
	}
	public void WhatsApp(String settings, String communities) {
		System.out.println(settings+" "+communities);
	}

}
