// Title: Design Spreadsheet
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/design-spreadsheet/

    public Spreadsheet(int rows) {
        sheet = new int[26][rows+1];
    }
    
    public void setCell(String cell, int value) {
        sheet[cell.charAt(0)-'A'][Integer.parseInt
(cell.substring(1))]=value;
    }
    
    public void resetCell(String cell) {
        setCell(cell,0);
    }
    
    public int getValue(String formula) {
        String X_Y = formula.substring(1);
        String[] vals = X_Y.split("\\+");
        int ans=0;
        for (String val : vals){
            if (val.charAt(0)-'A'<26 && val.charAt
(0)-'A'>=0){
                ans+=sheet[val.charAt(0)-'A']
[Integer.parseInt(val.substring(1))];
            }
            else{
                ans+=Integer.parseInt(val);
            }
        }
