// Title: Design a Food Rating System
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/design-a-food-rating-system/

                        return a.getValue().compareTo(b.getValue());
                    }
                    return compareByRating;
                .computeIfAbsent(cuisines[i], k -> new TreeSet<>((a, b) -> {
                    int compareByRating = Integer.compare(a.getKey(), b.getKey());
                    if (compareByRating == 0) {
                        // If ratings are equal, compare by food name (in ascending 
order).
    private Map<String, TreeSet<Pair<Integer, String>>> cuisineFoodMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; ++i) {
            // Store 'rating' and 'cuisine' of current 'food' in 'foodRatingMap' and 
'foodCuisineMap' maps.
            foodRatingMap.put(foods[i], ratings[i]);
            foodCuisineMap.put(foods[i], cuisines[i]);

            // Insert the '(-1 * rating, name)' element in the current cuisine's set.
            cuisineFoodMap
    // Set element -> Pair: (-1 * foodRating, foodName)
    private Map<String, String> foodCuisineMap = new HashMap<>();

    // Store all food of cuisine in set (to sort them on ratings/name)
    private Map<String, Integer> foodRatingMap = new HashMap<>();
    // Map food with cuisine it belongs to.
class FoodRatings {
    // Map food with its rating.
