package My_Maven.My_Maven;

import org.apache.commons.codec.binary.Base64;

public class MT_EncodingDecodingPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "qwerty71";

		byte[] encodedString=Base64.encodeBase64(str.getBytes());
		System.out.println(encodedString);
		System.out.println("encoded String:" +new String (encodedString));

		byte[] decodedString=Base64.decodeBase64(encodedString);
		System.out.println(decodedString);
		System.out.println("decoded String:" +new String (decodedString));

		}
}
	


