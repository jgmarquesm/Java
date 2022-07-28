class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int input) {
        double sum = 0;
        for(int i=0; i < input + 1; i++){
            sum += i;
        }
        return (int) Math.pow(sum, 2.0);
    }
    int computeSumOfSquaresTo(int input) {
        double sumOfSquares = 0;
        for (int i = 0; i < input + 1; i++){
         sumOfSquares += Math.pow(i, 2.0);
        }
        return (int) sumOfSquares;
    }
    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
