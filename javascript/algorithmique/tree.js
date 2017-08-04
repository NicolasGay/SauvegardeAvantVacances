
//     LEAVES :                a   b    c
//                             |    \  /
//                             |     \/
//                            div   div text  img
//  							\    /    \    /
//								 \  /      \  /
//								  \/        \/
//						          div       p
//                   \    /	        \      /
//                    \  /           \    /
//                     \/             \  /
//     NODES :        head            body 
//						 \            /
//     BRANCHES :         \          /
//                         \        /
//							\      /
//							 \    /
//                            \  /
//                             \/
//     ===========================================================
//     ROOT : 		     	  html

///////////////////////////////////////////////////////////////////// DEFINITION DE L'ARBRE COMME UNE SUITE DE MAPS IMBRIQUEES /////////////////////////////////////////////////////////////////////////////

const root = {
    value : 'html',                                     // on est en train de créer une map key-value
    children : ['head',                                 // il y a un deuxième objet à la ligne : key = children, value = []
    {
        value : 'body',
        children : [
            {value:'div', children:[]},
            {value:'p'  , children:[]}
        ]
    }]
}

//////////////////////////////////////////////////////////////////////////////// POUR AFFICHER TOUTES LES VALUES ///////////////////////////////////////////////////////////////////////////////////////////

function displayNode(root){
    console.log('node value',root.value);
    displayChildren(root.children);
}

function displayChildren(children){
    children.forEach(function(child){                    // en paramètre de la fonction forEach, on va mettre une liste de choses à faire sous forme de fonction
            if(typeof child === 'string'){               // dans le cas de head on n'a ni value ni children : c'est une leaf
                console.log('leaf', child);
            }else{                                       // si le child n'est pas une leaf, c'est un node
                displayNode(child);
            }   
    });             
}

/////////////////////////////////////////////////////////////////////////////////// PROGRAMME PRINCIPAL ////////////////////////////////////////////////////////////////////////////////////////////////////

displayNode(root);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////