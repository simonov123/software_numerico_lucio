#codice calcolo epsilon-machine
n=1
counter=1
while(1+n)>1:
    n=n/2
    print(str(counter)+')'+str(n))
    counter=counter+1
print("epsilon-machine="+str(n))