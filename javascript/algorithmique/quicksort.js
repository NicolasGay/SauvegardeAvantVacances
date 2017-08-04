
///////////////////////////////////////////////////////////////////////// ALGORITHME DE TRI DE TYPE "QUICKSORT" //////////////////////////////////////////////////////////////////////////////////////////

// PRINCIPE : 
// On prend tous les plus petits nombres du tableau et on les met à gauche d'un élément pivot (à définir).
// On prend tous les plus grands nombres du tableau et on les met à droite.
// Puis on trie chaque moitié du tableau avec la même technique : petits à gauche d'un pivot, grands à droite...
// ...et on continue à travailler par itération jusqu'à ce que tout le tableau soit trié.
// Aux itérations les plus fortes, on trie des tableaux vides (qui sont déjà triés par définition).
// Il faut donc penser à considérer le cas "tableau vide" dans la fonction quicksort.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

const input = [2,5,6,3,0,-12,34];                                    // création d'un tableau d'entiers NON MODIFIABLE (l'adresse n'est pas modifiable, le contenu oui)

function quicksort(array)
{
    if(array.length == 0)                                            // guard : permet d'éviter que la récursivité de la fonction ne s'emballe
        return [];

    const smalls = [], bigs = [];
    const first = array[0];

    for(var i=1 ; i<array.length ; i++)
    {
        const current = array[i];                                    // permet d'éviter de travailler avec array[i] à chaque fois
        if(current < first)
            smalls.push(current);                                    // push permet d'ajouter un élément unique dans le tableau : modifie le tableau courant (à la différence de concat, voir plus bas)
        else
            bigs.push(current);
    }

    return quicksort(smalls).concat(first).concat(quicksort(bigs));  // on range les petis à gauche du pivot, les grands à droite. Le pivot est le premier élément en input
                                                                     // concat renvoie un nouveau tableau avec les deux tableaux concaténés
                                                                     // on rappelle la fonction de tri de man ière récursive sur le tableau des smalls et le tableau des bigs
}

// Sur stackoverflow.com : 
// "Choosing a random pivot minimizes the chance that you will encounter worst-case O(n2) performance 
// (always choosing first or last would cause worst-case performance for nearly-sorted or nearly-reverse-sorted data). 
// Choosing the middle element would also be acceptable in the majority of cases."

///////////////////////////////////////////////////////////////////////// APPEL DE LA FONCTION QUICKSORT //////////////////////////////////////////////////////////////////////////////////////////////////

console.log(quicksort(input));                                      // attendu : le tableau "input" trié

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////