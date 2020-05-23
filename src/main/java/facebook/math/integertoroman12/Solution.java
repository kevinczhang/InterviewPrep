package facebook.math.integertoroman12;

/**
 * Created by czhang on 12/28/2016.
 */
public class Solution {
    public String intToRoman(int num) {
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC","C", "CD", "D", "CM","M"};
        int[] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder res = new StringBuilder();

        int index = numbers.length - 1;
        int curNum = num;
        while(curNum != 0 && index >= 0){
            if((curNum - numbers[index]) >= 0){
                curNum -= numbers[index];
                res.append(romans[index]);
            }else{
                index--;
            }
        }

        return res.toString();
    }
}
