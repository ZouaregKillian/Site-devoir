function calcul(x,y,nomCalcul) {

    if(nomCalcul == "addition"){
        console.log(x + y);
    }else if (nomCalcul == "soustraction"){
        console.log(x - y);
    }else if (nomCalcul == "multiplication"){
        console.log(x * y);
    }else if (nomCalcul == "division"){
        console.log(x / y);
    }
    
}

calcul(5,5,"addition");
calcul(5,5,"soustraction");
calcul(5,5,"multiplication");
calcul(5,5,"division");


let array = [
    "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"
];

let arrayTwo = [];

for(let i = 0; i <= array.length; i++){
    if(i == 0){
        arrayTwo.push("le mois de " + array[i] + " est le " + (i + 1) + " er");
    }else{
        arrayTwo.push("le mois de " + array[i] + " est le " + (i + 1) + " ème");
    }
}
console.log(arrayTwo);

let succes = 0;
let lancer =0;
for(let j = 0; j < 100;j++){
    lancer += 1;
    let jet = Math.floor(Math.random()*6 + 1);
    if(jet >= 4){
        succes = 1 + succes;
    }
}

console.log("Le joueur a eu au total " + succes + " jet de dés réussi.");
console.log("Sur un total de : " + lancer + " jet de dés");