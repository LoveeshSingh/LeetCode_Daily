// Title: Remove Sub-Folders from the Filesystem
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/

            boolean isSubfolder = false;

            for (int i = 0; i < folderNames.length; i++) {
                // Skip empty folder names
                if (folderNames[i].equals("")) continue;

                TrieNode nextNode = currentNode.children.get(folderNames[i]);
                // Check if the current folder path is a subfolder of an
                // existing folder
                if (nextNode.isEndOfFolder && i != folderNames.length - 1) {
                    isSubfolder = true;
                    break; // Found a sub-folder
                }

                currentNode = nextNode;
            }
            // If not a sub-folder, add to the result
            if (!isSubfolder) result.add(path);
            String[] folderNames = path.split("/");
            TrieNode currentNode = root;
        for (String path : folder) {
        List<String> result = new ArrayList<>();
        // Check each path for subfolders

        }