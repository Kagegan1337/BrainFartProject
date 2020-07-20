package HexConverter;

public class Main {

    public static void main(String[] args) {
        byte[] b = new byte[]{1,3,3,7};
        String hex = Converter.bytesToHex(b);
        String s = Converter.convertBytesToString(b);
        System.out.println(s);
        System.out.println(hex);
        byte[] n = Converter.hexStringToByteArray(hex);
        byte[] bytes = Converter.convertStringToBase64(s);
        for(byte b1 : n) {
            System.out.print(b1);
        }
        System.out.println();
        for (byte b1 : bytes) {
            System.out.print(b1);
        }

    }
}
