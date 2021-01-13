import java.lang.*;

class ChallengeOne {
    /** @return the number of words found in a string */
    public static int countWords (String inputstr) {
        if (inputstr.isEmpty()){
            return 0;
        }
        int res = 1;
        for (int i=0; i<inputstr.length(); i++){
            if (Character.isUpperCase(inputstr.charAt(i))){
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countWords("thisContainsFourWords"));
    }
}