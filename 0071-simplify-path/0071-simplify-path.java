import java.util.*;

class Solution {
    public String simplifyPath(String path) {
            Deque<String> st = new ArrayDeque<>();
                    
                            for (String p : path.split("/")) {
                                        if (p.isEmpty() || p.equals(".")) continue;
                                                    if (p.equals("..")) {
                                                                    if (!st.isEmpty()) st.pop();
                                                                                } else {
                                                                                                st.push(p);
                                                                                                            }
                                                                                                                    }
                                                                                                                            
                                                                                                                                    return "/" + String.join("/", st.reversed());
                                                                                                                                        }
                                                                                                                                        }