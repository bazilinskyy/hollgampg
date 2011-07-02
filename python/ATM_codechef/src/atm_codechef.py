x, y = map(float, raw_input().split())
if x > y - 0.5 or int(x) % 5 != 0:
    output = y
else:
    output = y - x - 0.5
print '%.2f' % output