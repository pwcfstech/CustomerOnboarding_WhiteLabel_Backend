package com.afrAsia.Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class AfrAsiaSMSUtility {
	public static void sendSMS(String URL)
			throws  IOException {
		URL url = new URL(URL);
		HttpURLConnection uc = (HttpURLConnection)url.openConnection();
		uc.disconnect();
	}
}
