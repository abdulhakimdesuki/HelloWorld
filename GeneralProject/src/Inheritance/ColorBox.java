package Inheritance;

//Here, Box is extended to include color.
class ColorBox extends Box {
int color; // color of box
ColorBox(double w, double h, double d, int c) {
super(w,h,d);
color = c;
}
}
