def fibo(n):
    first = 1
    second = 1
    curr = 0
    if n == 1 or n == 2:
        return 1

    for i in range(2, n):
        curr = first + second
        first = second
        second = curr

    return curr

print(fibo(3))

"""Since the first 2 numbers in the fibonacci series are '1', we initialise the variables first and second with it.
If n is either 1 or 2, we return 1 as those are the first 2 digits.
Otherwise, if n is greater than 2, we start a for loop from 2 to n.
The current digit in the fibonacci series will be the sum of previous 2 i.e. first and second variables.
We add the 2 variables and store it in curr and change the values of first and second var. First will now save the value in second and second will now save the value in curr in
order to keep the fibonacci series going."""
