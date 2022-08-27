animal(ema).
animal(falcao).
animal(pinguim).
animal(leao).
voar(ema).
voar(falcao).
voar(pinguim).
passaro(X):- animal(X), voar(X).
quadrupede(leao).
felino(x):- animal(X), quadrupede(X).