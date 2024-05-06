public class SystemclassPractice {
    public static void main(String[] args) {
        // Terminates the JVM
        System.exit(0);
        
        // Runs the garbage collector
        System.gc();
        
        // Returns the current time in milliseconds
        long currentTime = System.currentTimeMillis();
        System.out.println("Current time in milliseconds: " + currentTime);
        
        // Returns the current value of the system timer in nanoseconds
        long nanoTime = System.nanoTime();
        System.out.println("Current nano time: " + nanoTime);
        
        // Copies elements from one array to another
        int[] srcArray = {1, 2, 3, 4, 5};
        int[] destArray = new int[5];
        System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);
        System.out.println("Copied array: " + Arrays.toString(destArray));
        
        // Gets the system property
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);
        
        // Sets the system property
        System.setProperty("user.language", "en");
        System.out.println("User Language: " + System.getProperty("user.language"));
    }
}
