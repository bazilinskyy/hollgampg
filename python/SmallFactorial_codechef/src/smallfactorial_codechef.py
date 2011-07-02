__author__="Pavlo Bazilinskyy aka Hollgam"
__date__ ="$Jul 2, 2011 7:25:09 PM$"

def factorial(n):
    output = 1
    for i in range(1, n+1):
        output *= i
    return output

if __name__ == "__main__":
    t = int(raw_input())
    for i in range(t):
        n = int(raw_input())
        print factorial(n)