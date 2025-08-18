// Title: 24 Game
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/24-game/

                    if (k != i && k != j) next.add(nums.get(k));
                }
                for (double val : compute(nums.get(i), nums.get(j))) {
                    next.add(val);
                    if (dfs(next)) return true;
                    next.remove(next.size() - 1);
                }
            }
        }
        return false;
    }

    private List<Double> compute(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > EPS) res.add(a / b);
        if (Math.abs(a) > EPS) res.add(b / a);
        return res;
    }
}
