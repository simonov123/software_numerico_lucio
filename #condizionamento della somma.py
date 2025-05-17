#condizionamento della somma 
from random import random
print("inserire numero reale x:")
x=float(input())  #dati non perturbati
print("inserire numero reale y:")
y=float(input())
errx=random()*1.0e-7       #genero gli errori
erry=random()*1.0e-7
xpt=x+errx          #dati perturbati
ypt=y+erry

s=x+y            #somma non perturbata
st=xpt+ypt       #somma perturbata
erx=abs(x-xpt)/abs(x)     #errore relativo x
ery=abs(y-ypt)/abs(y)     #errore relativo y
erst=abs(s-st)/abs(s)     #errore relativo somma 
# stampa risultati
print("x="+str(x))
print("y="+str(y))
print("x perturbato="+str(xpt))
print("y perturbato="+str(ypt))
print("somma non perturbata="+str(s))
print("somma perturbata="+str(st))
print("errore relativo x="+str(erx))
print("errore relativo y="+str(ery))
print("errore relativo somma="+str(erst))


