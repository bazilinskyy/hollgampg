__author__="Pavlo Bazilinskyy aka Hollgam"
__date__ ="$Jul 7, 2011"

#problem: http://www.codechef.com/problems/SUMTRIAN/

#import psyco
#psyco.full()

def sumsTriangle(rows):
    #TODO finish sums in triangle
    sums = []
    for i in range(len(rows)):
        for i in range(len(rows)):
            sum = 0
            sum += rows[i][0]
            sums.append(sum)

    print sums

    return sums


def largestNumber(arr):
    largest = 0
    for i in arr:
        if i > largest:
            largest = i
    return largest

if __name__ == "__main__":
    t = int(raw_input()) #Number of cases in input
    for i in range(t): #Getting input
        rows = []
        s = int(raw_input()) #Number of rows in input
        for j in range(s): #Getting rows
            rows.append(map(int, raw_input().split()))
        print largestNumber(sumsTriangle(rows)) #Outputting the largest sum