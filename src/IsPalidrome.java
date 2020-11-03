public class IsPalidrome {
    public static void main(String[] args) {
        String str = "RADAR";
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }

}

