package medium;

import java.nio.ByteOrder;

public class EndiannessCheck {

	public static void endianType(){
		if (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)) {
			  System.out.println("BigEndian");
			} else {
			  System.out.println("LittleEndian");
			}
	}
}
