__author__="Pavlo Bazilinskyy aka Hollgam"
__date__ ="$Jul 2, 2011 7:25:09 PM$"

#import psyco
#psyco.full()

def odd(n):
    i = 2
    while (i<n):
        r = i
        i *= 2
    return r

if __name__ == "__main__":
    t = int(raw_input())
    for i in range(t):
        n = int(raw_input())
        print odd(n)