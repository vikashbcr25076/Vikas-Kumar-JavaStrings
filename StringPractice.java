public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "Java Programming";

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Concatenation: " + str1.concat(" - ").concat(str2));
        System.out.println("Uppercase str2: " + str2.toUpperCase());
        System.out.println("Lowercase str1: " + str1.toLowerCase());
        System.out.println("Substring of str2 (0 to 4): " + str2.substring(0, 4));
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
    }
}
