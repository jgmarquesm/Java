import java.lang.IllegalArgumentException;
class CollatzCalculator {
    int computeStepCount(int start) {
        if(start <= 0) {
            throw new  IllegalArgumentException("Only natural numbers are allowed");
        } 
        else { 
            int steps = 0;
            while(start > 1){
                if(start % 2 == 0){
                    start /= 2;
                } 
                else {
                    start = start*3 + 1;
                }   
                steps++;
            }
            return steps;
        }
    }
}
