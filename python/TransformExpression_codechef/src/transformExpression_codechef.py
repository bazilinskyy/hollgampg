__author__="Pavlo Bazilinskyy aka Hollgam"
__date__ ="$Jul 2, 2011"

#problem: http://www.codechef.com/problems/ONP/ 

import psyco
psyco.full()

def translateToRPN(exp):
    stack = []
    out = ""
    for t in exp:
        if t == ")":
            out += stack.pop()
        elif t in ("+","-","*","/","^"):
            stack.append(t)
        elif t != "(":
            out += t
    return out

def isLower(ch):
    return 'a' <= ch <= 'z'

def isLeftPar(ch):
    if ch == "(":
        return True
    else:
        return False

def isRightPar(ch):
    if ch == ")":
        return True
    else:
        return False

if __name__ == "__main__":
    t = int(raw_input()) #Number of cases in input
    for i in range(t): #Getting input
        n = raw_input()
        print translateToRPN(n)