__author__="Pavlo Bazilinskyy aka Hollgam"
__date__ ="$Jul 6, 2011"

#problem: http://www.codechef.com/problems/TSORT/

#import psyco
#psyco.full()

def sortPython(listIn):
    listIn.sort()
    return listIn

def bubbleSort(arr):
    done = False
    while not done:
        done = True
        for i in range(len(arr)-1):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                done = False
    return arr

def quickSort(a):
    if len(a) <= 1: return a
    pivot = a.pop()
    before = [x for x in a if x <= pivot]
    after = [x for x in a if x > pivot]
    return quickSort(before) + [pivot] + quickSort(after)

if __name__ == "__main__":
    t = int(raw_input()) #Number of cases in input
    list = []
    for i in range(t): #Getting input
        list.append(int(raw_input()))
    for i in quickSort(list): #Output
        print i