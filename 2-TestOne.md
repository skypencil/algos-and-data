## Question 1 (20 points):

Problem: Browser History Navigation

Imagine you're implementing the history functionality of a web browser. The browser needs to maintain a record of websites visited, so users can click the "back" or "forward" button to navigate through their browsing history.

Features:

1. When a user visits a new website, it should be added to the history.
2. When the user clicks the "back" button, the browser should show the previous website.
3. When the user clicks the "forward" button, if they had previously clicked "back", the browser should navigate to the next website.
4. If a user visits a new website after clicking "back" (i.e., without clicking "forward" first), the forward history should be discarded.

copy and paste the following tests at the end of your file and make sure they pass - DO NOT CHANGE THE TESTS - you should be able to read these tests and understand what methods, properties, and classes you need to implement:


```typescript
// Test
let score = 0;

const browser = new BrowserHistory();

browser.visit("google.com");
if (browser.getCurrentUrl() === "google.com") score+=2;

browser.visit("openai.com");
if (browser.getCurrentUrl() === "openai.com") score+=2;

browser.visit("github.com");
if (browser.getCurrentUrl() === "github.com") score+=2;

browser.back();
if (browser.getCurrentUrl() === "openai.com") score+=2;

browser.back();
if (browser.getCurrentUrl() === "google.com") score+=2;

browser.forward();
if (browser.getCurrentUrl() === "openai.com") score+=2;

browser.forward();
if (browser.getCurrentUrl() === "github.com") score+=2;

browser.back();
browser.back();
browser.visit("stackoverflow.com");
if (browser.getCurrentUrl() === "stackoverflow.com") score+=4;

browser.forward();
if (browser.getCurrentUrl() === "stackoverflow.com") score+=2;  // No forward history as it was discarded

console.log(`You scored: ${score} out of 20`);
```

## Question 2 (15 points):

Problem: Yearly Temperature Records

You're developing a system to record and analyze the daily temperatures for an entire year. Since there are 365365 days in a typical year, the system should be able to accommodate all these records without needing to expand its storage after initialization.

The system should be able to perform the following operations efficiently:

1. Record a temperature for a day (only one temperature per day).
2. Get the temperature of a specific day.
3. Calculate the average temperature of the last n days, where n is a user-provided value and 1 <= n <= 365.

Design and implement the necessary functionalities for the above system. Ensure that once the year is over and you record temperatures for the new year, the system should overwrite the oldest data.

copy and paste the following tests at the end of your file and make sure they pass - DO NOT CHANGE THE TESTS - you should be able to read these tests and understand what methods, properties, and classes you need to implement:

```typescript
// Test
let score = 0;

const records = new TemperatureRecords();

records.record(72);
records.record(75);
records.record(78);
records.record(80);
records.record(82);

if (records.getTemperature(1) === 72) score+=1;
if (records.getTemperature(5) === 82) score+=1;
if (records.getTemperature(10) === null) score+=4;
if (records.averageLastNDays(5) === 77.4) score+=5;
if (records.averageLastNDays(10) === null) score+=4;

console.log(`You scored: ${score} out of 15`);
```

## Question 3 (15 points):
Problem: Balanced Brackets

Given a string containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid. An input string is valid if:

1. Open brackets are closed by the same type of brackets.
2. Open brackets are closed in the correct order.

A string is considered balanced if it satisfies the above conditions. Your goal is to determine whether a given string is balanced or not.

copy and paste the following tests at the end of your file and make sure they pass - DO NOT CHANGE THE TESTS - you should be able to read these tests and understand what methods, properties, and classes you need to implement:


```typescript
// Test
let score = 0;

if (isBalanced("{[()]}") === true) score += 2;  // Balanced
if (isBalanced("{[(])}") === false) score += 2; // Not Balanced
if (isBalanced("{}") === true) score += 2;      // Balanced
if (isBalanced("[}") === false) score += 2;     // Not Balanced
if (isBalanced("}}{{") === false) score += 7;     // Not Balanced

console.log(`You scored: ${score} out of 15`);
```

## Question 4 - (15 points):
Implement **Question 1** from the above in front of the class (from scratch) and explain each step via debugger. Tell us why you chose the data structure you chose.

## Question 5 - (10 points):
Implement **Question 2** from the above in front of the class (from scratch) and explain each step via debugger. Tell us why you chose the data structure you chose.

## Question 5 - (10 points):
Implement **Question 3** from the above in front of the class (from scratch) and explain each step via debugger. Tell us why you chose the data structure you chose.


## Question 6 - (15 points):
Your code will be assessed for code quality. Please make sure to follow the best practices we discussed in class. You will be graded on the following:

1. have you used generics?
2. do you understand object oriented programming?
3. where you able to write your code according to the test cases?
