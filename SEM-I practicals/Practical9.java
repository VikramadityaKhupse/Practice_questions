class Sample {
    private double x;
    private double y;

    // Constructor
    public Sample(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the mean
    public static double calculateMean(Sample sample) {
        return (sample.x + sample.y) / 2.0;
    }

    public static void main(String[] args) {
        // Creating an object of Sample class
        Sample sample = new Sample(5.0, 7.0);
        
        // Calculating the mean and printing the result
        double mean = calculateMean(sample);
        System.out.println("Mean value: " + mean);
    }
}
