package testing;

// TODO - renomeie o arquivo para atender ao mesmo nome da classe.

public class Variance {
    public static double calculateSampleVariance(double[] datasetValues) {
        int totalElements = datasetValues.length;
        double meanValue = 0, sumValues = 0, difference = 0, squaredDifferences = 0;

        if (totalElements <= 1) return 0;

        for (double value : datasetValues) sumValues += value;

        meanValue = sumValues / totalElements;
        squaredDifferences = 0;

        for (double value : datasetValues) {
            difference = value - meanValue;
            squaredDifferences += difference * difference;
        }

        return squaredDifferences / (totalElements - 1);
    }

    public static void main(String[] args) {
        double[] testScores = {3, 21, 98, 17, 9};
        System.out.printf("Variância de valores da amostra: %.4f", calculateSampleVariance(testScores));
    }
}