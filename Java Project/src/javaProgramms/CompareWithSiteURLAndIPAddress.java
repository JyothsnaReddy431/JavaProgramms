package javaProgramms;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareWithSiteURLAndIPAddress {

	public static void main(String[] args) {
		try {
			System.out.println(new URL("https://app.hubsport.com").equals(new URL("https://104.19.155.83")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
