////////////////////////////////////////////////////////////////// TRIER PAR ORDRE CROISSANT LES VALEURS CONTENUES DANS UN TABLEAU ////////////////////////////////////////////////////////////////////////

// ce dont on dispose déjà avec les outils javascript :

var array = [1,2,3,4,5,8,7];                                    // création d'un tableau d'entiers (n elements, que l'on parcourt à partir de l'indice 0)
console.log(array);
//console.log(array.sort());                                    // c'est un tri par ordre ALPHABETIQUE donc 10 sortira avant 2 !
//console.log(10<2)                                             // la console indique bien "false", donc 10 PEUT être reconnu comme un nombre et pas une suite de caractères numériques
                                                                // c'est simplement la fonction array.sort() qui n'est pas adapté au tri de valeurs numériques

// pour trier correctement (numeriquement) l'array, on propose de passer par des fonctions (javascript est un langage "fonctionnel") //////////////////////////////////////////////////////////////////////

/*
function sort(array)
{
    var worker = array.slice();                                 // JS trick to copy
    
        for(var i=0 ; i<worker.length ; i++)
        {
            for(var j=0 ; j<worker.length-i ; j++)              
            {
                if(worker[j]>worker[j+1])
                {
                    swap(worker, j);
                }
            }
            
        }

    return worker;
}
*/

// cette fonction fonctionne mais n'est pas la plus efficace en raison de la double boucle qui augmente le nombre d'étape
// on travaille à l'ordre de grandeur n² (on fait n(n-1)/2 étapes), on aimerait descendre à l'ordre n.

function improvedSort(array)
{
    var worker = array.slice();                                 // JS trick to copy

        for(var i=0 ; i<worker.length ; i++)
        {
            var hasSwapped = false ;

            for(var j=0 ; j<worker.length-i ; j++)              
            {
                
                if(worker[j]>worker[j+1])
                {
                    swap(worker, j);
                    hasSwapped = true;
                    
                }
            }
        
        if(hasSwapped == false)
            {
                console.log('Has not swapped for i=', i);
                break;                                          // on arrête la boucle pour ce i quand il n'y a pas eu de swap
            }    
            
        }

    return worker;
}


/*
// tests pour vérifier le fonctionnement de la fonction swap() : on cherche à anticiper le futur fonctionnement de la fonction pour en simplifier l'écriture ///////////////////////////////////////////////

swap([2,3], 0, 1) == [3,2];
swap([2,3,4], 0, 1) == [3,2,4];
swap([2,3,4], 0, 2) == [4,3,2];                                 // pas besoin de ce test car on va toujours intervertir un indice avec l'indice limitrophe
swap([2,3,4], 1) == [2,4,3];                                    // du coup pas besoin de donner le deuxième indice j à intervertir, puisqu'on aura forcément j = i+1
swap([2], 0) == [2];
swap([2], 1) != [2];                                            // le tableau n'a qu'un élément, il n'y a pas d'indice "1"
*/


function swap(array, i)                                         // returns a mutated swap array : le tableau en entrée de la fonction est inversé
{
    // "guards" ou "defensive programming"
    if(array.lenght < 2)                                        // le tableau n'a qu'une case, il n'y a rien a intervertir, on renvoie le tableau tel quel
    {
        return array;
    }

    if(i >= array.length)                                       // l'indice à intervertir n'est pas dans le tableau (tableau trop petit)
    {
        throw 'Bad array size';                                 // fait planter le programme MAIS renvoie l'explication 'Bad array size' à l'utilisateur
    }
    
    //fonction swap
    var buffer = array[i+1];                                    // on est obligé de sauvegarder l'une des valeurs dans une variable "temporaire"
    array[i+1] = array[i];                                      // car ici on écrase la valeur de array[i+1]
    array[i] = buffer;
    return array;
}

////////////////////////////////////////////////////////////////////////////////// PROGRAMME PRINCIPAL /////////////////////////////////////////////////////////////////////////////////////////////////////

console.log(swap([2,3],0) == [3,2]);                            // renvoie FALSE alors que la fonction swap() fonctionne, parce que le == compare les adresses et non les éléments un à un !
                                                                // en javascript il n'y a QUE des pointeurs !
console.log(swap([2,3],0).toString() == [3,2].toString());      // renvoie TRUE car on a converti le tableau en chaîne de caractères                                               

//console.log(sort(array));

console.log(improvedSort(array));