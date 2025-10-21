def main():
   
    print("Enter numbers separated by spaces (e.g., 5 2 8 1):")
    line = input()

    #Parse the input string into a list of integers
    # We use a list comprehension for a clean, one-line conversion.
    # We also add a try-except block for robustness in case of bad input.
    try:
        numbers = [int(num_str) for num_str in line.split()]
    except ValueError:
        print("Invalid input. Please enter only integers separated by spaces.")
        return

    inserstion_sort(numbers)

  
    print(f"Sorted Array: {numbers}")

def inserstion_sort

# This is a standard Python construct to ensure main() runs only
# when the script is executed directly.
if __name__ == "__main__":
    main()