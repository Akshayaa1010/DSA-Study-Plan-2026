class Solution {
        public String countAndSay(int n) {
                String result = "1";

                        for (int i = 1; i < n; i++) {
                                    StringBuilder current = new StringBuilder();
                                                int count = 1;

                                                            for (int j = 0; j < result.length(); j++) {
                                                                            // Check if the current character matches the next character
                                                                                            if (j + 1 < result.length() && result.charAt(j) == result.charAt(j + 1)) {
                                                                                                                count++;
                                                                                                                                } else {
                                                                                                                                                    // Append frequency followed by the digit character
                                                                                                                                                                        current.append(count).append(result.charAt(j));
                                                                                                                                                                                            count = 1; // Reset count for next digit
                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                    result = current.toString();
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                    return result;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }
