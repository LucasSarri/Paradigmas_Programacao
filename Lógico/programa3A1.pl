homem(albert).
homem(edward).
mulher(alice).
mulher(vitoria).
pais(edward, vitoria, albert).
pais(alice, vitoria, albert).
irma_de(X,Y):- mulher(X), pais(X,M,P), pais(Y,M,P).