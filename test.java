class Question {

    public static void main(String[] args) {
        String str1 = "Mid";
        String str2 = new String("Term");
        String str3 = "Mid";
        String str4 = str2;
        String str5 = new String("Term");

        System.out.println(str1.getClass().getName() + Integer.toHexString(str1.hashCode()) );
        System.out.println(str2.getClass().getName() + Integer.toHexString(str2.hashCode()) );
        System.out.println(str3.getClass().getName() + Integer.toHexString(str3.hashCode()) );
        System.out.println(str4.getClass().getName() + Integer.toHexString(str4.hashCode()) );
        System.out.println(str5.getClass().getName() + Integer.toHexString(str5.hashCode()) );
    
    
    }
}