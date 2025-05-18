//calcolo esponenziale
var index=0
var espreal=Math.exp(2)
var exppar=document.getElementById("exppar")
var inputcamp=document.getElementById("input")
var result=document.getElementById("result")
exppar.innerText="esponenziale in algebra reale:"+espreal

function calcola(){
    index=parseInt(inputcamp.value)
    let appr_attuale=0
    for(let i=0;i<=index;i++){
        let indice_sommatoria=Math.pow(2,i)/factorial(i)
        appr_attuale=appr_attuale+indice_sommatoria
      
        
    }
    result.innerText="esponenziale calcolato al termine k-esimo della sommatoria="+appr_attuale.toFixed(30)+"   errore algoritmico="+(espreal-appr_attuale).toFixed(30)


}

function factorial(index){
    if(index<2){
        return 1
    }
    let j=1
    let factorial=1
    for(j=2;j<=index;j++){
        factorial=factorial*j

    }
    return factorial

}

