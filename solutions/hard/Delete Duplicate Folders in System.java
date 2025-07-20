// Title: Delete Duplicate Folders in System
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/delete-duplicate-folders-in-system/

        node.serial = sb.toString();
        freq.put(node.serial, freq.getOrDefault(node.serial, 0) + 1);
    }

    private void operate(
        Trie node,
        Map<String, Integer> freq,
        List<String> path,
        List<List<String>> ans
    ) {
        if (freq.getOrDefault(node.serial, 0) > 1) return; // if the serialization representation appears more than once, it needs to be deleted

        if (!path.isEmpty()) {
            ans.add(new ArrayList<>(path));
        }

        for (Map.Entry<String, Trie> entry : node.children.entrySet()) {
            path.add(entry.getKey());
            operate(entry.getValue(), freq, path, ans);
            path.remove(path.size() - 1);
        }
    }
}