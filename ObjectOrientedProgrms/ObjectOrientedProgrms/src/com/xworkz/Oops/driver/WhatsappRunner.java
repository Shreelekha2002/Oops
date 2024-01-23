package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Whatsapp;
import com.xworkz.Oops.things.WhatsappVersion1;

public class WhatsappRunner {

	public static void main(String[] args) {
		WhatsappVersion1 v = new WhatsappVersion1();
	v.color="red";
	v.communities="we can merge more groups into a single groups";
	v.feature1="updated in vedio and audio chats";
	v.feature2="new update is channel";
	v.name="WhatsApp";
	v.settings="updated settings are available";
	v.updates="v5";
	v.version="v6";
	v.WhatsApp();
	v.whatsapp();
	v.WhatsApp("v21");
	v.whatsapp("whatsapp");
	v.contactNumber=9886;
	
	System.out.println(v.color);
	System.out.println(v.communities);
	System.out.println(v.feature1);
	System.out.println(v.feature2);
	System.out.println(v.name);
	System.out.println(v.settings);
	System.out.println(v.updates);
	System.out.println(v.version);
	System.out.println(v.contactNumber);
	}

}
