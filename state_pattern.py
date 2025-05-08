from sys import stdin

#STATES
INITIAL = 0
ODD = 1
EVEN = 2

state = INITIAL

for line in stdin:
    integer = int(line)
    is_even = integer%2 == 0

    if state == INITIAL:
        if is_even:
            state = EVEN
        else:
            state = ODD
    
    elif state == EVEN:
        if is_even:
            state = EVEN
            print(f"Repeated parity for {line}")
        else:
            state = ODD

    elif state == ODD:
        if is_even:
            state = EVEN
        else:
            state = ODD
            print(f"Repeated parity for {line}")
    else:
        raise Exception("Unrecognized state!")