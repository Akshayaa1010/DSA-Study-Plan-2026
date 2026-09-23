class Solution {
        public String convert(String s, int numRows) {
                // Edge case: No zigzagging needed if only 1 row or string is shorter than numRows
                        if (numRows == 1 || s.length() <= numRows) {
                                    return s;
                                            }

                                                    // Initialize a StringBuilder for each row
                                                            StringBuilder[] rows = new StringBuilder[numRows];
                                                                    for (int i = 0; i < numRows; i++) {
                                                                                rows[i] = new StringBuilder();
                                                                                        }

                                                                                                int currentRow = 0;
                                                                                                        boolean goingDown = false;

                                                                                                                // Iterate through each character in the string
                                                                                                                        for (char c : s.toCharArray()) {
                                                                                                                                    rows[currentRow].append(c);

                                                                                                                                                // Reverse direction when hitting the top or bottom row
                                                                                                                                                            if (currentRow == 0 || currentRow == numRows - 1) {
                                                                                                                                                                            goingDown = !goingDown;
                                                                                                                                                                                        }

                                                                                                                                                                                                    // Move to the next row index
                                                                                                                                                                                                                currentRow += goingDown ? 1 : -1;
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                // Combine all rows into a single result string
                                                                                                                                                                                                                                        StringBuilder result = new StringBuilder();
                                                                                                                                                                                                                                                for (StringBuilder row : rows) {
                                                                                                                                                                                                                                                            result.append(row);
                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                            return result.toString();
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }

