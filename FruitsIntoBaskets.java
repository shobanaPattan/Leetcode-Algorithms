import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

    static int maxFruitCount(int[] fruits) {

        Map<Integer, Integer> basket = new HashMap<>();

        int right = 0;
        int left = 0;
        int maxCount = 0;

        for (right = 0; right < fruits.length; right++) {

            int currentCount = basket.getOrDefault(fruits[right], 0);
            basket.put(fruits[right], currentCount + 1);

            while (basket.size() > 2) {
                int fruitCount = basket.get(fruits[left]);
                if (fruitCount == 1) {
                    basket.remove(fruits[left]);
                } else {
                    basket.put(fruits[left], fruitCount - 1);
                }
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 3, 2, 2, 3, 2};

        System.out.println(maxFruitCount(fruits));
    }
}

//Fruits into basket - given a fruit say of fruit types and two baskets, put only two types of fruits in continuation form and find maximum no of fruits
//Initialize two variables left and right as two pointers and count to 0
//For loop to access each element in a fruit say
//create map and start updating fruit type and counts
//If map size > 2 then start removing count, if fruit count == 1 then remove that key(FruitType)
//Calculate max count