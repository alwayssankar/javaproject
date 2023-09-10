package COM.JSP.JDBC;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class networkingInAdvanceJava {

	public static void main(String[] args) throws UnknownHostException {
		
		String url = "www.simlelearn.com";
		InetAddress inetaddress = Inet4Address.getByName(url);
		System.out.println("Address :" + Arrays.toString(inetaddress.getAddress()));
		
		System.out.println("hostAddress :" + inetaddress.getHostAddress());
		 System.out.println("isAnylocalAddress :" + inetaddress.isAnyLocalAddress());
		System.out.println("islinklocalAddress :" + inetaddress.isLinkLocalAddress());
		System.out.println("isloopbackAddress :" + inetaddress.isLoopbackAddress());
		System.out.println("issitelocalAddress :" + inetaddress.isSiteLocalAddress());
		System.out.println("hashcode :" + inetaddress.hashCode());
		
		
		

	}

}
