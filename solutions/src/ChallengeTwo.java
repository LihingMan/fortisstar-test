import java.util.Arrays;

class ChallengeTwo {
    /** @return the index of optimal (balanced) sum of numbers found in an array */
    public static int getOptimal(int input[]) {
        int[] front_cumulative = new int[input.length];
        int[] back_cumulative = new int[input.length];

        Arrays.fill(front_cumulative, 0);
        Arrays.fill(back_cumulative, 0);

        int front_cum_sum = 0;
        int back_cum_sum = 0;
        int back_ptr = input.length-1;

        for (int i=0; i<input.length; i++){
            front_cum_sum += input[i];
            front_cumulative[i] = front_cum_sum;
            back_cum_sum += input[back_ptr];
            back_cumulative[back_ptr] = back_cum_sum;
            back_ptr--;
        }
//        System.out.println(Arrays.toString(front_cumulative));
//        System.out.println(Arrays.toString(back_cumulative));

        for (int i=0; i<input.length; i++) {
            if (i == input.length-1){
                return -1;
            }
            if (front_cumulative[i] == back_cumulative[i+1]){
                return i;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        int[] input = {1, 8, 1, 2, 7, 1};
        System.out.println(getOptimal(input));
    }
}