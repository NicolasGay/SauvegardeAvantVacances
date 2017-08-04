// un graphe est un arbre particulier, avec possibilité de revenir en arrière sur un élément de l'arbre
// en partant de tree.js, on veut faire en sorte qu'un des children puisse revenir sur le root (par exemple)

///////////////////////////////////////////////////////////////////// DEFINITION DE L'ARBRE COMME UNE SUITE DE MAPS IMBRIQUEES /////////////////////////////////////////////////////////////////////////////

const root = {
    value : 'html',                                     
    children : ['head',                                 
    {
        value : 'body',
        children : [
            {value:'div', children:[]},
            {value:'p'  , children:[]}                              // on ne peut pas se contenter de rentrer "root" dans un des children parce que le programme
        ]                                                           // ne connait pas "root" (il n'est pas défini dans le scope, et c'est par là que commence la compilation)
    }]
}

///// CE QU'ON A AJOUTE PAR RAPPORT A DEPUIS tree.js

//console.log(root.children[1].children[1].value);                  // renvoie "p" (on n'oublie pas que la numérotation commence à 0 !)
console.log(root.children[1].children[1].children.push(root));      // on ne finit pas par children[0] parce qu'on ne connaît pas a priori le nombre de children et on ne veut pas écraser de valeur

//////////////////////////////////////////////////////////////////////////////// POUR AFFICHER TOUTES LES VALUES ///////////////////////////////////////////////////////////////////////////////////////////

function displayNode(root){
    console.log('node value',root.value);
    displayChildren(root.children);
}

function displayChildren(children){
    children.forEach(function(child){                    
            if(typeof child === 'string'){               
                console.log('leaf', child);
            }else{                                       
                displayNode(child);
            }   
    });             
}

/////////////////////////////////////////////////////////////////////////////////// PROGRAMME PRINCIPAL ////////////////////////////////////////////////////////////////////////////////////////////////////

displayNode(root);
// le graphe est créé correctement, mais comme il est circulaire, quand on demande de l'afficher on finit par rencontrer une erreur (boucle infinie)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////