#include <stdio.h>
#include <stdlib.h>
#include <ncurses.h>
/* donne un pointeur sur une case de la grille */
char * grille_case(char * grille, int x, int y, int largeur, int hauteur);
/* crée une grille de taille donnée */
char * creer_grille(int largeur, int hauteur);
/* affiche une grille à l'écran */
void afficher_grille(char * grille, int largeur, int hauteur);

int main() {
  int largeur = 60, hauteur = 20;
  char * grille = creer_grille(largeur, hauteur);
  int x = 1, y = 1;
  initscr();
  noecho();
  cbreak();
  do {
    clear();
    afficher_grille(grille, largeur, hauteur);
    mvprintw(y, x, "@");
    mvprintw(y, x, "");
    refresh();
    getch();
    /* gestion des événements */
  } while(1);
  refresh();
  clrtoeol();
  refresh();
  endwin();
  free(grille);
  exit(EXIT_SUCCESS);
}