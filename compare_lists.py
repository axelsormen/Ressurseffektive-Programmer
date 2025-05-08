list_a = [3, 5, 8, 34, 5, 7, 1, 2, 2, 3, 98, 98]
list_b = [2, 2, 2, 4, 6, 7, 98]

print(f"List A: {list_a}")
print(f"List B: {list_b}")

def compare_lists_expected_n(list_a, list_b):
    common_expected_n = []
    set_a = set(list_a)

    for x in list_b:
        if x in set_a and x not in common_expected_n:
            common_expected_n.append(x)
        
    print(f"Common expected_n: {common_expected_n}")

def compare_lists_expected_n_log_n(list_a, list_b):
    common_expected_n_log_n = []
    list_a.sort()
    list_b.sort()
    i, j = 0, 0

    # Use two pointers to find common elements
    while i < len(list_a) and j < len(list_b):
        if list_a[i] == list_b[j]:
            # Avoid duplicates in the result
            if not common_expected_n_log_n or common_expected_n_log_n[-1] != list_a[i]:
                common_expected_n_log_n.append(list_a[i])
            i += 1
            j += 1
        elif list_a[i] < list_b[j]:
            i += 1
        else:
            j += 1

    print(f"Common expected_n_log_n: {common_expected_n_log_n}")

compare_lists_expected_n(list_a, list_b)
compare_lists_expected_n_log_n(list_a, list_b)