from sys import argv

memo = {
    0:1,
    1:1
}

def fibonacci(n):
    if n in memo:
        return n
    
    result = fibonacci(n - 1) + fibonacci(n - 2)
    memo[n] = result
    return result

n = int(argv[1])
print(fibonacci(n))