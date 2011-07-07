__author__="Pavlo Bazilinskyy aka Hollgam"
__date__ ="$Jul 7, 2011"

#problem: http://www.codechef.com/problems/PERMUT2/

import psyco
psyco.full()

def isAmbiguosPermutation(line):
    isAmb = True
    for i in range(len(line)-1):
#        print "i+1 = ", i+1, " line[i-1] = ", line[i-1]
        if i+1 != line[line[i]-1]:
            isAmb = False
    return isAmb

def largestNumber(arr):
    largest = 0
    for i in arr:
        if i > largest:
            largest = i
    return largest

if __name__ == "__main__":
    
    while True:
        s = int(raw_input()) #Number of rows in input
        if s == 0:
            break
        line = map(int, raw_input().split())
        isAmb = isAmbiguosPermutation(line)
        if isAmb:
            print "ambiguous"
        else:
            print "not ambiguous"