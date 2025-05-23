def print_pattern(rows):
    for i in range(1, rows + 1):
        for j in range(i):
            print("*", end=" ")
        print()

# Example usage
rows = 6
print_pattern(rows)