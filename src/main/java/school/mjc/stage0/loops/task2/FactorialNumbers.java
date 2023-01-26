package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 1;
        int lastResult = 1;
        System.out.println(lastResult);
        while (count <= printToInclusive){
            lastResult *= count;
            System.out.println(lastResult);
            count++;
        }
    }
}
