public class hardFrq {

// checks if sqaure can fit in grid
    x + len >0;
    y - len < 0;
    int rightX = x + len;
    int butY = y - len;
    if(rightX > 10 or butY < 0){
        rightX = rightX-10;
        butY = 0 - butY;
    }
    if (rightX-10 >=0 - butY){
        len = 10-x;
    }
    else{
        len = y;

    }
    drawLine(x,y,x+len, y);
    drawLine(x,y,x,y-len);
    drawLine(x+len,y,x+len,y-len);
    drawLine(x,y-len,x+len,y-len);
    System.out.println("Sidelength = " + len + ", area" + (len*len));






}