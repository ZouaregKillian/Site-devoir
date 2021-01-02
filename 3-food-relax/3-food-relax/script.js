
function pizza(){

    const bodyDomNode = document.querySelector("body");
    let templateFinale = '<img src="./img/neverending-pizza-vortex.gif" alt="neverending pizza vortex" id="">';
    bodyDomNode.innerHTML = templateFinale;
}

function phrase(){
    const timerDomNode = document.querySelector("body #timer");
    let templateCompteur = '<p>Temps de visionnage : </p>';
    timerDomNode.innerHTML = templateCompteur;
}

pizza();
phrase();

