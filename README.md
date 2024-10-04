All the programs and outputs are added in this [google doc](https://docs.google.com/document/d/1G1OMd-dwFMmoJy12Lk13Vx-x7JsnV0IbR2vL6EFMCrw/edit?usp=sharing)

# Finding the 2nd Highest CGPA

Given the CGPA scores of 10 students:

[3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]


### Objective
Find the second highest CGPA using a linear searching algorithm without sorting the array.

# Algorithm 
1. **Initialize Variables**:
   - Create an array to hold the CGPA scores.
   - Set two variables, `highest` and `secondHighest`, both initialized to the first element of the CGPA array.

2. **Iterate Through the Array**:
   - Use a loop to traverse each element in the CGPA array.

3. **Update Highest CGPA**:
   - Within the loop, check if the current CGPA is greater than `highest`.
     - If true, update `secondHighest` to be the current value of `highest`, and then update `highest` to the current CGPA.

4. **Update Second Highest CGPA**:
   - If the current CGPA is not greater than `highest` but is greater than `secondHighest`, update `secondHighest` to be the current CGPA.

5. **Output the Result**:
   - After completing the loop, print the value of `secondHighest`, which now holds the second highest CGPA.

# Sorting CGPA Scores in Descending Order

Given the CGPA scores of students:

[3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86]


### Objective
Sort the array of CGPA scores in descending order programmatically.

# Algorithm

1. **Initialize the CGPA Array**:
   - Create an array named `cgpa` and initialize it with the CGPA scores of students.

2. **Outer Loop for Iteration**:
   - Use a loop with an index variable `i` that iterates through each element of the `cgpa` array from the beginning to the last element.

3. **Inner Loop for Comparison**:
   - For each element at index `i`, use a nested loop with an index variable `j` that starts from `i + 1` and iterates through the remaining elements of the array.

4. **Swap Elements**:
   - Inside the inner loop, check if the element at index `j` is greater than the element at index `i`. If true, swap the elements at indices `i` and `j` using a temporary variable `temp`.

5. **Output the Sorted Array**:
   - After completing both loops, print the sorted `cgpa` array, which now contains CGPA scores in descending order.
  
# Binary Search for CGPA in an Array

### Objective
Take a CGPA as user input and determine if it exists in a given array of CGPAs using the binary search algorithm.


# Algorithm

1. **Initialize the CGPA Array**:
   - Create an array `cgpa` and populate it with the CGPA scores of students.

2. **Sort the CGPA Array**:
   - Use `Arrays.sort()` to sort the `cgpa` array in ascending order.
   - Print the sorted CGPA scores to the console.

3. **Take User Input**:
   - Use a `Scanner` to prompt the user to enter a CGPA to search for, and store the input in a variable `targetCGPA`.

4. **Binary Search Implementation**:
   - Initialize two pointers, `low` set to `0` and `high` set to the length of the array.
   - Use a `while` loop to perform binary search until `low` is less than or equal to `high`:
     - Calculate the middle index `mid`.
     - If the CGPA at index `mid` equals `targetCGPA`, set a flag to `true`, store the `mid` index in a variable `index`, and break the loop.
     - If the CGPA at `mid` is less than `targetCGPA`, move the `low` pointer to `mid + 1`.
     - If the CGPA at `mid` is greater than `targetCGPA`, move the `high` pointer to `mid - 1`.

5. **Output the Result**:
   - After exiting the loop, check the flag:
     - If the flag is `true`, print the index where `targetCGPA` was found.
     - If the flag is `false`, print that the `targetCGPA` was not found.

# Generate Random Integer Array and Find Max/Min

### Objective
Generate an array of 10 random integers, print all the numbers, and find the maximum and minimum values in the array.

# Algorithm

1. **Initialize the Random Number Generator**:
   - Create an instance of the `Random` class to facilitate the generation of random integers.

2. **Create and Populate the Array**:
   - Declare an integer array named `array` with a size of 10.
   - Use a loop to fill the array with random integers in the range of 1 to 10, and print each integer as it is added to the array.

3. **Initialize Max and Min Values**:
   - Set the first element of the array as the initial value for both `max` and `min`.

4. **Find Maximum and Minimum Values**:
   - Use a loop to iterate through the array and compare each element with the current `max` and `min` values:
     - If the current element is greater than `max`, update `max`.
     - If the current element is less than `min`, update `min`.

5. **Output the Results**:
   - Print the maximum and minimum values found in the array to the console.

# Program to Break Down Amount into Notes

### Objective
Create a program that takes a given amount and breaks it down into the minimum number of notes using predefined denominations.

### Given Notes
The available denominations are:
```plaintext
notes = [1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]
```

# Algorithm

1. **Initialize the Denominations**:
   - Create an array named `notes` containing the available note denominations in descending order: `[1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]`.

2. **Take User Input**:
   - Use a `Scanner` to read an integer input from the user, which represents the amount to be broken down into notes.

3. **Iterate Through Each Denomination**:
   - Use a loop to traverse each note in the `notes` array.

4. **Calculate and Update Count**:
   - For each note:
     - Calculate the count of that note by dividing the amount by the note's value (`count = amount / notes[i]`).
     - If the count is greater than 0, print the note's value and the count.
     - Update the amount by calculating the remainder after accounting for the notes used (`amount = amount % notes[i]`).

5. **Output the Result**:
   - The program outputs the denominations and their counts until the entire amount has been broken down.
  
# Program to Print Number Patterns

### Objective
Create a program that prints a specific pattern of numbers based on a given number of marks.

# Algorithm 

1. **Initialize the First Loop**:
   - Start a loop with a variable `i` initialized to 5, which represents the number of lines in the descending part of the pattern.

2. **Print Descending Pattern**:
   - Inside the first loop, create a nested loop with a variable `j` that runs from 1 to `i`.
   - For each value of `j`, print the current value of `j` without moving to the next line.
   - After completing the inner loop for a specific `i`, print a newline character to move to the next line.

3. **Initialize the Second Loop**:
   - Start another loop with a variable `i` initialized to 2, which represents the starting point of the ascending part of the pattern.

4. **Print Ascending Pattern**:
   - Inside the second loop, create a nested loop with a variable `j` that runs from 1 to `i`.
   - For each value of `j`, print the current value of `j` without moving to the next line.
   - After completing the inner loop for a specific `i`, print a newline character to move to the next line.

5. **Complete Execution**:
   - The program will print the entire pattern in the specified format by executing both loops.
  
# Program to Find the Two Lowest Heights of Babies

### Objective
Create a program that takes input for the heights of 10 babies in centimeters and finds the two lowest heights without using the `Arrays.sort()` method.

# Algorithm 

1. **Initialize the Height Array**:
   - Create an integer array named `height` with a size of 10 to store the heights of the babies.

2. **Take User Input**:
   - Use a `Scanner` to prompt the user to enter the heights of 10 babies in centimeters. Store each input in the `height` array.

3. **Sort the Heights**:
   - Use a nested loop to sort the `height` array in ascending order:
     - The outer loop iterates through each element of the array.
     - The inner loop compares each element with the subsequent elements and swaps them if the current element is greater than the next one.

4. **Access the Two Lowest Heights**:
   - After sorting, the two lowest heights will be at the first two indices of the array (`height[0]` and `height[1]`).

5. **Output the Result**:
   - Print the two lowest heights of the babies.
  
# Program to Count Words, Characters, Vowels, and Consonants

### Objective
Create a program that counts the following from a given string:
- Number of words
- Number of characters without spaces
- Number of vowels
- Number of consonants

# Algorithm 

1. **Initialize Variables**:
   - Convert the input string `s` to lowercase (`s1`) to simplify the comparison.
   - Define a string `s2` containing all vowels ("aeiou") for easy lookup.
   - Initialize variables: `words`, `chars`, `vowel`, and `consonant` to count the respective elements.

2. **Loop Through Each Character of the String**:
   - Use a `for` loop to iterate through each character of the string `s1`.

3. **Count Words and Characters**:
   - If the current character is a space (`' '`), increment the `words` counter.
   - If the character is not a space, increment the `chars` counter to count the number of characters without spaces.

4. **Identify and Count Vowels and Consonants**:
   - For each character in the string:
     - Check if the character is a vowel by seeing if it exists in `s2` (vowel string). If yes, increment the `vowel` counter.
     - If the character is not a vowel and not a space, increment the `consonant` counter.

5. **Adjust the Word Count and Print Results**:
   - After the loop, increment the `words` counter by one to account for the last word (since spaces are used to count words).
   - Print the number of words, characters, vowels, and consonants.
  
# Program to Find the Number of Occurrences of Characters in a String

### Objective
Write a program that counts how many times each character appears in a given string. The program will ignore spaces and only count the occurrence of each character (case-insensitive).

# Algorithm

1. **Convert the Input String to Lowercase**:
   - Convert the given string `s` to lowercase using the `toLowerCase()` method to ensure that the character counting is case-insensitive.

2. **Convert the String to a Character Array**:
   - Use the `toCharArray()` method to convert the lowercase string into a character array `ch` for easier iteration over individual characters.

3. **Use a LinkedHashMap to Count Character Occurrences**:
   - Initialize a `LinkedHashMap` named `count` to store the character as the key and its occurrence as the value.
   - Loop through each character in the array:
     - If the character is not a space (`' '`), check if it already exists in the map.
     - If it exists, increment the count by 1.
     - If it does not exist, add the character to the map with an initial count of 1.

4. **Store and Update Counts**:
   - For each character encountered, update its count in the `LinkedHashMap`.

5. **Display the Results**:
   - After processing all characters, iterate over the keys of the `LinkedHashMap` to print each character and its corresponding count.

# Program to Print Non-Duplicate Numbers from an Array

### Objective
Write a program that prints only the numbers that appear once (i.e., non-duplicate numbers) in a given array.

# Algorithm

1. **Initialize a Frequency Map**:
   - Use a `HashMap` called `count` to store each number from the array as a key and its occurrence count as the value.

2. **Traverse the Array**:
   - Loop through each element in the `numbers` array.
   - For each number, check if it already exists in the `HashMap`:
     - If it exists, increment the count by 1.
     - If it does not exist, add the number to the `HashMap` with a count of 1.

3. **Identify Non-Duplicate Numbers**:
   - After processing the array, iterate through the keys of the `HashMap`.

4. **Check Occurrence Count**:
   - For each key (number) in the `HashMap`, check if its count is equal to 1 (indicating it's non-duplicate).

5. **Print Non-Duplicate Numbers**:
   - Print all the numbers from the `HashMap` that have a count of 1.
  
# Program to Remove Vowels from a String

### Objective
Write a program that removes all vowels (a, e, i, o, u) from a given input string and prints the resulting string with only consonants.

# Algorithm

1. **Initialize Input and Vowel Variables**:
   - Define the input string `s` and convert it to lowercase (`s1`) to ensure case insensitivity.
   - Create a string `sv` containing all vowels ("aeiou").

2. **Create a StringBuilder for Result**:
   - Initialize a `StringBuilder` (`s2`) to construct the resulting string without vowels.

3. **Traverse Through Each Character**:
   - Loop through each character in the lowercase string (`s1`).
   - For each character, check if it is a vowel by looking it up in the vowel string (`sv`).

4. **Append Non-Vowel Characters**:
   - If the character is not a vowel (i.e., it is not found in `sv`), append it to the `StringBuilder` (`s2`).

5. **Handle Extra Spaces and Display Result**:
   - Convert the `StringBuilder` to a string (`str`), and then to a character array (`chars`).
   - Iterate through the character array to print characters, skipping any consecutive spaces.
   - Print the final result, which is the input string without vowels and with extra spaces removed.
  
# Program to Calculate Total Cost After Discount

## Ojective

Given the prices of a Core i7 laptop and a gaming mouse, calculate the total cost after applying a 15% discount. Calculate total cost after discount by extracting necessary info from the given paragraph. 

### Given Information

- **Price of Core i7 Laptop**: 85000 tk
- **Price of Gaming Mouse**: 2500 tk
- **Discount**: 15%

# Algorithm

1. **Extract Numbers from Text**:
   - Use a regular expression to find all numeric values in the given string that contains information about prices, quantity, and discount.
   - Store the extracted numbers in a list.

2. **Assign Values**:
   - Assign the extracted numbers to appropriate variables:
     - The price of the laptop.
     - The price of the gaming mouse.
     - The quantity of the mouse.
     - The discount percentage.

3. **Calculate Total Price**:
   - Compute the total price by adding the laptop price to the product of the mouse price and its quantity.

4. **Calculate Discount Amount**:
   - Calculate the discount amount by multiplying the total price by the discount percentage (converted to a decimal).

5. **Calculate Final Price**:
   - Subtract the discount amount from the total price to determine the final price after applying the discount.
   - Print the final price formatted to two decimal places.





