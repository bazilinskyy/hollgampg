__author__ = "Pavlo Bazilinskyy aka Hollgam"
__date__ = "$Jul 8, 2011"

#problem: http://www.codechef.com/problems/MARCHA1/

#import psyco
#psyco.full()

def dec2bin(x):
    """
    bin(number) -> string

    Stringifies an int or long in base 2.
    """
    if x < 0: return '-' + bin(-x)
    out = []
    if x == 0: out.append('0')
    while x > 0:
        out.append('01'[x & 1])
        x >>= 1
        pass
    try: return '0b' + ''.join(reversed(out))
    except NameError, ne2: out.reverse()
    return '0b' + ''.join(out)

def payUp(money, m):
    for i in range(1, 2 ** len(money)):
        sum = 0
        for j in range(len(money)):
            binI = dec2bin(i)
            print (binI)
            if binI[j]:
                sum += money[j]
        if sum == m:
            return True
    return False

if __name__ == "__main__":
    t = int(raw_input()) #Number of cases in input
    for i in range(t): #Getting input
        n, m = map(int, raw_input().split()) #Number of rows in input
        money = []
        for j in range(n): #Getting banknotes
            money.append(int(raw_input()))
        if payUp(money, m):
            print ("Yes")
        else:
            print ("No")