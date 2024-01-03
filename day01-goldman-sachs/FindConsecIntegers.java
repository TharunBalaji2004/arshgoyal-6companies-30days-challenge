public class FindConsecIntegers {
    private int val, limit, count;

    public DataStream(int value, int k) {
        val = value;
        limit = k;
        count = 0;
    }
    
    public boolean consec(int num) {
        // Increment when num equals value
        if (num == val) count++;
        // If the flow breaks, reset the counter
        else count = 0;

        return count >= limit;
    }
}
