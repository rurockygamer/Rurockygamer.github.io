stroke(255, 0, 0);
background(224, 170, 170);
strokeWeight(2);
var divided = 0;
var divisor = 1;
var summed = 0;
var X = 10;
var Y = 10;
var Num = divided / divisor;
draw = function () {

    /*while(Y<= 400){
         Num = divided / divisor;
        text("144" + " / " + divisor + "= " + Num, X, Y);
        Y += 10;
        divided ++;
        divisor ++;
    }*/
    while (Y <= 400) {
        Num = divided / divisor;
        if (Num + divisor === summed) {
            text(Num + " + " + divisor + " = " + summed, X, Y);

        }
        if(Num -divisor === summed) {
            Num = divided / -divisor;
            text(Num + " + " + divisor + " = " + summed, X, Y);
            
        }

        
        Y += 10;
        divisor ++;
    }
};
