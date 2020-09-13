# LCS-Algorithm
Find Longest Common Sequence Using Dynamic Programming

Algorithm finds the longest common sequence in given sequences. There are following apporaches available to find LCS.
- Recursion
- Memoization
- Dynamic Programming

**Recursion:-**
This very costly in terms of performance. Time complexity of this approach is 2^n which is exponential.

**Memoization:-**
This can help to reduces the time to re-calculte same sub-problem again by storing it in first call. In memoization we store the result of all sub-problem and instead of calculating result of same sub-problem again we fetch it from where it stored.

**Dynamic Programming:-**
This approach is most suitable when similar sub-problems are involved. This emphasises on solving previous sub-problem first and then use the result of previously solved sub-problems to solve large/complete problem.
This is Bottom-to-Top apprach unlike Memoization (Top-Bottom approach) as we start solving problem from bottom. This is also called as Tabulation Method.
Table will be filled from Top-Bottom but we do consider the approach as Bottom-Top becuase it starts solving problem from Bottom.

Time Complexity:- O(m*n) when m is length of 1st String and n is the length of 2nd String.
