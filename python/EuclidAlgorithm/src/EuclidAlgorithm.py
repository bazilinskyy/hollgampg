__author__="Pavlo Bazilinskyy"
__date__ ="$Jun 19, 2011 7:09:55 PM$"

numberE1 = 0

def euclidAlgorithm(m, n):
    global numberE1
    if n <= 0 or m <= 0:
        return -1
    r = m % n #Reminder
    if r == 0:
        return n
    else:
        numberE1 += 1
        return euclidAlgorithm(n, r)
        
if __name__ == "__main__":
    #Input values
    m = 54
    n = 36
    
    print "Input : m = ", m, " n = ", n
    
    numberSteps = 1000
    for m in range(1,numberSteps):
        gcd = euclidAlgorithm(m, n)
        if gcd == -1:
            print "Function terminated with an error"
        else:
            print "Output: gcd = ", gcd
    
    print "Number step E1: ", numberE1 / numberSteps 
            
