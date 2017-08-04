/// JEU DE BATAILLE AVEC MISE ET GAINS

const cardMax = 14;
let pot = 0;
let oop = {                                                             // joueur 1, maniaque (out of position)
    money: 1000                                                         
};

let ip ={                                                               // joueur 2 (in position)
    money: 1000
};

function randomCard(){
    // http://stackoverflow.com/questions/4959975/
    return Math.floor(Math.random() * cardMax) + 1
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function enter(player){
    player.money = player.money - 1;
    pot = pot + 1;
    player.card = randomCard();
}

function bet(){
    oop.money = oop.money - 1;
    oop.move = "BET";
    pot = pot + 1;
}

function call(){                                                        // si la carte est suffisamment bonne pour remporter la bataille
    ip.money = ip.money - 1;
    ip.move = "CALL";
    pot = pot + 1;
}

/*
function fold(){                                                        // si la carte est trop mauvaise pour gagner la bataille
    // it's always ip that fold
    // You don't loose anything by folding
    ip.move = "FOLD";
    //ip.card=-1;
}
*/

function fold(player){                                                        // si la carte est trop mauvaise pour gagner la bataille
    // You don't loose anything by folding
    player.move = "FOLD";
    player.card=-1;
}

/*
function results(){
    // TODO !  if then else

    if (oop.card>ip.card || ip.move ==='FOLD'){                         // 1 == '1' mais 1 !=== '1' (permet d'éviter les conversions entre types par erreur)
       oop.money += pot;                                                // écriture équivalente à : oop.money = oop.money + pot;
    }else{
        
        ip.money += pot;
    }

    //console.log(pot, oop, ip);
}
*/

function results(){

    if (oop.card>ip.card){                                              // 1 == '1' mais 1 !=== '1' (permet d'éviter les conversions entre types par erreur)
       oop.money += pot;                                                // écriture équivalente à : oop.money = oop.money + pot;
    }else{
        
        ip.money += pot;
    }

    //console.log(pot, oop, ip);
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function gameIpVersusSmartManiac(oopBetLimit, ipCallLimit = 4){            // on a vu lors de premières itérations que ip était toujours gagnant s'il misait pour toute carte supérieure à 4
    pot = 0;
    enter(oop);
    enter(ip);

    // oop doesn't always bet
    if(oop.card >= oopBetLimit){
        bet(oop);

        if (ip.card >= ipCallLimit){
            call();
        }else{
            fold(ip);
        }
        results();

    }else{
        fold(oop);
    }
        
}

function simulation(){
    // we are looking for ip best strategy against a maniac
    let ipResult = [];
    let oopResult = [];
    let altResult = {};

    for (let limit = 2 ; limit <= 14; limit ++){                             // let est, grosso modo, la même chose que var (vieille notation), on commence à 2 parce que l'as est le plus fort (=14)
        ip.money = 1000;
        oop.money = 1000;
        for (let i = 0 ; i < 1000000 ; i++){ // up to 1M                          // on répète la partie 10 fois et on regarde les gains de ip
            gameIpVersusSmartManiac(limit);
        }
        ipResult[limit] = ip.money;
        oopResult[limit] = oop.money;

        altResult[limit+":"]=oop.money;                                     // au lieu de présenter les éléments dans un tableau, on les présente dans une map
    }

    console.log(altResult);
}

simulation();

// What is the best call strategy ? Display alt results
// What is a good enough bet strategy ?
// What if ip bet value changes to pot size ? to twice the pot size ?