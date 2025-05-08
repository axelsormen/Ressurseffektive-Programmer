import subprocess
from sys import argv

limit = int(argv[1])

completed_process = subprocess.run(
    ["./primes_fastest_compiled.cpp", str(limit)],
    capture_output=True,
    encoding="utf-8"
)

code = completed_process.returncode
if code == 0:
    result = int(completed_process.stdout)
    print(f"Prime numbers from 0 to {limit}: {result}")
else:
    print(f"Child process error with error code {code}")