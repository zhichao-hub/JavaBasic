package com.bjsxt;

import java.awt.*;

//游戏物体的根类
public class GameObject {
    Image img;
    int x,y;
    int speed;//物体移动速度
    int width,height;//物体的高度和宽度
    public void drawMyself(Graphics g){

        g.drawImage(img,x,y,width,height,null);
        //System.out.println("x="+x+" y="+y+" width="+width+" height="+height);
    }
    //返回该物体对应的矩形
    public Rectangle getRec(){
        return new Rectangle(x,y,width,height);
    }
    public GameObject(){}

    public GameObject(Image img, int x, int y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, int x, int y, int speed) {
        this(img,x,y);
        this.speed = speed;

    }

    public GameObject(Image img) {
        this.img=img;
        if(this.img!=null){
            this.width=img.getWidth(null);
            this.height=img.getHeight(null);
        }
    }
    public GameObject(Image img,int x,int y){
        this(img);
        this.x=x;
        this.y=y;
    }

}
