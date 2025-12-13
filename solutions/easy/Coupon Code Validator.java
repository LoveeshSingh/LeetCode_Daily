// Title: Coupon Code Validator
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/coupon-code-validator/


            return a.code.compareTo(b.code);
        });

        // Sort by business priority, then by code
        Collections.sort(valid, (a, b) -> {
            if (a.priority != b.priority)
                return a.priority - b.priority;
        }
            }
            if (isActive[i] && priority.containsKey(businessLine[i]) && isValidCode(code[i])) {
                valid.add(new Pair(priority.get(businessLine[i]), code[i]));

        for (int i = 0; i < code.length; i++) {
        priority.put("restaurant", 3);

        List<Pair> valid = new ArrayList<>();
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("electronics", 0);
        Map<String, Integer> priority = new HashMap<>();
        // Business line priority

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
class Solution {
import java.util.*;

