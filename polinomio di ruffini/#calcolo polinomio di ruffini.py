#calcolo polinomio di ruffini
def inserimentopolinomio():  #riempimento array delle costanti cj che moltiplicano x elevato a j
    for i in range(grado+1):
        print("inserire moltiplicatore esponente"+str(i))
        costanti.append(int(input()))

print("inserire il grado del polinomio")    #input grado polinomio
grado=int(input())
print("inserire base x")                   #input valore di x
base=int(input())
costanti=[]
inserimentopolinomio()      #riempimento array coefficenti
p=costanti[grado]
print(str(p))              #applicazione metodo di ruffini
for j in range(grado):
    p=p*base+costanti[grado-(j+1)]
#stampa dei risultati
print("il valore del polinomio con x="+str(base)+" è: "+str(p))
print("ovvero:")
for k in range(grado+1):
    print(str(costanti[grado-(k)])+'*'+str(base)+" elevato a "+str(grado-(k)))

#METODO DI RUFFINI-HORNER
#Applicato a un polinomio di grado 5 
#poniamo ogni volta in evidenza il termine x in comune
#p5x= c0+c1x1+c2x2+c3x3+c4x4+c5x5
#=c0+x(c1+c2x1+c3x2+c4x4+c5x4)
#=c0+x(c1+x(c2+c3x1+c4x2+c5x3))
#=c0+x(c1+x(c2+x(c3+c4x1+c5x2)))
#=c0+x(c1+x(c2+x(c3+x(c4+c5x))))

#in questo modo ho trasformato un polinomio di grado 5 in un prodotto di binomi 
#a questo punto posso partire dalle parentesi più interne ed eseguire il calcolo ricorsivamente

#(((((c5)*x+c4)*x+c3)*x+c2)*x+c1)
 

