# Exercise 7: Financial Forecasting

## Objective
To develop a financial forecasting tool predicting future values based on past data using a recursive approach, and understanding optimization using memoization.

## Analysis (Time & Space Complexity)
- **Basic Recursion**:
  - Time Complexity: $O(N)$ where $N$ is the number of periods (years).
  - Space Complexity: $O(N)$ call stack overhead.
- **Memoized Recursion**:
  - Time Complexity: $O(N)$ (but avoids recalculating overlapping subproblems if multiple different period queries are made).
  - Space Complexity: $O(N)$ call stack and auxiliary cache storage.

**Optimization Note**: For complex multi-variable recursion (e.g. Fibonacci, grid traveler), recursion without memoization grows exponentially ($O(2^N)$). Utilizing memoization reduces the time complexity to $O(N)$ by caching intermediate sub-problems, avoiding redundant recalculations.

## Implementation Details
- **Forecasting.java**: Implements basic recursion and memoized recursion to predict future value based on growth rate.
- **ForecastTest.java**: Test client executing and displaying forecasts.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 7 - Financial Forecasting/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise07.ForecastTest
   ```

## Output
```text
Present Value: $1000.0
Growth Rate: 5.0%
Periods: 10 years

Future Value (Basic Recursion): $1628.89
Future Value (Memoized Recursion): $1628.89
```
