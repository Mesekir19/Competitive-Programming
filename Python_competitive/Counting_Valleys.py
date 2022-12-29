def countingValleys(steps, path):
    # Write your code here
    count=0
    base=0
    dk={'U':1, 'D':-1}
    for i in path:
        base+=dk[i]
        if base==0 and i=='U':
            count+=1
            
    return int(count)
