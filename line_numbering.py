from sys import stdin
import time 

input_lines = list(stdin)

start_time= time.time()

line_number = 0
result = ""
for line in input_lines:
    line_number += 1
    result += f"{line_number}: {line}"

end_time= time.time()

total_time = end_time - start_time

print(f"Total time: {total_time:.2f} seconds. Lines: {line_number}")

start_time= time.time()

line_number = 0
result = []
for line in input_lines:
    line_number += 1
    result.append(f"{line_number}: {line}")

end_time= time.time()

total_time = end_time - start_time

print(f"Total time: {total_time:.2f} seconds. Lines: {line_number}")