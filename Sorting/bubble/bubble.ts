// We need to import the 'readline' module to handle console input in Node.js
import * as readline from 'readline';

// The function signature includes type annotations for clarity and safety.
// It returns 'void' because it sorts the array in-place.
function bubbleSort(nums: number[]): void {
    const n = nums.length;
    for (let i = 0; i < n - 1; i++) {
        let swapped = false;
        for (let j = 0; j < n - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                // The classic swap using a temporary variable
                const temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
}

function main() {
    // 1. Set up the readline interface to read from and write to the console
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    // Ask the user for input. This is asynchronous.
    rl.question("Enter numbers separated by spaces (e.g., 5 2 8 1):\n", (line: string) => {
        // This entire block is a "callback function". It only runs *after* the user presses Enter.

        // 2. Parse the input string into an array of numbers
        const numbers: number[] = line.trim().split(' ').map(s => {
            // parseInt requires a radix (base 10) to be safe
            return parseInt(s, 10);
        });
        
        // Check if any parsing resulted in NaN (Not a Number)
        if (numbers.some(isNaN)) {
             console.log("Invalid input. Please enter only integers separated by spaces.");
        } else {
            // 3. Call the sorting function
            bubbleSort(numbers);
    
            // 4. Print the result
            console.log(`Sorted Array: [${numbers.join(', ')}]`);
        }

        // It's crucial to close the readline interface, otherwise the program will hang
        rl.close();
    });
}

// Start the program
main();