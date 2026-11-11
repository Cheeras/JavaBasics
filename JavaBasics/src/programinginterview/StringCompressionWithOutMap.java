package programinginterview;


public class StringCompressionWithOutMap {

    public static void main(String[] args) {

        String ss = "aabcccccaaa";

        String result = compress(ss);

        System.out.println(result);
    }

    public static String compress(String ss) {

        if (ss == null || ss.isEmpty()) {
            System.out.println("String cannot be null or empty");
            return ss;
        }

        String result = "";
        int count = 1;

        for (int i = 1; i < ss.length(); i++) {

            if (ss.charAt(i) == ss.charAt(i - 1)) {

                count++;

            } else {

                result = result + ss.charAt(i - 1) + count;

                count = 1;
            }
        }

        // Append the last character and its count
        result = result + ss.charAt(ss.length() - 1) + count;

        return result;
    }
}

