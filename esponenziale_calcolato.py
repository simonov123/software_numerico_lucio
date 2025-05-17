from math import exp,factorial

def espcalc(k):
    espcalc=(2**k)/factorial(k)
    return espcalc



while 1:
 espreal=exp(2)
 print("esponenziale reale,solo errore di arrotondamento:"+str(espreal))
 print("inserire parametro per l'esponente calcolato:\n")
 k=int(input())
 esptot=0
 for i in range(k):
    esptot=esptot+espcalc(i)
 print("l'esponenziale di due approssimato al k-esimo termine è:"+str(esptot)+"\n l'errore analitico è :"+str(espreal-esptot))


