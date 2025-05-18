function calcolo_condizionamento(){
    //valori non perturbati e somma non perturbata
    var x=parseFloat(document.getElementById("x").value);
    var y=parseFloat(document.getElementById("y").value);
    var s=x+y;
    //generazione errore
    var errx=Math.random()*Math.pow(10,-7);
    var erry=Math.random()*Math.pow(10,-7);
    //dati perturbati e somma perturbata
    var xpt=x+errx;
    var ypt=y+erry;
    var st=xpt+ypt;
    //errore relativo x e y e somma
    var erx=Math.abs(x-xpt)/Math.abs(x)
    var ery=Math.abs(y-ypt)/Math.abs(y)
    var ers=Math.abs(s-st)/Math.abs(s)
    //stampa risultati
    var result=document.getElementById("result")
    result.innerText="x="+x.toFixed(20)+"\ny="+y.toFixed(20)+"\nsomma="+s.toFixed(20)+
    "\nx perturbato="+xpt.toFixed(20)+"\ny perturbato="+ypt.toFixed(20)+"\nsomma perturbata="+st.toFixed(20)+
    "\nerrore relativo x="+erx.toFixed(20)+"\nerrore relativo y="+ery.toFixed(20)+"\nerrore relativo somma="+ers.toFixed(20);

    



}