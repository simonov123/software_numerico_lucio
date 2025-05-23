function runtime(){
    //inserimento dati inziali (valore di x e grado polinomio)
    var grado=parseInt(document.getElementById("grado").value);
    var base=parseInt(document.getElementById("base").value);
    var container=document.getElementById("container");
    //inserimento costanti del valore di x
    for(i=0;i<grado+1;i++){
        const label=document.createElement("label")
        label.textContent=("inserire moltiplicatore per x elevato a "+i)
        const input=document.createElement("input")
        input.type="number"
        input.id="input" + i;
        input.placeholder = "Input " + i;
        input.name = "input" + i;
        container.appendChild(label)
        container.appendChild(input)
        container.appendChild(document.createElement("br"));

    }
    const button=document.createElement("button");
    button.id="conf2";
    button.onclick=function () {
        calcola(grado, base);
    };
    button.textContent="calcola";
    container.appendChild(button);

}
function calcola(grado,base){

    const container = document.getElementById("container");
    var costanti=[];
    //applicazione del metodo di Ruffini
    for(j=0;j<grado+1;j++){
        const val=parseInt(document.getElementById("input"+j).value);
        costanti.push(val);
    }
    p=costanti[grado];
    for(let k = grado - 1; k >= 0; k--){
        p = p * base + costanti[k];
    }
    //stampa risultati
    const results = document.createElement("p");
    results.textContent = "Valore del polinomio ="+ p;
    container.appendChild(results);
    for(m=0;m<grado+1;m++){
        const newr=costanti[m]+"*"+base+" elevato a "+m;
        const newp=document.createElement("p");
        newp.textContent=newr;
        container.appendChild(newp);
    }


}