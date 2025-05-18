window.onload=function(){var base=1;
while(1+base!==1){
    base=base/2;
}
base=base*2;
var p=document.getElementById("epsilon");
console.log(base);
p.innerText="epsilon-machine="+base.toFixed(30);}