__author__="hollgam"
__date__ ="$Jul 2, 2011 4:18:41 PM$"


def zeros(n):
    z = 0
    while(n > 1):
        z += n/5
        n /= 5
    return z

if __name__ == "__main__":
    t = input()
    nums = []
    for i in range(t):
        a = input()
        nums.append(a)
    for i in range(t):
        print zeros(nums[i])