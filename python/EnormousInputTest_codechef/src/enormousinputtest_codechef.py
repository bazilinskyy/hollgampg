__author__="hollgam"
__date__ ="$Jul 2, 2011 4:18:41 PM$"

def enormousInput():
    _ = raw_input()
    n, k = map(int, _.split())
    output = 0
    for i in range(n):
        t = int(raw_input())
        if not t % k:
            output += 1
    print output

if __name__ == '__main__':
    enormousInput()