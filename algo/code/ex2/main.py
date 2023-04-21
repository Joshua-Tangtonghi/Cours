# Ecrire (et tester) les fonctions suivantes :
# rechDoublonsVoisins qui indique si des doublons sont présents côte à côte dans le tableau
# tab
# rechDoublons qui indique (en renvoyant un booléen) si des doublons sont présents dans le
# tableau tab
def rechDoublonsVoisins(tab):
    for i in range(len(tab)-1):
        if tab[i] == tab[i+1]:
            return True
    return False

def rechercheDoublons(tab):
    for i in range(len(tab)):
        for j in range(i+1,len(tab)):
            if tab[i] == tab[j]:
                return True
    return False


tab = [1,1,3,4,5,6,7,8,9,10]
print(rechercheDoublons(tab))
print(rechDoublonsVoisins(tab))