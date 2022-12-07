var matriz = [[5,-3],[1,-3],[3,10]]

var Sln = [0,0,0]

var x=0, i, j;

for(i=1; i<=2; i++) {
   
    for(j=0; j<=1; j++) {
        console.log("------ valor de SLN")
        console.log(Sln[i])
        console.log("------- Valor da matriz")
        console.log(matriz[i][j]);
        console.log("-------")
        Sln[i] = Sln[i] + matriz[i][j];
        console.log(Sln[i])
    }
    
}



